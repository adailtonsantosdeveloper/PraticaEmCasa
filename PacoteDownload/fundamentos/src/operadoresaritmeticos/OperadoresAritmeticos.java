/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operadoresaritmeticos;

import java.lang.Math;
/**
 *
 * @author ADAILTON
 */
public class OperadoresAritmeticos {
    
    public static void main(String[] args) {
        // Dá para calcular assim direto
        System.out.println( 2 + 3);
        
        double x = 34.56;
        double y = 2.2;
        
        //Ou criando variáveis
        //O método printf() permite passar as variáveis como parâmetro
        System.out.printf("%2f + %2f = %2f %n", x, y, x + y);
        //Para dados [double] usa-se [%2f], para ir para próxima linha usa [%n]
        System.out.printf("%2f - %2f = %2f %n", x, y, x - y);
        System.out.printf("%2f * %2f = %2f %n", x, y, x * y);
        System.out.printf("%2f / %2f = %2f %n", x, y, x / y);
        //Para exibir o operador "módulo" [%] usa-se [%%] 
        System.out.printf("%2f %% %2f = %2f %n", x, y, x % y);
        // Módulo exibe o "resto" da divisão
        
        int a = 8;
        int b = 3;
        
        // Para valores inteiros usa-se [%d]
        System.out.printf("%d + %d = %d %n", a, b, a + b);
        System.out.printf("%d - %d = %d %n", a, b, a - b);
        System.out.printf("%d * %d = %d %n", a, b, a * b);
        System.out.printf("%d / %d = %d %n", a, b, a / b);
        // Pode fazer "cast" (conversão) durante a operação
      // Mas tem que informar o tipo a ser exibido, no caso usou %2f para double
        System.out.printf("%d / %d = %2f %n", a, b, a /(double) b);
        System.out.printf("%d %% %d = %d %n", a, b, a % b);
        System.out.printf("%d %% %d = %f %n", a, b, a % (float)b);
        
        //Para operações de exponenciação é necessário "importar"
        // da biblioteca java.lang.Math
        System.out.printf("%d^%d = %2f %n",a,b, Math.pow(a, b));
        System.out.println("Aqui eu usei [^] para indicar exponenciação, "
                + "porém no Java ^ é o operador lógico [XOR] (não exclusivo).");
        
    }
    
}
