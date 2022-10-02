/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vues;

import Entity.ConnexionBDD;
import Entity.FonctionsMetier;
import Entity.Medicament;
import Model.ModelIndividu;
import Model.ModelMedicament;
import Vues.frmMenu;
import javax.swing.JOptionPane;

/**
 *
 * @author gmnad
 */
public class frmMedicamentEtInformation extends javax.swing.JFrame {

    /**
     * Creates new form MedicamentEtInformation
     */
    
    FonctionsMetier fm;
    ModelMedicament mdlMedicament;
    
    public frmMedicamentEtInformation() {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMedicamentInformation = new javax.swing.JTable();
        btnInsererMedicament1 = new javax.swing.JButton();
        btnModifMedicament = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tblMedicamentInformation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Nom", "Famille code", "Composition", "Effet", "Prix", "Contre-indication"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMedicamentInformation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMedicamentInformationMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMedicamentInformation);

        btnInsererMedicament1.setBackground(new java.awt.Color(0, 153, 255));
        btnInsererMedicament1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnInsererMedicament1.setForeground(new java.awt.Color(255, 255, 255));
        btnInsererMedicament1.setText("Insérer un médicament");
        btnInsererMedicament1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInsererMedicament1MouseClicked(evt);
            }
        });
        btnInsererMedicament1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsererMedicament1ActionPerformed(evt);
            }
        });

        btnModifMedicament.setBackground(new java.awt.Color(0, 153, 255));
        btnModifMedicament.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnModifMedicament.setForeground(new java.awt.Color(255, 255, 255));
        btnModifMedicament.setText("Modifier un médicament");
        btnModifMedicament.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModifMedicamentMouseClicked(evt);
            }
        });
        btnModifMedicament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifMedicamentActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("      Médicaments");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnInsererMedicament1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModifMedicament, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(30, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 875, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(374, 374, 374)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModifMedicament, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsererMedicament1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(119, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnModifMedicamentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModifMedicamentMouseClicked
        // TODO add your handling code here:
        if(tblMedicamentInformation.getSelectedRowCount() == 0)
        {
            JOptionPane.showMessageDialog(this,"Sélectionner un médicament","Erreur de saisie",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
        Medicament medoc = fm.getLeMedicament(Integer.parseInt(tblMedicamentInformation.getValueAt(tblMedicamentInformation.getSelectedRow(), 0).toString()));
        
        frmModifierMedoc modifMedoc = new frmModifierMedoc(medoc);
        modifMedoc.setVisible(true);
        }
    }//GEN-LAST:event_btnModifMedicamentMouseClicked

    private void btnModifMedicamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifMedicamentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModifMedicamentActionPerformed

    private void tblMedicamentInformationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMedicamentInformationMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tblMedicamentInformationMouseClicked

    private void btnInsererMedicament1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsererMedicament1MouseClicked
        // TODO add your handling code here:
        frmInsererMedicament insererMedoc = new frmInsererMedicament();
        insererMedoc.setVisible(true);
    }//GEN-LAST:event_btnInsererMedicament1MouseClicked

    private void btnInsererMedicament1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsererMedicament1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInsererMedicament1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
       
        ConnexionBDD cnx = new ConnexionBDD() ;
        fm = new FonctionsMetier();
        mdlMedicament = new ModelMedicament();
        mdlMedicament.loadDatas8Colonnes(fm.getAllMedicaments());
        tblMedicamentInformation.setModel(mdlMedicament);
       
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(frmMedicamentEtInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMedicamentEtInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMedicamentEtInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMedicamentEtInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMedicamentEtInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsererMedicament1;
    private javax.swing.JButton btnModifMedicament;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMedicamentInformation;
    // End of variables declaration//GEN-END:variables
}
