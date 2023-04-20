/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operadoreslogicos;

/**
 *
 * @author ADAILTON
 */
public class OperadoresLogicos {
    
    public static void main(String [] args) {
        
        boolean condicao1 = true;
        boolean condicao2 = 3> 7;
        
        System.out.println(condicao1 && !condicao2); // && [and]
        System.out.println(condicao1 || condicao2); // ||
        System.out.println(condicao1 ^ condicao2);
        System.out.println(!condicao1);
        System.out.println(!!condicao1);
        System.out.println(!condicao2);
        
    }
    
}
