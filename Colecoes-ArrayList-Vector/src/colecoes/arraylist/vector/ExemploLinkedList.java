/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecoes.arraylist.vector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author anderson
 */
public class ExemploLinkedList {

    public class Professor{
        private String nome;
        public Professor(String nome){
            this.nome = nome;
        }
        
        @Override
        public String toString(){
            return this.nome;
        }
    }
    
    public class NomeProfessor implements Comparator{
        @Override
        public int compare(Object o1, Object o2) {
            Professor p1 = (Professor)o1;
            Professor p2 = (Professor)o2;
            return p1.nome.compareTo(p2.nome);
        }
    }
    
    public void exemploLinkedList(String[] lista){
        List<Professor> professores = new LinkedList<>();   
        for(String item: lista)
            professores.add(new Professor(item));
        Iterator itr = professores.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
    
    public void exemploLinkedListSorted(String[] lista){
        List<Professor> professores = new LinkedList<>();   
        for(String item: lista)
            professores.add(new Professor(item));
        
        Collections.sort(professores,new NomeProfessor());
        
        Iterator itr = professores.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }

    public static void main(String[] args) {
        String lista[] = {"Paulo", "Maria", "Claudia", "Ricardo"};
        ExemploLinkedList colecao = new ExemploLinkedList();
        colecao.exemploLinkedList(lista);
        System.out.println("");
        colecao.exemploLinkedListSorted(lista);
    }
}
