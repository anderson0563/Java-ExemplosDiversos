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
public class ImprimindoPontoFlutuante {

    public void imprimir(double vetor[]){
        for(double e: vetor)
            System.out.println(e);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] vetorPontoFlutuante = {1.0, 2.0, 3.0, 4.0};
        
        ImprimindoPontoFlutuante exemplo = new ImprimindoPontoFlutuante();
        exemplo.imprimir(vetorPontoFlutuante);
    }    
}
