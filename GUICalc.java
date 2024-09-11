package edu.psu.ist261;

import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ActionMap;
import javax.swing.DefaultListModel;
import javax.swing.InputMap;
import static javax.swing.JComponent.WHEN_FOCUSED;
import javax.swing.JList;
import javax.swing.KeyStroke;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author cambam
 */
public class GUICalc extends javax.swing.JFrame {

    /**
     * Creates new form GUICalc
     */
    public GUICalc() {
        initComponents();
        invalidInput.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        letterGradeLabel = new javax.swing.JLabel();
        classCreditLabel = new javax.swing.JLabel();
        letterGradeText = new javax.swing.JTextField();
        classCreditText = new javax.swing.JTextField();
        Clear = new javax.swing.JButton();
        Calculate = new javax.swing.JButton();
        totalGpaLabel = new javax.swing.JLabel();
        totalGpaText = new javax.swing.JTextField();
        invalidInput = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        gradeList = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Title.setFont(new java.awt.Font("Lucida Grande", 1, 25)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("GPA Calculator");
        Title.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        letterGradeLabel.setText("Enter Letter Grade");

        classCreditLabel.setText("Enter the class Credit");

        letterGradeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letterGradeTextActionPerformed(evt);
            }
        });

        classCreditText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classCreditTextActionPerformed(evt);
            }
        });

        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        Calculate.setText("Calculate");
        Calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateActionPerformed(evt);
            }
        });

        totalGpaLabel.setText("Total GPA");

        totalGpaText.setEditable(false);
        totalGpaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalGpaTextActionPerformed(evt);
            }
        });

        invalidInput.setForeground(new java.awt.Color(255, 0, 0));
        invalidInput.setText("Invalid input");

        gradeList.setEditable(false);
        gradeList.setColumns(20);
        gradeList.setRows(5);
        jScrollPane2.setViewportView(gradeList);

        jLabel1.setText("Enter the letter grades as captial letters.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(totalGpaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalGpaText, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Calculate)
                .addGap(63, 63, 63))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(Clear))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(classCreditLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(letterGradeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(letterGradeText, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                    .addComponent(classCreditText))
                                .addGap(18, 18, 18)
                                .addComponent(invalidInput, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(Title)))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(Title)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(letterGradeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letterGradeLabel))
                .addGap(4, 4, 4)
                .addComponent(Calculate)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(classCreditLabel)
                    .addComponent(classCreditText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(invalidInput, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Clear)
                    .addComponent(totalGpaLabel)
                    .addComponent(totalGpaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void letterGradeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letterGradeTextActionPerformed
         
    }//GEN-LAST:event_letterGradeTextActionPerformed

    private void classCreditTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classCreditTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classCreditTextActionPerformed

    double totalGradePoints;
    double totalCredits;
    double classCredit;
    boolean inputIsValid;
    private void CalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateActionPerformed
        double totalGPA;
        String letterGrade = letterGradeText.getText();
        try{
            classCredit = Double.parseDouble(classCreditText.getText());
            inputIsValid = true;
        }
        catch(Exception e){
            inputIsValid = false;
        }
        invalidInput.setVisible(false);
        
        Map<String, Double> gradeToScore = new HashMap<>();
        gradeToScore.put("A", 4.00);
        gradeToScore.put("A-", 3.67);
        gradeToScore.put("B+", 3.33);
        gradeToScore.put("B", 3.00);
        gradeToScore.put("B-", 2.67);
        gradeToScore.put("C+", 2.33);
        gradeToScore.put("C", 2.00);
        gradeToScore.put("D", 1.00);
        gradeToScore.put("F", 0.0);
        
        if(gradeToScore.containsKey(letterGrade) && inputIsValid){
            totalGradePoints += gradeToScore.get(letterGrade) * classCredit;
            totalCredits = totalCredits + classCredit;
            totalGPA = totalGradePoints / totalCredits;
            totalGPA = (double) Math.round(totalGPA * 100.0)/100.0;
            // Display the new totalGPA
            
            totalGpaText.setText(Double.toString(totalGPA));
            
            if(gradeList.getText().equals("")){
                gradeList.setText(letterGrade + "\t" + classCredit);
            }
            else{
                gradeList.setText(gradeList.getText() + "\n" + letterGrade + "\t" + classCredit);
            }
        }
        else{
            invalidInput.setVisible(true);
        }
    }//GEN-LAST:event_CalculateActionPerformed

    private void totalGpaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalGpaTextActionPerformed
        //texttotalGpa.setText(DoubletoString(totalGpa));
    }//GEN-LAST:event_totalGpaTextActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        totalGpaText.setText("");
        classCreditText.setText("");
        letterGradeText.setText("");
        totalGradePoints = 0;
        totalCredits = 0;
        invalidInput.setVisible(false);
        gradeList.setText("");
    }//GEN-LAST:event_ClearActionPerformed

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
            java.util.logging.Logger.getLogger(GUICalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUICalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUICalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUICalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUICalc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calculate;
    private javax.swing.JButton Clear;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel classCreditLabel;
    private javax.swing.JTextField classCreditText;
    private javax.swing.JTextArea gradeList;
    private javax.swing.JLabel invalidInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel letterGradeLabel;
    private javax.swing.JTextField letterGradeText;
    private javax.swing.JLabel totalGpaLabel;
    private javax.swing.JTextField totalGpaText;
    // End of variables declaration//GEN-END:variables
}
