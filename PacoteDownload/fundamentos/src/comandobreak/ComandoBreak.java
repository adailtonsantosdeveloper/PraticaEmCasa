/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comandobreak;

/**
 *
 * @author ADAILTON
 */
public class ComandoBreak {
    
    public static void main(String[] args) {
        
        System.out.println("Uso do BREAK:");
        System.out.println();
        System.out.println("O break é usado para interromper um LAÇO");
        
        externo: // Criando "rótulo" de nome [ externo ]
                                        // Ao criar Rótulo você está dando nome a um laço
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j ++) {
                    if (i == 1) break externo; 
                    System.out.printf("[%d] [%d] ",i,j);
                }
                System.out.println();
            } // Devido ao uso do "break" [rótulo], esse comando interrompeu o laço FOR externo
        System.out.println("Fim!");
        
         for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j ++) {
                    if (i == 1) break ; // Aqui ele está interrompendo apenas o laço interno
                    System.out.printf("[%d] [%d] ",i,j);
                }
                System.out.println();
            }
        System.out.println("Fim!");
    }
    
}
