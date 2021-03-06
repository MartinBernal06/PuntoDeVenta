/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

/**
 *
 * @author GPE
 */
public class FrmMenuSupervisor extends javax.swing.JFrame {

    /**
     * Creates new form FrmPago
     */
    public FrmMenuSupervisor() {
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

        lblTotal = new javax.swing.JLabel();
        lblImgPago = new javax.swing.JLabel();
        btnBalance = new javax.swing.JButton();
        btnCancelacionTotal = new javax.swing.JButton();
        btnRetiroDeEfectivo = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Elige la transacción deseada");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTotal.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblTotal.setText("Menu Del Supervisor");
        getContentPane().add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        lblImgPago.setFont(new java.awt.Font("Sylfaen", 3, 36)); // NOI18N
        lblImgPago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/MenuSupervisor.png"))); // NOI18N
        getContentPane().add(lblImgPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 350, 100));

        btnBalance.setBackground(new java.awt.Color(0, 102, 153));
        btnBalance.setText("Balance Cajero");
        btnBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBalanceActionPerformed(evt);
            }
        });
        getContentPane().add(btnBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        btnCancelacionTotal.setBackground(new java.awt.Color(0, 102, 153));
        btnCancelacionTotal.setText("Cancelacion Total");
        btnCancelacionTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelacionTotalActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelacionTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        btnRetiroDeEfectivo.setBackground(new java.awt.Color(0, 102, 153));
        btnRetiroDeEfectivo.setText("Retiro de Efectivo");
        btnRetiroDeEfectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetiroDeEfectivoActionPerformed(evt);
            }
        });
        getContentPane().add(btnRetiroDeEfectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, -1, -1));

        lblFondo.setFont(new java.awt.Font("Sylfaen", 3, 36)); // NOI18N
        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoPV.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelacionTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelacionTotalActionPerformed

    }//GEN-LAST:event_btnCancelacionTotalActionPerformed

    private void btnBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBalanceActionPerformed

    }//GEN-LAST:event_btnBalanceActionPerformed

    private void btnRetiroDeEfectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetiroDeEfectivoActionPerformed

    }//GEN-LAST:event_btnRetiroDeEfectivoActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenuSupervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenuSupervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenuSupervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenuSupervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenuSupervisor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBalance;
    private javax.swing.JButton btnCancelacionTotal;
    private javax.swing.JButton btnRetiroDeEfectivo;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblImgPago;
    private javax.swing.JLabel lblTotal;
    // End of variables declaration//GEN-END:variables
}
