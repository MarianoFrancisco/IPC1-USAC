package com.mariano.ipc1;

import com.mariano.ipc1.gui.Principal;
import javax.swing.SwingUtilities;

/**
 *
 * @author Mariano Camposeco {@literal (mariano1941@outlook.es)}
 */
public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Principal::new);
    }
}
