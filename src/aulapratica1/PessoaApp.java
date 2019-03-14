/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapratica1;

/**
 *
 * @author eleoterio
 */
public class PessoaApp {
    
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa(1, "Luiz");
        Pessoa pessoa2 = new Pessoa(1, "Felipe");
        
        System.out.println("O nome da pessoa é, " + pessoa1.getNome());
        
        pessoa1.setNome("Pacheco");
        System.out.println("O nome da pessoa é, " + pessoa1.getNome());
    }
}
