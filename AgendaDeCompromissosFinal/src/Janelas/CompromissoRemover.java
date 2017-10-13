/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/
package Janelas;

import BD.GerenciadorBD;
import Tipos.Compromisso;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rizzadinha
 */
public class CompromissoRemover extends javax.swing.JInternalFrame {

    /**
     * Creates new form CompromissoRemover
     */
    public CompromissoRemover() {
        initComponents();
        this.setLocation(250, 100);
        
        jDateChooserRemover.setDateFormatString("yyyy/MM/dd");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButtonCompromissoRemover = new javax.swing.JToggleButton();
        jDateChooserRemover = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaInfoCompromissoAchadoRemover = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNomeCompromissoAchadoRemover = new javax.swing.JTextField();
        jToggleButtonEncontrarRemover = new javax.swing.JToggleButton();
        jComboBoxRemover = new javax.swing.JComboBox<>();
        JButtonSelecionar = new javax.swing.JButton();
        jTextFieldHoraCompromissoAchadoRemover = new javax.swing.JFormattedTextField();
        jDateChooserRemoverE = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setTitle("Remover Compromisso");
        setPreferredSize(new java.awt.Dimension(455, 392));

        jToggleButtonCompromissoRemover.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jToggleButtonCompromissoRemover.setText("Remover");
        jToggleButtonCompromissoRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonCompromissoRemoverActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome:");

        jLabel4.setText("Hora:");

        jLabel5.setText("Data:");

        jTextAreaInfoCompromissoAchadoRemover.setColumns(20);
        jTextAreaInfoCompromissoAchadoRemover.setLineWrap(true);
        jTextAreaInfoCompromissoAchadoRemover.setRows(5);
        jScrollPane2.setViewportView(jTextAreaInfoCompromissoAchadoRemover);

        jLabel6.setText("Info:");

        jLabel3.setText("Data:");

        jToggleButtonEncontrarRemover.setText("Encontrar");
        jToggleButtonEncontrarRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonEncontrarRemoverActionPerformed(evt);
            }
        });

        JButtonSelecionar.setText("Selecionar");
        JButtonSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonSelecionarActionPerformed(evt);
            }
        });

        try {
            jTextFieldHoraCompromissoAchadoRemover.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextFieldHoraCompromissoAchadoRemover.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jDateChooserRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(106, 106, 106)
                                .addComponent(jComboBoxRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jToggleButtonEncontrarRemover)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JButtonSelecionar)
                                .addGap(84, 84, 84))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldHoraCompromissoAchadoRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldNomeCompromissoAchadoRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooserRemoverE, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jToggleButtonCompromissoRemover)))
                        .addContainerGap(14, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDateChooserRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jComboBoxRemover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButtonEncontrarRemover)
                    .addComponent(JButtonSelecionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNomeCompromissoAchadoRemover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldHoraCompromissoAchadoRemover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jDateChooserRemoverE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jToggleButtonCompromissoRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButtonEncontrarRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonEncontrarRemoverActionPerformed
       
        if(jDateChooserRemover.getDate() == null){
            JOptionPane.showMessageDialog(null, "Insira uma data válida");
        }
        else{
            ArrayList<Compromisso> encontrado = new ArrayList<Compromisso>();
            ArrayList<String> nomes = new ArrayList<String>();
            DateFormat dataFomatador = new SimpleDateFormat("yyyy/MM/dd"); 

            encontrado = GerenciadorBD.listarDatas(dataFomatador.format(jDateChooserRemover.getDate()), AuxCompromissoUsuario.getIdUC());
            
            if(encontrado.isEmpty()){
                JOptionPane.showMessageDialog(null, "Nenhum compromisso encontrado com essa data");
            }
            else{    
                JOptionPane.showMessageDialog(null, "Compromissos encontrado(s)");
                
                for(int i=0;i<encontrado.size();i++)
                    nomes.add(encontrado.get(i).getNome());
                   

                jComboBoxRemover.setModel(new DefaultComboBoxModel(nomes.toArray()));
            }
        }
        
    }//GEN-LAST:event_jToggleButtonEncontrarRemoverActionPerformed

    private void JButtonSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonSelecionarActionPerformed
        
        DateFormat dataFomatador = new SimpleDateFormat("yyyy/MM/dd"); 
        
        Compromisso aC = GerenciadorBD.auxAlterar(jComboBoxRemover.getSelectedItem().toString(),dataFomatador.format(jDateChooserRemover.getDate()), AuxCompromissoUsuario.getIdUC());       
        
      
        jTextFieldNomeCompromissoAchadoRemover.setText(aC.getNome());
        jTextFieldHoraCompromissoAchadoRemover.setText(aC.getHora());      
        jTextAreaInfoCompromissoAchadoRemover.setText(aC.getInfo());
        
        try{
            Date date = new SimpleDateFormat("yyyy/MM/dd").parse(aC.getData());
            jDateChooserRemoverE.setDateFormatString("yyyy/MM/dd");
            jDateChooserRemoverE.setDate(date);
                 
        }
        catch (ParseException ex) {
            Logger.getLogger(CompromissoAlterar.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_JButtonSelecionarActionPerformed

    private void jToggleButtonCompromissoRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonCompromissoRemoverActionPerformed
                     
        DateFormat dataFomatador = new SimpleDateFormat("yyyy/MM/dd");

        GerenciadorBD.deletarCompromisso(dataFomatador.format(jDateChooserRemover.getDate()),jComboBoxRemover.getSelectedItem().toString(),AuxCompromissoUsuario.getIdUC());
        
        this.dispose();
        
    }//GEN-LAST:event_jToggleButtonCompromissoRemoverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonSelecionar;
    private javax.swing.JComboBox<String> jComboBoxRemover;
    private com.toedter.calendar.JDateChooser jDateChooserRemover;
    private com.toedter.calendar.JDateChooser jDateChooserRemoverE;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaInfoCompromissoAchadoRemover;
    private javax.swing.JFormattedTextField jTextFieldHoraCompromissoAchadoRemover;
    private javax.swing.JTextField jTextFieldNomeCompromissoAchadoRemover;
    private javax.swing.JToggleButton jToggleButtonCompromissoRemover;
    private javax.swing.JToggleButton jToggleButtonEncontrarRemover;
    // End of variables declaration//GEN-END:variables
}