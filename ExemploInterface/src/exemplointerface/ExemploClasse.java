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
public class ExemploClasse {
    public static void main(String[] args) {
        Produto s = new Produto(2, 3);
        System.out.println(s);
        System.out.println(s.calculo());
    }
}
