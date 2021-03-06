/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionalumnos;
import gestionalumnos.control.controlProfesores;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author gem2u
 */
public class pantallaProfesores extends javax.swing.JFrame {
    
    registrarProfesor regProf = new registrarProfesor();
    controlProfesores ctProf = new controlProfesores();
    actualizarProfesor actProf = new actualizarProfesor();
    borrarProfesor borrarProf = new borrarProfesor();
    pantallaAlumnos pantAlumnos = new pantallaAlumnos();

    /**
     * Creates new form pantallaProfesores
     */
    public pantallaProfesores() {
        initComponents();
        this.setLocationRelativeTo(null);
        tbProfesores.setModel(ctProf.mostrarTabla());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfBusqueda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProfesores = new javax.swing.JTable();
        btRegistrar = new javax.swing.JButton();
        btActualizar = new javax.swing.JButton();
        btBorrar = new javax.swing.JButton();
        btActualizarTabla = new javax.swing.JButton();
        btCerrar = new javax.swing.JButton();
        btGestionarAlumnos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(734, 343));
        setMinimumSize(new java.awt.Dimension(734, 343));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("GESTIÓN DE PROFESORES");

        jLabel2.setText("Buscar por número económico:");

        tfBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfBusquedaKeyReleased(evt);
            }
        });

        jScrollPane1.setViewportView(tbProfesores);

        btRegistrar.setText("REGISTRAR PROFESOR");
        btRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegistrarActionPerformed(evt);
            }
        });

        btActualizar.setText("ACTUALIZAR PROFESOR");
        btActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActualizarActionPerformed(evt);
            }
        });

        btBorrar.setText("BORRAR PROFESOR");
        btBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBorrarActionPerformed(evt);
            }
        });

        btActualizarTabla.setText("ACTUALIZAR TABLA");
        btActualizarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActualizarTablaActionPerformed(evt);
            }
        });

        btCerrar.setText("CERRAR");
        btCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCerrarActionPerformed(evt);
            }
        });

        btGestionarAlumnos.setText("GESTIONAR ALUMNOS");
        btGestionarAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGestionarAlumnosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btRegistrar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(btActualizar)
                                    .addGap(18, 18, 18)
                                    .addComponent(btBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btActualizarTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(btGestionarAlumnos)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btCerrar))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(tfBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btRegistrar)
                    .addComponent(btBorrar)
                    .addComponent(btActualizar)
                    .addComponent(btActualizarTabla))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btGestionarAlumnos)
                    .addComponent(btCerrar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistrarActionPerformed
        // TODO add your handling code here:
        regProf.setVisible(true);
    }//GEN-LAST:event_btRegistrarActionPerformed

    private void btActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActualizarActionPerformed
        // TODO add your handling code here:
        int row = tbProfesores.getSelectedRow();
        if(row < 0){
            JOptionPane.showMessageDialog(null, "Debe elegir un profesor de la tabla.");
        }else{
            String nombre = tbProfesores.getValueAt(row, 0).toString();
            String papellido = tbProfesores.getValueAt(row, 1).toString();
            String sapellido = tbProfesores.getValueAt(row, 2).toString();
            String eco = tbProfesores.getValueAt(row, 3).toString();
            actProf.setCampos(nombre, papellido, sapellido, eco);
            actProf.setVisible(true);
        }
    }//GEN-LAST:event_btActualizarActionPerformed

    private void btBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBorrarActionPerformed
        // TODO add your handling code here:
        int row = tbProfesores.getSelectedRow();
        if(row < 0){
             JOptionPane.showMessageDialog(null, "Debe elegir un profesor de la tabla.");
        }else{
            String nombre = tbProfesores.getValueAt(row, 0).toString();
            String papellido = tbProfesores.getValueAt(row, 1).toString();
            String sapellido = tbProfesores.getValueAt(row, 2).toString();
            String eco = tbProfesores.getValueAt(row, 3).toString();
            String numAlumnos = tbProfesores.getValueAt(row, 4).toString();
            borrarProf.setCampos(nombre, papellido, sapellido, eco, numAlumnos);
            borrarProf.setVisible(true);
        }
    }//GEN-LAST:event_btBorrarActionPerformed

    private void btActualizarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActualizarTablaActionPerformed
        // TODO add your handling code here:
        tbProfesores.setModel(ctProf.mostrarTabla());
    }//GEN-LAST:event_btActualizarTablaActionPerformed

    private void btCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btCerrarActionPerformed

    private void tfBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBusquedaKeyReleased
        // TODO add your handling code here:
        String eco = tfBusqueda.getText();
        char validar = evt.getKeyChar();
        ctProf.validarEco(validar);
        if(evt.getKeyChar() == KeyEvent.VK_ENTER){
          if(eco == null || eco.isEmpty() || eco.length() < 8){
              JOptionPane.showMessageDialog(null, "Debe llenar el campo de búsqueda.");
          }else{
                tbProfesores.setModel(ctProf.buscarProfesor(eco));
            }
        }
    }//GEN-LAST:event_tfBusquedaKeyReleased

    private void btGestionarAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGestionarAlumnosActionPerformed
        // TODO add your handling code here:
        int row = tbProfesores.getSelectedRow();
        if(row < 0){
            JOptionPane.showMessageDialog(null, "Debe elegir un profesor de la tabla.");
        }else{
            String nombre = tbProfesores.getValueAt(row, 0).toString();
            String papellido = tbProfesores.getValueAt(row, 1).toString();
            String sapellido = tbProfesores.getValueAt(row, 2).toString();
            String eco = tbProfesores.getValueAt(row, 3).toString();
            pantAlumnos.setCamposProfesor(nombre, papellido, sapellido, eco);
            pantAlumnos.setVisible(true);
        }
    }//GEN-LAST:event_btGestionarAlumnosActionPerformed

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
            java.util.logging.Logger.getLogger(pantallaProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pantallaProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pantallaProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pantallaProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pantallaProfesores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btActualizar;
    private javax.swing.JButton btActualizarTabla;
    private javax.swing.JButton btBorrar;
    private javax.swing.JButton btCerrar;
    private javax.swing.JButton btGestionarAlumnos;
    private javax.swing.JButton btRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tbProfesores;
    private javax.swing.JTextField tfBusqueda;
    // End of variables declaration//GEN-END:variables
}
