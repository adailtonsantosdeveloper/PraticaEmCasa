/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulamento.casaB;
import encapsulamento.casaA.Ana; //Importando classe de outro pacote
/**
 *
 * @author ADAILTON
 */
public class Julia {
    
    void testeAcessos() {
        
        Ana sogra = new Ana();
        
        // System.out.println(sogra.segredo); // pacote diferente, classe diferente
       // System.out.println(sogra.facoDentroDeCasa); // pacote diferente
        // System.out.println(sogra.formaDeFalar); // pacote diferente
        System.out.println(sogra.todosSabem);
        
    }
    
}
