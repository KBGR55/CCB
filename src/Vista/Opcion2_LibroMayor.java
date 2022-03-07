package Vista;

import Controlador.ControladorLibroMayor;
import Controlador.ControladorPlantillaPDF;
import Modelo.LibroMayor;
import Modelo.PlantillaPDF;
import Modelo.Usuario;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 * @author K.G 
 */
public class Opcion2_LibroMayor extends javax.swing.JFrame {

    ArrayList<ControladorLibroMayor> lits;
    DefaultTableModel modeloTabla;
    public boolean verificar;
    public Usuario usuario;

    public Opcion2_LibroMayor() {
        sentencias(false, "Usuario");
        opRepositorio.setEnabled(verificar);
    }

    public Opcion2_LibroMayor(Usuario usuario) {
        this.usuario = usuario;
        sentencias(true, usuario.getNombre());
    }

    private void sentencias(boolean a, String nomUsuario) {
        initComponents();
        this.verificar = a;
        this.setLocationRelativeTo(Opcion2_LibroMayor.this);
        this.setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/Vista/Imagen/logo.png")).getImage());
        txt_NombreUsuario.setText(nomUsuario);
        lits = new ArrayList<>();
        modeloTabla = (DefaultTableModel) jtbDatosLibroMayor.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_NombreUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombreEmpresa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_Cuenta = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        txtDetalle = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtRef = new javax.swing.JTextField();
        obFecha = new com.toedter.calendar.JDateChooser();
        btnDebe = new javax.swing.JButton();
        btnHaber = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbDatosLibroMayor = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jlbSaldo = new javax.swing.JLabel();
        jlbDebe = new javax.swing.JLabel();
        jlbHaber = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnDeshacer = new javax.swing.JButton();
        txtCantidad = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        generarPDF = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        opRepositorio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora Contable Basica");

        jLabel2.setBackground(new java.awt.Color(255, 51, 102));
        jLabel2.setFont(new java.awt.Font("Wide Latin", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_ LIBRO MAYOR _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        jLabel2.setToolTipText("");
        jLabel2.setOpaque(true);

        jLabel1.setText("Elaborado por : ");

        txt_NombreUsuario.setText("Usuario");

        jLabel3.setText("Nombre de la Empresa :");

        txtNombreEmpresa.setText("Empresa \"La exitosa\"");

        jLabel4.setText("Cuenta :");

        txt_Cuenta.setText("Caja");

        jLabel5.setText("Codigo :");

        txtCodigo.setText("001");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel6.setText("Detalle :");

        jLabel7.setText("Cantidad :");

        jLabel8.setText("Fecha :");

        jLabel9.setText("REF : ");

        btnDebe.setBackground(new java.awt.Color(255, 51, 102));
        btnDebe.setText("DEBE");
        btnDebe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDebe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDebeActionPerformed(evt);
            }
        });

        btnHaber.setBackground(new java.awt.Color(255, 51, 102));
        btnHaber.setText("HABER");
        btnHaber.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHaber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHaberActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jtbDatosLibroMayor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FECHA", "DETALLE", "REF", "DEBE", "HABER", "SALDO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtbDatosLibroMayor);

        jLabel10.setBackground(new java.awt.Color(255, 0, 102));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("TOTAL");
        jLabel10.setOpaque(true);

        jlbSaldo.setBackground(new java.awt.Color(204, 204, 204));
        jlbSaldo.setOpaque(true);

        jlbDebe.setBackground(new java.awt.Color(204, 204, 204));
        jlbDebe.setOpaque(true);

        jlbHaber.setBackground(new java.awt.Color(204, 204, 204));
        jlbHaber.setOpaque(true);

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagen/eliminar.png"))); // NOI18N
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnDeshacer.setBackground(new java.awt.Color(255, 255, 255));
        btnDeshacer.setForeground(new java.awt.Color(255, 255, 255));
        btnDeshacer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagen/deshacer.png"))); // NOI18N
        btnDeshacer.setBorder(null);
        btnDeshacer.setBorderPainted(false);
        btnDeshacer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeshacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeshacerActionPerformed(evt);
            }
        });

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
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
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCantidad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRef, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(obFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDebe, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                            .addComponent(btnHaber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_NombreUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                                    .addComponent(txt_Cuenta))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombreEmpresa)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)))
                            .addComponent(jSeparator2)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlbDebe, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlbHaber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlbSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnEliminar)
                                .addGap(18, 18, 18)
                                .addComponent(btnDeshacer)))
                        .addGap(17, 17, 17))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_NombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txtNombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_Cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDebe))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9)
                                .addComponent(txtRef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(obFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHaber))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlbHaber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlbSaldo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jlbDebe, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDeshacer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarPDFActionPerformed
        String nombDoc = null;
        nombDoc = JOptionPane.showInputDialog("Ingrese el nombre del archivo a generar :");
        if (nombDoc != null) {
            PlantillaPDF pdf = new PlantillaPDF(txt_NombreUsuario.getText(), nombDoc);
            ControladorLibroMayor pdfK = new ControladorLibroMayor();
            pdfK.tablaPDF(txtNombreEmpresa.getText(), txt_Cuenta.getText(), txtCodigo.getText(), lits, pdf);
            mensajes("/Vista/Imagen/Correcto.png", "Correcto", "Pdf creado con exito :)");
        } else {
            mensajes("/Vista/Imagen/Error.png", "Error", "Escribir un nombre para crear el pdf");
        }
    }//GEN-LAST:event_generarPDFActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        MenuOpciones ven = (verificar == true) ? new MenuOpciones(usuario) : new MenuOpciones();
        ven.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnDebeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDebeActionPerformed
        try {
            sentanciasIgualDebeHaber(new LibroMayor(obFecha.getDate(), txtDetalle.getText(), txtRef.getText(), Double.parseDouble(txtCantidad.getText())));
        } catch (NumberFormatException e) {
            mensajes("/Vista/Imagen/Error.png", "Error", "Escribir bien la cantidad (502.51)");
        }
    }//GEN-LAST:event_btnDebeActionPerformed

    private void btnHaberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHaberActionPerformed
        try {
            sentanciasIgualDebeHaber(new LibroMayor(Double.parseDouble(txtCantidad.getText()), obFecha.getDate(), txtDetalle.getText(), txtRef.getText()));
        } catch (NumberFormatException e) {
            mensajes("/Vista/Imagen/Error.png", "Error", "Escribir bien la cantidad (502.51)");
        }
    }//GEN-LAST:event_btnHaberActionPerformed

    private void sentanciasIgualDebeHaber(LibroMayor lit) {
        ControladorLibroMayor libro = new ControladorLibroMayor(lit);
        try {
            libro.calculoSaldos(lits.get(lits.size() - 1).lit.getSaldo());
        } catch (Exception e) {
            libro.calculoSaldos(0.00);
        }
        lits.add(libro);
        modeloTabla.addRow(new Object[]{lit.getFecha(), lit.getDetalle(), lit.getRef(), lit.getDebe(), lit.getHaber(), lit.getSaldo()});
        jlbDebe.setText(libro.sumasDebe(lits));
        jlbHaber.setText(libro.sumasHaber(lits));
        jlbSaldo.setText(lit.getSaldo().toString());
    }

    private void btnDeshacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeshacerActionPerformed
        if (modeloTabla.getRowCount() > 0) {
            modeloTabla.removeRow(modeloTabla.getRowCount() - 1);
            lits.remove(lits.size() - 1);
            ControladorLibroMayor libro = new ControladorLibroMayor();
            jlbDebe.setText(libro.sumasDebe(lits));
            jlbHaber.setText(libro.sumasHaber(lits));
            jlbSaldo.setText(lits.get(lits.size() - 1).lit.getSaldo().toString());
        }
    }//GEN-LAST:event_btnDeshacerActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        for (int i = modeloTabla.getRowCount() - 1; i >= 0; i--) {
            modeloTabla.removeRow(i);
            lits.remove(i);
        }
        jlbDebe.setText("0.00");
        jlbHaber.setText("0.00");
        jlbSaldo.setText("0.00");
    }//GEN-LAST:event_btnEliminarActionPerformed

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
                c.AgregarPDFBaseDatos(ruta1, usuario, nombre, "Libro Mayor");
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

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Opcion2_LibroMayor().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDebe;
    private javax.swing.JButton btnDeshacer;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnHaber;
    private javax.swing.JMenuItem generarPDF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jlbDebe;
    private javax.swing.JLabel jlbHaber;
    private javax.swing.JLabel jlbSaldo;
    private javax.swing.JTable jtbDatosLibroMayor;
    private com.toedter.calendar.JDateChooser obFecha;
    private javax.swing.JMenuItem opRepositorio;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDetalle;
    private javax.swing.JTextField txtNombreEmpresa;
    private javax.swing.JTextField txtRef;
    private javax.swing.JTextField txt_Cuenta;
    private javax.swing.JTextField txt_NombreUsuario;
    // End of variables declaration//GEN-END:variables
}
