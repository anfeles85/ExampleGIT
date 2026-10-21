package co.edu.sena.examplegit.lyra;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

/**
 * Fecha: 21 / 10 / 26
 * @authores Juan Lozano, Luis Longa, Sebastian Caro, Harrison Suarez
 * Objetivo: crear un nuevo JFrame llamado JFrameApprentice, el cual contenga un jlabel con el titulo 
 * "Aprendices:" y un jcombo. En el código deberá crear un List de Apprentices, 
 * cree 3 aprendices (los del grupo) y adiciónelos en esta lista.
 */
public class JFrameApprentice extends javax.swing.JFrame 
{
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JFrameApprentice.class.getName());

    /**
     * Creates new form JFrameApprentice
     */
    public JFrameApprentice() 
    {
        initComponents();
        
        ArrayList<String> apprentice  = new ArrayList<>();
        apprentice.add("Juan Lozano");
        apprentice.add("Luis Longa");
        apprentice.add("Sebastian Caro");
        apprentice.add("Harrison Suarez");

        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
        for (String name : apprentice) 
        {
        modelo.addElement(name);
        }
        JComboBoxApprentice.setModel(modelo);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JComboBoxApprentice = new javax.swing.JComboBox<>();
        jLabelAprentices = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aprendices");

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));

        JComboBoxApprentice.setBackground(new java.awt.Color(255, 255, 255));
        JComboBoxApprentice.setEditable(true);
        JComboBoxApprentice.addActionListener(this::JComboBoxApprenticeActionPerformed);

        jLabelAprentices.setBackground(new java.awt.Color(255, 255, 255));
        jLabelAprentices.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabelAprentices.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAprentices.setText("Aprendices:");

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SENA CLEM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabelAprentices)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(JComboBoxApprentice, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JComboBoxApprentice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAprentices))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JComboBoxApprenticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboBoxApprenticeActionPerformed
        
    }//GEN-LAST:event_JComboBoxApprenticeActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> new JFrameApprentice().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JComboBoxApprentice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAprentices;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
