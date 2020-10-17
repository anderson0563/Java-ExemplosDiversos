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
public class Turma132 {

    public static Statement conexao()throws SQLException {
        //Conexao
        Connection conexao = (Connection)DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/turma853", 
                "galvaobueno", "ronaldinho");
        
        //Statement
        return conexao.createStatement();
    }
    
    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        
        Statement comando = conexao();
        
        //query
        //int linhas = comando.executeUpdate("INSERT INTO time (nome, atleta) VALUES ('Santos', 'Neymar Jr')");
        //int linhas = comando.executeUpdate("DELETE FROM time WHERE atleta LIKE '%Jr%'");
        int linhas = comando.executeUpdate("UPDATE time set atleta='Zico' where nome='Flamengo'");
       
        //percorrer resultset
        if(linhas>0) System.out.println("Foram alteradas " + linhas + " linha(s)");
    }    
}
