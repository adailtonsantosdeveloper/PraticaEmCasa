/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whileindeterminado;
import java.util.Scanner;
/**
 *
 * @author ADAILTON
 */
public class WhileIndeterminado {  
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("O laço WHILE é indicado\n para qunado não sabe quantas\n vezes precisará REPETIR \n");
        
        int quantidadeDeNotas = 0;
        double nota = 0;
        double total = 0;
        
        while (nota != -1) {
            
            System.out.println("Informe uma nota entre 0.0 e 10.0: [ou digite -1 para encerrar");
            nota = Double.parseDouble(entrada.next());
            
            if (nota <= 10 && nota >= 0) {
                
                total += nota;
                quantidadeDeNotas ++ ;
                
            }
            
        }
        
        double media = total / quantidadeDeNotas;
        System.out.println("Quantidade de notas: " + quantidadeDeNotas);
        System.out.println("Média das notas: " + media);
        entrada.close();
    }
    
}
