/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condicaodowhile;

/**
 *
 * @author ADAILTON
 */
public class CondicaoDoWhile {
    
    public static void main(String[] args) {
        
        System.out.println("Condição DO WHILE: ");
        
        /*
        Sintaxe:
        do {
            <bloco de codigos>;
        } while (<condicao>);
        */
        
        double a = 100;
        double b ;
        double c ;
        
        do {
        b = a -1;
        c = a * b;
        a = b;
            System.out.printf("a = %2f -- b = %2f -- c = %2f %n",a, b, c);
        } while (c <10000);
        
    }
    
}
