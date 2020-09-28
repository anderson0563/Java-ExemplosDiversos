/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecoes.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 *
 * @author anderson
 */
public class ColecoesMap {

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

    public void exemploHashMap(int[] vetor) {
        HashMap<Item, Integer> colecao = new HashMap();
        for (int i : vetor) {
            colecao.put(new Item(i), i);
        }
        for (Entry<Item, Integer> i : colecao.entrySet()) {
            System.out.print(i.getKey().toString() + " ");
        }
    }

    public void exemploHashTable(int[] vetor) {
        Hashtable<Item, Integer> colecao = new Hashtable();
        for (int i : vetor) {
            colecao.put(new Item(i), i);
        }
        for (Entry<Item, Integer> i : colecao.entrySet()) {
            System.out.print(i.getKey().toString() + " ");
        }
    }

    public void exemploLinkedHashMap(int[] vetor) {
        LinkedHashMap<Item, Integer> colecao = new LinkedHashMap();
        for (int i : vetor) {
            colecao.put(new Item(i), i);
        }
        for (Entry<Item, Integer> i : colecao.entrySet()) {
            System.out.print(i.getKey().toString() + " ");
        }
    }
    public void exemploTreeMap(int[] vetor) {
        TreeMap<Item, Integer> colecao = new TreeMap();
        for (int i : vetor) {
            colecao.put(new Item(i), i);
        }
        for (Entry<Item, Integer> i : colecao.entrySet()) {
            System.out.print(i.getKey().toString() + " ");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ColecoesMap exercicio = new ColecoesMap();
        int[] a = {5, 4, 2, 3, 1, 10, 6, 8, 7, 9};
        exercicio.exemploHashMap(a);
        System.out.println("");
        exercicio.exemploHashTable(a);
        System.out.println("");
        exercicio.exemploLinkedHashMap(a);
        System.out.println("");
        exercicio.exemploTreeMap(a);
    }

}
