/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecoes.arraylist.vector;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author anderson
 */
public class ExemploVector {

    public static void main(String args[]) {
        Vector professores = new Vector();
        professores.add("Paulo");
        professores.add("Maria");
        professores.add("Claudia");
        professores.add("Ricardo");

        Enumeration e = professores.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
