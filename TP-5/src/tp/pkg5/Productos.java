package tp.pkg5;

import static java.awt.Color.black;
import static java.awt.Color.gray;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Productos extends javax.swing.JFrame {
    private DefaultTableModel modelo = new DefaultTableModel(){
    
        public boolean isCellEditable(int fila, int columna){
            return false;
        }
    
    };
    /**
     * Creates new form Productos
     */
    public Productos() {
        initComponents();
        jcbCategoria.setSelectedIndex(-1);
        armarCabecera();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcbCategoria = new javax.swing.JComboBox<>();
        jlTitulo = new javax.swing.JLabel();
        jbAgregar = new javax.swing.JButton();
        jtfNombre = new javax.swing.JTextField();
        jtfPrecio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtLista = new javax.swing.JTable();
        jbListo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tabla de Productos");
        setResizable(false);

        jcbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Electronica", "Ropa", "Alimentos", "Limpieza" }));

        jlTitulo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo.setText("Lista de Productos");

        jbAgregar.setText("Agregar producto");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jtfNombre.setEditable(false);
        jtfNombre.setForeground(new java.awt.Color(153, 153, 153));
        jtfNombre.setText("Nombre");

        jtfPrecio.setEditable(false);
        jtfPrecio.setForeground(new java.awt.Color(153, 153, 153));
        jtfPrecio.setText("Precio");

        jtLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtLista);

        jbListo.setText("Listo");
        jbListo.setEnabled(false);
        jbListo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbListoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtfNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbCategoria, javax.swing.GroupLayout.Alignment.LEADING, 0, 150, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbAgregar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbListo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jlTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitulo)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAgregar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbListo))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        
        if(jcbCategoria.getSelectedIndex()==-1){
            JOptionPane.showMessageDialog(this, "Seleccione una categoria");
        }else{
            jtfNombre.setEditable(true);
            jtfPrecio.setEditable(true);
            jtfNombre.setText("");
            jtfPrecio.setText("");
            jtfNombre.setForeground(black);
            jtfPrecio.setForeground(black);  
            jbListo.setEnabled(true);
        }
        
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jbListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbListoActionPerformed
        try{
            double precio = Double.parseDouble(jtfPrecio.getText());
            String nombre = jtfNombre.getText();
            if(nombre.isEmpty() || jtfPrecio.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Los campos de texto deben contener infomración");
                return;
            }
            modelo.addRow(new Object[]{jcbCategoria.getSelectedItem()+"",nombre,precio});
            limpiarCampos();
            jbListo.setEnabled(false);
            
        }catch (NumberFormatException e){
            if(jcbCategoria.getSelectedIndex()==-1){
                JOptionPane.showMessageDialog(this, "Seleccione una categoria");
                return;
            }
            JOptionPane.showMessageDialog(this, "El precio debe ser un número");
            jtfPrecio.setText("");
            jtfPrecio.requestFocus();
        }        
    }//GEN-LAST:event_jbListoActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbListo;
    private javax.swing.JComboBox<String> jcbCategoria;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTable jtLista;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfPrecio;
    // End of variables declaration//GEN-END:variables
    
    private void armarCabecera(){
        modelo.addColumn("Categoria");
        modelo.addColumn("Nombre");
        modelo.addColumn("Precio");
        jtLista.setModel(modelo);
    }

    private void limpiarCampos() {
        jtfNombre.setText("Nombre");
        jtfPrecio.setText("Precio");
        jcbCategoria.setSelectedIndex(-1);
        jtfNombre.setEditable(false);
        jtfPrecio.setEditable(false);
        jtfNombre.setForeground(gray);
        jtfPrecio.setForeground(gray);
    }
}
