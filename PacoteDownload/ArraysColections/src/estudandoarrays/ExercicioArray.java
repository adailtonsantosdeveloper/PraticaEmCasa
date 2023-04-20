/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudandoarrays;
import java.util.Arrays;
/**
 *
 * @author ADAILTON
 */
public class ExercicioArray {
    
    public static void main(String[] args) {
        // Criando objeto Array "notasAlunoA" de 4 posições
        double[] notasAlunoA = new double[4];
        
        // Também pode criar Arrays já com os espaços preenchidos
        
        double[] notasAlunoB = {5.5, 6.85,10,7.25};
        
        /*
        Se Array é um "objeto", ele possui [atributos] e [métodos],
        para acessá-los é necessário importar o pacote da classe Array.
        
        Para visualizar os dados contidos no "Array" criado, é necessário
        chamar o método [toString()]
        */
        
        // Aqui exibirá os dados "padrão" do tipo criado
        System.out.println("Valor padrão: " + Arrays.toString(notasAlunoA));
        
        notasAlunoA[0] = 7.5;
        notasAlunoA[1] = 8.25;
        notasAlunoA[2] = 6.75;
        notasAlunoA[3] = 9.75;
        
        // Aqui exibirá os dados armazenado em cada posição do Array
        System.out.println("Valor preenchido: " + Arrays.toString(notasAlunoA));
        
        // Para percorrer o Array faça assim...
        // Cria-se uma variável de armazenamento
        double totalA = 0;
        // Dentro do "for" cria-se uma variável de "incremento
        // Compara com a "largura" do Array notasAlunoA
        for (int i = 0; i < notasAlunoA.length; i++) {
        // "length é um ATRIBUTO, ou seja, um DADO associado ao Array [largura do Array]
            totalA += notasAlunoA[i];
            
        }
        // Aqui exibe a média das notas registradas
        System.out.println("Média dos dados: " + totalA / notasAlunoA.length);
        
        double totalB = 0;
        
        for(int i = 0; i < notasAlunoB.length; i++) {
            
            totalB += notasAlunoB[i];
            
        }
        System.out.println("Dados preenchidos AlunoB: " + Arrays.toString(notasAlunoB));
        System.out.println("Média alunoB: " + totalB / notasAlunoB.length);
        
    }
    
}
