/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Janelas;

import BD.GerenciadorBD;
import Tipos.Usuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Rizzadinha
 */
public class UsuarioListar extends javax.swing.JInternalFrame {

    /**
     * Creates new form UsuarioListar
     */
    public UsuarioListar() {
        initComponents();
        this.setLocation(300, 170);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonListar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaListar = new javax.swing.JTextArea();

        setClosable(true);
        setTitle("Listar Usuario");

        jButtonListar.setText("Listar");
        jButtonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarActionPerformed(evt);
            }
        });

        jTextAreaListar.setEditable(false);
        jTextAreaListar.setColumns(20);
        jTextAreaListar.setRows(5);
        jTextAreaListar.setTabSize(5);
        jScrollPane2.setViewportView(jTextAreaListar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jButtonListar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonListar)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarActionPerformed
        
        ArrayList<Usuario> ultimos = new ArrayList<Usuario>();
        
        ultimos = GerenciadorBD.listarUsuarioTodos();
        
        if(ultimos.isEmpty()){
                JOptionPane.showMessageDialog(null, "Nenhum compromisso encontrado com esse nome");
        }
        else{
            JOptionPane.showMessageDialog(null, "Usuários encontrado(s)");
        
            for(int i = 0; i < ultimos.size(); i++)
                jTextAreaListar.setText( jTextAreaListar.getText() + "Id: " + ultimos.get(i).getId() + "          Login: " + ultimos.get(i).getLogin() + "\n\n");        
        }
        
        
    }//GEN-LAST:event_jButtonListarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonListar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaListar;
    // End of variables declaration//GEN-END:variables
}
