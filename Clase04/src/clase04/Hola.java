package clase04;

import java.awt.Color;
import javafx.scene.control.ToggleGroup;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Hola extends javax.swing.JFrame {

    private ButtonGroup grupoEstado;
    
    public Hola() {
        initComponents();
        //this.setExtendedState(MAXIMIZED_BOTH); //Maximizado
        //this.setBounds(100, 100, 640, 480);
        
        inicializarGrupoEstado();
        
        inicializarCmbColores();
        
    }

    private void inicializarCmbColores() {
        //Incializamos cmbColores
        cmbColores.addItem("Rojo");
        cmbColores.addItem("Verde");
        cmbColores.addItem("Azul");
        cmbColores.addItem("Blanco");
        cmbColores.addItem("Negro");
        cmbColores.addItem("Amarillo");
        cmbColores.addItem("Gris");
        cmbColores.setSelectedIndex(0);
    }

    private void inicializarGrupoEstado() {
        //Inicializamos el grupoEstado
        grupoEstado = new ButtonGroup();
        grupoEstado.add(radSoltero);
        grupoEstado.add(radCasado);
        grupoEstado.add(radViudo);
        grupoEstado.add(radDivorciado);
        radSoltero.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnOk = new javax.swing.JButton();
        chkBici = new javax.swing.JCheckBox();
        chkMoto = new javax.swing.JCheckBox();
        chkAuto = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaTexto = new javax.swing.JTextArea();
        btnAceptar = new javax.swing.JButton();
        radSoltero = new javax.swing.JRadioButton();
        radCasado = new javax.swing.JRadioButton();
        radViudo = new javax.swing.JRadioButton();
        radDivorciado = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        cmbColores = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Primer Formulario");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nombre:");

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnOk.setBackground(new java.awt.Color(204, 255, 51));
        btnOk.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnOk.setForeground(new java.awt.Color(153, 153, 255));
        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        chkBici.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkBici.setText("Bicicleta");

        chkMoto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkMoto.setText("Moto");

        chkAuto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkAuto.setText("Auto");

        txaTexto.setEditable(false);
        txaTexto.setColumns(20);
        txaTexto.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txaTexto.setRows(5);
        jScrollPane1.setViewportView(txaTexto);

        btnAceptar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        radSoltero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radSoltero.setText("Soltero");

        radCasado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radCasado.setText("Casado");

        radViudo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radViudo.setText("Viudo");

        radDivorciado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radDivorciado.setText("Divorciado");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Color:");

        cmbColores.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(radDivorciado, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chkBici, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chkMoto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chkAuto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 153, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radSoltero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(radCasado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(radViudo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(cmbColores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(btnOk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOk))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkBici)
                    .addComponent(radSoltero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkMoto)
                    .addComponent(radCasado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkAuto)
                    .addComponent(radViudo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radDivorciado)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(cmbColores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(btnAceptar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        // Evento Boton OK
        System.out.println("Evento Boton OK.");
        //String nombre=txtNombre.getText();
        //System.out.println(nombre);
        System.out.println(txtNombre.getText());
        JOptionPane.showMessageDialog(this, "Hola "+txtNombre.getText());
        txtNombre.setText("");
        txtNombre.requestFocus();
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // Evento Boton aceptar
        if(txtNombre.getText().length()<2) return;
        String texto="Nombre: "+txtNombre.getText()+".\n";
        if(chkBici.isSelected()) texto+="Tiene Bici.\n";
        if(chkMoto.isSelected()) texto+="Tiene Moto.\n";
        if(chkAuto.isSelected()) texto+="Tiene Auto.\n";
        if(radSoltero.isSelected()) texto+="Estado civil: Soltero.\n";
        if(radCasado.isSelected()) texto+="Estado civil: Casado.\n";
        if(radViudo.isSelected()) texto+="Estado civil: Viudo.\n";
        if(radDivorciado.isSelected()) texto+="Estado civil: Divorciado.\n";
        texto+="Color: "+cmbColores.getSelectedItem()+".\n";
        String color=cmbColores.getSelectedItem()+"";
        switch(color){
            case "Rojo":    txaTexto.setBackground(Color.RED);    break; 
            case "Verde":   txaTexto.setBackground(Color.GREEN);  break; 
            case "Azul":    txaTexto.setBackground(Color.BLUE);   break; 
            case "Negro":   txaTexto.setBackground(Color.BLACK);  break; 
            case "Blanco":  txaTexto.setBackground(Color.WHITE);  break; 
            case "Amarillo":txaTexto.setBackground(Color.YELLOW); break; 
            case "Gris":    txaTexto.setBackground(Color.GRAY);    break; 
            default: txaTexto.setBackground(Color.DARK_GRAY);
        }
        System.out.println(color);
        
        
        
        
        limpiar();
        txaTexto.setText(texto);
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void limpiar() {
        //Limpiar Formulario
        txtNombre.setText("");
        txtNombre.requestFocus();
        chkBici.setSelected(false);
        chkMoto.setSelected(false);
        chkAuto.setSelected(false);
        radSoltero.setSelected(true);
        cmbColores.setSelectedIndex(0);
    }

  
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
            java.util.logging.Logger.getLogger(Hola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hola().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnOk;
    private javax.swing.JCheckBox chkAuto;
    private javax.swing.JCheckBox chkBici;
    private javax.swing.JCheckBox chkMoto;
    private javax.swing.JComboBox<String> cmbColores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radCasado;
    private javax.swing.JRadioButton radDivorciado;
    private javax.swing.JRadioButton radSoltero;
    private javax.swing.JRadioButton radViudo;
    private javax.swing.JTextArea txaTexto;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
