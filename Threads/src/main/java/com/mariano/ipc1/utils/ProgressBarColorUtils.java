package com.mariano.ipc1.utils;

import java.awt.Color;
import javax.swing.JProgressBar;

/**
 *
 * @author Mariano Camposeco {@literal (mariano1941@outlook.es)}
 */
public class ProgressBarColorUtils {

    public static void updateBarColor(JProgressBar bar, int value) {
        if (value > 50) {
            bar.setForeground(Color.GREEN);
        } else if (value > 20) {
            bar.setForeground(Color.ORANGE);
        } else {
            bar.setForeground(Color.RED);
        }
    }
}
