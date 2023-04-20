/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forstring;

/**
 *
 * @author ADAILTON
 */
public class ForString {
    
    public static void main(String[] args) {
        
        System.out.println("Implementando FOR utilizando [String]: ");
        
        String valor = "#";
        
        // for com contador numérico
        for(int i = 1; i <= 5; i++) {
            System.out.println(valor);
            valor += "#";
        }
        
        // for sem contador numérico
        for (String v = "#"; !v.equals("######"); v +="#") {
            System.out.println(v);
        }
        
    }
    
}
