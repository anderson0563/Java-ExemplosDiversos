/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turma853;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author anderson
 */
public class Turma853 {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        //Conexao
        Connection conexao = (Connection)DriverManager.getConnection("jdbc:mysql://127.0.0.1/turma853", 
                "galvaobueno", "ronaldinho");
        
        //Statement
        Statement comando = conexao.createStatement();
        
        //query
        ResultSet brasileirao = comando.executeQuery("SELECT nome as time, atleta as jogador FROM time ORDER BY atleta");
        
        //percorrer resultset
        while(brasileirao.next()){
            System.out.print(brasileirao.getString("time") + " - ");
            System.out.println(brasileirao.getString("jogador"));
        }
    }
    
}
