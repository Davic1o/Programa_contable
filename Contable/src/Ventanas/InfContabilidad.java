/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author shagg
 */
public class InfContabilidad extends javax.swing.JFrame {

    /**
     * Creates new form InfContabilidad
     */
    public InfContabilidad() {
        initComponents();
                 super.setVisible(true);
        setSize(1050,300);
        setResizable(false);
        setTitle("Menu Ventas");
        setLocationRelativeTo(null);
                ImageIcon wallpaper = new ImageIcon("src/images/FondoC.jpg");
        Icon Icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(),
                jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(Icono);
        this.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_Reportes = new javax.swing.JButton();
        jButton_ComprasN = new javax.swing.JButton();
        jButton_ComprasI = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_Reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Reporte (2).png"))); // NOI18N
        jButton_Reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ReportesActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Reportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 55, 150, 150));

        jButton_ComprasN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ComprasN (2).png"))); // NOI18N
        jButton_ComprasN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ComprasNActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_ComprasN, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 55, 150, 150));

        jButton_ComprasI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ComprasI (2).png"))); // NOI18N
        jButton_ComprasI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ComprasIActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_ComprasI, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 55, 150, 150));

        jButton9.setBackground(new java.awt.Color(255, 51, 51));
        jButton9.setText("Salir");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 10, 75, 30));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reportes");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 220, 150, 30));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Compras Generales");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 210, 30));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Compras de  Inventario");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 250, 30));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ReportesActionPerformed
        ReportesCont reportes = new ReportesCont();
        reportes.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton_ReportesActionPerformed

    private void jButton_ComprasNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ComprasNActionPerformed
        ComprasN comprasN = new ComprasN();
        comprasN.setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_ComprasNActionPerformed

    private void jButton_ComprasIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ComprasIActionPerformed
        ComprasI comprasI = new ComprasI();
        comprasI.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton_ComprasIActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        Contabilidad contabilidad = new Contabilidad();
        contabilidad.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(InfContabilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InfContabilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InfContabilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InfContabilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InfContabilidad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButton_ComprasI;
    private javax.swing.JButton jButton_ComprasN;
    private javax.swing.JButton jButton_Reportes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_Wallpaper;
    // End of variables declaration//GEN-END:variables
}
