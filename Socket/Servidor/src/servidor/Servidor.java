/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author anderson
 */
public class Servidor {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        ServerSocket listenSocket = new ServerSocket(80);//instanciar um servidor socket
        //abro a porta TCP 4000
        
        System.out.print("Servidor Ligado...");
        
        Socket clientSocket = listenSocket.accept();//vou aguardar conexao
        
        DataInputStream in = new DataInputStream(clientSocket.getInputStream());
        //com a conexao estabelecida, vou receber os dados enviados pelo cliente
        //no objeto in
        
        String data = in.readUTF();
        //vou ler este objeto e converter os dados lidos para string
        
        System.out.println("Recebido:" + data);//imprimio na tela
        System.out.print("Conexão encerrada");
        clientSocket.close();//encerro conexao
    }

}
