/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao; 

import java.sql.Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cliente;
import model.agendamento;
import view.CadastroCliente;


/**
 *
 * @author Administrador
 */
public class AgendamentoDAO {

    private final Connection connection;

    public AgendamentoDAO(Connection connection) {
        this.connection = connection;
    }
    public void insert(agendamento agendamento) throws SQLException{
      
            String sql ="insert into agendamento(cliente,servico,valor,data,hora,observacao) values ('"+agendamento.getCliente()+"','"+agendamento.getServico()+"','"+agendamento.getValor()+"','"+agendamento.getData()+"','"+agendamento.getHora()+"','"+agendamento.getObservacao()+"')";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            connection.close();
            
             
         
        
        
        
        
    }
     

 }
    

