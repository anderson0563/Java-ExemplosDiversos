/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplogenerics;

/**
 *
 * @author anderson
 */
public class ExemploGenerics {

    public <T> void imprimir(T vetor[]){
        for(T e: vetor)
            System.out.println(e);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer vetorInt[] = {1, 2, 3, 4};
        Double[] vetorPontoFlutuante = {1.0, 2.0, 3.0, 4.0};
        Character vetorChar[] = {'a', 'b', 'c', 'd'};
        
        ExemploGenerics exemplo = new ExemploGenerics();
        exemplo.imprimir(vetorInt);
        exemplo.imprimir(vetorPontoFlutuante);
        exemplo.imprimir(vetorChar);
    }
}
