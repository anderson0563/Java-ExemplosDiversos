/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author anderson
 */
public class AlunoDAO {
    
    private Connection conexao;
    private Statement comando;
    
    public AlunoDAO() throws SQLException{
        conexao = (new Conexao(1)).estabelecerConexao();
        if(conexao!=null)
            comando = conexao.createStatement();
    }
    
    public boolean inserirAluno(Aluno aluno) throws SQLException{
        return (comando.executeUpdate("INSERT INTO aluno (`nome`, `email`) VALUES "
                        + "('"+aluno.getNome()+"', '"+aluno.getEmail()+"')"))>0; 
    }
    
    public boolean removerAluno(Aluno aluno) throws SQLException{
        return (comando.executeUpdate("DELETE FROM aluno WHERE indice= "
                        +  aluno.getIndice()))>0; 
    }
    
    public boolean atualizarAluno(Aluno aluno) throws SQLException{
        return (comando.executeUpdate("UPDATE aluno set `email` = '"
                +aluno.getEmail() +  "' WHERE indice = "
                       +  aluno.getIndice()))>0;
    }
    
    public ArrayList selecionarAluno() throws SQLException{
        ArrayList lista = new ArrayList();
        Aluno aluno;
        ResultSet dados = comando.executeQuery("SELECT * FROM aluno");
        
                
        while(dados.next()){
            aluno = new Aluno(dados.getInt("indice"), 
                              dados.getString("nome"),
                              dados.getString("email"));
            lista.add(aluno);
        }
        
        return lista;
    }
}
