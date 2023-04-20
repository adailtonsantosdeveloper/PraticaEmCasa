/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operadoresatribuicao;
import java.lang.Math;
/**
 *
 * @author ADAILTON
 */
public class OperadoresAtribuicao {
    public static void main(String[] args) {
        // "Atribuindo" valor 3 à variável [a]
        int a = 3;
        System.out.println("a recebe  " + 3);
        
        // "Atribuindo" valor de [a] na variável [b]
        int b = a;
        System.out.println("b recebe " + a);
        
        // "Atribuindo" a "soma" de [a] + [b] à variável [c]
        int c = a + b;
        System.out.printf("c recebe %d + %d (%d)%n",a, b, a+b);
        System.out.println("c vale agora " + c);
       
        // c += b; // c = c + b
        System.out.printf("c += %d (%d)%n",b, c+=b);
        System.out.println("c vale agora " + c);
        
        // c -= a; // c = c - a
        System.out.printf("c -= %d (%d) %n",a,c-=a);
        System.out.println("c vale agora " + c);
        
        //c *= b // c = c * b
        System.out.printf("c *= b (%d) é %d %n", b, c*=b);
        System.out.println("c vale agora " + c);
        
        //c /= a // c = c / a
        System.out.printf("c /= a (%d) é %f %n",a,(float)(c/=a));
        System.out.println("c vale agora " + c);
        double x = Math.pow( a, b);
        c = 11;
        //c %= 2;
        System.out.println("c %= 2 é \n" + (c%=2));
        c += a;
        System.out.println("c vale agora " + c);
        
        double d = Math.pow(a,b);
        double d1 = 2; 
        System.out.println("d vale a^b \n");
        System.out.printf("a vale [%d] e b vale [%d] %n",a, b);
        System.out.printf("d = a^b que dá %2f %n",d);
        System.out.printf("d1 vale %2f %n", d1);
        System.out.printf("d1 (%2f) /= %2f é [%2f] %n",d1,d,(d1/=d));
    }
    
}
