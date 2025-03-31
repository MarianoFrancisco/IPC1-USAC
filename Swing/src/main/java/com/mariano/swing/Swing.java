
package com.mariano.swing;

import com.mariano.swing.gui.Principal;

/**
 *
 * @author Mariano Camposeco {@literal (mariano1941@outlook.es)}
 */
public class Swing {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);      
            }
        });
    }
}
