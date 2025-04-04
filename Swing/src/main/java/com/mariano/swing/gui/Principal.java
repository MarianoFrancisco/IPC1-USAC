package com.mariano.swing.gui;

import com.mariano.swing.utils.AppUIUtils;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mariano Camposeco {@literal (mariano1941@outlook.es)}
 */
public class Principal extends JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        ExitButton = new javax.swing.JButton();
        MessageButton = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        ValidateButton = new javax.swing.JButton();
        ValidateField = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        FirstTextArea = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        SecondTextArea = new javax.swing.JTextArea();
        SendButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        FirstTable = new javax.swing.JTable();
        TableButton = new javax.swing.JButton();
        PrincipalTitle1 = new javax.swing.JLabel();
        ChangeFrameButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ExitButton.setBackground(new java.awt.Color(255, 51, 51));
        ExitButton.setForeground(new java.awt.Color(0, 0, 0));
        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        MessageButton.setBackground(new java.awt.Color(255, 255, 51));
        MessageButton.setForeground(new java.awt.Color(0, 0, 0));
        MessageButton.setText("Message");
        MessageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MessageButtonActionPerformed(evt);
            }
        });
        jPanel1.add(MessageButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ValidateButton.setBackground(new java.awt.Color(51, 102, 255));
        ValidateButton.setForeground(new java.awt.Color(0, 0, 0));
        ValidateButton.setText("Validate");
        ValidateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValidateButtonActionPerformed(evt);
            }
        });
        jPanel2.add(ValidateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        ValidateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValidateFieldActionPerformed(evt);
            }
        });
        jPanel2.add(ValidateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 90, -1));

        jTabbedPane2.addTab("First", jPanel2);

        jPanel3.setBackground(new java.awt.Color(153, 255, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FirstTextArea.setColumns(20);
        FirstTextArea.setRows(5);
        jScrollPane2.setViewportView(FirstTextArea);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 200, 90));

        SecondTextArea.setColumns(20);
        SecondTextArea.setRows(5);
        jScrollPane1.setViewportView(SecondTextArea);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 190, 90));

        SendButton.setBackground(new java.awt.Color(0, 255, 51));
        SendButton.setForeground(new java.awt.Color(0, 0, 0));
        SendButton.setText("Send");
        SendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendButtonActionPerformed(evt);
            }
        });
        jPanel3.add(SendButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, -1));

        jTabbedPane2.addTab("Second", jPanel3);

        jPanel1.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 480, 230));

        FirstTable.setBackground(new java.awt.Color(102, 255, 102));
        FirstTable.setForeground(new java.awt.Color(0, 0, 0));
        FirstTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "2", "3", "4"}
            },
            new String [] {
                "First", "Second", "Third", "Fourth"
            }
        ));
        jScrollPane3.setViewportView(FirstTable);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 300, 70));

        TableButton.setBackground(new java.awt.Color(102, 255, 255));
        TableButton.setForeground(new java.awt.Color(0, 0, 0));
        TableButton.setText("Table");
        TableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TableButtonActionPerformed(evt);
            }
        });
        jPanel1.add(TableButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        PrincipalTitle1.setBackground(new java.awt.Color(0, 0, 0));
        PrincipalTitle1.setFont(new java.awt.Font("Britannic Bold", 0, 12)); // NOI18N
        PrincipalTitle1.setForeground(new java.awt.Color(0, 0, 0));
        PrincipalTitle1.setText("Test Label");
        jPanel1.add(PrincipalTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        ChangeFrameButton.setBackground(new java.awt.Color(153, 153, 255));
        ChangeFrameButton.setForeground(new java.awt.Color(0, 0, 0));
        ChangeFrameButton.setText("Change Frame");
        ChangeFrameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeFrameButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ChangeFrameButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        AppUIUtils.exitWithInfo("Goodbye!");
        AppUIUtils.exitWithError("Critical failure. Shutting down.");
        AppUIUtils.confirmAndExit("Do you really want to exit?");
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void MessageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MessageButtonActionPerformed
        AppUIUtils.showInfo("Saved successfully!");
        AppUIUtils.showWarning("This action cannot be undone.");
        AppUIUtils.showError("Something went wrong.");
        AppUIUtils.showPlain("This is just a neutral message.");
        AppUIUtils.showQuestionIcon("Are you sure?");
    }//GEN-LAST:event_MessageButtonActionPerformed

    private void TableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TableButtonActionPerformed
        FirstTable.setValueAt("Test", 0, 0);
        DefaultTableModel model = (DefaultTableModel) FirstTable.getModel();
        model.addRow(new Object[]{"New 1", "New 2", "New 3", "New 4"});
    }//GEN-LAST:event_TableButtonActionPerformed

    private void ChangeFrameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeFrameButtonActionPerformed
        new NextOption().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ChangeFrameButtonActionPerformed

    private void SendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendButtonActionPerformed
        SecondTextArea.setText(FirstTextArea.getText());
    }//GEN-LAST:event_SendButtonActionPerformed

    private void ValidateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValidateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValidateFieldActionPerformed

    private void ValidateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValidateButtonActionPerformed
        if (ValidateField.getText().equals(FirstTextArea.getText())) {
            AppUIUtils.showInfo("Correct.");
        } else {
            AppUIUtils.showError("Incorrect.");
        }
    }//GEN-LAST:event_ValidateButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChangeFrameButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JTable FirstTable;
    private javax.swing.JTextArea FirstTextArea;
    private javax.swing.JButton MessageButton;
    private javax.swing.JLabel PrincipalTitle1;
    private javax.swing.JTextArea SecondTextArea;
    private javax.swing.JButton SendButton;
    private javax.swing.JButton TableButton;
    private javax.swing.JButton ValidateButton;
    private javax.swing.JPasswordField ValidateField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    // End of variables declaration//GEN-END:variables
}
