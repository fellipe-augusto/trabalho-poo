/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.view;

import fatec.poo.control.Conexao;
import fatec.poo.control.DaoVendedor;
import fatec.poo.model.Pessoa;
import fatec.poo.model.Vendedor;
import javax.swing.JOptionPane;

/**
 *
 * @author Fellipe
 */
public class GUIVendedor extends javax.swing.JFrame {

    /**
     * Creates new form GUIVendedor
     */
    public GUIVendedor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    private Conexao conexao=null;
    private DaoVendedor daoVendedor=null;
    private Vendedor vendedor=null;
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        txtNome = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtCep = new javax.swing.JTextField();
        txtSalBase = new javax.swing.JTextField();
        cbxUf = new javax.swing.JComboBox<>();
        txtDdd = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtTaxaComissao = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Vendedor");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("CPF");

        jLabel2.setText("Nome");

        jLabel3.setText("Endereço");

        jLabel4.setText("Cidade");

        jLabel5.setText("CEP");

        jLabel6.setText("Salário Base");

        jLabel7.setText("UF");

        jLabel8.setText("Telefone");

        jLabel9.setText("Taxa de Comissão");

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtNome.setEnabled(false);

        txtEndereco.setEnabled(false);

        txtCidade.setEnabled(false);

        txtCep.setEnabled(false);

        txtSalBase.setEnabled(false);

        cbxUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" }));
        cbxUf.setEnabled(false);

        txtDdd.setEnabled(false);

        txtTelefone.setEnabled(false);

        txtTaxaComissao.setEnabled(false);

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtEndereco, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                                .addComponent(txtCpf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtSalBase, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtTaxaComissao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtDdd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addGap(3, 3, 3)
                                            .addComponent(cbxUf, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(1, 1, 1)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIncluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSair)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtCep, txtCpf});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterar, btnConsultar, btnExcluir, btnIncluir, btnSair});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtDdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSalBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtTaxaComissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
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

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        
        String cpf = txtCpf.getText().replaceAll("[.-]", "");
        if(Pessoa.validarCpf(cpf) == false){
            JOptionPane.showMessageDialog(null, "CPF Inválido!","Atenção", JOptionPane.WARNING_MESSAGE);
            txtCpf.requestFocus();
        }
        else {
            vendedor = null;
            vendedor = daoVendedor.consultar(txtCpf.getText().replaceAll("[.-]", ""));

            if (vendedor == null) {
                txtCpf.setEnabled(false);
                txtNome.setEnabled(true);
                txtEndereco.setEnabled(true);
                txtCidade.setEnabled(true);
                cbxUf.setEnabled(true);
                txtDdd.setEnabled(true);
                txtTelefone.setEnabled(true);
                txtCep.setEnabled(true);
                txtSalBase.setEnabled(true);
                txtTaxaComissao.setEnabled(true);
                txtNome.requestFocus();

                btnConsultar.setEnabled(false);
                btnIncluir.setEnabled(true);
            }
            else {
                txtCpf.setEnabled(false);
                txtNome.setEnabled(true);
                txtEndereco.setEnabled(true);
                txtCidade.setEnabled(true);
                cbxUf.setEnabled(true);
                txtDdd.setEnabled(true);
                txtTelefone.setEnabled(true);
                txtCep.setEnabled(true);
                txtSalBase.setEnabled(true);
                txtTaxaComissao.setEnabled(true);
                txtNome.setText(vendedor.getNome());
                txtEndereco.setText(vendedor.getEndereco());
                txtCidade.setText(vendedor.getCidade());
                cbxUf.setSelectedItem(vendedor.getUf());
                txtDdd.setText(vendedor.getDdd());
                txtTelefone.setText(vendedor.getTelefone());
                txtCep.setText(vendedor.getCep());
                txtSalBase.setText(Double.toString(vendedor.getSalarioBase()));
                txtTaxaComissao.setText(Double.toString(vendedor.getTaxaComissao()));

                btnConsultar.setEnabled(false);
                btnIncluir.setEnabled(false);
                btnAlterar.setEnabled(true);
                btnExcluir.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed

        String cpf = txtCpf.getText().replaceAll("[.-]", "");
        if(Pessoa.validarCpf(cpf) == false){
            JOptionPane.showMessageDialog(null, "CPF Inválido!","Atenção", JOptionPane.WARNING_MESSAGE);
            txtCpf.requestFocus();
        }
        else {
            vendedor = new Vendedor(txtCpf.getText().replaceAll("[.-]", ""),txtNome.getText(),Double.parseDouble(txtSalBase.getText()));
            vendedor.setEndereco(txtEndereco.getText());
            vendedor.setCidade(txtCidade.getText());
            vendedor.setUf(String.valueOf(cbxUf.getSelectedItem()));
            vendedor.setDdd(txtDdd.getText());
            vendedor.setTelefone(txtTelefone.getText());
            vendedor.setCep(txtCep.getText());
            vendedor.setSalarioBase(Double.parseDouble(txtSalBase.getText()));
            vendedor.setTaxaComissao(Double.parseDouble(txtTaxaComissao.getText()));
            
            daoVendedor.inserir(vendedor);

            txtCpf.setEnabled(true);
            txtNome.setEnabled(false);
            txtEndereco.setEnabled(false);
            txtCidade.setEnabled(false);
            cbxUf.setEnabled(false);
            txtDdd.setEnabled(false);
            txtTelefone.setEnabled(false);
            txtCep.setEnabled(false);
            txtSalBase.setEnabled(false);
            txtTaxaComissao.setEnabled(false);

            txtCpf.setText("");
            txtNome.setText("");
            txtEndereco.setText("");
            txtCidade.setText("");
            cbxUf.setSelectedIndex(0);
            txtDdd.setText("");
            txtTelefone.setText("");
            txtCep.setText("");
            txtSalBase.setText("");
            txtTaxaComissao.setText("");

            btnConsultar.setEnabled(true);
            btnIncluir.setEnabled(false);
        }
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //*******************BLOCO PARA CONECTAR COM O ORACLE
        
        /*conexao = new Conexao("BD1721024","BD1721024");
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@apolo:1521:xe");
        daoVendedor = new DaoVendedor(conexao.conectar());*/
        
        /*
        conexao = new Conexao("SYSTEM","");
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@localhost:1521:xe");
        daoVendedor = new DaoVendedor(conexao.conectar());
        */
        
        //*******************BLOCO PARA CONECTAR COM O MYSQL
        conexao = new Conexao("root","");
        conexao.setDriver("com.mysql.jdbc.Driver");
        conexao.setConnectionString("jdbc:mysql://localhost/bd_poo");
        daoVendedor = new DaoVendedor(conexao.conectar());
    }//GEN-LAST:event_formWindowOpened

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Confirma a alteração?", "Alteração", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) {
            vendedor.setNome(txtNome.getText());
            vendedor.setEndereco(txtEndereco.getText());
            vendedor.setCidade(txtCidade.getText());
            vendedor.setUf(String.valueOf(cbxUf.getSelectedItem()));
            vendedor.setDdd(txtDdd.getText());
            vendedor.setTelefone(txtTelefone.getText());
            vendedor.setCep(txtCep.getText());
            vendedor.setSalarioBase(Double.parseDouble(txtSalBase.getText()));
            vendedor.setTaxaComissao(Double.parseDouble(txtTaxaComissao.getText()));
           
            daoVendedor.alterar(vendedor);
           
            txtCpf.setEnabled(true);
            txtNome.setEnabled(false);
            txtEndereco.setEnabled(false);
            txtCidade.setEnabled(false);
            cbxUf.setEnabled(false);
            txtDdd.setEnabled(false);
            txtTelefone.setEnabled(false);
            txtCep.setEnabled(false);
            txtSalBase.setEnabled(false);
            txtTaxaComissao.setEnabled(false);
            txtCpf.setText("");
            txtNome.setText("");
            txtEndereco.setText("");
            txtCidade.setText("");
            cbxUf.setSelectedIndex(0);
            txtDdd.setText("");
            txtTelefone.setText("");
            txtCep.setText("");
            txtSalBase.setText("");
            txtTaxaComissao.setText("");

            btnConsultar.setEnabled(true);
            btnIncluir.setEnabled(false);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Confirma a exclusão?", "Exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) {
            daoVendedor.excluir(vendedor);
            
            txtCpf.setEnabled(true);
            txtNome.setEnabled(false);
            txtEndereco.setEnabled(false);
            txtCidade.setEnabled(false);
            cbxUf.setEnabled(false);
            txtDdd.setEnabled(false);
            txtTelefone.setEnabled(false);
            txtCep.setEnabled(false);
            txtSalBase.setEnabled(false);
            txtTaxaComissao.setEnabled(false);
            txtCpf.setText("");
            txtNome.setText("");
            txtEndereco.setText("");
            txtCidade.setText("");
            cbxUf.setSelectedIndex(0);
            txtDdd.setText("");
            txtTelefone.setText("");
            txtCep.setText("");
            txtSalBase.setText("");
            txtTaxaComissao.setText("");
            
            btnConsultar.setEnabled(true);
            btnIncluir.setEnabled(false);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        conexao.fecharConexao();
        dispose();
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(GUIVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIVendedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cbxUf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtDdd;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSalBase;
    private javax.swing.JTextField txtTaxaComissao;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
