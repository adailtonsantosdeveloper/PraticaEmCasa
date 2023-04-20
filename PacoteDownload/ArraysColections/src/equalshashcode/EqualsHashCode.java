/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equalshashcode;

/**
 *
 * @author ADAILTON
 */
public class EqualsHashCode {
    
    public static void main(String[] args) {
        
        Usuario u1 = new Usuario();
        u1.nome = "Pedro Silva";
        u1.email = "pedro.silva@ezemail.com.br";
        
        Usuario u2 = new Usuario();
        u2.nome = "Pedro Silva";
        u2.email = "pedro.silva@ezemail.com.br";
        
        System.out.println("Teste  u1 == u2 => " + (u1 == u2));
        System.out.println("Teste u1.equals(u2) => " + (u1.equals(u2)));
        
    }
    
}
