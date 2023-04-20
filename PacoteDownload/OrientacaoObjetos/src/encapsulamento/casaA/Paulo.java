/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulamento.casaA;

/**
 *
 * @author ADAILTON
 */
public class Paulo {
    
    Ana esposa = new Ana();
    
    void testeAcessos() {
        // segredo
        // facoDentroDecasa
        // formaDeFalar
        // todosSabem
        
        // System.out.println(esposa.segredo); // Não é possível acessar porque é PRIVATE
        System.out.println(esposa.facoDentroDeCasa); // é possível acessar porque está no mesmo PACKAGE
        System.out.println(esposa.formaDeFalar); // é possível acessar PROTECTED porque está no mesmo pacote
        System.out.println(esposa.todosSabem); // é possível acessar porque é PUBLIC
        
       
        
    }
    
}
