/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author anderson
 */
public class SerieFibonacci {
    //atributos
    private int n;
    //metodos

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n<0?0:n;
    }

    public SerieFibonacci(int n) {
        this.n = n<0?0:n;
    }
    
    private int recursivo(int n){
        if(n==0 || n==1) return n;
        return recursivo(n-1) + recursivo(n-2); 
    }
    
    public int calculo(){
        return recursivo(this.n);
    }
    
}
