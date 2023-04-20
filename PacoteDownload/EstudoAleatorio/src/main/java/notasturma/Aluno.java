/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notasturma;

/**
 *
 * @author ADAILTON
 */
public class Aluno {
    
    String nome = new String();
    double nota1;
    double nota2;
    double nota3;
    double nota4;
    double mediaAluno;
    
    double media(double a, double b, double c, double d) {
        
        double m = (a + b + c + d) / 4;
        
        return m;
        
    }
    
}
