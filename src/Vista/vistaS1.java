package Vista;

import java.awt.Toolkit;

public class vistaS1 extends javax.swing.JFrame {

    public vistaS1(){
        this.setTitle("PROYECTO ALGORITMOS");
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/tamizado.png")));
        this.txtA_pantallita.append("\t\t\t*******************BIENVENIDO*****************");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.txtA_pantallita.setEditable(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btng_grupo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        btn_Exportar = new javax.swing.JButton();
        btn_medirtiempo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtA_pantallita = new javax.swing.JTextArea();
        txt_numero_elementos = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_datos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 153, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ANALISIS DE ALGORITMOS DE LA BUSQUEDA DE NUMEROS PRIMOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        btn_Exportar.setBackground(new java.awt.Color(102, 102, 255));
        btn_Exportar.setForeground(new java.awt.Color(51, 255, 153));
        btn_Exportar.setText(" EXPORTAR  DATOS");
        btn_Exportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExportarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Exportar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 580, -1, -1));

        btn_medirtiempo.setBackground(new java.awt.Color(102, 102, 102));
        btn_medirtiempo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_medirtiempo.setForeground(new java.awt.Color(153, 255, 255));
        btn_medirtiempo.setText("MEDIR TIEMPO");
        btn_medirtiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_medirtiempoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_medirtiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 153, 255));
        jLabel4.setText("NUMERO ENECIMO");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        txtA_pantallita.setBackground(new java.awt.Color(153, 255, 153));
        txtA_pantallita.setColumns(20);
        txtA_pantallita.setRows(5);
        txtA_pantallita.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        txtA_pantallita.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtA_pantallitaCaretUpdate(evt);
            }
        });
        txtA_pantallita.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtA_pantallitaPropertyChange(evt);
            }
        });
        txtA_pantallita.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtA_pantallitaKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(txtA_pantallita);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 640, 50));

        txt_numero_elementos.setBackground(new java.awt.Color(204, 204, 255));
        txt_numero_elementos.setText("0");
        txt_numero_elementos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_numero_elementosActionPerformed(evt);
            }
        });
        getContentPane().add(txt_numero_elementos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 250, -1));

        tbl_datos.setBackground(new java.awt.Color(0, 51, 51));
        tbl_datos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 204, 255)));
        tbl_datos.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        tbl_datos.setForeground(new java.awt.Color(153, 204, 255));
        tbl_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_datos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbl_datos.setSelectionBackground(new java.awt.Color(0, 204, 204));
        tbl_datos.setSelectionForeground(new java.awt.Color(0, 51, 204));
        jScrollPane1.setViewportView(tbl_datos);
        if (tbl_datos.getColumnModel().getColumnCount() > 0) {
            tbl_datos.getColumnModel().getColumn(0).setResizable(false);
            tbl_datos.getColumnModel().getColumn(1).setResizable(false);
            tbl_datos.getColumnModel().getColumn(2).setResizable(false);
            tbl_datos.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 850, 410));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 580, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/estado.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 90, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoprin1 (2).png"))); // NOI18N
        jLabel6.setText("jLabel6");
        jLabel6.setMinimumSize(new java.awt.Dimension(600, 600));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, -20, 940, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExportarActionPerformed

    }//GEN-LAST:event_btn_ExportarActionPerformed

    private void btn_medirtiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_medirtiempoActionPerformed

    }//GEN-LAST:event_btn_medirtiempoActionPerformed

    private void txt_numero_elementosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_numero_elementosActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txt_numero_elementosActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseDragged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtA_pantallitaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtA_pantallitaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtA_pantallitaKeyReleased

    private void txtA_pantallitaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtA_pantallitaPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txtA_pantallitaPropertyChange

    private void txtA_pantallitaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtA_pantallitaCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_txtA_pantallitaCaretUpdate

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaS1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_Exportar;
    public javax.swing.JButton btn_medirtiempo;
    private javax.swing.ButtonGroup btng_grupo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable tbl_datos;
    public javax.swing.JTextArea txtA_pantallita;
    public javax.swing.JTextField txt_numero_elementos;
    // End of variables declaration//GEN-END:variables

}
