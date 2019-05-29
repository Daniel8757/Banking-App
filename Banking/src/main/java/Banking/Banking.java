/*
 * User sees their bank account to make withdrawals and deposits
 */
package Banking;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class Banking extends javax.swing.JFrame {

    /**
     * Creates new form Banking
     */
    int id; // The user that logged in
    int myMoney; // Total money the user has
    checkFile add;

    public Banking(int id, String name) throws IOException {
        initComponents();
        this.id = id;
        this.add = new checkFile("data.txt");
        myMoney = Integer.parseInt(add.findMoney(id));
        money.setText(Integer.toString(myMoney));
        username.setText("Hello " + name);
    }

    private Banking() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        moneyLabel = new javax.swing.JLabel();
        money = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        depositButton = new javax.swing.JButton();
        withdrawButton = new javax.swing.JButton();
        amountChange = new javax.swing.JTextField();
        username = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(96, 166, 222));

        moneyLabel.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        moneyLabel.setText("Total Money:");

        money.setText("0");

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(125, 223, 178));

        depositButton.setText("Deposit");
        depositButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositButtonActionPerformed(evt);
            }
        });

        withdrawButton.setText("Withdraw");
        withdrawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawButtonActionPerformed(evt);
            }
        });

        amountChange.setText("Money Change");
        amountChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountChangeActionPerformed(evt);
            }
        });

        username.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        username.setText("Hello ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(depositButton)
                .addGap(32, 32, 32)
                .addComponent(withdrawButton)
                .addGap(71, 71, 71))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(amountChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(username)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(username)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depositButton)
                    .addComponent(withdrawButton))
                .addGap(43, 43, 43)
                .addComponent(amountChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(moneyLabel)))
                .addGap(65, 65, 65)
                .addComponent(money, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(moneyLabel)
                    .addComponent(money))
                .addGap(203, 203, 203))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void amountChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountChangeActionPerformed

    }//GEN-LAST:event_amountChangeActionPerformed

    private void depositButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositButtonActionPerformed

        try { // Increases money
            add.changeMoney(id, Integer.parseInt(amountChange.getText())); // Makes sure its a number
            //Updates status 
            myMoney = myMoney + Integer.parseInt(amountChange.getText());
            money.setText(Integer.toString(myMoney));
            JOptionPane.showMessageDialog(this, "Sucess!");
        } catch (IOException ex) {
            Logger.getLogger(Banking.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception NumberFormatException) {
            JOptionPane.showMessageDialog(this, "Must be number!");
        }

    }//GEN-LAST:event_depositButtonActionPerformed

    private void withdrawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawButtonActionPerformed
        try {
            if (Integer.parseInt(amountChange.getText()) > myMoney) { // Makes sure it's a number
                JOptionPane.showMessageDialog(this, "Not Enough Money");
            } else {
                try { // Decreases money
                    add.changeMoney(id, -Integer.parseInt(amountChange.getText()));
                    //Updates status
                    myMoney = myMoney - Integer.parseInt(amountChange.getText());
                    money.setText(Integer.toString(myMoney));
                    JOptionPane.showMessageDialog(this, "Sucess!");
                } catch (IOException ex) {
                    Logger.getLogger(Banking.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (Exception NumberFormatException) {
            JOptionPane.showMessageDialog(this, "Must be number!");
        }
    }//GEN-LAST:event_withdrawButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        try { // Goes back to login screen
            Login log = new Login();
            log.setVisible(true);
            this.setVisible(false);
        } catch (Exception ex) {
            Logger.getLogger(Banking.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_backButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Banking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Banking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Banking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Banking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Banking().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountChange;
    private javax.swing.JButton backButton;
    private javax.swing.JButton depositButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel money;
    private javax.swing.JLabel moneyLabel;
    private javax.swing.JLabel username;
    private javax.swing.JButton withdrawButton;
    // End of variables declaration//GEN-END:variables
}
