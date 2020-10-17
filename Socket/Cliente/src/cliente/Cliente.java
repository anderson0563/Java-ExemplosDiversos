/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author anderson
 */
public class Cliente {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("127.0.0.1", 8888);//instancio o socket com 
        //endereco e porta do servidor
        
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        //configurando o objeto que vou enviar para o servidor
        
        out.writeUTF("UNICARIOCA");
        //envio
        System.out.println("Informação enviada");
        //informo ao usuario
    }

}
