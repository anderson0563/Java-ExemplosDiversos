/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula191020;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author anderson
 */
public class Aula191020 {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        //Conexao
        
        Connection conexao = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/turma22ime", 
                "alunoime", "12345678");
        
        //Statement
        
        Statement comando = conexao.createStatement();
        
        //Consulta (realizar)
        
        
        //int quantidadeRegistrosAlterados = 
        //        comando.executeUpdate("INSERT INTO aluno (`nome`, `email`) VALUES "
        //                + "('anderson', 'anderson@ime.eb.br')");
        //int quantidadeRegistrosAlterados = comando.executeUpdate("DELETE from aluno WHERE indice=1");
        //int quantidadeRegistrosAlterados = comando.executeUpdate("UPDATE  aluno SET nome='andersonsantos'"
        //        + " WHERE indice=2");
        
        
        //for(int i=0; i<10; i++)
        //    comando.executeUpdate("INSERT INTO aluno (`nome`, `email`) VALUES "
        //                + "('anderson"+i+"', 'anderson@ime.eb.br')");
        
        
        ResultSet dados = comando.executeQuery("SELECT indice as id, nome as aluno FROM aluno");
        
        
        //Trato a resposta
        
        //System.out.println("Registros alterados no banco: " + quantidadeRegistrosAlterados);
        
        while(dados.next()){
            System.out.print("indice=" + dados.getInt("id"));
            System.out.println(" nome=" + dados.getString("aluno"));
        }
        
        
        conexao.close();
    }
    
}
