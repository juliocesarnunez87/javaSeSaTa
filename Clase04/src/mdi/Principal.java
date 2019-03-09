package mdi;
public class Principal extends javax.swing.JFrame {
    public Principal() {
        initComponents();
        this.setExtendedState(6);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dspPanel = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuVentana1 = new javax.swing.JMenuItem();
        mnuVentana2 = new javax.swing.JMenuItem();
        mnuVentana3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout dspPanelLayout = new javax.swing.GroupLayout(dspPanel);
        dspPanel.setLayout(dspPanelLayout);
        dspPanelLayout.setHorizontalGroup(
            dspPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        dspPanelLayout.setVerticalGroup(
            dspPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jMenu1.setText("File");

        mnuVentana1.setText("Ventana 1");
        mnuVentana1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuVentana1ActionPerformed(evt);
            }
        });
        jMenu1.add(mnuVentana1);

        mnuVentana2.setText("Ventana 2");
        mnuVentana2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuVentana2ActionPerformed(evt);
            }
        });
        jMenu1.add(mnuVentana2);

        mnuVentana3.setText("Ventana 3");
        mnuVentana3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuVentana3ActionPerformed(evt);
            }
        });
        jMenu1.add(mnuVentana3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dspPanel, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dspPanel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuVentana3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuVentana3ActionPerformed
        // Evento Ventana 3
        Ventana3 ventana=new Ventana3();
        dspPanel.add(ventana);
        ventana.setVisible(true);
    }//GEN-LAST:event_mnuVentana3ActionPerformed

    private void mnuVentana1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuVentana1ActionPerformed
        // Evento Ventana 1
        Ventana1 ventana=new Ventana1();
        dspPanel.add(ventana);
        ventana.setVisible(true);
    }//GEN-LAST:event_mnuVentana1ActionPerformed

    private void mnuVentana2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuVentana2ActionPerformed
        // Evento Ventana 2
        Ventana2 ventana=new Ventana2();
        dspPanel.add(ventana);
        ventana.setVisible(true);
    }//GEN-LAST:event_mnuVentana2ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dspPanel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnuVentana1;
    private javax.swing.JMenuItem mnuVentana2;
    private javax.swing.JMenuItem mnuVentana3;
    // End of variables declaration//GEN-END:variables
}
