package com.lucas.view;

import com.lucas.model.Cliente;
import com.lucas.reports.ClienteRelatorio;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 * Janela de lançamento de venda
 *
 * @author Juliano
 */
public class ViewRelatorioCliente extends javax.swing.JInternalFrame {

    public ViewRelatorioCliente() {
        initComponents();
        SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");
        habilitarFormulario(false);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        tpConteudo = new javax.swing.JTabbedPane();
        pnCabecalho = new javax.swing.JPanel();
        pnForm = new javax.swing.JPanel();
        lbCliente = new javax.swing.JLabel();
        ftfCliente = new javax.swing.JFormattedTextField();
        btCliente = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setClosable(true);
        setIconifiable(true);
        setTitle("Relatório de Clientes");

        pnCabecalho.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 10, 10));

        pnForm.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(5, 0, 5, 0), javax.swing.BorderFactory.createTitledBorder(null, "Formulário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 153, 255)))); // NOI18N
        pnForm.setOpaque(false);
        pnForm.setPreferredSize(new java.awt.Dimension(393, 150));

        lbCliente.setText("Cliente:");

        ftfCliente.setEditable(false);
        ftfCliente.setColumns(25);

        btCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        btCliente.setToolTipText("Localizar cliente");
        btCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCliente.setPreferredSize(new java.awt.Dimension(21, 21));
        btCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        btCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClienteActionPerformed(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnFormLayout = new javax.swing.GroupLayout(pnForm);
        pnForm.setLayout(pnFormLayout);
        pnFormLayout.setHorizontalGroup(
            pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormLayout.createSequentialGroup()
                .addComponent(lbCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ftfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConsultar)
                .addContainerGap(84, Short.MAX_VALUE))
        );
        pnFormLayout.setVerticalGroup(
            pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCliente)
                            .addComponent(ftfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnConsultar))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnCabecalhoLayout = new javax.swing.GroupLayout(pnCabecalho);
        pnCabecalho.setLayout(pnCabecalhoLayout);
        pnCabecalhoLayout.setHorizontalGroup(
            pnCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCabecalhoLayout.createSequentialGroup()
                .addComponent(pnForm, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnCabecalhoLayout.setVerticalGroup(
            pnCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCabecalhoLayout.createSequentialGroup()
                .addComponent(pnForm, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(292, Short.MAX_VALUE))
        );

        tpConteudo.addTab("Dados da venda", pnCabecalho);

        getContentPane().add(tpConteudo, java.awt.BorderLayout.CENTER);

        setBounds(10, 10, 543, 483);
    }// </editor-fold>//GEN-END:initComponents

    private void btClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClienteActionPerformed
        ViewBuscaCliente buscaCliente = new ViewBuscaCliente(this);
        buscaCliente.setVisible(true);
    }//GEN-LAST:event_btClienteActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
        imprimir();
    }//GEN-LAST:event_btnConsultarActionPerformed

    public void setCliente(Cliente cliente) {
        ftfCliente.setValue(cliente);
    }

    private void habilitarFormulario(boolean ativo) {
        ftfCliente.setEnabled(ativo);
   
        if (!ativo) {
            limpaFormulario();
        }
    }

    private void limpaFormulario() {
        ftfCliente.setValue(null);
    }

    
     private void imprimir(){
        Cliente cliente = (Cliente) ftfCliente.getValue();
        long codCliente = cliente.getId();
        ClienteRelatorio cliRel = new ClienteRelatorio();
        cliRel.imprimeCliente2(codCliente);    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCliente;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JFormattedTextField ftfCliente;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbCliente;
    private javax.swing.JPanel pnCabecalho;
    private javax.swing.JPanel pnForm;
    private javax.swing.JTabbedPane tpConteudo;
    // End of variables declaration//GEN-END:variables
}
