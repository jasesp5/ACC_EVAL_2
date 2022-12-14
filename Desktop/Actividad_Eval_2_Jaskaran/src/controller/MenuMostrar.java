/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Services.TematicaService;
import javax.swing.JOptionPane;

/**
 *
 * @author Shajinder
 */
public class MenuMostrar extends javax.swing.JFrame {

    private final String NO_HAY_TEMATICAS = "Crear primero una tematica para crear un libro";

    /**
     * Creates new form MenuMostrar
     */
    private TematicaService tematicaServer;

    public MenuMostrar() {
        initComponents();
        this.tematicaServer = new TematicaService();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonNuevaTematica = new javax.swing.JButton();
        jButtonModificarTematica = new javax.swing.JButton();
        jButtonMostrarTematica = new javax.swing.JButton();
        jButtonMostrarLibro = new javax.swing.JButton();
        jButtonNuevoLibro = new javax.swing.JButton();
        jButtonModificarLibro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteca Menu");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(1, 21, 48));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(1, 21, 48));
        jLabel1.setText("Biblioteca ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 320, 140));

        jButtonNuevaTematica.setBackground(new java.awt.Color(1, 21, 48));
        jButtonNuevaTematica.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonNuevaTematica.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNuevaTematica.setText("Nueva Tem??tica");
        jButtonNuevaTematica.setAlignmentX(0.5F);
        jButtonNuevaTematica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNuevaTematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevaTematicaActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonNuevaTematica, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 210, 50));

        jButtonModificarTematica.setBackground(new java.awt.Color(1, 21, 48));
        jButtonModificarTematica.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonModificarTematica.setForeground(new java.awt.Color(255, 255, 255));
        jButtonModificarTematica.setText("Modificar Tem??tica");
        jButtonModificarTematica.setAlignmentX(0.5F);
        jButtonModificarTematica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonModificarTematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarTematicaActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonModificarTematica, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 210, 50));

        jButtonMostrarTematica.setBackground(new java.awt.Color(1, 21, 48));
        jButtonMostrarTematica.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonMostrarTematica.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMostrarTematica.setText("Mostrar tem??ticas ");
        jButtonMostrarTematica.setAlignmentX(0.5F);
        jButtonMostrarTematica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMostrarTematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarTematicaActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonMostrarTematica, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 210, 50));

        jButtonMostrarLibro.setBackground(new java.awt.Color(1, 21, 48));
        jButtonMostrarLibro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonMostrarLibro.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMostrarLibro.setText("Mostrar Libros ");
        jButtonMostrarLibro.setAlignmentX(0.5F);
        jButtonMostrarLibro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMostrarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarLibroActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonMostrarLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 210, 50));

        jButtonNuevoLibro.setBackground(new java.awt.Color(1, 21, 48));
        jButtonNuevoLibro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonNuevoLibro.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNuevoLibro.setText("Nuevo Libro");
        jButtonNuevoLibro.setAlignmentX(0.5F);
        jButtonNuevoLibro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNuevoLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoLibroActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonNuevoLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 210, 50));

        jButtonModificarLibro.setBackground(new java.awt.Color(1, 21, 48));
        jButtonModificarLibro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonModificarLibro.setForeground(new java.awt.Color(255, 255, 255));
        jButtonModificarLibro.setText("Modificar Libro");
        jButtonModificarLibro.setAlignmentX(0.5F);
        jButtonModificarLibro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonModificarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarLibroActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonModificarLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, 210, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 859, 563));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNuevaTematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevaTematicaActionPerformed
        // TODO add your handling code here:
        NuevaTematicaJFrame nuevaTematicaJFrame = new NuevaTematicaJFrame();
        nuevaTematicaJFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonNuevaTematicaActionPerformed

    private void jButtonModificarTematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarTematicaActionPerformed
        // TODO add your handling code here:
        ModificarTematicaJFrame modificarTematicaJFrame = new ModificarTematicaJFrame();
        modificarTematicaJFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonModificarTematicaActionPerformed

    private void jButtonMostrarTematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarTematicaActionPerformed
        // TODO add your handling code here:
        MostrarTematicaJFrame mostrarTematicaJFrame = new MostrarTematicaJFrame();
        mostrarTematicaJFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonMostrarTematicaActionPerformed

    private void jButtonMostrarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarLibroActionPerformed
        // TODO add your handling code here:
        MostrarLibroJFrame mostrarLibroJFrame = new MostrarLibroJFrame();
        mostrarLibroJFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonMostrarLibroActionPerformed

    private void jButtonNuevoLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoLibroActionPerformed
        // TODO add your handling code here:
        if (this.tematicaServer.mostrarTematicas().isEmpty()) {
            JOptionPane.showMessageDialog(null, NO_HAY_TEMATICAS);
        } else {
            NuevoLibroJFrame nuevoLibroJFrame = new NuevoLibroJFrame();
            nuevoLibroJFrame.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButtonNuevoLibroActionPerformed

    private void jButtonModificarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarLibroActionPerformed
        // TODO add your handling code here:
        if (this.tematicaServer.mostrarTematicas().isEmpty()) {
            JOptionPane.showMessageDialog(null, NO_HAY_TEMATICAS);
        } else {
            ModiciarLibroJFrame modificarLibroJFrame = new ModiciarLibroJFrame();
            modificarLibroJFrame.setVisible(true);
            this.dispose();
        }

    }//GEN-LAST:event_jButtonModificarLibroActionPerformed

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
            java.util.logging.Logger.getLogger(MenuMostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuMostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuMostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuMostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuMostrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonModificarLibro;
    private javax.swing.JButton jButtonModificarTematica;
    private javax.swing.JButton jButtonMostrarLibro;
    private javax.swing.JButton jButtonMostrarTematica;
    private javax.swing.JButton jButtonNuevaTematica;
    private javax.swing.JButton jButtonNuevoLibro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
