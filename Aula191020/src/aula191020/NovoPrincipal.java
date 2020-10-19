/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula191020;

import dados.Aluno;
import dados.AlunoDAO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author anderson
 */
public class NovoPrincipal {
    public static void main(String[] args) throws SQLException {
        AlunoDAO banco = new AlunoDAO();
        ArrayList listaBanco, lista = new ArrayList();
        
        lista.add(new Aluno(1, "anderson", "anderson@ime.eb.br"));
 
        //carregamento
        
        for(int i=0; i<lista.size(); i++)
            banco.inserirAluno((Aluno)lista.get(i));
        
        listaBanco = banco.selecionarAluno();
        
        for(int i=0; i<listaBanco.size(); i++)
            System.out.println((Aluno)listaBanco.get(i));
        
        banco.atualizarAluno(new Aluno(1, "anderson", "ch.se9@ime.eb.mil.br"));
        
        listaBanco = banco.selecionarAluno();
        
        for(int i=0; i<listaBanco.size(); i++)
            System.out.println((Aluno)listaBanco.get(i));
        
        banco.removerAluno(new Aluno(1, "anderson", "ch.se9@ime.eb.mil.br"));
        listaBanco = banco.selecionarAluno();
        
        for(int i=0; i<listaBanco.size(); i++)
            System.out.println((Aluno)listaBanco.get(i));
    }
}
