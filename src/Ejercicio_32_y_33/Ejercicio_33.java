package Ejercicio_32_y_33;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class Ejercicio_33 extends javax.swing.JFrame {

    /**
     * Creates new form Ejercicio_33
     */
    Carro ObjCarro=new Carro();
    public Ejercicio_33() {
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

        jPanel2 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        TexMarca = new javax.swing.JTextField();
        BotMarca = new javax.swing.JButton();
        TexModelo = new javax.swing.JTextField();
        BotModelo = new javax.swing.JButton();
        TexColor = new javax.swing.JTextField();
        BotColor = new javax.swing.JButton();
        TexKilometraje = new javax.swing.JTextField();
        BotKilometraje = new javax.swing.JButton();
        BotElegir = new javax.swing.JComboBox<>();
        BotMetodo = new javax.swing.JComboBox<>();
        BotOrdenar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        Titulo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("Concesionario medio feo :(");

        TexMarca.setBackground(new java.awt.Color(0, 0, 0));
        TexMarca.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        TexMarca.setForeground(new java.awt.Color(255, 255, 255));
        TexMarca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TexMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TexMarcaActionPerformed(evt);
            }
        });

        BotMarca.setBackground(new java.awt.Color(0, 0, 0));
        BotMarca.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BotMarca.setForeground(new java.awt.Color(255, 255, 255));
        BotMarca.setText("Marca");
        BotMarca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        BotMarca.setContentAreaFilled(false);
        BotMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotMarcaActionPerformed(evt);
            }
        });

        TexModelo.setBackground(new java.awt.Color(0, 0, 0));
        TexModelo.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        TexModelo.setForeground(new java.awt.Color(255, 255, 255));
        TexModelo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TexModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TexModeloActionPerformed(evt);
            }
        });

        BotModelo.setBackground(new java.awt.Color(0, 0, 0));
        BotModelo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BotModelo.setForeground(new java.awt.Color(255, 255, 255));
        BotModelo.setText("Modelo");
        BotModelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        BotModelo.setContentAreaFilled(false);
        BotModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotModeloActionPerformed(evt);
            }
        });

        TexColor.setBackground(new java.awt.Color(0, 0, 0));
        TexColor.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        TexColor.setForeground(new java.awt.Color(255, 255, 255));
        TexColor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TexColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TexColorActionPerformed(evt);
            }
        });

        BotColor.setBackground(new java.awt.Color(0, 0, 0));
        BotColor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BotColor.setForeground(new java.awt.Color(255, 255, 255));
        BotColor.setText("Color");
        BotColor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        BotColor.setContentAreaFilled(false);
        BotColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotColorActionPerformed(evt);
            }
        });

        TexKilometraje.setBackground(new java.awt.Color(0, 0, 0));
        TexKilometraje.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        TexKilometraje.setForeground(new java.awt.Color(255, 255, 255));
        TexKilometraje.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TexKilometraje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TexKilometrajeActionPerformed(evt);
            }
        });

        BotKilometraje.setBackground(new java.awt.Color(0, 0, 0));
        BotKilometraje.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BotKilometraje.setForeground(new java.awt.Color(255, 255, 255));
        BotKilometraje.setText("Kilometraje");
        BotKilometraje.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        BotKilometraje.setContentAreaFilled(false);
        BotKilometraje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotKilometrajeActionPerformed(evt);
            }
        });

        BotElegir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BotElegir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Modelo", "Kilometraje" }));
        BotElegir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotElegirActionPerformed(evt);
            }
        });

        BotMetodo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BotMetodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Bubble sort", "Mergesort" }));
        BotMetodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotMetodoActionPerformed(evt);
            }
        });

        BotOrdenar.setBackground(new java.awt.Color(0, 0, 0));
        BotOrdenar.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        BotOrdenar.setForeground(new java.awt.Color(255, 255, 255));
        BotOrdenar.setText("Ordenar");
        BotOrdenar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        BotOrdenar.setContentAreaFilled(false);
        BotOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotOrdenarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TexMarca)
                            .addComponent(BotMarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TexModelo)
                            .addComponent(BotModelo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                            .addComponent(TexColor)
                            .addComponent(BotColor, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                            .addComponent(TexKilometraje)
                            .addComponent(BotKilometraje, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(BotElegir, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BotMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BotOrdenar, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(Titulo)))
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Titulo)
                .addGap(10, 10, 10)
                .addComponent(TexMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(BotMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(TexModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(BotModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(TexColor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(BotColor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(TexKilometraje, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(BotKilometraje, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotElegir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(BotOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TexMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TexMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TexMarcaActionPerformed

    private void BotMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotMarcaActionPerformed
        ObjCarro.Marca=TexMarca.getText();
        TexMarca.setText("");
    }//GEN-LAST:event_BotMarcaActionPerformed

    private void TexModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TexModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TexModeloActionPerformed

    private void BotModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotModeloActionPerformed
        ObjCarro.Modelo=Integer.parseInt(TexModelo.getText());
        TexModelo.setText("");
    }//GEN-LAST:event_BotModeloActionPerformed

    private void TexColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TexColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TexColorActionPerformed

    private void BotColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotColorActionPerformed
        ObjCarro.Color=TexColor.getText();
        TexColor.setText("");
    }//GEN-LAST:event_BotColorActionPerformed

    private void TexKilometrajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TexKilometrajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TexKilometrajeActionPerformed

    private void BotKilometrajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotKilometrajeActionPerformed
        ObjCarro.Kilometraje=Integer.parseInt(TexKilometraje.getText());
        TexKilometraje.setText("");
    }//GEN-LAST:event_BotKilometrajeActionPerformed

    private void BotOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotOrdenarActionPerformed
        Ejercicio_33_2 ejercicio_33_2=new Ejercicio_33_2();
        ejercicio_33_2.setVisible(true);
    }//GEN-LAST:event_BotOrdenarActionPerformed

    private void BotElegirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotElegirActionPerformed
        if(BotElegir.getSelectedItem()=="Modelo")
        {
            
        }
        else
        {
            if(BotElegir.getSelectedItem()=="Kilometraje")
            {
                
            }
        }
    }//GEN-LAST:event_BotElegirActionPerformed

    private void BotMetodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotMetodoActionPerformed
        if(BotMetodo.getSelectedItem()=="Bubble sort")
        {
            
        }
        else
        {
            if(BotMetodo.getSelectedItem()=="Mergesort")
            {
                
            }
        }
    }//GEN-LAST:event_BotMetodoActionPerformed

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
            java.util.logging.Logger.getLogger(Ejercicio_33.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio_33.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio_33.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio_33.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio_33().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotColor;
    private javax.swing.JComboBox<String> BotElegir;
    private javax.swing.JButton BotKilometraje;
    private javax.swing.JButton BotMarca;
    private javax.swing.JComboBox<String> BotMetodo;
    private javax.swing.JButton BotModelo;
    private javax.swing.JButton BotOrdenar;
    private javax.swing.JTextField TexColor;
    private javax.swing.JTextField TexKilometraje;
    private javax.swing.JTextField TexMarca;
    private javax.swing.JTextField TexModelo;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
