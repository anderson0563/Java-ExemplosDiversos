/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecoes.arraylist.vector;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author anderson
 */
public class ExemploArrayList {

    public static void main(String[] args) {
        List<String> professores = new ArrayList<>();   
        professores.add("Paulo"); 
        professores.add("Maria");
        professores.add("Claudia");
        professores.add("Ricardo");
        

        Iterator itr = professores.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
