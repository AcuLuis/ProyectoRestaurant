
package UI;

public class MdiEscritorio extends javax.swing.JFrame {

    public MdiEscritorio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Administrador");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Agregar Usuarios");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Completar BD por Defecto");
        fileMenu.add(saveMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Mantenimiento");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Contrato");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Rol");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Area");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Producto");
        deleteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(deleteMenuItem);

        jMenuItem2.setText("Insumo");
        editMenu.add(jMenuItem2);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Reportes");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Reporte Contrato");
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("Reporte Area");
        helpMenu.add(aboutMenuItem);

        jMenuItem3.setText("Reporte Rol");
        helpMenu.add(jMenuItem3);

        jMenuItem4.setText("Reporte Producto");
        helpMenu.add(jMenuItem4);

        jMenuItem5.setText("Reporte Insumo");
        helpMenu.add(jMenuItem5);

        menuBar.add(helpMenu);

        jMenu1.setText("Reporte Con Parametros");

        jMenuItem1.setText("Contrato por Fecha");
        jMenu1.add(jMenuItem1);

        jMenuItem6.setText("Contrato por Area");
        jMenu1.add(jMenuItem6);

        jMenuItem7.setText("Contrato por Rol");
        jMenu1.add(jMenuItem7);

        jMenuItem8.setText("Producto por  Precio");
        jMenu1.add(jMenuItem8);

        jMenuItem9.setText("Insumo por Precio");
        jMenu1.add(jMenuItem9);

        menuBar.add(jMenu1);

        jMenu2.setText("Tablas Cruzadas");

        jMenuItem10.setText("Producto - Tipo Plato");
        jMenu2.add(jMenuItem10);

        jMenuItem11.setText("Contrato - Area");
        jMenu2.add(jMenuItem11);

        jMenuItem12.setText("Tipo Usuario - Ubicacion");
        jMenu2.add(jMenuItem12);

        menuBar.add(jMenu2);

        jMenu3.setText("Correo General");

        jMenuItem13.setText("GMAIL");
        jMenu3.add(jMenuItem13);

        menuBar.add(jMenu3);

        jMenu4.setText("Redes");

        jMenuItem14.setText("Facebook");
        jMenu4.add(jMenuItem14);

        jMenuItem15.setText("Instagram");
        jMenu4.add(jMenuItem15);

        jMenuItem16.setText("Twitter");
        jMenu4.add(jMenuItem16);

        menuBar.add(jMenu4);

        jMenu5.setText("Transacciones y Control");

        jMenuItem17.setText("Venta");
        jMenu5.add(jMenuItem17);

        jMenuItem18.setText("Control de Inventario");
        jMenu5.add(jMenuItem18);

        menuBar.add(jMenu5);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteMenuItemActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

}
