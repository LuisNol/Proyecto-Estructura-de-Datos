package Vista;

import java.awt.Graphics;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import Modelo.CribaEratostenes;
import Modelo.PrimoFuerzaBruta;


class datos {

    private String Tamaño, Tipo;
    private long Inicio, Fin, Resultado;

    public datos(String Tamaño, String Tipo, long Inicio, long Fin, long Resultado) {
        this.Tamaño = Tamaño;
        this.Tipo = Tipo;
        this.Inicio = Inicio;
        this.Fin = Fin;
        this.Resultado = Resultado;
    }

    public String getTamaño() {
        return Tamaño;
    }

    public String getTipo() {
        return Tipo;
    }

    public long getInicio() {
        return Inicio;
    }

    public long getFin() {
        return Fin;
    }

    public long getResultado() {
        return Resultado;
    }

    public String dato() {
        return this.Tamaño + "," + this.Tipo + "," + this.Inicio + "," + this.Fin + "," + this.Resultado;
    }
}

class metodoTXT {

    ArrayList<datos> lista = new ArrayList<>();
    File arch = new File("ABC.txt");

    public metodoTXT(ArrayList<datos> lista) {
        this.lista = lista;
    }

    public metodoTXT() {
    }

    void escribir() throws IOException {
        if (!arch.exists()) {
            arch.createNewFile();
        }
        PrintWriter pw = new PrintWriter(arch);
        for (datos p : lista) {
            pw.println(p.dato());
        }
        pw.close();
    }

    void leer() throws IOException {
        if (!arch.exists()) {
            arch.createNewFile();
        }
        BufferedReader br = new BufferedReader(new FileReader(arch));
        String cad;
        while ((cad = br.readLine()) != null) {
            String cad2[] = cad.split(",");
            this.lista.add(new datos(cad2[0].trim(), cad2[1].trim(), Long.parseLong(cad2[2]), Long.parseLong(cad2[3]), Long.parseLong(cad2[4])));
        }
    }

    void ingresar(datos p) {
        lista.add(p);
    }

    public ArrayList<datos> getLista() {
        return lista;
    }
}

public class vistaS1 extends javax.swing.JFrame {

    FondoPanel fondo = new FondoPanel();
    ArrayList<datos> lista;
    int n = 0;
    metodoTXT mtxt;
    public vistaS1() throws IOException {
       
       this.setContentPane(fondo);
        this.setTitle("PROYECTO ALGORITMOS");
        Image imagen = new ImageIcon(getClass().getResource("insignia.png")).getImage();
        initComponents(); 
        this.txtA_pantallita.append("\t\t*******************BIENVENIDO*****************");
        lista = new ArrayList<>();
        mtxt = new metodoTXT();
        mtxt.leer();
        lista = mtxt.getLista();
        llenarTabla();
        btng_grupo.add(rbtn_FuerzaBruta);
        btng_grupo.add(rbtn_eratostenes);
        btng_grupo.add(rbtn_criba_sumaran);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.txtA_pantallita.setEditable(false);
    }

    private void llenarTabla() {
        String cabeza[] = {"Tamaño", "Tipo", "Inicio ", "Fin", "Resultado (ns)"};
        DefaultTableModel modelodef = new DefaultTableModel(cabeza, lista.size());
        tbl_datos.setModel(modelodef);
        TableModel modelo = tbl_datos.getModel();
        for (int i = 0; i < lista.size(); i++) {
            datos d = lista.get(i);
            modelo.setValueAt(d.getTamaño(), i, 0);
            modelo.setValueAt(d.getTipo(), i, 1);
            modelo.setValueAt(d.getInicio(), i, 2);
            modelo.setValueAt(d.getFin(), i, 3);
            modelo.setValueAt(d.getResultado(), i, 4);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btng_grupo = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rbtn_eratostenes = new javax.swing.JRadioButton();
        rbtn_FuerzaBruta = new javax.swing.JRadioButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_datos = new javax.swing.JTable();
        btn_Exportar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_numero_elementos = new javax.swing.JTextField();
        btn_medirtiempo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtA_pantallita = new javax.swing.JTextArea();
        rbtn_criba_sumaran = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 172, 15));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 153, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("ANALISIS DE ALGORITMOS DE LA BUSQUEDA DE NUMEROS PRIMOS");

        jLabel3.setText("Tipo");

        rbtn_eratostenes.setBackground(new java.awt.Color(51, 51, 51));
        rbtn_eratostenes.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        rbtn_eratostenes.setForeground(new java.awt.Color(153, 255, 0));
        rbtn_eratostenes.setSelected(true);
        rbtn_eratostenes.setText("ERATOSTENES");
        rbtn_eratostenes.setBorderPainted(true);
        rbtn_eratostenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_eratostenesActionPerformed(evt);
            }
        });

        rbtn_FuerzaBruta.setBackground(new java.awt.Color(0, 0, 0));
        rbtn_FuerzaBruta.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        rbtn_FuerzaBruta.setForeground(new java.awt.Color(255, 255, 0));
        rbtn_FuerzaBruta.setText("FUERZA BRUTA");
        rbtn_FuerzaBruta.setBorderPainted(true);
        rbtn_FuerzaBruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_FuerzaBrutaActionPerformed(evt);
            }
        });

        jDesktopPane1.setBackground(new java.awt.Color(102, 204, 0));
        jDesktopPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jDesktopPane1.setForeground(new java.awt.Color(0, 102, 0));

        tbl_datos.setBackground(new java.awt.Color(51, 255, 51));
        tbl_datos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 204, 255)));
        tbl_datos.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        tbl_datos.setForeground(new java.awt.Color(0, 0, 102));
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

        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
        );

        btn_Exportar.setBackground(new java.awt.Color(204, 204, 255));
        btn_Exportar.setText(" EXPORTAR  DATOS");
        btn_Exportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExportarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel4.setText("NUMERO ENECIMO");

        txt_numero_elementos.setBackground(new java.awt.Color(204, 204, 255));
        txt_numero_elementos.setText("0");
        txt_numero_elementos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_numero_elementosActionPerformed(evt);
            }
        });

        btn_medirtiempo.setBackground(new java.awt.Color(102, 102, 102));
        btn_medirtiempo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_medirtiempo.setForeground(new java.awt.Color(153, 255, 255));
        btn_medirtiempo.setText("MEDIR TIEMPO");
        btn_medirtiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_medirtiempoActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(153, 255, 51));
        jLabel5.setForeground(new java.awt.Color(204, 255, 153));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/insignia.png"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(204, 204, 204)));

        txtA_pantallita.setBackground(new java.awt.Color(153, 255, 153));
        txtA_pantallita.setColumns(20);
        txtA_pantallita.setRows(5);
        jScrollPane2.setViewportView(txtA_pantallita);

        rbtn_criba_sumaran.setBackground(new java.awt.Color(0, 0, 0));
        rbtn_criba_sumaran.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        rbtn_criba_sumaran.setForeground(new java.awt.Color(255, 255, 0));
        rbtn_criba_sumaran.setText("CRIBA DE SUMARAN");
        rbtn_criba_sumaran.setBorderPainted(true);
        rbtn_criba_sumaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_criba_sumaranActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(78, 78, 78)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rbtn_FuerzaBruta)
                                            .addComponent(rbtn_eratostenes)
                                            .addComponent(rbtn_criba_sumaran)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(106, 106, 106)
                                        .addComponent(btn_Exportar)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)))
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(6, 6, 6)
                                .addComponent(txt_numero_elementos, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(144, 144, 144)
                                .addComponent(btn_medirtiempo)
                                .addGap(175, 175, 175)
                                .addComponent(jLabel3)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(65, 65, 65)
                                        .addComponent(jLabel4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addComponent(jLabel3))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(txt_numero_elementos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(btn_medirtiempo))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbtn_eratostenes)
                                .addGap(18, 18, 18)
                                .addComponent(rbtn_FuerzaBruta)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)))
                        .addComponent(rbtn_criba_sumaran)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(btn_Exportar)
                        .addGap(29, 29, 29)))
                .addComponent(jDesktopPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtn_eratostenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_eratostenesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtn_eratostenesActionPerformed

    private void rbtn_FuerzaBrutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_FuerzaBrutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtn_FuerzaBrutaActionPerformed

    private void btn_ExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExportarActionPerformed

    }//GEN-LAST:event_btn_ExportarActionPerformed

    private void btn_medirtiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_medirtiempoActionPerformed
        this.txtA_pantallita.setText("");
        n = Integer.parseInt(this.txt_numero_elementos.getText().trim());
        long inicio = 0;
        long fin = 0;
        CribaEratostenes crivbaE=new CribaEratostenes();
        PrimoFuerzaBruta PfB1= new PrimoFuerzaBruta();
            if (this.rbtn_eratostenes.isSelected()) {
                inicio = System.nanoTime();
                crivbaE.Calcular(n);
                fin = System.nanoTime();
                lista.add(new datos(n + "", "CRIBA DE ERATOSTENES", inicio, fin, fin - inicio));
               this.txtA_pantallita.setText("\t\t+++ "+n+" elementos pasados por la criba de eratostenes  +++\n \t\t*** numero de primos enontrados = "
                       + ""+crivbaE.getCount()+"***");
            }  
            
            if(this.rbtn_FuerzaBruta.isSelected()){
        
                inicio = System.nanoTime();
                PfB1.primo(n);
                fin = System.nanoTime();
                lista.add(new datos(n + "", "ALGORITMO DE FUERZA BRUTA", inicio, fin, fin - inicio));
                this.txtA_pantallita.setText("\t\t+++ "+n+" elementos pasados por el algritmo de fueza bruta  +++\n \t\t*** numero de primos enontrados = "
                       + ""+PfB1.getCantidad()+"***");
            }
            JOptionPane.showMessageDialog(null, "CALCULO FINALIZADO" );
         mtxt = new metodoTXT(lista);
        try {
            mtxt.escribir();
        
         } catch (IOException ex) {
           mtxt = new metodoTXT(lista);   Logger.getLogger(vistaS1.class.getName()).log(Level.SEVERE, null, ex);
         }
            llenarTabla();

    }//GEN-LAST:event_btn_medirtiempoActionPerformed

    private void txt_numero_elementosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_numero_elementosActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_txt_numero_elementosActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseDragged

    private void rbtn_criba_sumaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_criba_sumaranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtn_criba_sumaranActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new vistaS1().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(vistaS1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_Exportar;
    public javax.swing.JButton btn_medirtiempo;
    private javax.swing.ButtonGroup btng_grupo;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JRadioButton rbtn_FuerzaBruta;
    private javax.swing.JRadioButton rbtn_criba_sumaran;
    public javax.swing.JRadioButton rbtn_eratostenes;
    public javax.swing.JTable tbl_datos;
    public javax.swing.JTextArea txtA_pantallita;
    private javax.swing.JTextField txt_numero_elementos;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("UNAS.png")).getImage();
            g.drawImage(imagen, 150, 0, 600, 40, this);
            setOpaque(false);
            super.paint(g);
        }

    }
}
