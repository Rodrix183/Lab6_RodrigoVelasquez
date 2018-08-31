package lab6_rodrigovelasquez;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LOGIN extends javax.swing.JFrame {

    public LOGIN() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_nesflis = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        tf_nombrePeli = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_duracionPeli = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        rb3 = new javax.swing.JRadioButton();
        rb4 = new javax.swing.JRadioButton();
        rb5 = new javax.swing.JRadioButton();
        rb6 = new javax.swing.JRadioButton();
        rb7 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        tf_directorPeli = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tf_companiaPeli = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tf_idiomaPeli = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        rb_dub1 = new javax.swing.JRadioButton();
        rb_dub2 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        rb_sub1 = new javax.swing.JRadioButton();
        rb_sub2 = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        tf_actoresPeli3 = new javax.swing.JTextField();
        tf_actoresPeli1 = new javax.swing.JTextField();
        tf_actoresPeli2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        tf_nombreSerie = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tf_duracionSerie = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        tf_temporadas = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        tf_productora = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        tf_idiomaSerie = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        rb_dub3 = new javax.swing.JRadioButton();
        rb_dub4 = new javax.swing.JRadioButton();
        jLabel20 = new javax.swing.JLabel();
        tf_actoresSerie1 = new javax.swing.JTextField();
        tf_actoresSerie2 = new javax.swing.JTextField();
        tf_actoresSerie3 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        rb_sub3 = new javax.swing.JRadioButton();
        rb_sub4 = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        tf_catSerie = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        arbol = new javax.swing.JTree();
        jPanel4 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_user = new javax.swing.JTextField();
        pf_password = new javax.swing.JPasswordField();

        jd_nesflis.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(tf_nombrePeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 11, 159, -1));

        jLabel4.setText("Nombre");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, -1, -1));
        jPanel1.add(tf_duracionPeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 37, 67, -1));

        jLabel5.setText("Duracion");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel6.setText("Categoria");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 63, -1, -1));

        buttonGroup1.add(rb1);
        rb1.setText("Suspenso");
        jPanel1.add(rb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 79, -1, -1));

        buttonGroup1.add(rb2);
        rb2.setText("Terror");
        jPanel1.add(rb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 79, -1, -1));

        buttonGroup1.add(rb3);
        rb3.setText("Accion");
        jPanel1.add(rb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 79, -1, -1));

        buttonGroup1.add(rb4);
        rb4.setText("Romanticas");
        jPanel1.add(rb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 79, -1, -1));

        buttonGroup1.add(rb5);
        rb5.setText("Ciencia Ficcion");
        jPanel1.add(rb5, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 79, -1, -1));

        buttonGroup1.add(rb6);
        rb6.setText("Animacion");
        jPanel1.add(rb6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 102, -1, -1));

        buttonGroup1.add(rb7);
        rb7.setText("Fantasia");
        jPanel1.add(rb7, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 102, -1, -1));

        jLabel7.setText("Director");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));
        jPanel1.add(tf_directorPeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 120, -1));

        jLabel8.setText("Compania");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));
        jPanel1.add(tf_companiaPeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 158, 130, -1));

        jLabel9.setText("Idioma");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));
        jPanel1.add(tf_idiomaPeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 184, 130, -1));

        jLabel10.setText("Doblado?");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        buttonGroup2.add(rb_dub1);
        rb_dub1.setText("Si");
        jPanel1.add(rb_dub1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        buttonGroup2.add(rb_dub2);
        rb_dub2.setText("No");
        jPanel1.add(rb_dub2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabel11.setText("Tiene Subtitulos?");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        buttonGroup3.add(rb_sub1);
        rb_sub1.setText("Si");
        jPanel1.add(rb_sub1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        buttonGroup3.add(rb_sub2);
        rb_sub2.setText("No");
        jPanel1.add(rb_sub2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jLabel12.setText("Actores principales: ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, -1));

        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, -1, -1));
        jPanel1.add(tf_actoresPeli3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 120, -1));
        jPanel1.add(tf_actoresPeli1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 120, -1));
        jPanel1.add(tf_actoresPeli2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 120, -1));

        jTabbedPane1.addTab("Crear Pelicula", jPanel1);

        jLabel13.setText("Nombre");

        jLabel14.setText("Duracion");

        jLabel15.setText("Categoria");

        jLabel16.setText("Temporadas");

        jLabel17.setText("Productora");

        jLabel18.setText("Idioma");

        jLabel19.setText("Doblado?");

        buttonGroup2.add(rb_dub3);
        rb_dub3.setText("Si");

        buttonGroup2.add(rb_dub4);
        rb_dub4.setText("No");

        jLabel20.setText("Actores principales: ");

        jLabel21.setText("Tiene Subtitulos?");

        buttonGroup3.add(rb_sub3);
        rb_sub3.setText("Si");

        buttonGroup3.add(rb_sub4);
        rb_sub4.setText("No");

        jButton3.setText("Guardar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(tf_duracionSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_temporadas, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(jLabel20))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(206, 206, 206)
                        .addComponent(tf_actoresSerie3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rb_dub3)
                        .addGap(7, 7, 7)
                        .addComponent(rb_dub4))
                    .addComponent(jLabel21)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rb_sub3)
                        .addGap(7, 7, 7)
                        .addComponent(rb_sub4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jButton3))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addGap(18, 18, 18)
                            .addComponent(tf_catSerie))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addGap(23, 23, 23)
                            .addComponent(tf_nombreSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(8, 8, 8)
                                .addComponent(tf_productora, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(13, 13, 13)
                                .addComponent(tf_idiomaSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_actoresSerie2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_actoresSerie1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel13))
                    .addComponent(tf_nombreSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel14))
                    .addComponent(tf_duracionSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_catSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(tf_temporadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel20)))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_productora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(tf_actoresSerie1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_idiomaSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_actoresSerie2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel18)))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(tf_actoresSerie3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rb_dub3)
                    .addComponent(rb_dub4))
                .addGap(7, 7, 7)
                .addComponent(jLabel21)
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rb_sub3)
                    .addComponent(rb_sub4))
                .addGap(27, 27, 27)
                .addComponent(jButton3)
                .addGap(34, 34, 34))
        );

        jTabbedPane1.addTab("Crear Serie", jPanel2);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Nesflis");
        arbol.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane2.setViewportView(arbol);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Arbol", jPanel3);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 573, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 434, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Logout", jPanel4);

        jd_nesflis.getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 26, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Entrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("LOGIN");

        jLabel2.setText("Usuario");

        jLabel3.setText("Contraseña");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(138, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(128, 128, 128))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_user)
                            .addComponent(pf_password, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(pf_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jButton1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Scanner lea = null;
        try {
            File archivo = new File("./Usuarios.txt");
            lea = new Scanner(archivo);
            String user = "";
            String pass = "";
            user = tf_user.getText();
            pass = pf_password.getText();
            lea.useDelimiter(";");
            boolean bandera = false;
            while (lea.hasNext()) {
                String t1, t2, t3;
                t1 = lea.next();
                t2 = lea.next();
                t3 = lea.next();
                if (t1.equals(user) && t3.equals(pass)) {
                    bandera = true;
                    break;
                }
            }
            if (bandera) {
                jd_nesflis.setModal(true);
                jd_nesflis.pack();
                jd_nesflis.setLocationRelativeTo(this);

                jd_nesflis.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "No validos");
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {
            // guardar pelicula
            String nombre = tf_nombrePeli.getText();
            int duracion = Integer.parseInt(tf_duracionPeli.getText());
            String categoria = "";
            if (rb1.isSelected()) {
                categoria = "Suspenso";
            } else if (rb2.isSelected()) {
                categoria = "Terror";
            } else if (rb3.isSelected()) {
                categoria = "Accion";
            } else if (rb4.isSelected()) {
                categoria = "Romanticas";
            } else if (rb5.isSelected()) {
                categoria = "Ciencia Ficcion";
            } else if (rb6.isSelected()) {
                categoria = "Animacion";
            } else if (rb7.isSelected()) {
                categoria = "Fantasia";
            } else {
                categoria = "-";
            }
            //
            String director = tf_directorPeli.getText();
            String compania = tf_companiaPeli.getText();
            String idioma = "No";
            if (rb_dub1.isSelected()) {
                idioma = "Si";
            } else {
                idioma = "No";
            }
            String sub = "No";
            if (rb_sub1.isSelected()) {
                sub = "Si";
            } else {
                sub = "No";
            }
            String actor1 = "", actor2 = "", actor3 = "";
            if (tf_actoresPeli1 != null) {
                actor1 = tf_actoresPeli1.getText() + ",";
            } else {
                actor1 = "-" + ",";
            }

            //actor2
            if (tf_actoresPeli2 != null) {
                actor2 = tf_actoresPeli2.getText() + ",";
            } else {
                actor2 = "-" + ",";
            }

            //actor3
            if (tf_actoresPeli3 != null) {
                actor3 = tf_actoresPeli3.getText() + ",";
            } else {
                actor3 = "-" + ",";
            }

            AdministrarPeliculas ap = new AdministrarPeliculas("./Peliculas.txt");
            ap.cargarArchivo();
            ap.setPelicula(new Pelicula(nombre, duracion, categoria, director, compania, idioma, nombre, sub));
            ap.escribirArchivo();
        } catch (IOException ex) {

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree arbol;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JDialog jd_nesflis;
    private javax.swing.JPasswordField pf_password;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    private javax.swing.JRadioButton rb4;
    private javax.swing.JRadioButton rb5;
    private javax.swing.JRadioButton rb6;
    private javax.swing.JRadioButton rb7;
    private javax.swing.JRadioButton rb_dub1;
    private javax.swing.JRadioButton rb_dub2;
    private javax.swing.JRadioButton rb_dub3;
    private javax.swing.JRadioButton rb_dub4;
    private javax.swing.JRadioButton rb_sub1;
    private javax.swing.JRadioButton rb_sub2;
    private javax.swing.JRadioButton rb_sub3;
    private javax.swing.JRadioButton rb_sub4;
    private javax.swing.JTextField tf_actoresPeli1;
    private javax.swing.JTextField tf_actoresPeli2;
    private javax.swing.JTextField tf_actoresPeli3;
    private javax.swing.JTextField tf_actoresSerie1;
    private javax.swing.JTextField tf_actoresSerie2;
    private javax.swing.JTextField tf_actoresSerie3;
    private javax.swing.JTextField tf_catSerie;
    private javax.swing.JTextField tf_companiaPeli;
    private javax.swing.JTextField tf_directorPeli;
    private javax.swing.JTextField tf_duracionPeli;
    private javax.swing.JTextField tf_duracionSerie;
    private javax.swing.JTextField tf_idiomaPeli;
    private javax.swing.JTextField tf_idiomaSerie;
    private javax.swing.JTextField tf_nombrePeli;
    private javax.swing.JTextField tf_nombreSerie;
    private javax.swing.JTextField tf_productora;
    private javax.swing.JTextField tf_temporadas;
    private javax.swing.JTextField tf_user;
    // End of variables declaration//GEN-END:variables

    File Archivo = null;

///Suspenso  , Terror , Acción , Románticas , Ciencia Ficción  , Animación  ,Fantasía
}
