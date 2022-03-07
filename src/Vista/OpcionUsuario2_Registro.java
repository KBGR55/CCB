package Vista;

import Controlador.ControladorUsuariosBD;
import Modelo.Usuario;
import java.awt.HeadlessException;
import javax.swing.ImageIcon;

/**
 * @author K.G 
 */
public class OpcionUsuario2_Registro extends javax.swing.JFrame {

    public static ControladorUsuariosBD datosUsuario = new ControladorUsuariosBD();

    public OpcionUsuario2_Registro() {
        initComponents();
        aviso.setVisible(false);
        this.setLocationRelativeTo(OpcionUsuario2_Registro.this);
        this.setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/Vista/Imagen/logo.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txt_CorreoUsuario = new javax.swing.JTextField();
        txt_Password = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_NombreUsuario = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jButton_Guardar = new javax.swing.JButton();
        jButton_Regresar = new javax.swing.JButton();
        aviso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora de Contabilidad Basica");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Correo :");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Contraseña :");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        txt_CorreoUsuario.setBackground(new java.awt.Color(222, 220, 220));
        txt_CorreoUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_CorreoUsuario.setForeground(new java.awt.Color(0, 0, 0));
        txt_CorreoUsuario.setText("Ingrese el correo del usuario");
        txt_CorreoUsuario.setBorder(null);
        txt_CorreoUsuario.setCaretColor(new java.awt.Color(0, 0, 0));
        txt_CorreoUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_CorreoUsuario.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_CorreoUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_CorreoUsuarioKeyReleased(evt);
            }
        });

        txt_Password.setBackground(new java.awt.Color(204, 204, 204));
        txt_Password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_Password.setBorder(null);
        txt_Password.setCaretColor(new java.awt.Color(0, 0, 0));
        txt_Password.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_Password.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("REGISTAR USUARIO");
        jLabel3.setToolTipText("");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel3.setFocusCycleRoot(true);
        jLabel3.setOpaque(true);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre: ");

        txt_NombreUsuario.setBackground(new java.awt.Color(222, 220, 220));
        txt_NombreUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_NombreUsuario.setForeground(new java.awt.Color(0, 0, 0));
        txt_NombreUsuario.setText("Ingrese el nombre del usuario");
        txt_NombreUsuario.setBorder(null);
        txt_NombreUsuario.setCaretColor(new java.awt.Color(0, 0, 0));
        txt_NombreUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_NombreUsuario.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jButton_Guardar.setBackground(new java.awt.Color(0, 0, 0));
        jButton_Guardar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton_Guardar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Guardar.setText("GUARDAR");
        jButton_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GuardarActionPerformed(evt);
            }
        });

        jButton_Regresar.setBackground(new java.awt.Color(0, 0, 0));
        jButton_Regresar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton_Regresar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Regresar.setText("REGRESAR");
        jButton_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegresarActionPerformed(evt);
            }
        });

        aviso.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        aviso.setForeground(new java.awt.Color(102, 0, 0));
        aviso.setText("Correo invalido ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Password)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_CorreoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2)
                    .addComponent(txt_NombreUsuario)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aviso, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(26, 153, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_NombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(aviso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_CorreoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegresarActionPerformed
        MenuOpcionesUsuario ventana = new MenuOpcionesUsuario();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_RegresarActionPerformed

    private void jButton_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GuardarActionPerformed
        boolean verificarCorreo = datosUsuario.buscarCorreoExistente(txt_CorreoUsuario.getText());
        if(verificarCorreo==true)verificarCorreo = datosUsuario.verificarEmail(txt_CorreoUsuario.getText());
        boolean verificarClave = (txt_Password.getPassword().length > 3);
        datosUsuario.mensaje(verificarClave, "Ingreso de datos ", "/Vista/Imagen/Error.png", "Su clave debe tener mas de 3 digitos");
        boolean verrificarUsuario = (txt_NombreUsuario.getText().length() > 2);
        datosUsuario.mensaje(verrificarUsuario, "Ingreso de datos ", "/Vista/Imagen/Error.png", "Su nombre de usuario debe tener mas de 2 digitos");
        try {
            String clave = "";
            char[] pasword = txt_Password.getPassword();
            for (int i = 0; i < pasword.length; i++) {
                clave += pasword[i];
            }
            if (verificarCorreo == true && verificarClave == true && verrificarUsuario == true) {
                datosUsuario.guardarUsuario(new Usuario(txt_NombreUsuario.getText(), clave, txt_CorreoUsuario.getText()));
                datosUsuario.mensaje(false, "Correcto", "/Vista/Imagen/Correcto.png", "Usuario registrado :)");
            }else{
                datosUsuario.mensaje(false, "Error", "/Vista/Imagen/Error.png", "Ingrese correctamente los datos");
            }
        } catch (HeadlessException e) {
            datosUsuario.mensaje(false, "Error", "/Vista/Imagen/Error.png", "Ocurrio un error !!!");
        }
    }//GEN-LAST:event_jButton_GuardarActionPerformed

    private void txt_CorreoUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_CorreoUsuarioKeyReleased
        if (datosUsuario.verificarEmail(txt_CorreoUsuario.getText())) {
            aviso.setVisible(false);
        } else {
            aviso.setVisible(true);
        }
    }//GEN-LAST:event_txt_CorreoUsuarioKeyReleased

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new OpcionUsuario2_Registro().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aviso;
    private javax.swing.JButton jButton_Guardar;
    private javax.swing.JButton jButton_Regresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txt_CorreoUsuario;
    private javax.swing.JTextField txt_NombreUsuario;
    private javax.swing.JPasswordField txt_Password;
    // End of variables declaration//GEN-END:variables
}
