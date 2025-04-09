package com.mariano.ipc1.threads;

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
        timeBar.setValue(100);
        timeBar.setForeground(Color.GREEN);

        while (timeBar.getValue() > 0 && running) {
            try {
                Thread.sleep(100);

                if (paused) {
                    continue;
                }

                int current = timeBar.getValue();
                int newValue = current - 1;

                timeBar.setValue(newValue);

                if (newValue > 50) {
                    timeBar.setForeground(Color.GREEN);
                } else if (newValue > 20) {
                    timeBar.setForeground(Color.ORANGE);
                } else {
                    timeBar.setForeground(Color.RED);
                }

            } catch (InterruptedException ex) {
                if (!running) {
                    break;
                }
            }
        }

        if (!paused && running) {
            AppUIUtils.showInfo("Time has run out.");
        }
    }
}
