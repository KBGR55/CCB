package Vista;

import Controlador.ControladorKardex;
import Controlador.ControladorPlantillaPDF;
import Modelo.Kardex;
import Modelo.PlantillaPDF;
import Modelo.Usuario;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 * @author K.G 
 */

public class Opcion1_Kardex extends javax.swing.JFrame {

    ArrayList<ControladorKardex> kars;
    DefaultTableModel modeloTabla;
    public boolean verificar;
    public Usuario usuario;

    public Opcion1_Kardex() {
        sentencias(false, "Usuario");
        opRepositorio.setEnabled(verificar);
    }

    public Opcion1_Kardex(Usuario usuario) {
        this.usuario = usuario;
        sentencias(true, usuario.getNombre());
    }

    private void sentencias(boolean i, String usu) {
        initComponents();
        this.verificar = i;
        this.setLocationRelativeTo(Opcion1_Kardex.this);
        this.setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/Vista/Imagen/logo.png")).getImage());
        kars = new ArrayList<>();
        modeloTabla = (DefaultTableModel) jTable_Datos.getModel();
        SpinnerNumberModel numero = new SpinnerNumberModel();
        numero.setMinimum(1);
        jsCantidad.setModel(numero);
        jsCantidad.setValue(1);
        txtNombreUsuario.setText(usu);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Datos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtDetalle = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        obFecha = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        txtValorUnitario = new javax.swing.JTextField();
        btnEntrada = new javax.swing.JButton();
        btnSalida = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        txtNombreUsuario = new javax.swing.JTextField();
        txtNombreEmpresa = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtArticulo = new javax.swing.JTextField();
        btnDeshacer = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jsCantidad = new javax.swing.JSpinner();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        generarPDF = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        opRepositorio = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora Contable Basica");

        jLabel2.setBackground(new java.awt.Color(0, 0, 102));
        jLabel2.setFont(new java.awt.Font("Wide Latin", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-  KARDEX -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        jLabel2.setToolTipText("");
        jLabel2.setOpaque(true);

        jLabel1.setText("Nombre de la empresa :");

        jLabel3.setText("Elaborado por:");

        jTable_Datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Detalle", "Cant", "Vr/U", "Total", "Cant", "Vr/U", "Total", "Cant", "Vr/U", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_Datos);

        jLabel4.setText("Detalle:");

        jLabel5.setText("Cantidad:");

        jLabel6.setText("Valor Unitario :");

        jLabel8.setText("Fecha:");

        txtValorUnitario.setText("0.00");

        btnEntrada.setBackground(new java.awt.Color(0, 0, 102));
        btnEntrada.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEntrada.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrada.setText("ENTRADA");
        btnEntrada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradaActionPerformed(evt);
            }
        });

        btnSalida.setBackground(new java.awt.Color(0, 0, 102));
        btnSalida.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalida.setForeground(new java.awt.Color(255, 255, 255));
        btnSalida.setText("SALIDA");
        btnSalida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalidaActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        txtNombreUsuario.setText("Usuario");

        txtNombreEmpresa.setText("Empresa \"La Exitosa\"");

        jLabel9.setText("Codigo:");

        txtCodigo.setText("001");

        jLabel10.setText("Articulo:");

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

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagen/eliminar.png"))); // NOI18N
        btnEliminar.setBorder(null);
        btnEliminar.setBorderPainted(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setBorderPainted(false);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEliminar)
                                .addGap(18, 18, 18)
                                .addComponent(btnDeshacer))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jsCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(obFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                                    .addComponent(txtDetalle))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                    .addComponent(txtCodigo))
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombreEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                                    .addComponent(txtArticulo))))))
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEntrada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(obFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(txtValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jsCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSalida))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDeshacer)
                    .addComponent(btnEliminar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarPDFActionPerformed
        String nombDoc = null;
        nombDoc = JOptionPane.showInputDialog("Ingrese el nombre del archivo a generar :");
        if (nombDoc != null) {
            PlantillaPDF pdf = new PlantillaPDF(txtNombreUsuario.getText(), nombDoc);
            ControladorKardex pdfK = new ControladorKardex();
            pdfK.tablaPDF(txtNombreEmpresa.getText(), txtArticulo.getText(), txtCodigo.getText(), kars, pdf);
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

    private void btnSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalidaActionPerformed
        try {
            sentenciasEntradaSalida(new Kardex(Integer.parseInt(jsCantidad.getValue().toString()), Double.parseDouble(txtValorUnitario.getText()), obFecha.getDate(), txtDetalle.getText()));
        } catch (NumberFormatException e) {
            mensajes("/Vista/Imagen/Error.png", "Error", "Escribir bien el valor unitario (12.55)");
        }
    }//GEN-LAST:event_btnSalidaActionPerformed

    private void btnEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradaActionPerformed
        try {
            sentenciasEntradaSalida(new Kardex(obFecha.getDate(), txtDetalle.getText(), Integer.parseInt(jsCantidad.getValue().toString()), Double.parseDouble(txtValorUnitario.getText())));
        } catch (NumberFormatException e) {
            mensajes("/Vista/Imagen/Error.png", "Error", "Escribir bien el valor unitario (12.55)");
        }
    }//GEN-LAST:event_btnEntradaActionPerformed

    private void sentenciasEntradaSalida(Kardex knew) {
        ControladorKardex kar = new ControladorKardex(knew);
        kar.calculoTotal();
        try {
            kar.calculoSaldos(kars.get(kars.size() - 1).kar1.getCantidadTotal(), kars.get(kars.size() - 1).kar1.getTotalTotal());
        } catch (Exception e) {
            kar.calculoSaldos(0, 0.0);
        }
        kars.add(kar);
        modeloTabla.addRow(new Object[]{knew.getFecha(), knew.getDetalle(), knew.getCantidadEntrada(), knew.getValorUnitarioEntrada(), knew.getTotalEntrada(), knew.getCantidadSalida(), knew.getValorUnitarioSalida(), knew.getTotalSalida(), knew.getCantidadTotal(), knew.getValorUnitarioTotal(), knew.getTotalTotal()});
    }

    private void btnDeshacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeshacerActionPerformed
        if (modeloTabla.getRowCount() > 0) {
            modeloTabla.removeRow(modeloTabla.getRowCount() - 1);
            kars.remove(kars.size() - 1);
        }
    }//GEN-LAST:event_btnDeshacerActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        for (int i = modeloTabla.getRowCount() - 1; i >= 0; i--) {
            modeloTabla.removeRow(i);
            kars.remove(i);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void opRepositorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opRepositorioActionPerformed
        String ruta="";
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
            if (ruta1.length() != 0){
                c.AgregarPDFBaseDatos(ruta1, usuario, nombre,"Kardex");
                mensajes("/Vista/Imagen/Correcto.png", "Correcto", "Ppf guardado con exito :)");
            }else{
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
            new Opcion1_Kardex().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeshacer;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEntrada;
    private javax.swing.JButton btnSalida;
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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable_Datos;
    private javax.swing.JSpinner jsCantidad;
    private com.toedter.calendar.JDateChooser obFecha;
    private javax.swing.JMenuItem opRepositorio;
    private javax.swing.JTextField txtArticulo;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDetalle;
    private javax.swing.JTextField txtNombreEmpresa;
    private javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JTextField txtValorUnitario;
    // End of variables declaration//GEN-END:variables
}
