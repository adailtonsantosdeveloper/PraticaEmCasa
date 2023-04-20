/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversaoprimitivos;
import java.lang.Math;

/**
 *
 * @author ADAILTON
 */
public class ConversaoPrimitivos {
    
    public static void main(String[] args) {
        
        System.out.println("Como converter tipos primitivos: ");
        double numMonet = 1.99785314586;
        int numInt = 0;
        
        System.out.printf(" %2f é um double e ao converter para int fica assim [%d].%n",numMonet,(int)numMonet);
        numInt = (int)Math.pow(numMonet, 15);
        System.out.println("A linguagem leva em consideração o TAMANHO do tipo\n");
        System.out.println("Se criar uma variável [x] do timpo long com valor 1, e tentar criar uma variável [y] para receber [x]\n");
            System.out.println("Não será possível, porque o tipo [long] tem o dobro do tamanho de [int].\n");
            System.out.println("Para fazer essa conversão de long para int é preciso fazer um cast y = (int) x; \n");
            System.out.println("Demonstrando [casting] (int) de um double => " + numInt);
        numInt = (int) numMonet;
        
        System.out.println("Double para int, usando (int) para converter: " + numInt + "\n");
        System.out.println("Mas é possível converter int para long sem o [casting] justamente porque dentro de long CABE int.");
        
    }
    
}
