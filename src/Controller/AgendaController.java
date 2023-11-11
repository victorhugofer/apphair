/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.Agenda;
import dao.AgendamentoDAO;
import dao.Conexao;
import static java.awt.image.ImageObserver.WIDTH;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.agendamento;

/**
 *
 * @author Administrador
 */
public class AgendaController {
    
    private Agenda view;

    public AgendaController(Agenda view) {
        this.view = view;
    }
    
    
    
    
    public void salvarAgendamento(){
        
        view.getjTextFieldCliente().getText();
        
        
        
        String agendamentoCliente = view.getjTextFieldCliente().getText();
        String agendamentoServico = view.getjTextFieldServico().getText();
        String agendamentoValor = view.getjTextFieldValor().getText();
        double Valor = Double.parseDouble(agendamentoValor);
        String agendamentoData = view.getjTextFieldData().getText();
        String agendamentoHora = view.getjTextFieldHora().getText();
        String agendamentoObs = view.getjTextObs().getText();
        
        
       
        
        
        
        agendamento Agendamento = new agendamento(WIDTH,agendamentoCliente , agendamentoServico,Valor, agendamentoHora, agendamentoData, agendamentoObs);
     
    
     
        try {
            Connection conexao = new Conexao().getConnection();
            AgendamentoDAO agendametoDao = new AgendamentoDAO(conexao);
            agendametoDao.insert(Agendamento);
            
            JOptionPane.showMessageDialog(null, "O agendamento foi realizado com sucesso!!");
           
            
        } catch (SQLException ex) {
            
            
            
            Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    
    
}
