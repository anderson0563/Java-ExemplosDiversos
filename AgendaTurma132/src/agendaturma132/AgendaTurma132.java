/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendaturma132;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author anderson
 */
public class AgendaTurma132 {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        //Conexao
        Connection conexao = (Connection)DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/turma132", 
                "alunounicarioca",
                "123456");
        //Statement
        Statement comando = conexao.createStatement();
        
        //Executar Query
        ResultSet resultado = 
                comando.executeQuery("SELECT nome, n1+n2  FROM agenda");
        
        //Imprimir o resultado da query
        while(resultado.next())
            System.out.println(resultado.getString("nome") + "-" 
                    + resultado.getInt("n1+n2"));
    }
    
}