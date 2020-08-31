/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duvidas;

/**
 *
 * @author anderson
 */
public class ExemploAplicacao {
    public void impressao(int a){
        impressaoCabecalho();
        System.out.println(a);
        impressaoRodape();
    }
    public void impressaoCabecalho(){
        System.out.println("===============================");
    }
    public void impressaoRodape(){
        System.out.println("*******************************");
    }
    public static void main(String[] args) {
        int a = Biblioteca.soma(2, 3);
        
        ExemploAplicacao minhaAplicacao = new ExemploAplicacao();
        
        minhaAplicacao.impressao(a);
    }
}
