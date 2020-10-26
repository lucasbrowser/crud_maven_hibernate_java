package com.lucas.view;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 * Janela menu da aplicação
 *
 * @author lucas
 */
public class ViewPrincipal extends javax.swing.JFrame {

    public ViewPrincipal() {
        initComponents();
        Locale locale = new Locale("pt","BR"); 
        GregorianCalendar calendar = new GregorianCalendar();
        SimpleDateFormat dataHora = new SimpleDateFormat("dd' de 'MMMMM' de 'yyyy' - 'HH':'mm'.'",locale); 
        lblData.setText("Diamantino-MT, "+dataHora.format(calendar.getTime()));
        UIManager.put("OptionPane.yesButtonText", "Sim"); 
        UIManager.put("OptionPane.noButtonText", "Não"); 
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        toolBar = new javax.swing.JToolBar();
        btCliente = new javax.swing.JButton();
        btRelatorioVenda = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        desktopPane = new javax.swing.JDesktopPane();
        lblNome = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuCadastros = new javax.swing.JMenu();
        miCliente = new javax.swing.JMenuItem();
        menuRelatorios = new javax.swing.JMenu();
        miRelVendasCliente = new javax.swing.JMenuItem();
        menuFerramentas = new javax.swing.JMenu();
        miBlocodeNotas = new javax.swing.JMenuItem();
        menuSistema = new javax.swing.JMenu();
        miSobre = new javax.swing.JMenuItem();
        miSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clientes Martinello");
        setIconImages(null);

        toolBar.setFloatable(false);

        btCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cliente.png"))); // NOI18N
        btCliente.setText("Cliente");
        btCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCliente.setFocusable(false);
        btCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCliente.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cliente.png"))); // NOI18N
        btCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miClienteActionPerformed(evt);
            }
        });
        toolBar.add(btCliente);

        btRelatorioVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/report.png"))); // NOI18N
        btRelatorioVenda.setText("Relatório");
        btRelatorioVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btRelatorioVenda.setFocusable(false);
        btRelatorioVenda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btRelatorioVenda.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btRelatorioVenda.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/report.png"))); // NOI18N
        btRelatorioVenda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btRelatorioVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmVendasActionPerformed(evt);
            }
        });
        toolBar.add(btRelatorioVenda);

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sair.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSair.setFocusable(false);
        btSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSair.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btSair.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sair.png"))); // NOI18N
        btSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSairActionPerformed(evt);
            }
        });
        toolBar.add(btSair);

        getContentPane().add(toolBar, java.awt.BorderLayout.PAGE_START);

        desktopPane.setOpaque(false);

        lblNome.setText(".");
        desktopPane.add(lblNome);
        lblNome.setBounds(790, 580, 160, 14);

        lblData.setText("........");
        desktopPane.add(lblData);
        lblData.setBounds(670, 600, 310, 14);

        getContentPane().add(desktopPane, java.awt.BorderLayout.CENTER);

        menuCadastros.setText("Cadastros");

        miCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        miCliente.setText("Cadastrar Cliente");
        miCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miClienteActionPerformed(evt);
            }
        });
        menuCadastros.add(miCliente);

        menuBar.add(menuCadastros);

        menuRelatorios.setText("Relatórios");

        miRelVendasCliente.setText("Relatório por Cliente");
        miRelVendasCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRelVendasClienteActionPerformed(evt);
            }
        });
        menuRelatorios.add(miRelVendasCliente);

        menuBar.add(menuRelatorios);

        menuFerramentas.setText("Ferramentas");

        miBlocodeNotas.setText("Bloco de Notas");
        miBlocodeNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBlocodeNotasActionPerformed(evt);
            }
        });
        menuFerramentas.add(miBlocodeNotas);

        menuBar.add(menuFerramentas);

        menuSistema.setText("Sistema");

        miSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        miSobre.setText("Sobre");
        miSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSobreActionPerformed(evt);
            }
        });
        menuSistema.add(miSobre);

        miSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        miSair.setText("Sair");
        miSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSairActionPerformed(evt);
            }
        });
        menuSistema.add(miSair);

        menuBar.add(menuSistema);

        setJMenuBar(menuBar);

        setSize(new java.awt.Dimension(1040, 807));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void miClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miClienteActionPerformed
        ViewCliente c = new ViewCliente();
        desktopPane.add(c);
        c.setVisible(true);
    }//GEN-LAST:event_miClienteActionPerformed

    private void miSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSobreActionPerformed
        ViewSobre sobre = new ViewSobre();
        desktopPane.add(sobre);
        sobre.setVisible(true);
    }//GEN-LAST:event_miSobreActionPerformed

    private void miSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSairActionPerformed
        int q = JOptionPane.showConfirmDialog(null, "Tem certeza que quer sair do sistema?", "Atenção",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (q==JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_miSairActionPerformed

    private void mmVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmVendasActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_mmVendasActionPerformed

    private void miRelVendasClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRelVendasClienteActionPerformed
        // TODO add your handling code here:
        ViewRelatorioCliente rvendac = new ViewRelatorioCliente();
        desktopPane.add(rvendac);
        rvendac.setVisible(true);
    }//GEN-LAST:event_miRelVendasClienteActionPerformed

    private void miBlocodeNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBlocodeNotasActionPerformed
        // TODO add your handling code here:
        try{
            Runtime.getRuntime().exec("notepad");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_miBlocodeNotasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCliente;
    private javax.swing.JButton btRelatorioVenda;
    private javax.swing.JButton btSair;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel lblData;
    public javax.swing.JLabel lblNome;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuCadastros;
    private javax.swing.JMenu menuFerramentas;
    private javax.swing.JMenu menuRelatorios;
    private javax.swing.JMenu menuSistema;
    private javax.swing.JMenuItem miBlocodeNotas;
    private javax.swing.JMenuItem miCliente;
    private javax.swing.JMenuItem miRelVendasCliente;
    private javax.swing.JMenuItem miSair;
    private javax.swing.JMenuItem miSobre;
    private javax.swing.JToolBar toolBar;
    // End of variables declaration//GEN-END:variables
}
