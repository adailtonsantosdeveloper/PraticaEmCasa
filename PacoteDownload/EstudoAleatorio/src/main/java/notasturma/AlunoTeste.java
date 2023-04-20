/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notasturma;

import javax.swing.JOptionPane;

/**
 *
 * @author ADAILTON
 */
public class AlunoTeste {
    public static void main(String[] args) {
        String sQuantAlunos = JOptionPane.showInputDialog("Deseja cadastrar quantos alunos?");
        int nQuantAlunos = Integer.parseInt(sQuantAlunos);
        System.out.println("A quantidade é: " + nQuantAlunos);
        JOptionPane.showMessageDialog(null, nQuantAlunos + " alunos a registrar. Click em OK");
        int vetAlunos [] = new int [nQuantAlunos];
        Aluno aluno[] = new Aluno[nQuantAlunos]; // Instanciando VETOR do objeto aluno
        
        for (int qCadastro = 0; qCadastro <= nQuantAlunos; qCadastro++ ) {
            aluno[qCadastro].nome = JOptionPane.showInputDialog("Informe o nome do " + (qCadastro + 1)+ "º aluno: ");
        }
        for (int i = 0; i <= nQuantAlunos; i++) {
            System.out.println("Aluno " + (i + 1) + " => " + aluno[i] + ";");
        }
        
    }
    
}
