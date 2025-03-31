package com.mariano.swing.utils;

import javax.swing.*;

/**
 *
 * @author Mariano Camposeco {@literal (mariano1941@outlook.es)}
 */
public class AppUIUtils {

    private AppUIUtils() {
    }

    public static void showInfo(
            String message
    ) {
        JOptionPane.showMessageDialog(
                null,
                message,
                "Info",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    public static void showWarning(
            String message
    ) {
        JOptionPane.showMessageDialog(
                null,
                message,
                "Warning",
                JOptionPane.WARNING_MESSAGE
        );
    }

    public static void showError(
            String message
    ) {
        JOptionPane.showMessageDialog(
                null,
                message,
                "Error",
                JOptionPane.ERROR_MESSAGE
        );
    }

    public static void showPlain(
            String message
    ) {
        JOptionPane.showMessageDialog(
                null,
                message,
                "Message",
                JOptionPane.PLAIN_MESSAGE
        );
    }

    public static void showQuestionIcon(
            String message
    ) {
        JOptionPane.showMessageDialog(
                null,
                message,
                "Question",
                JOptionPane.QUESTION_MESSAGE
        );
    }

    public static void exitWithInfo(
            String message
    ) {
        showInfo(message);
        System.exit(0);
    }

    public static void exitWithError(
            String message
    ) {
        showError(message);
        System.exit(0);
    }

    public static void exitWithWarning(
            String message
    ) {
        showWarning(message);
        System.exit(0);
    }

    public static boolean confirmYesNo(
            String message,
            String title
    ) {
        int result = JOptionPane.showConfirmDialog(
                null,
                message,
                title,
                JOptionPane.YES_NO_OPTION
        );
        return result == JOptionPane.YES_OPTION;
    }

    public static boolean confirmYesNoCancel(
            String message,
            String title
    ) {
        int result = JOptionPane.showConfirmDialog(
                null,
                message,
                title,
                JOptionPane.YES_NO_CANCEL_OPTION
        );
        return result == JOptionPane.YES_OPTION;
    }

    public static void confirmAndExit(
            String message
    ) {
        if (confirmYesNo(
                message,
                "Exit Confirmation"
        )) {
            System.exit(0);
        }
    }

    public static String askInput(
            String message
    ) {
        return JOptionPane.showInputDialog(
                null,
                message,
                "Input",
                JOptionPane.QUESTION_MESSAGE
        );
    }

    public static int askOption(
            String message,
            String title,
            String[] options,
            String defaultOption
    ) {
        return JOptionPane.showOptionDialog(
                null,
                message,
                title,
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                defaultOption
        );
    }

}
