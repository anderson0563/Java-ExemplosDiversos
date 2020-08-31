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
public class ImprimindoInteiros {

    public void imprimir(int vetor[]){
        for(int e: vetor) //for each
      //for(int i=0; i<vetor.length; i++) 
            System.out.println(e);
            //System.out.println(vetor[i]);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vetorInt[] = {1, 2, 3, 4};
        
        ImprimindoInteiros exemplo = new ImprimindoInteiros();
        exemplo.imprimir(vetorInt);
    }    
}
