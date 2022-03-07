package Vista;

import Controlador.ControladorPlantillaPDF;
import Controlador.ControladorSuplementarias;
import Modelo.PlantillaPDF;
import Modelo.Usuario;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * @author K.G 
 */
public class Opcion4_HorasSuplementarias extends javax.swing.JFrame {

    public ControladorSuplementarias horasSuplementarias;
    public boolean verificar;
    public Usuario usuario;

    public Opcion4_HorasSuplementarias() {
        initComponents();
        sentencias();
        this.verificar = false;
        opRepositorio.setEnabled(verificar);
    }

    public Opcion4_HorasSuplementarias(Usuario usuario) {
        initComponents();
        sentencias();
        this.verificar = true;
        this.usuario = usuario;
        txtNombre.setText(usuario.getNombre());
    }

    private void sentencias() {
        this.setLocationRelativeTo(Opcion4_HorasSuplementarias.this);
        this.setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/Vista/Imagen/logo.png")).getImage());
        SpinnerNumberModel numero = new SpinnerNumberModel();
        numero.setMinimum(1);
        txtHorasSuplementariasTrab.setModel(numero);
        txtHorasSuplementariasTrab.setValue(1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_sueldoBasico = new javax.swing.JTextField();
        jButton_enviar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel_Resultado = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtHorasSuplementariasTrab = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        generarPDF = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        opRepositorio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora de Contabilidad Basica");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 37)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("       CALCULAR HORAS SUPLEMENTARIAS");
        jLabel1.setToolTipText("");

        jLabel2.setBackground(new java.awt.Color(0, 51, 51));
        jLabel2.setFont(new java.awt.Font("Vladimir Script", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-");
        jLabel2.setToolTipText("");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51)));
        jLabel2.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Horas suplementarias trabajadas :");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Sueldo Basico : ");

        txt_sueldoBasico.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_sueldoBasico.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_sueldoBasico.setText("425.00");

        jButton_enviar.setBackground(new java.awt.Color(0, 51, 51));
        jButton_enviar.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jButton_enviar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_enviar.setText("CALCULAR");
        jButton_enviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_enviarActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("RESULTADO :");

        jLabel_Resultado.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel_Resultado.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_Resultado.setText("0.00");

        jLabel6.setBackground(new java.awt.Color(0, 51, 51));
        jLabel6.setFont(new java.awt.Font("Vladimir Script", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        jLabel6.setToolTipText("");
        jLabel6.setOpaque(true);

        jLabel7.setBackground(new java.awt.Color(0, 51, 51));
        jLabel7.setFont(new java.awt.Font("Vladimir Script", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        jLabel7.setToolTipText("");
        jLabel7.setOpaque(true);

        txtHorasSuplementariasTrab.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Elaborado por :");

        txtNombre.setText("Usuario");

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setBorderPainted(false);

        jMenu4.setForeground(new java.awt.Color(255, 255, 255));
        jMenu4.setText("Opciones");
        jMenu4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        generarPDF.setBackground(new java.awt.Color(255, 255, 255));
        generarPDF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        generarPDF.setForeground(new java.awt.Color(0, 0, 0));
        generarPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagen/imagPDF.png"))); // NOI18N
        generarPDF.setText("Generar PDF ");
        generarPDF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        generarPDF.setOpaque(true);
        generarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarPDFActionPerformed(evt);
            }
        });
        jMenu4.add(generarPDF);

        jMenuItem1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagen/imagMenu.png"))); // NOI18N
        jMenuItem1.setText("Menu");
        jMenuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem1.setOpaque(true);
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        opRepositorio.setBackground(new java.awt.Color(255, 255, 255));
        opRepositorio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        opRepositorio.setForeground(new java.awt.Color(0, 0, 0));
        opRepositorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagen/Repositorio.png"))); // NOI18N
        opRepositorio.setText("Repositorio");
        opRepositorio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opRepositorio.setOpaque(true);
        opRepositorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opRepositorioActionPerformed(evt);
            }
        });
        jMenu4.add(opRepositorio);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_enviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_sueldoBasico, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                                    .addComponent(txtHorasSuplementariasTrab))))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(3, 3, 3)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHorasSuplementariasTrab, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sueldoBasico, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jButton_enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_enviarActionPerformed
        try {
            horasSuplementarias = new Controlador.ControladorSuplementarias(Integer.parseInt(txtHorasSuplementariasTrab.getValue().toString()), Double.parseDouble(txt_sueldoBasico.getText()));
            jLabel_Resultado.setText(String.valueOf(horasSuplementarias.resultado()));
        } catch (NumberFormatException e) {
            mensajes("/Vista/Imagen/Error.png", "Error", "Ingresar de forma correcta la cantidad de sueldo (450.25)");
        } catch (Exception e) {
            mensajes("/Vista/Imagen/Error.png", "Error", "Ocurrio un error !!!");
        }
    }//GEN-LAST:event_jButton_enviarActionPerformed

    private void generarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarPDFActionPerformed
        String nombDoc = null;
        nombDoc = JOptionPane.showInputDialog("Ingrese el nombre del archivo a generar :");
        if (nombDoc != null) {
            try {
                PlantillaPDF planPdf = new PlantillaPDF(txtNombre.getText(), nombDoc);
                horasSuplementarias.tablaPDF(planPdf);
                mensajes("/Vista/Imagen/Correcto.png", "Correcto", "Pdf creado con exito :)");
            } catch (Exception e) {
                mensajes("/Vista/Imagen/Error.png", "Error", "Genere el calculo primero ");
            }
        } else {
            mensajes("/Vista/Imagen/Error.png", "Error", "Escribir un nombre para crear el pdf");
        }
    }//GEN-LAST:event_generarPDFActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        MenuOpciones ven = (verificar == true) ? new MenuOpciones(usuario) : new MenuOpciones();
        ven.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void opRepositorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opRepositorioActionPerformed
        String ruta = "";
        String nombre = null;
        nombre = JOptionPane.showInputDialog("Ingrese el nombre a guardar en el repositorio : ");
        if (nombre != null) {
            JFileChooser j = new JFileChooser();
            j.setFileFilter(new FileNameExtensionFilter("pdf", "pdf"));
            int se = j.showOpenDialog(this);
            if (se == 0) {
                ruta = j.getSelectedFile().getAbsolutePath();
            }
            ControladorPlantillaPDF c = new ControladorPlantillaPDF();
            File ruta1 = new File(ruta);
            if (ruta1.length() != 0) {
                c.AgregarPDFBaseDatos(ruta1, usuario, nombre, "Horas suplementarias");
                mensajes("/Vista/Imagen/Correcto.png", "Correcto", "Ppf guardado con exito :)");
            } else {
                mensajes("/Vista/Imagen/Error.png", "Error", "Ingresar el pdf a guardar");
            }
        } else {
            mensajes("/Vista/Imagen/Error.png", "Error", "Ingresar el nombre para guardar el pdf");
        }
    }//GEN-LAST:event_opRepositorioActionPerformed

    private void mensajes(String rutaImg, String titulo, String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.PLAIN_MESSAGE, new ImageIcon(getClass().getResource(rutaImg)));
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new Opcion4_HorasSuplementarias().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem generarPDF;
    private javax.swing.JButton jButton_enviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_Resultado;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem opRepositorio;
    private javax.swing.JSpinner txtHorasSuplementariasTrab;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txt_sueldoBasico;
    // End of variables declaration//GEN-END:variables
}
