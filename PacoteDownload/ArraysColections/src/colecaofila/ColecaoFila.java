/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecaofila;
import java.util.LinkedList;
/*
A classe LinkedList tem por objetivo armazenar e identificar a posição [anterior] e a 
[posterior] de determinada "lista", sendo que a próxima posição da última será a PRIMEIRA.
E e posição anterior à primeira será a ÚLTIMA.
Formando algo como um círculo, em que cada posição é chamada de NÓ.
*/
import java.util.Queue;
/*
A classe Queue serve para armazenar objetos em uma [fila], onde o primeiro objeto
a entrar é também o primeiro a sair, como uma FILA
*/

/**
 *
 * @author ADAILTON
 */
public class ColecaoFila {
    public static void main(String[] args) {
        
        Queue<String> fila = new LinkedList<>();
        
        fila.add("Abel");
        fila.offer("Bruno");
        fila.add("Carlinha");
        fila.offer("Gonçalo");
        fila.add("Hebe");
        fila.offer("Zacarias");
        
        System.out.println(fila.peek()); // Retorna o próximo (ou primeiro) elemento da fila, sem removê-lo
        // Caso não haja nenhum elemento, irá retornar [null]
        System.out.println(fila.peek());
        
        System.out.println(); // pula linha
        
        System.out.println(fila.element()); // Retorna o próximo (ou primeiro) elemento da fila sem removê-lo
        // Caso não haja elemento, irá exibir mensagem de erro
        System.out.println();
        System.out.println("Tamanho da fila: [" + fila.size() + "]"); // size() retorna valor inteiro
        System.out.println("Para limpar a lista usa-se o método .clear()");
        System.out.println("A fila está vazia? " + fila.isEmpty()); 
        // O método "isEmpty() serve para verificar se a fila está vazia e RETORNA valor "booleano"
        
        System.out.println("Para eliminar o primeiro elemento da fila usa-se o método . poll()");
        System.out.println(fila.poll()); // Quando não houver mais elementos ele retorna [null]
        System.out.println("Tamanho: " + fila.size());
        // fila.contains("Bruno");
        System.out.println("O método contains() verifica se há o elemento na fila\n");
        System.out.println("Exemplo: fila.contains(ValorObjeto) => " + fila.contains("Gonçalo"));
        System.out.println("Exemplo: fila.contains(ValorObjeto) => " + fila.contains("Adailton"));
        
        
    }
    
}
