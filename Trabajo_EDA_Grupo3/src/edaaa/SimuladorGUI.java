/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edaaa;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextArea;


/**
 *
 * @author HP
 */
public class SimuladorGUI extends javax.swing.JFrame {
    private javax.swing.JTextArea jTextArea1;
    public Simulador simulador=new Simulador();
     
    /**
     * Creates new form SimuladorGUI
     */
    public SimuladorGUI() {
        initComponents();
        
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
        jLabel3 = new javax.swing.JLabel();
        nombreProcesoField = new javax.swing.JTextField();
        tiempoEjecucionField = new javax.swing.JTextField();
        tiempoLlegadaField = new javax.swing.JTextField();
        agregarProcesoButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        quantumField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre del Proceso:");

        jLabel2.setText("Tiempo de ejecución:");

        jLabel3.setText("Tiempo de Llegada:");

        nombreProcesoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreProcesoFieldActionPerformed(evt);
            }
        });

        agregarProcesoButton.setText("Agregar");
        agregarProcesoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarProcesoButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("AgregarProceso:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Round-Robin", "SJF" }));

        jButton2.setText("INICIAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Método de Ejecución:");

        jLabel6.setText("Iniciar Simulación:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Proceso", "Tiempo de ejecución", "Tiempo de llegada", "Tiempo de comienzo", "Tiempo de finalización "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable1);

        jLabel7.setText("Quantum");

        quantumField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantumFieldActionPerformed(evt);
            }
        });

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane1.setViewportView(jTextArea2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nombreProcesoField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tiempoEjecucionField))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(agregarProcesoButton)
                                            .addComponent(tiempoLlegadaField))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(115, 115, 115)
                                        .addComponent(jLabel6)
                                        .addGap(26, 26, 26)
                                        .addComponent(jButton2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(98, 98, 98)
                                                .addComponent(jLabel5))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(135, 135, 135)
                                                .addComponent(jLabel7)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(quantumField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addGap(83, 83, 83)))))
                .addGap(195, 195, 195))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nombreProcesoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tiempoEjecucionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(quantumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tiempoLlegadaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarProcesoButton)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(355, 355, 355))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarProcesoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarProcesoButtonActionPerformed
        try{ String nombreProceso = nombreProcesoField.getText();
        int tiempoEjecucion = Integer.parseInt(tiempoEjecucionField.getText());
        int tiempoLlegada = Integer.parseInt(tiempoLlegadaField.getText());
        
        Proceso nuevoProceso = new Proceso(nombreProceso, tiempoEjecucion, tiempoLlegada);
        
        simulador.agregarProceso(nuevoProceso);
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.addRow(new Object[]{nombreProceso, tiempoEjecucion, tiempoLlegada,nuevoProceso.tiempoComienzo,nuevoProceso.tiempoFinalizacion});
        
        
        }catch (NumberFormatException e) {
        // Mostrar un mensaje de error si la entrada no es válida
        JOptionPane.showMessageDialog(null,"Por favor, ingresa valores válidos.");
    }
        
    }//GEN-LAST:event_agregarProcesoButtonActionPerformed

    private void nombreProcesoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreProcesoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreProcesoFieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String algoritmoSeleccionado = (String) jComboBox1.getSelectedItem();
    if ("Round-Robin".equals(algoritmoSeleccionado)) {
        int quantum = Integer.parseInt(quantumField.getText());
        simulador.ejecutarRoundRobin(quantum);
        
Nodo actual = simulador.getCabeza();
int i = 0;
while (actual != null) {    
    Proceso proceso = actual.getProceso();
    DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
    modelo.setValueAt(proceso.getTiempoComienzo(), i, 3); // Actualiza el tiempo de finalización (columna 3)
    modelo.setValueAt(proceso.getTiempoFinalizacion(), i, 4); // Actualiza el tiempo de finalización (columna 3)
    
    i++;
        actual = actual.getSiguiente();
}jTable1.repaint();
        
        // Lógica para ejecutar la simulación Round-Robin
    } else if ("SJF".equals(algoritmoSeleccionado)) {
        simulador.ejecutarSJF();
        Nodo actual = simulador.getCabeza();
int i = 0;
while (actual != null) {    
    Proceso proceso = actual.getProceso();
    DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
    modelo.setValueAt(proceso.getTiempoComienzo(), i, 3); // Actualiza el tiempo de finalización (columna 3)
    modelo.setValueAt(proceso.getTiempoFinalizacion(), i, 4); // Actualiza el tiempo de finalización (columna 3)
    
    i++;
        actual = actual.getSiguiente();
}jTable1.repaint();
        
        // Lógica para ejecutar la simulación SJF
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void quantumFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantumFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantumFieldActionPerformed

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
            java.util.logging.Logger.getLogger(SimuladorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SimuladorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SimuladorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SimuladorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SimuladorGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarProcesoButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField nombreProcesoField;
    private javax.swing.JTextField quantumField;
    private javax.swing.JTextField tiempoEjecucionField;
    private javax.swing.JTextField tiempoLlegadaField;
    // End of variables declaration//GEN-END:variables
}