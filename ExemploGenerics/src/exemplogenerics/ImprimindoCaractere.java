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
public class ImprimindoCaractere {

    public void imprimir(char vetor[]){
        for(char e: vetor)
            System.out.println(e);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char vetorChar[] = {'a', 'b', 'c', 'd'};
        
        ImprimindoCaractere exemplo = new ImprimindoCaractere();
        exemplo.imprimir(vetorChar);
    }    
}
