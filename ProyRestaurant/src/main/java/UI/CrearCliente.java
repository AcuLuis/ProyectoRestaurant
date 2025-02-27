
package UI;

import BEAN.Cliente;
import DAO.ClienteDao;
import UTIL.Util;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class CrearCliente extends javax.swing.JInternalFrame {
    ClienteDao clieDao;
    int idCliente;
    public CrearCliente() {
        initComponents();
        clieDao = new ClienteDao();
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_limpiar_regcliente = new javax.swing.JButton();
        btn_registrar_regcliente = new javax.swing.JButton();
        btn_salir_regcliente = new javax.swing.JButton();
        txt_nombre_regcliente = new javax.swing.JTextField();
        txt_apellidos_regcliente = new javax.swing.JTextField();
        txt_direccion_regcliente = new javax.swing.JTextField();
        txt_telefono_regcliente = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("REGISTRAR CLIENTE");

        jLabel2.setText("NOMBRE:");

        jLabel3.setText("APELLIDOS:");

        jLabel4.setText("DIRECCION:");

        jLabel5.setText("TELEFONO:");

        btn_limpiar_regcliente.setText("LIMPIAR");

        btn_registrar_regcliente.setText("REGISTRAR");
        btn_registrar_regcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrar_regclienteActionPerformed(evt);
            }
        });

        btn_salir_regcliente.setText("SALIR");
        btn_salir_regcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salir_regclienteActionPerformed(evt);
            }
        });

        txt_direccion_regcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_direccion_regclienteActionPerformed(evt);
            }
        });

        txt_telefono_regcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefono_regclienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_nombre_regcliente)
                                    .addComponent(txt_apellidos_regcliente)
                                    .addComponent(txt_direccion_regcliente)
                                    .addComponent(txt_telefono_regcliente, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(btn_limpiar_regcliente)
                                .addGap(44, 44, 44)
                                .addComponent(btn_registrar_regcliente)
                                .addGap(42, 42, 42)
                                .addComponent(btn_salir_regcliente)))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_nombre_regcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_apellidos_regcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_direccion_regcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_telefono_regcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_limpiar_regcliente)
                    .addComponent(btn_registrar_regcliente)
                    .addComponent(btn_salir_regcliente))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private boolean valida(){
        boolean sw = false;
        String aux = "";
        if(this.txt_nombre_regcliente.getText().isEmpty()){
            aux = "Debe registrar el nombre";
        }
        if(this.txt_apellidos_regcliente.getText().isEmpty()){
            aux += "\nDebe registrar el apellido";
        }
        if(this.txt_direccion_regcliente.getText().isEmpty()){
            aux += "\nDebe registrar la direccion";
        }
        if(this.txt_telefono_regcliente.getText().isEmpty()){
            aux += "\nDebe registrar el telefono";
        }
        
        if(aux.isEmpty()){
            sw = true;
        }else{
            JOptionPane.showMessageDialog(this, aux);
        }
        return sw;
    }
    private void limpia(){
        this.txt_nombre_regcliente.setText("");
        this.txt_apellidos_regcliente.setText("");
        this.txt_direccion_regcliente.setText("");
        this.txt_telefono_regcliente.setText("");
    }
    private void btn_registrar_regclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrar_regclienteActionPerformed
        if(valida() == true){
            Util u = new Util();
            Cliente clie = new Cliente();
            idCliente = u.idNext("Cliente", "clienteID");
            clie.setClienteID(idCliente);
            clie.setNombres(this.txt_nombre_regcliente.getText());
            clie.setApellidos(this.txt_apellidos_regcliente.getText());
            clie.setDireccion(this.txt_direccion_regcliente.getText());
            clie.setTelefono(Integer.parseInt(this.txt_telefono_regcliente.getText()));
            this.clieDao.procesaItem(clie, "insert");
            this.limpia();
        }
    }//GEN-LAST:event_btn_registrar_regclienteActionPerformed

    private void btn_salir_regclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salir_regclienteActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_salir_regclienteActionPerformed

    private void txt_telefono_regclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefono_regclienteActionPerformed
        this.txt_telefono_regcliente.setText("000000000");
    }//GEN-LAST:event_txt_telefono_regclienteActionPerformed

    private void txt_direccion_regclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_direccion_regclienteActionPerformed
        this.txt_direccion_regcliente.setText("NULL");
    }//GEN-LAST:event_txt_direccion_regclienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_limpiar_regcliente;
    private javax.swing.JButton btn_registrar_regcliente;
    private javax.swing.JButton btn_salir_regcliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txt_apellidos_regcliente;
    private javax.swing.JTextField txt_direccion_regcliente;
    private javax.swing.JTextField txt_nombre_regcliente;
    private javax.swing.JTextField txt_telefono_regcliente;
    // End of variables declaration//GEN-END:variables
}
