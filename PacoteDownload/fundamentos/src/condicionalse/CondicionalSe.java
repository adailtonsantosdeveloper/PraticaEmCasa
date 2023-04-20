/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condicionalse;
import java.util.Scanner;
/**
 *
 * @author ADAILTON
 */
public class CondicionalSe {
    
    public static void main(String[] args) {
        
        System.out.println("Sintaxe IF");
        System.out.println("if (<comparacao booleana> )");
        System.out.println("<uma linha de codigo>");
        System.out.println("Exemplo: ");
        System.out.println("if ((2%2) = 0)");
        System.out.println("Numero PAR \n");
        System.out.println("sintaxe para mais de uma linha de código: ");
        System.out.println("if (n >5) { \n");
        System.out.println("n é maior que 5;");
        System.out.println("n é diferente de 5; \n }");
        
        Scanner entrada = new Scanner(System.in);
        
        double mediaAprovacao = 6.5;
        double total;
        double media;
        
        System.out.println("Informe a nota do 1º bimestre: ");
        double b1 = Double.parseDouble(entrada.nextLine());
        
        if (b1 >= 6.5)
            System.out.println("APROVADO primeiro Bim \n");
        else
            System.out.println("REPROVADO primeiro Bim \n");
        
        System.out.println("Informe a nota do 2º bimestre: ");
        double b2 = Double.parseDouble(entrada.nextLine());
        
         total = (b1 + b2);
            media = total / 2;
            
        if ((b1<6.5) && (b2 >= 6.5)) {
           
            if (media < mediaAprovacao) {
            System.out.println("Aprovado apenas nesse segundo Bim");
            
            System.out.println("Sua média agora é " + media);
            }else {
                System.out.println("Recuperou. Parabéns");
            }
        }
        System.out.println("Informe a nota do 3º Bim: \n");
        double b3 = Double.parseDouble(entrada.nextLine());
        media = (media + b3)/3;
        if (b3 >= media) {
            System.out.println("Está se saindo bem! \n");
            System.out.println("Média atual é "+media);
        }else if ((b3 < media) && ((media + b3)/ 3) <= mediaAprovacao) {
            System.out.println("Foi mal nesse, mas está dentro da média. \n");
            System.out.println("Média atual é " + media);
        }else {
            System.out.println("Está REPROVADO!!!");
            System.out.println("Precisa tirar nota alta no 4º \n");
        }
        
        System.out.println("Informe a nota do quarto Bim: \n");
        double b4 = Double.parseDouble(entrada.nextLine());
        total = b1 + b2 + b3 + b4;
        media = total / 4;
       entrada.close();
       
      
           System.out.println("Nota do 1º Bim: " + b1);
           System.out.println("Nota do 2º Bim: " + b2);
           System.out.println("Nota do 3º Bim: " + b3);
           System.out.println("Nota do 4º Bim: " + b4);
           System.out.println("Sua média final é:  " + media);
           
       if (media >= mediaAprovacao) {
           System.out.println("Parabéns, está APROVADO!"); 
       }else if ((media >= 3.5) && (media < mediaAprovacao)){
           System.out.println("Está em recuperação");
           System.out.printf("Precisa de %2f pontos para passar de série %n",(mediaAprovacao - media));
       }else {
           System.out.println("Vai repetir o ANO LETIVO!!!");
       }
    }
    
}
