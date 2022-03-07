package Vista;

import Modelo.Usuario;
import javax.swing.ImageIcon;

/**
 * @author K.G 
 */
public class OpcionUsuarioBD_HistorialUsuarios extends javax.swing.JFrame {

    Usuario usuario;

    public OpcionUsuarioBD_HistorialUsuarios(Usuario usuario) {
        initComponents();
        this.setLocationRelativeTo(OpcionUsuarioBD_HistorialUsuarios.this);
        this.setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/Vista/Imagen/logo.png")).getImage());
        this.usuario = usuario;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtHistorial = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        btn_Regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora de Contabilidad Basica");

        txtHistorial.setEditable(false);
        txtHistorial.setBackground(new java.awt.Color(204, 255, 204));
        txtHistorial.setColumns(20);
        txtHistorial.setRows(5);
        jScrollPane1.setViewportView(txtHistorial);

        jLabel2.setBackground(new java.awt.Color(0, 51, 51));
        jLabel2.setFont(new java.awt.Font("Wide Latin", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("*************** HISTORIAL DE USUARIOS ***************");
        jLabel2.setToolTipText("");
        jLabel2.setOpaque(true);

        btn_Regresar.setBackground(new java.awt.Color(255, 204, 204));
        btn_Regresar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_Regresar.setForeground(new java.awt.Color(51, 0, 51));
        btn_Regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagen/Izquierda.png"))); // NOI18N
        btn_Regresar.setText("   REGRESAR AL MENU");
        btn_Regresar.setBorderPainted(false);
        btn_Regresar.setContentAreaFilled(false);
        btn_Regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Regresar.setDefaultCapable(false);
        btn_Regresar.setFocusPainted(false);
        btn_Regresar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_Regresar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_Regresar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagen/Izquierda2.png"))); // NOI18N
        btn_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btn_Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegresarActionPerformed
        MenuOpciones ven = new MenuOpciones(usuario);
        ven.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_RegresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Regresar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextArea txtHistorial;
    // End of variables declaration//GEN-END:variables
}
