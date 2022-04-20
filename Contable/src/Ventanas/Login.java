
package Ventanas;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.HashSet;
import java.util.Set;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.sql.*;
import clases.Conexion;
import javax.swing.JOptionPane;
public class Login extends javax.swing.JFrame {
    
    public static String user = "";
    String pass = "";

    public Login() {
        initComponents();
        setSize(400,600);
        setResizable(false);
        setTitle("Acceso al sistema");
        setLocationRelativeTo(null);
        ImageIcon wallpaper = new ImageIcon("src/images/FondoC.jpg");
        Icon Icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(),
                jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(Icono);
        this.repaint();
 
    }
    @Override 
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/Icono200.png"));
        return retValue;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_Acceder = new javax.swing.JButton();
        txt_password = new javax.swing.JPasswordField();
        jLabel_Logo = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_Acceder.setText("Acceder");
        jButton_Acceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AccederActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Acceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 460, 140, 40));

        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 240, 30));

        jLabel_Logo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icono200.png"))); // NOI18N
        getContentPane().add(jLabel_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 200, 200));
        getContentPane().add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 240, 30));

        jButton9.setBackground(new java.awt.Color(255, 51, 51));
        jButton9.setText("Salir");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 75, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 350, 30, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pass.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 30, 30));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passwordActionPerformed

    private void jButton_AccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AccederActionPerformed
     user = txt_user.getText().trim();
     pass =txt_password.getText().trim();
     if(!user.equals("")|| !pass.equals("")){
       try{
       Connection cn = Conexion.conectar();
       PreparedStatement pst = cn.prepareStatement(
            "select tipo_nivel, status from usuarios where username='" + user
                +"' and password = '" + pass +"'");
       
       ResultSet rs =pst.executeQuery();
       if(rs.next()){
           String tipo_nivel = rs.getString("tipo_nivel");
           String status = rs.getString("status");
           if(tipo_nivel.equalsIgnoreCase("Administrador")&& status.equalsIgnoreCase("Activo")){
               dispose();
               new Administrador().setVisible(true);
               
           }else if(tipo_nivel.equalsIgnoreCase("Comercial")&& status.equalsIgnoreCase("Activo")){
                dispose();
               new Comercial().setVisible(true);
           }else if(tipo_nivel.equalsIgnoreCase("Contabilidad")&& status.equalsIgnoreCase("Activo")){
               dispose();
               new Contabilidad().setVisible(true);
           }else if(tipo_nivel.equalsIgnoreCase("T_humano")&& status.equalsIgnoreCase("Activo")){
               dispose();
               new T_Humano().setVisible(true);
           }
           
           
       }else{
       JOptionPane.showMessageDialog(null,"Datos de ingreso Incorrectos"); 
       txt_user.setText("");
       txt_password.setText("");
       }
       
       
       
       }catch (SQLException e){
           System.err.println("Error en el boton Acceder"+e);
           JOptionPane.showMessageDialog(null,"Error al iniciar sesion!!, Contacte a David Vega");
       } 
     }else{
         JOptionPane.showMessageDialog(null,"Por favor ingresa tu usuario y contraseña");
         
         
     }
    if(user.equals("")|| !pass.equals("")){
         
     }else{
         JOptionPane.showMessageDialog(null,"Por favor ingresa tu contraseña");
          }
    if(!user.equals("")|| pass.equals("")){
         
     }else{
         JOptionPane.showMessageDialog(null,"Por favor ingresa tu Usuario");
          }
    }//GEN-LAST:event_jButton_AccederActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButton_Acceder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_Logo;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
