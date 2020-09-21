/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplointerface;

/**
 *
 * @author anderson
 */
public class Soma implements Operacao{
    // publicos - public
    // privados - private 
    // protegido - protected
    // pacote -  XXXX
    
    private int a, b; //atributos

    public Soma(int a, int b) {
        this.a = a;
        this.b = b;
        //super -> referencia a classe pai
    }
    
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
   
    public int operacao(){ //metodos
        return a + b;
    }
    
    @Override
    public String toString(){
        return "(" + this.a + ", " + this.b + ")";
    }

    @Override
    public int calculo() {
        return a + b;
    }
}
