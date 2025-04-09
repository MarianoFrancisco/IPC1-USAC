package com.mariano.ipc1.threads;

import com.mariano.ipc1.helpers.TimeBarHelper;
import com.mariano.ipc1.utils.AppUIUtils;
import java.awt.Color;
import javax.swing.JProgressBar;

/**
 *
 * @author Mariano Camposeco {@literal (mariano1941@outlook.es)}
 */
public class TimeThread extends Thread {

    private final JProgressBar timeBar;
    private volatile boolean paused = false;
    private volatile boolean running = true;

    public TimeThread(JProgressBar timeBar) {
        this.timeBar = timeBar;
    }

    public void pauseThread() {
        paused = true;
    }

    public void resumeThread() {
        paused = false;
    }

    public void stopThread() {
        running = false;
        interrupt();
    }

    @Override
    public void run() {
        TimeBarHelper timeBarHelper = new TimeBarHelper(timeBar);

        while (running && !Thread.currentThread().isInterrupted()) {
            try {
                Thread.sleep(100);

                if (paused) {
                    continue;
                }

                boolean hasTime = timeBarHelper.update();
                if (!hasTime) {
                    break;
                }

            } catch (InterruptedException ex) {
                if (!running) {
                    break;
                } else {
                    AppUIUtils.showError("The thread was interrupted unexpectedly.");
                    break;
                }
            }
        }

        if (!paused && running) {
            AppUIUtils.showInfo("Time has run out.");
        }
    }
}
