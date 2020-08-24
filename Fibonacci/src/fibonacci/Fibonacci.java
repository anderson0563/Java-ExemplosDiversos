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
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // int main(int argc, char *argv)
    
        SerieFibonacci fibo = new SerieFibonacci(15);
        System.out.println(fibo.calculo());
    }
    
}
