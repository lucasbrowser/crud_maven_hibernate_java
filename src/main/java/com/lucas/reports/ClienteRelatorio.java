/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lucas.reports;

import com.lucas.dao.ClienteDAO;
import java.util.List;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author lucas
 */
public class ClienteRelatorio {
    
    public void imprimeCliente(){
        try {
            ClienteDAO clienteDAO = new ClienteDAO(); 
            List lista = clienteDAO.findCliente();
            JRDataSource jdsource = new JRBeanCollectionDataSource(lista);
            String path = "src/main/resources/reports/ClienteReport.jrxml";
            JasperReport report = JasperCompileManager.compileReport(path);
            JasperPrint printReport = JasperFillManager.fillReport(report, null, jdsource);
            JasperViewer.viewReport(printReport, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void imprimeCliente2(long id){
        try {
            ClienteDAO clienteDAO = new ClienteDAO(); 
            List lista = clienteDAO.findClienteOne(id);
            JRDataSource jdsource = new JRBeanCollectionDataSource(lista);
            String path = "src/main/resources/reports/ClienteReport.jrxml";
            JasperReport report = JasperCompileManager.compileReport(path);
            JasperPrint printReport = JasperFillManager.fillReport(report, null, jdsource);
            JasperViewer.viewReport(printReport, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao visualizar o relatório "+e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
        
}
