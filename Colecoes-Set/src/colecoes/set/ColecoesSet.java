/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecoes.set;

import colecoes.set.ColecoesSet.Item;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author anderson
 */
public class ColecoesSet {

    public class Item implements Comparable<Item> {

        private int id;

        public Item(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return String.valueOf(id);
        }

        @Override
        public int compareTo(Item o) {
            return this.id - o.id;
        }
    }

    public void exemploHashSet(int[] vetor) {
        Set colecao = new HashSet();
        for (int i : vetor) {
            colecao.add(new Item(i));
        }
        Iterator i = colecao.iterator();
        while (i.hasNext()) {
            if(i.hasNext()) System.out.print((Item) i.next() + " ");
            else System.out.print((Item) i.next());
        }
    }

    public void exemploLinkedHashSet(int[] vetor) {
        Set colecao = new LinkedHashSet();
        for (int i : vetor) {
            colecao.add(new Item(i));
        }
        Iterator i = colecao.iterator();
        while (i.hasNext()) {
            if(i.hasNext()) System.out.print((Item) i.next() + " ");
            else System.out.print((Item) i.next());
        }
    }

    public void exemploTreeSet(int[] vetor) {
        Set colecao = new TreeSet();
        for (int i : vetor) {
            colecao.add(new Item(i));
        }
        Iterator i = colecao.iterator();
        while (i.hasNext()) {
            if(i.hasNext()) System.out.print((Item) i.next() + " ");
            else System.out.print((Item) i.next());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ColecoesSet exercicio = new ColecoesSet();
        int[] a = {5, 4, 2, 3, 1, 10, 6, 8, 7, 9};
        exercicio.exemploHashSet(a);
        System.out.println("");
        exercicio.exemploLinkedHashSet(a);
        System.out.println("");
        exercicio.exemploTreeSet(a);
    }

}
