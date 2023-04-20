/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foreach;

/**
 *
 * @author ADAILTON
 */
public class ForEach {
    
        public static void main(String[] args) {
        
            System.out.println("Uma forma mais [simples] de percorrer um Array:");
            
            double [] notas = {9.9, 8.7, 7.2, 9.4}; // Array de 4 posições criada
            
            // Forma convencional de percorrer um Array
            for(int i = 0; i < notas.length; i++) {
                System.out.print(notas[i] + " ");
            }
            System.out.println(); // Pular uma linha
            
            // Usando o FOREACH
            for(double ponteiro: notas) {
                System.out.print(ponteiro + " ");
            }
            /*
            Ao criar a variável do mesmo tipo de dado do Array
            e usar o operador [ : ] (significa CADA),  faz com que
            seja criado um ponteiro para cada posição do Array
            */
            
    }
    
}
