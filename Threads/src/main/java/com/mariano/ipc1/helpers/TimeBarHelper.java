package com.mariano.ipc1.helpers;

import com.mariano.ipc1.utils.ProgressBarColorUtils;
import javax.swing.JProgressBar;

/**
 *
 * @author Mariano Camposeco {@literal (mariano1941@outlook.es)}
 */
public class TimeBarHelper {

    private final JProgressBar bar;

    public TimeBarHelper(JProgressBar bar) {
        this.bar = bar;
        initializeBar();
    }

    public boolean update() {
        int current = bar.getValue();
        if (current <= 0) {
            return false;
        }

        int newValue = current - 1;
        bar.setValue(newValue);
        ProgressBarColorUtils.updateBarColor(bar, newValue);

        return newValue > 0;
    }

    private void initializeBar() {
        bar.setValue(100);
        ProgressBarColorUtils.updateBarColor(bar, 100);
    }
}
