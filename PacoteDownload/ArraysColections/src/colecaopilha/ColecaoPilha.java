/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecaopilha;
import java.util.ArrayDeque;

import java.util.Deque;

/**
 *
 * @author ADAILTON
 */
public class ColecaoPilha {
    
    public static void main(String[] args) {
        
        Deque<String> livros = new ArrayDeque<>();
        
        livros.add("O Pequeno Príncipe");
        livros.push("Dom Quixote");
        livros.push("O Hobbit");
        livros.push("Memórias de um Sargento de Milícias");
        // O último a entrar é o primeiro a "sair", se torna o primeiro da fila
        System.out.println(livros.peek()); 
        System.out.println(livros.element());
        
        System.out.println(livros.pop()); // Exibe e remove o 1º elemento de saída (o último que entrou)
        System.out.println(livros.pop());
        System.out.println(livros.pop()); // Quando não há mais nenhum, ele exibe mensagem de ERRO
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        
    }
    
    
}
