/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

/**
 *
 * @author anderson
 */
public class Aluno {
    private int indice;
    private String nome;
    private String email;

    public Aluno(int indice, String nome, String email) {
        this.indice = indice;
        this.nome = nome;
        this.email = email;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public String toString(){
        return "{nome:" + this.getNome() 
                + " email:" + this.getEmail() + "}";
    }
}
