package Vista;

import Controlador.ControladorPlantillaPDF;
import Modelo.Usuario;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 * @author K.G
 */

public class OpcionUsuarioBD_RepositoriosPDF extends javax.swing.JFrame {
    public ControladorPlantillaPDF i;
    public String opcion;
    Usuario usuario;

    public OpcionUsuarioBD_RepositoriosPDF(Usuario usuario, String titulo,String opcion) {
        initComponents();
        this.setLocationRelativeTo(OpcionUsuarioBD_RepositoriosPDF.this);
        this.setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/Vista/Imagen/logo.png")).getImage());
        this.usuario = usuario;
        txt_titulo.setText(titulo);
        i = new ControladorPlantillaPDF();
        this.opcion=opcion;
        i.verTabla(jT_tablaPDF,usuario,opcion);
    }

    public OpcionUsuarioBD_RepositoriosPDF() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jT_tablaPDF = new javax.swing.JTable();
        txt_titulo = new javax.swing.JLabel();
        btn_Regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora de Contabilidad Basica");

        jT_tablaPDF.setBackground(new java.awt.Color(255, 204, 204));
        jT_tablaPDF.setForeground(new java.awt.Color(51, 0, 51));
        jT_tablaPDF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PDF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jT_tablaPDF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jT_tablaPDFMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jT_tablaPDF);

        txt_titulo.setBackground(new java.awt.Color(255, 204, 204));
        txt_titulo.setFont(new java.awt.Font("Wide Latin", 0, 18)); // NOI18N
        txt_titulo.setForeground(new java.awt.Color(51, 0, 51));
        txt_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_titulo.setToolTipText("");
        txt_titulo.setOpaque(true);

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
            .addComponent(txt_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegresarActionPerformed
        MenuOpciones ven = new MenuOpciones(usuario);
        ven.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_RegresarActionPerformed

    private void jT_tablaPDFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jT_tablaPDFMouseClicked
       int column = jT_tablaPDF.getColumnModel().getColumnIndexAtX(evt.getX());
       int fila = evt.getY() / jT_tablaPDF.getRowHeight();
       if (fila < jT_tablaPDF.getRowCount() && fila >= 0 && column < jT_tablaPDF.getColumnCount() && column >= 0) {
            String nombre = (String) jT_tablaPDF.getValueAt(fila, 0);
            Object value = jT_tablaPDF.getValueAt(fila, column);
            if (value instanceof JButton) {
                ((JButton) value).doClick();
                JButton boton = (JButton) value;
                if (boton.getText().equals("No hay archivo")) {
                    JOptionPane.showMessageDialog(null, "No hay archivo","Error", JOptionPane.PLAIN_MESSAGE, new ImageIcon(getClass().getResource("/Vista/Imagen/Error.png")));
                } else {
                    i.ejecutarPDF(opcion,nombre);
                    try {
                        Desktop.getDesktop().open(new File("ArchivoAbiertoExito.pdf"));
                    } catch (IOException ex) {
                    }
                }
            }
        }
    }//GEN-LAST:event_jT_tablaPDFMouseClicked

    public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(() -> {
        new OpcionUsuarioBD_RepositoriosPDF().setVisible(true);
    });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Regresar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jT_tablaPDF;
    private javax.swing.JLabel txt_titulo;
    // End of variables declaration//GEN-END:variables
}
