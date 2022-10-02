/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vues;

import Entity.ConnexionBDD;
import Entity.FonctionsMetier;
import java.util.Map;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.data.statistics.HistogramType;

/**
 *
 * @author natha
 */
public class frmStats extends javax.swing.JFrame {

    
    ConnexionBDD cnx;
    FonctionsMetier fm;
    /**
     * Creates new form frmStats
     */
    public frmStats() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnMedocParFamille = new javax.swing.JButton();
        btnPresciptionParMedoc = new javax.swing.JButton();
        btnPresciptionParType = new javax.swing.JButton();
        cboType = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Statistiques");

        jLabel2.setText("Nombre de prescriptions par type d'individu :");

        jLabel5.setText("Nombre de prescriptions par médicament :");

        jLabel6.setText("Nombre de médicaments par famille :");

        btnMedocParFamille.setBackground(new java.awt.Color(51, 51, 51));
        btnMedocParFamille.setForeground(new java.awt.Color(255, 255, 255));
        btnMedocParFamille.setText("Afficher");
        btnMedocParFamille.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMedocParFamilleMouseClicked(evt);
            }
        });

        btnPresciptionParMedoc.setBackground(new java.awt.Color(51, 51, 51));
        btnPresciptionParMedoc.setForeground(new java.awt.Color(255, 255, 255));
        btnPresciptionParMedoc.setText("Afficher");
        btnPresciptionParMedoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPresciptionParMedocMouseClicked(evt);
            }
        });

        btnPresciptionParType.setBackground(new java.awt.Color(51, 51, 51));
        btnPresciptionParType.setForeground(new java.awt.Color(255, 255, 255));
        btnPresciptionParType.setText("Afficher");
        btnPresciptionParType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPresciptionParTypeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnMedocParFamille, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnPresciptionParMedoc, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnPresciptionParType, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(cboType, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(69, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(56, 56, 56)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(btnMedocParFamille)
                .addGap(32, 32, 32)
                .addComponent(jLabel5)
                .addGap(34, 34, 34)
                .addComponent(btnPresciptionParMedoc)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPresciptionParType)
                    .addComponent(cboType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMedocParFamilleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMedocParFamilleMouseClicked
        // TODO add your handling code here:
        DefaultPieDataset donnees = new DefaultPieDataset();
        
        for (Map.Entry valeur : fm.GetDatasGraphique2().entrySet())
        {
            donnees.setValue(valeur.getKey().toString(), Integer.parseInt(valeur.getValue().toString()));
        }

        JFreeChart chart1 = ChartFactory.createPieChart(
        "Nombre de médicaments par famille",
        donnees,
        true, // légende
        true, // info bulle
        true // url
        );
        ChartFrame frame = new ChartFrame("", chart1);
        frame.pack();
        frame.setVisible(true);
    }//GEN-LAST:event_btnMedocParFamilleMouseClicked

    private void btnPresciptionParMedocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPresciptionParMedocMouseClicked
        // TODO add your handling code here:
        DefaultCategoryDataset donnees = new DefaultCategoryDataset();
        
        for (Map.Entry valeur : fm.GetDatasGraphique3().entrySet())
        {
            Double type = Double.parseDouble(((String[])valeur.getValue())[1].toString());
            String nomPrescription = ((String[])valeur.getValue())[0].toString();
            String nomMedoc = ((String[])valeur.getValue())[2].toString();
            donnees.setValue(type,nomPrescription,nomMedoc);
        }
        
        JFreeChart chart1 = ChartFactory.createBarChart(
        "Nombre de prescriptions par médicament :",
        "",
        "",
        donnees,
        PlotOrientation.VERTICAL,
        true, true, true);
        ChartFrame frame = new ChartFrame("", chart1);
        frame.pack();
        frame.setVisible(true);
    }//GEN-LAST:event_btnPresciptionParMedocMouseClicked

    private void btnPresciptionParTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPresciptionParTypeMouseClicked
        // TODO add your handling code here:
        
        DefaultCategoryDataset donnees = new DefaultCategoryDataset();
        
        for (Map.Entry valeur : fm.GetDatasGraphique1(cboType.getSelectedItem().toString()).entrySet())
        {
            donnees.setValue(Double.parseDouble(valeur.getValue().toString()), cboType.getSelectedItem().toString(), valeur.getKey().toString());
        }
       
        JFreeChart chart1 = ChartFactory.createLineChart("Nombre de préscription "+cboType.getSelectedItem().toString(), "", "", donnees);
        ChartFrame fra = new ChartFrame("", chart1);
        fra.pack();
        fra.setVisible(true);
    }//GEN-LAST:event_btnPresciptionParTypeMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        cnx = new ConnexionBDD();
        fm = new FonctionsMetier();
        
        for(String nomType : fm.GetAllNomIndividus())
        {
            cboType.addItem(nomType);
        }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(frmStats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmStats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmStats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmStats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmStats().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMedocParFamille;
    private javax.swing.JButton btnPresciptionParMedoc;
    private javax.swing.JButton btnPresciptionParType;
    private javax.swing.JComboBox<String> cboType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
