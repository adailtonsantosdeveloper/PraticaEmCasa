/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fordentrofor;

/**
 *
 * @author ADAILTON
 */
public class ForDentroFor {
    
    public static void main(String[] args) {
        
            System.out.println("Laço FOR dentro de FOR:");
            
            int i;
            int j;
            int k;
            
            for (i = 0; i <= 10; i++) {
                
                for (j = 0; j <= 10; j++) {
                    
                    k = i * j;
                    System.out.printf("[%d] * [%d] = %d", i, j, k);
                    
                }
                System.out.println();
            }
        
    }
    
}
