/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controleswitch;
import java.util.Scanner;
/**
 *
 * @author ADAILTON
 */
public class ControleSwitch {
    
    public static void main(String[] args) {
        
        System.out.println("Controle SWITCH (crocar)");
        
        /*
        Sintaxe:
        switch (<verifica valor) {
        
        case "x" :
            <bloco de códigos>;
            beak;
        case "y" :
            <bloco de códigos>;
            break;
        case "z" :
            <bloco de códigos>;
            break;
        
        default: 
            <instrução padrão>;
        }
        */
      Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um número de 1 a 12: ");
        int mes = Integer.parseInt(entrada.next());
        
        switch (mes) {
            case 1 :
                System.out.println("JANEIRO");
                break;
            case 2 :
                System.out.println("FEVEREIRO");
                break;
            case 3 :
               System.out.println("MARÇO ");
               break;
            case 4 :
                System.out.println("ABRIL");
                break;
            case 5 :
                System.out.println("MAIO");
                break;
            case 6 :
                System.out.println("JUNHO");
                break;
            case 7 :
                System.out.println("JULHO");
                break;
            case 8 :
                System.out.println("AGOSTO");
                break;
            case 9 :
                System.out.println("SETEMBRO");
                break;
            case 10 :
                System.out.println("OUTUBRO");
                break;
            case 11:
                System.out.println("NOVEMBRO");
                break;
            case 12 :
                System.out.println("DEZEMBRO");
                break;
            default:
                System.out.println("Número inválido!");
                
        }
    }
    
}
