package Telas;

import javax.swing.JOptionPane;
import programacaoorientadaaobjetos2.Funcionario;

public class FExercicio3 extends javax.swing.JFrame {
    private Funcionario funcionarioCadastrado;
    
    public FExercicio3() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        txtRA = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtVHr = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtQntH = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        txtDesconto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnMostrar1 = new javax.swing.JButton();
        cmbTipo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Funcionário - Exercício 3"));

        jLabel1.setText("Nome");

        jLabel2.setText("Crachá");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        jLabel4.setText("Tipo");

        jLabel6.setText("Valor p/ Hr.");

        jLabel7.setText("Qntd. Hrs.");

        jLabel8.setText("Salário");

        txtSalario.setEnabled(false);

        jLabel9.setText("Desconto");

        btnMostrar1.setText("Alt. Sal.");
        btnMostrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrar1ActionPerformed(evt);
            }
        });

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "H", "M" }));
        cmbTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTipoItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtVHr))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txtQntH, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(txtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 63, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnMostrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMostrar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRA, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtNome))))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVHr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQntH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnMostrar1)
                    .addComponent(btnMostrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTipoItemStateChanged
        if (((String)cmbTipo.getSelectedItem()).equals("H")) {
            txtSalario.setEnabled(false);
            txtVHr.setEnabled(true);
            txtQntH.setEnabled(true);
        } else {
            txtSalario.setEnabled(true);
            txtVHr.setEnabled(false);
            txtQntH.setEnabled(false);
        }
    }//GEN-LAST:event_cmbTipoItemStateChanged

    private void btnMostrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrar1ActionPerformed
        if (((String)cmbTipo.getSelectedItem()).charAt(0) == 'H') {
            if (txtVHr.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Entrada de salário por hora vazia", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            } else
            this.funcionarioCadastrado.setValorHora(Float.parseFloat(txtVHr.getText()));

            if (txtQntH.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Entrada de quantidade de horas por dia vazia", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            } else
            this.funcionarioCadastrado.setQntHora(Float.parseFloat(txtQntH.getText()));
        } else {
            if (txtSalario.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Entrada de salário por mês vazia", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            } else
            this.funcionarioCadastrado.setSalario(Float.parseFloat(txtSalario.getText()));
        }

        JOptionPane.showMessageDialog(this, "Alterado com sucesso", "Atenção", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnMostrar1ActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        if (funcionarioCadastrado != null)
        JOptionPane.showMessageDialog(this, funcionarioCadastrado.imprimir());
        else
        JOptionPane.showMessageDialog(this, "Nenhuma funcionário cadastrado ainda.", "Erro", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            this.funcionarioCadastrado = new Funcionario();

            if (txtRA.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Entrada de RA vazia", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            } else
            this.funcionarioCadastrado.setCracha(Integer.parseInt(txtRA.getText()));

            if (txtNome.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Entrada de nome vazia", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            } else
            this.funcionarioCadastrado.setNome(txtNome.getText());

            this.funcionarioCadastrado.setTipoVinculo(((String)cmbTipo.getSelectedItem()).charAt(0));

            if (this.funcionarioCadastrado.getTipoVinculo() == 'H') {
                if (txtVHr.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "Entrada de salário por hora vazia", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                } else
                this.funcionarioCadastrado.setValorHora(Float.parseFloat(txtVHr.getText()));

                if (txtQntH.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "Entrada de quantidade de horas por dia vazia", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                } else
                this.funcionarioCadastrado.setQntHora(Float.parseFloat(txtQntH.getText()));
            } else {
                if (txtSalario.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "Entrada de salário por mês vazia", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                } else
                this.funcionarioCadastrado.setSalario(Float.parseFloat(txtSalario.getText()));
            }

            if (txtDesconto.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Entrada de valor de desconto vazia", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            } else
            this.funcionarioCadastrado.setValorDesconto(Float.parseFloat(txtDesconto.getText()));

            JOptionPane.showMessageDialog(this, "Salvo com sucesso", "Atenção", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed
    
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FExercicio3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnMostrar1;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtDesconto;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtQntH;
    private javax.swing.JTextField txtRA;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtVHr;
    // End of variables declaration//GEN-END:variables
}
