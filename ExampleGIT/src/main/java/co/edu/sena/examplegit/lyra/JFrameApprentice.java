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

        jLabelAprentices = new javax.swing.JLabel();
        JComboBoxApprentice = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aprendices");

        jLabelAprentices.setText("Aprendices :");

        JComboBoxApprentice.addActionListener(this::JComboBoxApprenticeActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabelAprentices)
                .addGap(36, 36, 36)
                .addComponent(JComboBoxApprentice, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAprentices)
                    .addComponent(JComboBoxApprentice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(267, Short.MAX_VALUE))
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
    private javax.swing.JLabel jLabelAprentices;
    // End of variables declaration//GEN-END:variables
}
