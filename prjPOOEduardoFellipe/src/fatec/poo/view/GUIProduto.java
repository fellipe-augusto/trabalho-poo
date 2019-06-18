/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.view;

import fatec.poo.control.Conexao;
import fatec.poo.control.DaoProduto;
import fatec.poo.model.Produto;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Fellipe
 */
public class GUIProduto extends javax.swing.JFrame {

    /**
     * Creates new form GUIProduto
     */
    public GUIProduto() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    
    private DaoProduto daoProduto=null;
    private Produto produto=null;
    private Conexao conexao=null;

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        txtQtdeEstoque = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        txtEstoqueMinimo = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Produto");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Código");

        jLabel2.setText("Descrição");

        jLabel3.setText("Qtde. Disponível");

        jLabel4.setText("Preço Unitário");

        jLabel5.setText("Estoque Mínimo");

        txtDescricao.setEnabled(false);

        txtQtdeEstoque.setEnabled(false);

        txtPreco.setEnabled(false);

        txtEstoqueMinimo.setEnabled(false);

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        btnIncluir.setText("Incluir");
        btnIncluir.setEnabled(false);
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Eraser.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/exit.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIncluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSair))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtQtdeEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtEstoqueMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addGap(37, 37, 37)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDescricao)))))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterar, btnConsultar, btnExcluir, btnIncluir, btnSair});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtQtdeEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtEstoqueMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnIncluir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addGap(26, 26, 26))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAlterar, btnConsultar, btnExcluir, btnIncluir, btnSair});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        conexao = new Conexao("BD1721024","BD1721024");
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@apolo:1521:xe");
        daoProduto = new DaoProduto(conexao.conectar());
        
        /*
        conexao = new Conexao("SYSTEM","Fe78951230");
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@localhost:1521:xe");
        daoProduto = new DaoProduto(conexao.conectar());
        */
        
        //*******************BLOCO PARA CONECTAR COM O MYSQL
        /*conexao = new Conexao("root","");
        conexao.setDriver("com.mysql.jdbc.Driver");
        conexao.setConnectionString("jdbc:mysql://localhost/bd_poo");
        daoProduto = new DaoProduto(conexao.conectar());*/
        
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        conexao.fecharConexao();
        dispose();
    }//GEN-LAST:event_formWindowClosed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        produto = new Produto(txtCodigo.getText(), txtDescricao.getText());
        produto.setQtdeEstoque(Double.parseDouble(txtQtdeEstoque.getText()));
        produto.setPreco(Double.parseDouble(txtPreco.getText()));
        produto.setEstoqueMinimo(Double.parseDouble(txtEstoqueMinimo.getText()));
        
        daoProduto.inserir(produto);
        
        txtCodigo.setText("");
        txtDescricao.setText("");  
        txtQtdeEstoque.setText("");
        txtPreco.setText("");
        txtEstoqueMinimo.setText("");
        btnIncluir.setEnabled(false);
        txtCodigo.setEnabled(true);
        txtDescricao.setEnabled(false);
        txtQtdeEstoque.setEnabled(false);
        txtPreco.setEnabled(false);
        txtEstoqueMinimo.setEnabled(false);
        txtCodigo.requestFocus();
        
        btnConsultar.setEnabled(true);
        btnIncluir.setEnabled(false);
        
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        
        try {
                Integer.parseInt(txtCodigo.getText());
                
            } catch(NumberFormatException ex) {
                txtCodigo.setText("");
                txtCodigo.requestFocus();
                JOptionPane.showMessageDialog(null, "Insira apenas números!","Atenção", JOptionPane.WARNING_MESSAGE);
                return;
            }
        
        produto = null;
        produto = daoProduto.consultar(txtCodigo.getText());
        
        if (produto == null){
           txtCodigo.setEnabled(false);
           txtDescricao.setEnabled(true);
           txtQtdeEstoque.setEnabled(true);
           txtPreco.setEnabled(true);
           txtEstoqueMinimo.setEnabled(true);
           txtDescricao.requestFocus();
           
           btnConsultar.setEnabled(false);
           btnIncluir.setEnabled(true);
           btnAlterar.setEnabled(false);
           btnExcluir.setEnabled(false);
       }
       else{
            
          txtDescricao.setText(produto.getDescricao());
          txtQtdeEstoque.setText(Double.toString(produto.getQtdeEstoque()));
          txtPreco.setText(Double.toString(produto.getPreco()));
          txtEstoqueMinimo.setText(Double.toString(produto.getEstoqueMinimo()));
       
          txtCodigo.setEnabled(false);
          txtDescricao.setEnabled(true);
          txtQtdeEstoque.setEnabled(true);
          txtPreco.setEnabled(true);
          txtEstoqueMinimo.setEnabled(true);
          txtCodigo.requestFocus();
          
          btnConsultar.setEnabled(false);
          btnAlterar.setEnabled(false);
          btnAlterar.setEnabled(true);
          btnExcluir.setEnabled(true);
       }    
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        
        if(JOptionPane.showConfirmDialog(null, "Confirma a exclusão?", "Exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) {
            daoProduto.excluir(produto);
            
            txtCodigo.setText("");
            txtDescricao.setText("");
            txtQtdeEstoque.setText("");
            txtPreco.setText("");
            txtEstoqueMinimo.setText("");
            txtCodigo.setEnabled(true); 
            txtDescricao.setEnabled(false);
            txtQtdeEstoque.setEnabled(false);
            txtPreco.setEnabled(false);
            txtEstoqueMinimo.setEnabled(false);
            txtCodigo.requestFocus();
            btnConsultar.setEnabled(true);
            btnIncluir.setEnabled(false);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        
        if(JOptionPane.showConfirmDialog(null, "Confirma a alteração?", "Alteração", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) {
           produto.setDescricao(txtDescricao.getText());
           produto.setQtdeEstoque(Double.parseDouble(txtQtdeEstoque.getText()));
           produto.setPreco(Double.parseDouble(txtPreco.getText()));
           produto.setEstoqueMinimo(Double.parseDouble(txtEstoqueMinimo.getText()));
           daoProduto.alterar(produto);
        }
        
        txtCodigo.setText("");
        txtDescricao.setText("");
        txtQtdeEstoque.setText("");
        txtPreco.setText("");
        txtEstoqueMinimo.setText("");
        txtCodigo.setEnabled(true);
        txtDescricao.setEnabled(false);
        txtQtdeEstoque.setEnabled(false);
        txtPreco.setEnabled(false);
        txtEstoqueMinimo.setEnabled(false);
        txtCodigo.requestFocus();
        btnConsultar.setEnabled(true);
        btnIncluir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }//GEN-LAST:event_btnAlterarActionPerformed

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
            java.util.logging.Logger.getLogger(GUIProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtEstoqueMinimo;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQtdeEstoque;
    // End of variables declaration//GEN-END:variables

}

