/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author alex
 */
public class index extends javax.swing.JFrame {

    /**
     * Creates new form index
     */
    public index() {
        initComponents();
        setLocationRelativeTo(null);
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
        bnt_mixto_calculado = new javax.swing.JButton();
        btn_multiplicativo_calculado = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        bnt_mixto_ingresado = new javax.swing.JButton();
        btn_multiplicativo_ingresado = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        menu_mixto_calculado = new javax.swing.JMenuItem();
        menu_multiplicativo_calculado = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menu_mixto_ingresado = new javax.swing.JMenuItem();
        menu_multiplicativo_ingresado = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Generación de Números Aleatorios ");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("a, c, m; Calculados"));

        bnt_mixto_calculado.setText("Congruencial Mixto (crtl+shift+m)");
        bnt_mixto_calculado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_mixto_calculadoActionPerformed(evt);
            }
        });

        btn_multiplicativo_calculado.setText("Congruencial Multiplicativo (ctrl+m)");
        btn_multiplicativo_calculado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiplicativo_calculadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bnt_mixto_calculado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_multiplicativo_calculado, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addComponent(bnt_mixto_calculado, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_multiplicativo_calculado, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("a, c, m; Ingresados"));

        bnt_mixto_ingresado.setText("Congruencial Mixto (crtl+shift+m)");
        bnt_mixto_ingresado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_mixto_ingresadoActionPerformed(evt);
            }
        });

        btn_multiplicativo_ingresado.setText("Congruencial Multiplicativo (ctrl+m)");
        btn_multiplicativo_ingresado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiplicativo_ingresadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bnt_mixto_ingresado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_multiplicativo_ingresado, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addComponent(bnt_mixto_ingresado, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_multiplicativo_ingresado, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        jMenu1.setText("Metodos");

        jMenu3.setText("ACM Calculado");

        menu_mixto_calculado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menu_mixto_calculado.setText("Congruencial Mixto");
        menu_mixto_calculado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_mixto_calculadoActionPerformed(evt);
            }
        });
        jMenu3.add(menu_mixto_calculado);

        menu_multiplicativo_calculado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        menu_multiplicativo_calculado.setText("Congruencial Multiplicativo");
        menu_multiplicativo_calculado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_multiplicativo_calculadoActionPerformed(evt);
            }
        });
        jMenu3.add(menu_multiplicativo_calculado);

        jMenu1.add(jMenu3);

        jMenu4.setText("ACM Ingresado");

        menu_mixto_ingresado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menu_mixto_ingresado.setText("Congruencial Mixto");
        menu_mixto_ingresado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_mixto_ingresadoActionPerformed(evt);
            }
        });
        jMenu4.add(menu_mixto_ingresado);

        menu_multiplicativo_ingresado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        menu_multiplicativo_ingresado.setText("Congruencial Multiplicativo");
        menu_multiplicativo_ingresado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_multiplicativo_ingresadoActionPerformed(evt);
            }
        });
        jMenu4.add(menu_multiplicativo_ingresado);

        jMenu1.add(jMenu4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Opciones");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem1.setText("Descripción");
        jMenu2.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(286, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_mixto_calculadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_mixto_calculadoActionPerformed
        // TODO add your handling code here:
        new congruencial_mixto(this, true).setVisible(true);
    }//GEN-LAST:event_menu_mixto_calculadoActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void bnt_mixto_calculadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_mixto_calculadoActionPerformed
        // TODO add your handling code here:
        new congruencial_mixto(this, true).setVisible(true);
    }//GEN-LAST:event_bnt_mixto_calculadoActionPerformed

    private void btn_multiplicativo_calculadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiplicativo_calculadoActionPerformed
        // TODO add your handling code here:
        new congruencial_multiplicativo(this, true).setVisible(true);
    }//GEN-LAST:event_btn_multiplicativo_calculadoActionPerformed

    private void menu_multiplicativo_calculadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_multiplicativo_calculadoActionPerformed
        // TODO add your handling code here:
        new congruencial_multiplicativo(this, true).setVisible(true);
    }//GEN-LAST:event_menu_multiplicativo_calculadoActionPerformed

    private void bnt_mixto_ingresadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_mixto_ingresadoActionPerformed
        // TODO add your handling code here:
        new windows.sinRestriccion.congruencial_mixto(this, true).setVisible(true);
    }//GEN-LAST:event_bnt_mixto_ingresadoActionPerformed

    private void btn_multiplicativo_ingresadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiplicativo_ingresadoActionPerformed
        // TODO add your handling code here:
        new windows.sinRestriccion.congruencial_multiplicativo(this, true).setVisible(true);
    }//GEN-LAST:event_btn_multiplicativo_ingresadoActionPerformed

    private void menu_mixto_ingresadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_mixto_ingresadoActionPerformed
        // TODO add your handling code here:
        new windows.sinRestriccion.congruencial_mixto(this, true).setVisible(true);
    }//GEN-LAST:event_menu_mixto_ingresadoActionPerformed

    private void menu_multiplicativo_ingresadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_multiplicativo_ingresadoActionPerformed
        // TODO add your handling code here:
        new windows.sinRestriccion.congruencial_multiplicativo(this, true).setVisible(true);
    }//GEN-LAST:event_menu_multiplicativo_ingresadoActionPerformed

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
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnt_mixto_calculado;
    private javax.swing.JButton bnt_mixto_ingresado;
    private javax.swing.JButton btn_multiplicativo_calculado;
    private javax.swing.JButton btn_multiplicativo_ingresado;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuItem menu_mixto_calculado;
    private javax.swing.JMenuItem menu_mixto_ingresado;
    private javax.swing.JMenuItem menu_multiplicativo_calculado;
    private javax.swing.JMenuItem menu_multiplicativo_ingresado;
    // End of variables declaration//GEN-END:variables
}
