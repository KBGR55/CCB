package Vista;

import Modelo.BaseDatosConexion;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * @author K.G 
 */
public class InicioPrograma extends javax.swing.JFrame {

    private int auxiliar = 0;
    hilo ejecutar = new hilo();
    private boolean realizado = false;

    public InicioPrograma() {
        initComponents();
        InicioPrograma.this.getRootPane().setOpaque(false);
        InicioPrograma.this.getContentPane().setBackground(new Color(0, 0, 0, 0));
        InicioPrograma.this.setBackground(new Color(0, 0, 0, 0));
        this.setResizable(false);
        this.setLocationRelativeTo(InicioPrograma.this);
        setIconImage(new ImageIcon(getClass().getResource("/Vista/Imagen/logo.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTextoCarga = new javax.swing.JLabel();
        barraProgreso = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora de Contabilidad Basica");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        txtTextoCarga.setBackground(new java.awt.Color(51, 0, 51));
        txtTextoCarga.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtTextoCarga.setForeground(new java.awt.Color(255, 255, 255));
        txtTextoCarga.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtTextoCarga.setToolTipText("");
        txtTextoCarga.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        txtTextoCarga.setFocusable(false);
        txtTextoCarga.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        txtTextoCarga.setOpaque(true);

        barraProgreso.setBackground(new java.awt.Color(51, 0, 51));
        barraProgreso.setForeground(new java.awt.Color(255, 255, 255));
        barraProgreso.setOpaque(true);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagen/InicioCCB.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(barraProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(txtTextoCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(403, 403, 403)
                .addComponent(barraProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(480, 480, 480)
                .addComponent(txtTextoCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if (realizado == false) {
            realizado = true;
            barraProgreso.setMaximum(49);
            barraProgreso.setMinimum(0);
            barraProgreso.setStringPainted(true);
            ejecutar.start();
        }
    }//GEN-LAST:event_formWindowActivated

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new InicioPrograma().setVisible(true);
        });
    }

    private class hilo extends Thread {

        @Override
        public void run() {
            try {
                while (true) {
                    auxiliar++;
                    barraProgreso.setValue(auxiliar);
                    repaint();
                    switch (auxiliar) {
                        case 3 ->
                            txtTextoCarga.setText("Cargando programa...");
                        case 10-> 
                            txtTextoCarga.setText("Actualizando programa...");
                        case 15 ->
                            txtTextoCarga.setText("Buscando imagenes...");
                        case 20 ->
                            txtTextoCarga.setText("Buscando base de datos...");
                        case 48 -> {
                            txtTextoCarga.setText("Carga finalizada...");
                            boolean verificar = false;
                            BaseDatosConexion bd = new BaseDatosConexion();
                            verificar =bd.getVerificar();
                            if (verificar == true) {
                                MenuOpcionesUsuario menuConBase = new MenuOpcionesUsuario();
                                menuConBase.setVisible(true);
                                menuConBase.setLocationRelativeTo(InicioPrograma.this);
                                mensajeFuncionamiento("/Vista/Imagen/BaseDatos.png","Con base de datos");
                                } else {
                                MenuOpciones menuSinBase = new MenuOpciones();
                                menuSinBase.setVisible(true);
                                menuSinBase.setLocationRelativeTo(InicioPrograma.this);
                                mensajeFuncionamiento("/Vista/Imagen/SinBaseDatos.png","Sin base de datos");
                            }
                        }
                    }
                    Thread.sleep(100);
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        private void mensajeFuncionamiento(String rutaImg,String conSinBase){
            InicioPrograma.this.dispose();
            Icon icon=new ImageIcon(getClass().getResource(rutaImg));
            JOptionPane.showMessageDialog(null, conSinBase, "Funcionamiento", JOptionPane.PLAIN_MESSAGE, icon);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barraProgreso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel txtTextoCarga;
    // End of variables declaration//GEN-END:variables
}
