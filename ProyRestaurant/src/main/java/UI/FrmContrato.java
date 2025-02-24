
package UI;

public class FrmContrato extends javax.swing.JInternalFrame {

    public FrmContrato() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TabPanel_Contrato = new javax.swing.JTabbedPane();
        panel_emp_general = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_busca_empgeneral_contrato = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_empgeneral_contrato = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        panel_emp_sin_contrato = new javax.swing.JPanel();
        lbl = new javax.swing.JLabel();
        txt_buscar_emp_sin_contrato = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_emp_sin_contrato = new javax.swing.JTable();
        panel_contrato = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_fecha_inicio_contrato = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_fecha_fin_contrato = new javax.swing.JTextField();
        cmb_estado_contrato = new javax.swing.JComboBox<>();
        txt_sueldo_contrato = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_id_contrato = new javax.swing.JTextField();
        txt_empleado_id_contrato = new javax.swing.JTextField();
        cmb_rol_contrato = new javax.swing.JComboBox<>();
        cmb_area_contrato = new javax.swing.JComboBox<>();
        btn_grabar_contrato = new javax.swing.JButton();
        btn_volver_contrato = new javax.swing.JButton();
        btn_eliminar_contrato = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_buscar_contrato = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_contrato = new javax.swing.JTable();
        btn_salir_contrato = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("FORMULARIO CONTRATO");

        jLabel3.setText("Buscar");

        tbl_empgeneral_contrato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "APELLIDOS", "FECHA NAC.", "GENERO", "DNI", "ESTADO CIVIL"
            }
        ));
        jScrollPane2.setViewportView(tbl_empgeneral_contrato);

        javax.swing.GroupLayout panel_emp_generalLayout = new javax.swing.GroupLayout(panel_emp_general);
        panel_emp_general.setLayout(panel_emp_generalLayout);
        panel_emp_generalLayout.setHorizontalGroup(
            panel_emp_generalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_emp_generalLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panel_emp_generalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_emp_generalLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txt_busca_empgeneral_contrato, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panel_emp_generalLayout.setVerticalGroup(
            panel_emp_generalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_emp_generalLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panel_emp_generalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_busca_empgeneral_contrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        TabPanel_Contrato.addTab("Empleados General", panel_emp_general);

        lbl.setText("Buscar");

        tbl_emp_sin_contrato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "APELLIDOS", "FECHA NAC.", "GENERO", "DNI", "ESTADO CIVIL"
            }
        ));
        jScrollPane3.setViewportView(tbl_emp_sin_contrato);

        javax.swing.GroupLayout panel_emp_sin_contratoLayout = new javax.swing.GroupLayout(panel_emp_sin_contrato);
        panel_emp_sin_contrato.setLayout(panel_emp_sin_contratoLayout);
        panel_emp_sin_contratoLayout.setHorizontalGroup(
            panel_emp_sin_contratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_emp_sin_contratoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panel_emp_sin_contratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_emp_sin_contratoLayout.createSequentialGroup()
                        .addComponent(lbl)
                        .addGap(18, 18, 18)
                        .addComponent(txt_buscar_emp_sin_contrato, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panel_emp_sin_contratoLayout.setVerticalGroup(
            panel_emp_sin_contratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_emp_sin_contratoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panel_emp_sin_contratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl)
                    .addComponent(txt_buscar_emp_sin_contrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel_emp_sin_contrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel_emp_sin_contrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        TabPanel_Contrato.addTab("Empleados sin Contrato", jPanel2);

        panel_contrato.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setText("FECHA INICIO");

        jLabel6.setText("FECHA FIN");

        jLabel7.setText("ESTADO");

        jLabel8.setText("SUELDO");

        jLabel9.setText("DATOS GENERALES");
        jLabel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setText("EmpleadoID");

        jLabel11.setText("ContratoID");

        jLabel12.setText("Rol");

        jLabel13.setText("Area");

        cmb_rol_contrato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cmb_rol_contrato.setSelectedIndex(-1);

        btn_grabar_contrato.setText("GRABAR");
        btn_grabar_contrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_grabar_contratoActionPerformed(evt);
            }
        });

        btn_volver_contrato.setText("VOLVER");

        btn_eliminar_contrato.setText("ELIMINAR");

        javax.swing.GroupLayout panel_contratoLayout = new javax.swing.GroupLayout(panel_contrato);
        panel_contrato.setLayout(panel_contratoLayout);
        panel_contratoLayout.setHorizontalGroup(
            panel_contratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_contratoLayout.createSequentialGroup()
                .addGroup(panel_contratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_contratoLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(panel_contratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(panel_contratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_fecha_inicio_contrato)
                            .addComponent(txt_fecha_fin_contrato)
                            .addComponent(cmb_estado_contrato, 0, 100, Short.MAX_VALUE)
                            .addComponent(txt_sueldo_contrato))
                        .addGap(64, 64, 64)
                        .addGroup(panel_contratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(panel_contratoLayout.createSequentialGroup()
                                .addGroup(panel_contratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addGap(18, 18, 18)
                                .addGroup(panel_contratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_eliminar_contrato)
                                    .addGroup(panel_contratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_id_contrato)
                                        .addComponent(txt_empleado_id_contrato)
                                        .addComponent(cmb_rol_contrato, 0, 150, Short.MAX_VALUE)
                                        .addComponent(cmb_area_contrato, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(panel_contratoLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(btn_grabar_contrato)
                        .addGap(76, 76, 76)
                        .addComponent(btn_volver_contrato)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        panel_contratoLayout.setVerticalGroup(
            panel_contratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_contratoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panel_contratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_contratoLayout.createSequentialGroup()
                        .addGroup(panel_contratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_fecha_inicio_contrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(24, 24, 24)
                        .addGroup(panel_contratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_fecha_fin_contrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(txt_id_contrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(panel_contratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cmb_estado_contrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(txt_empleado_id_contrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panel_contratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_contratoLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(panel_contratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(txt_sueldo_contrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_contratoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12))))
                    .addComponent(cmb_rol_contrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(panel_contratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cmb_area_contrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(panel_contratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_grabar_contrato)
                    .addComponent(btn_volver_contrato)
                    .addComponent(btn_eliminar_contrato))
                .addGap(79, 79, 79))
        );

        TabPanel_Contrato.addTab("Contrato", panel_contrato);

        jLabel2.setText("CONTRATOS");

        tbl_contrato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "EMPLEADO", "ROL", "AREA", "FECHA INI.", "FECHA FIN", "ESTADO", "SUELDO"
            }
        ));
        jScrollPane1.setViewportView(tbl_contrato);

        btn_salir_contrato.setText("SALIR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(524, 524, 524))
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_salir_contrato, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TabPanel_Contrato, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(30, 30, 30)
                                .addComponent(txt_buscar_contrato, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TabPanel_Contrato, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_buscar_contrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(btn_salir_contrato, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_grabar_contratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_grabar_contratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_grabar_contratoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane TabPanel_Contrato;
    private javax.swing.JButton btn_eliminar_contrato;
    private javax.swing.JButton btn_grabar_contrato;
    private javax.swing.JButton btn_salir_contrato;
    private javax.swing.JButton btn_volver_contrato;
    private javax.swing.JComboBox<String> cmb_area_contrato;
    private javax.swing.JComboBox<String> cmb_estado_contrato;
    private javax.swing.JComboBox<String> cmb_rol_contrato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbl;
    private javax.swing.JPanel panel_contrato;
    private javax.swing.JPanel panel_emp_general;
    private javax.swing.JPanel panel_emp_sin_contrato;
    private javax.swing.JTable tbl_contrato;
    private javax.swing.JTable tbl_emp_sin_contrato;
    private javax.swing.JTable tbl_empgeneral_contrato;
    private javax.swing.JTextField txt_busca_empgeneral_contrato;
    private javax.swing.JTextField txt_buscar_contrato;
    private javax.swing.JTextField txt_buscar_emp_sin_contrato;
    private javax.swing.JTextField txt_empleado_id_contrato;
    private javax.swing.JTextField txt_fecha_fin_contrato;
    private javax.swing.JTextField txt_fecha_inicio_contrato;
    private javax.swing.JTextField txt_id_contrato;
    private javax.swing.JTextField txt_sueldo_contrato;
    // End of variables declaration//GEN-END:variables
}
