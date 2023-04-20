/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlefor;

/**
 *
 * @author ADAILTON
 */
public class ControleFor {
    
    public static void main(String[] args) {
        
        System.out.println("Estrutura de controle FOR");
        
        /*
        Sintaxe:
        // Cont inicia com <valor x>; contador <= valor y ; contador ++ / contador --
        for (<contador> = <valor> ; <condicao> ; <incremento> ou <decremento>) {
        
            <Bloco de códigos>;
        
        }
        */
        double multipl = 0.5;
        double x;
        double y;
        for (int cont = 0; cont < 7; cont ++) {
          
            multipl = multipl + cont;
            x = multipl;
            y = (x * multipl) - cont;
            System.out.printf("--cont = %d; multipl = %2f; x = %2f; y = %2f %n --", cont, multipl, x, y);
            multipl += 0.05;
        }
        
    }
    
}
