package Vista;

import Modelo.Usuario;
import static Vista.OpcionUsuario1_IniciarSesion.datosUsuario;
import javax.swing.ImageIcon;

/**
 * @author K.G
 */

public class MenuOpciones extends javax.swing.JFrame {

    Usuario usuario;
    boolean verificar;

    public MenuOpciones(Usuario usuario) {
        this.usuario = usuario;
        sentenciasMenu(usuario.getNombre(),true);
    }

    public MenuOpciones() {
        sentenciasMenu("Usuario",false);
        btnHistorial.setEnabled(verificar);
        Button_RepositorioKardex.setEnabled(verificar);
        Button_RepositorioLibroMayor.setEnabled(verificar);
        Button_RepositorioHorasExtra.setEnabled(verificar);
        Button_RepositorioHorasSuplementarias.setEnabled(verificar);
    }
    
    private void sentenciasMenu(String usu,boolean a){
        initComponents();
        this.setLocationRelativeTo(MenuOpciones.this);
        this.setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/Vista/Imagen/logo.png")).getImage());
        txtNombreUsuario.setText(usu);
        this.verificar = a;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        txtNombreUsuario = new javax.swing.JLabel();
        btnHistorial = new javax.swing.JButton();
        Button_HSuplementarias = new javax.swing.JButton();
        Button_Kardex = new javax.swing.JButton();
        Button_LibroMayor = new javax.swing.JButton();
        Button_RepositorioKardex = new javax.swing.JButton();
        Button_RepositorioLibroMayor = new javax.swing.JButton();
        Button_RepositorioHorasExtra = new javax.swing.JButton();
        Button_RepositorioHorasSuplementarias = new javax.swing.JButton();
        Button_HExtra = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora Contable Basica");
        setIconImage(getIconImage());

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.setForeground(new java.awt.Color(255, 255, 255));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombreUsuario.setBackground(new java.awt.Color(255, 204, 255));
        txtNombreUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNombreUsuario.setForeground(new java.awt.Color(51, 0, 51));
        txtNombreUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNombreUsuario.setOpaque(true);
        fondo.add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 250, 20));

        btnHistorial.setBackground(new java.awt.Color(51, 0, 51));
        btnHistorial.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHistorial.setForeground(new java.awt.Color(255, 255, 255));
        btnHistorial.setText("Historial de Usuarios");
        btnHistorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHistorial.setFocusPainted(false);
        btnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialActionPerformed(evt);
            }
        });
        fondo.add(btnHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 0, 290, 20));

        Button_HSuplementarias.setBackground(new java.awt.Color(255, 255, 255));
        Button_HSuplementarias.setFont(new java.awt.Font("Segoe Print", 0, 8)); // NOI18N
        Button_HSuplementarias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagen/siguiente.png"))); // NOI18N
        Button_HSuplementarias.setBorder(null);
        Button_HSuplementarias.setBorderPainted(false);
        Button_HSuplementarias.setContentAreaFilled(false);
        Button_HSuplementarias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_HSuplementarias.setFocusPainted(false);
        Button_HSuplementarias.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_HSuplementarias.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagen/siguiente.png"))); // NOI18N
        Button_HSuplementarias.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagen/siguiente2_1.png"))); // NOI18N
        Button_HSuplementarias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_HSuplementariasActionPerformed(evt);
            }
        });
        fondo.add(Button_HSuplementarias, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 90, 80));

        Button_Kardex.setBackground(new java.awt.Color(255, 255, 255));
        Button_Kardex.setFont(new java.awt.Font("Segoe Print", 0, 8)); // NOI18N
        Button_Kardex.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagen/siguiente.png"))); // NOI18N
        Button_Kardex.setBorder(null);
        Button_Kardex.setBorderPainted(false);
        Button_Kardex.setContentAreaFilled(false);
        Button_Kardex.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Kardex.setFocusPainted(false);
        Button_Kardex.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Kardex.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagen/siguiente.png"))); // NOI18N
        Button_Kardex.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagen/siguiente2_1.png"))); // NOI18N
        Button_Kardex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_KardexActionPerformed(evt);
            }
        });
        fondo.add(Button_Kardex, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 90, 80));

        Button_LibroMayor.setBackground(new java.awt.Color(255, 255, 255));
        Button_LibroMayor.setFont(new java.awt.Font("Segoe Print", 0, 8)); // NOI18N
        Button_LibroMayor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagen/siguiente.png"))); // NOI18N
        Button_LibroMayor.setBorder(null);
        Button_LibroMayor.setBorderPainted(false);
        Button_LibroMayor.setContentAreaFilled(false);
        Button_LibroMayor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_LibroMayor.setFocusPainted(false);
        Button_LibroMayor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_LibroMayor.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagen/siguiente.png"))); // NOI18N
        Button_LibroMayor.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagen/siguiente2_1.png"))); // NOI18N
        Button_LibroMayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_LibroMayorActionPerformed(evt);
            }
        });
        fondo.add(Button_LibroMayor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 90, 80));

        Button_RepositorioKardex.setBackground(new java.awt.Color(255, 255, 255));
        Button_RepositorioKardex.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        Button_RepositorioKardex.setForeground(new java.awt.Color(51, 0, 51));
        Button_RepositorioKardex.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagen/Entrar.png"))); // NOI18N
        Button_RepositorioKardex.setText("   Repositorio kardex");
        Button_RepositorioKardex.setBorder(null);
        Button_RepositorioKardex.setBorderPainted(false);
        Button_RepositorioKardex.setContentAreaFilled(false);
        Button_RepositorioKardex.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_RepositorioKardex.setFocusPainted(false);
        Button_RepositorioKardex.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Button_RepositorioKardex.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Button_RepositorioKardex.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagen/Entrar2.png"))); // NOI18N
        Button_RepositorioKardex.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagen/Entrar3.png"))); // NOI18N
        Button_RepositorioKardex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_RepositorioKardexActionPerformed(evt);
            }
        });
        fondo.add(Button_RepositorioKardex, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 250, 60));

        Button_RepositorioLibroMayor.setBackground(new java.awt.Color(255, 255, 255));
        Button_RepositorioLibroMayor.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        Button_RepositorioLibroMayor.setForeground(new java.awt.Color(51, 0, 51));
        Button_RepositorioLibroMayor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagen/Entrar.png"))); // NOI18N
        Button_RepositorioLibroMayor.setText("   Repositorio libro mayor");
        Button_RepositorioLibroMayor.setBorder(null);
        Button_RepositorioLibroMayor.setBorderPainted(false);
        Button_RepositorioLibroMayor.setContentAreaFilled(false);
        Button_RepositorioLibroMayor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_RepositorioLibroMayor.setFocusPainted(false);
        Button_RepositorioLibroMayor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Button_RepositorioLibroMayor.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Button_RepositorioLibroMayor.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagen/Entrar2.png"))); // NOI18N
        Button_RepositorioLibroMayor.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagen/Entrar3.png"))); // NOI18N
        Button_RepositorioLibroMayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_RepositorioLibroMayorActionPerformed(evt);
            }
        });
        fondo.add(Button_RepositorioLibroMayor, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 250, 60));

        Button_RepositorioHorasExtra.setBackground(new java.awt.Color(255, 255, 255));
        Button_RepositorioHorasExtra.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        Button_RepositorioHorasExtra.setForeground(new java.awt.Color(51, 0, 51));
        Button_RepositorioHorasExtra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagen/Entrar.png"))); // NOI18N
        Button_RepositorioHorasExtra.setText("   Repositorio horas extra");
        Button_RepositorioHorasExtra.setBorder(null);
        Button_RepositorioHorasExtra.setBorderPainted(false);
        Button_RepositorioHorasExtra.setContentAreaFilled(false);
        Button_RepositorioHorasExtra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_RepositorioHorasExtra.setFocusPainted(false);
        Button_RepositorioHorasExtra.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Button_RepositorioHorasExtra.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Button_RepositorioHorasExtra.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagen/Entrar2.png"))); // NOI18N
        Button_RepositorioHorasExtra.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagen/Entrar3.png"))); // NOI18N
        Button_RepositorioHorasExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_RepositorioHorasExtraActionPerformed(evt);
            }
        });
        fondo.add(Button_RepositorioHorasExtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 250, 60));

        Button_RepositorioHorasSuplementarias.setBackground(new java.awt.Color(255, 255, 255));
        Button_RepositorioHorasSuplementarias.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        Button_RepositorioHorasSuplementarias.setForeground(new java.awt.Color(51, 0, 51));
        Button_RepositorioHorasSuplementarias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagen/Entrar.png"))); // NOI18N
        Button_RepositorioHorasSuplementarias.setText("   Repositorio horas suplementarias");
        Button_RepositorioHorasSuplementarias.setBorder(null);
        Button_RepositorioHorasSuplementarias.setBorderPainted(false);
        Button_RepositorioHorasSuplementarias.setContentAreaFilled(false);
        Button_RepositorioHorasSuplementarias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_RepositorioHorasSuplementarias.setFocusPainted(false);
        Button_RepositorioHorasSuplementarias.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Button_RepositorioHorasSuplementarias.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Button_RepositorioHorasSuplementarias.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagen/Entrar2.png"))); // NOI18N
        Button_RepositorioHorasSuplementarias.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagen/Entrar3.png"))); // NOI18N
        Button_RepositorioHorasSuplementarias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_RepositorioHorasSuplementariasActionPerformed(evt);
            }
        });
        fondo.add(Button_RepositorioHorasSuplementarias, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 390, 260, 60));

        Button_HExtra.setBackground(new java.awt.Color(255, 255, 255));
        Button_HExtra.setFont(new java.awt.Font("Segoe Print", 0, 8)); // NOI18N
        Button_HExtra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagen/siguiente.png"))); // NOI18N
        Button_HExtra.setBorder(null);
        Button_HExtra.setBorderPainted(false);
        Button_HExtra.setContentAreaFilled(false);
        Button_HExtra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_HExtra.setFocusPainted(false);
        Button_HExtra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_HExtra.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagen/siguiente.png"))); // NOI18N
        Button_HExtra.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagen/siguiente2_1.png"))); // NOI18N
        Button_HExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_HExtraActionPerformed(evt);
            }
        });
        fondo.add(Button_HExtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 90, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagen/ImagenFondo.png"))); // NOI18N
        jLabel2.setFocusCycleRoot(true);
        jLabel2.setFocusTraversalPolicyProvider(true);
        jLabel2.setInheritsPopupMenu(false);
        jLabel2.setRequestFocusEnabled(false);
        jLabel2.setVerifyInputWhenFocusTarget(false);
        fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_HSuplementariasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_HSuplementariasActionPerformed
        Opcion4_HorasSuplementarias ventanahorasSuplementarias = (verificar == true) ? new Opcion4_HorasSuplementarias(usuario) : new Opcion4_HorasSuplementarias();
        ventanahorasSuplementarias.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Button_HSuplementariasActionPerformed

    private void Button_KardexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_KardexActionPerformed
        Opcion1_Kardex kar = (verificar == true) ? new Opcion1_Kardex(usuario) : new Opcion1_Kardex();
        kar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Button_KardexActionPerformed

    private void Button_LibroMayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_LibroMayorActionPerformed
        Opcion2_LibroMayor lit = (verificar == true) ? new Opcion2_LibroMayor(usuario) : new Opcion2_LibroMayor();
        lit.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Button_LibroMayorActionPerformed

    private void Button_HExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_HExtraActionPerformed
        Opcion3_HorasExtra ventanHorasExtra = (verificar == true) ? new Opcion3_HorasExtra(usuario) : new Opcion3_HorasExtra();
        ventanHorasExtra.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Button_HExtraActionPerformed

    
    private void btnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialActionPerformed
        OpcionUsuarioBD_HistorialUsuarios mostrar = new OpcionUsuarioBD_HistorialUsuarios(usuario);
        mostrar.txtHistorial.setText(datosUsuario.leerInfo());
        mostrar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHistorialActionPerformed

    private void Button_RepositorioHorasSuplementariasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_RepositorioHorasSuplementariasActionPerformed
        sentenciasIgualesRepositorio("REPOSITORIO HORAS SUPLEMENTARIAS", "Horas suplementarias");
    }//GEN-LAST:event_Button_RepositorioHorasSuplementariasActionPerformed

    private void Button_RepositorioHorasExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_RepositorioHorasExtraActionPerformed
        sentenciasIgualesRepositorio("*_*_*_*_* REPOSITORIO HORAS EXTRA *_*_*_*_*", "Horas extra");
    }//GEN-LAST:event_Button_RepositorioHorasExtraActionPerformed

    private void Button_RepositorioLibroMayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_RepositorioLibroMayorActionPerformed
        sentenciasIgualesRepositorio("*_*_*_* REPOSITORIO LIBRO MAYOR *_*_*_*", "Libro Mayor");
    }//GEN-LAST:event_Button_RepositorioLibroMayorActionPerformed

    private void Button_RepositorioKardexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_RepositorioKardexActionPerformed
        sentenciasIgualesRepositorio("*_*_*_*_*_* REPOSITORIO KARDEX *_*_*_*_*_*", "Kardex");
    }//GEN-LAST:event_Button_RepositorioKardexActionPerformed

    private void sentenciasIgualesRepositorio(String titulo, String opcion) {
        OpcionUsuarioBD_RepositoriosPDF ven = new OpcionUsuarioBD_RepositoriosPDF(usuario, titulo, opcion);
        ven.setVisible(true);
        this.dispose();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new MenuOpciones().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_HExtra;
    private javax.swing.JButton Button_HSuplementarias;
    private javax.swing.JButton Button_Kardex;
    private javax.swing.JButton Button_LibroMayor;
    private javax.swing.JButton Button_RepositorioHorasExtra;
    private javax.swing.JButton Button_RepositorioHorasSuplementarias;
    private javax.swing.JButton Button_RepositorioKardex;
    private javax.swing.JButton Button_RepositorioLibroMayor;
    private javax.swing.JButton btnHistorial;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel txtNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
