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
public class ImprimindoTentativa {

    public void imprimir(double vetor[]){
        for(double e: vetor)
            System.out.println(e);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vetorInt[] = {1, 2, 3, 4};
        double[] vetorPontoFlutuante = {1.0, 2.0, 3.0, 4.0};
        char vetorChar[] = {'a', 'b', 'c', 'd'};
        
        ImprimindoTentativa exemplo = new ImprimindoTentativa();
        exemplo.imprimir(vetorPontoFlutuante);
        exemplo.imprimir(vetorInt);
        exemplo.imprimir(vetorChar);
    }    
}
