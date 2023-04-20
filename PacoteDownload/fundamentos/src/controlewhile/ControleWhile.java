/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlewhile;
import java.util.Scanner;
/**
 *
 * @author ADAILTON
 */
public class ControleWhile {
    
    public static void main(String[] args) {
        
        System.out.println("Estrutura de Controle WHILE: ");
        
        /*
        Sintaxe:
        int contador = 1;
        
        while (contador <= 20) {
        
            System.out.printf(" i vale = %d %n", contador);
            contador += 2;
        
        }
        */
        
        int contador = 1;
        // Enquanto contador for menor ou igual a 20
        while (contador <= 10) {
            System.out.printf("incremento vale [ %d ] %n", contador);
            
           /* if (contador %2 == 1) {
                contador +=0.5;
            }else if (contador %2 == 0) {
                contador += 1;
            }*/
            contador += 1;
        }
        
        Scanner entrada = new Scanner(System.in);
        String valor = "";
        
        // enquanto valor for diferente [!] de "sair", ignorando maiúscula ou minúscula
        while (!valor.equalsIgnoreCase("sair")) {
            System.out.println("Digite algo: ");
            valor = entrada.nextLine();
        }
        
    }
    
}
