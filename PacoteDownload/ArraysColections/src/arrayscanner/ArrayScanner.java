/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrayscanner;
import java.util.Scanner;

/**
 *
 * @author ADAILTON
 */
public class ArrayScanner {
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
            System.out.println("Deseja registrar quantos alunos: \n");
            int quantAlunos = Integer.parseInt(entrada.next());
            System.out.println("Quantas notas por aluno? \n");
            int quantNotas = Integer.parseInt(entrada.next());
            double [][] notasTurma = new double [quantAlunos][quantNotas];
            double total = 0;
            for(int i = 0; i < notasTurma.length; i++) {
                
                for (int j = 0; j < notasTurma[i].length; j++) {
                    
                    System.out.printf("informe a nota %d do %d aluno: %n",j +1, i + 1);
                    
                    notasTurma[i][j] = Double.parseDouble(entrada.next());
                    total += notasTurma[i][j];
                }
                System.out.println();
                
            }
            
            double mediaTurma = total / (quantAlunos * quantNotas);
            System.out.println("A média da turma é " + mediaTurma);
            
            entrada.close();
    }
    
}
