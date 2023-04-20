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
public class Pedro extends Ana{
   /*
    Quando uma classe é extensão de outra classe, recebe seus atributos por herança,
    sendo desnecessário instanciar novo objeto para acessar estes atributos.
    */ 
   // Ana mae = new Ana();
    
    void testeAcessos() {
        // segredo
        // facoDentroDecasa
        // formaDeFalar
        // todosSabem
       /* 
        System.out.println(mae.segredo); // Não é possível acessar porque é PRIVATE
        System.out.println(mae.facoDentroDeCasa); // é possível acessar porque está no mesmo PACKAGE
        System.out.println(mae.formaDeFalar); // é possível acessar PROTECTED porque está no mesmo pacote
        System.out.println(mae.todosSabem); // é possível acessar porque é PUBLIC
        */
        
       // System.out.println(segredo); // Não é possível acessar porque é PRIVATE
        // System.out.println(facoDentroDeCasa); // é possível acessar porque está no mesmo PACKAGE
        System.out.println(formaDeFalar); // é possível acessar PROTECTED porque está no mesmo pacote
        System.out.println(todosSabem); // é possível acessar porque é PUBLIC
        System.out.println(new Ana().todosSabem);
        
    }
    
    
}
