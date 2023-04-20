/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operadoresrelacionais;

/**
 *
 * @author ADAILTON
 */
public class OperadoresRelacionais {
    
     public static void main(String[] args) {
         
         // Comparando se A é "maior que" B
         System.out.println("A > B, resultado: true/false?");
         
         // Comparando se A é "maior ou igual a" B
         System.out.println("A >= B, resultado: true/false?");
         
         // Comparando se A é "menor que" B
         System.out.println("A < B, resultado: true/false?");
         
         // Comparando se A é "menor ou igual a" B
         System.out.println("A <= B, resultado: true/false?");
         
         // Comparando se A é "igual a" B
         System.out.println("A == B, resultado: true/false?");
         // Não é recomendável usar [==] para comparar "String"
         // o ideal é usar o [.equals], em tema específico falaremos sobre
         
         // Comparando se A é "diferente de" B
         System.out.println("A != B, resultado: true/false?");
         
         // Exemplos:
         
         int N1 = 15;
         int a = 3;
         int b = 5;
         int K1 = a * b;
         char L1 = 'a';
         char L2 = 'b';
         
         /* Para converter [char] em String chama a classe invólucro "String"
         e o método valueOf (Of são letra O e letra f = Of)
         */
         String S1 = String.valueOf(L1 + L2);
         
         System.out.println("N1=15");
         System.out.println("a=3");
         System.out.println("b=5");
         System.out.println("K1=a*b");
         System.out.println("L1='a'");
         System.out.println("L2='b'");
         System.out.println("S1=a+b \n");
         
         System.out.println("a > b ? " + (a>b));
         System.out.println("a >= b ? " + (a>=b));
         System.out.println("K1 == N1 ? " + (K1 == N1));
         System.out.println("N1 != K1 ? " + (N1 != K1));
         System.out.println("a < b ? " + (a<b));
         System.out.println("L2 <= L1 ? " + (L2 <= L1));
         System.out.println("S1 equals (L1 + L2) ? " + (S1.equals(L1 + L2)));
         
    }
               
}
