/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecoes.arraylist.vector;

import java.util.ArrayList;

/**
 *
 * @author anderson
 */
public class UsandoArraylist {
    private int fibonacci(int i){
        if(i==0 || i==1) return i;
        return fibonacci(i-1) + fibonacci(i-2);
    }
    private void popular(ArrayList lista){
        for(int i=0; i<10; i++){
            lista.add(fibonacci(i));
        }
    }
    //referencia
    
    public static void main(String[] args) {
        UsandoArraylist minhaLista = new UsandoArraylist();
        ArrayList lista = new ArrayList(5);
        System.out.println(lista.size());
        minhaLista.popular(lista);
        System.out.println(lista);
    }
}
