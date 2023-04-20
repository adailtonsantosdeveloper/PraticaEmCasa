/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecoes;
import java.util.HashSet;
// Coleções não aceitam tipos primitivos
/**
 *
 * @author ADAILTON
 */
public class ConjuntoBaguncadoHashSet {
    
    public static void main(String[] args) {
        
        HashSet conjunto = new HashSet();
        
        // Ao inserir um dado do tipo primitivo, ele é convertido para a classe Invólucro
        // Para adicionar um dado, usa-se o método "add()"
        conjunto.add(1.25); // adiciona dado double, convertido em Double
        conjunto.add(true); // adiciona dado boolean convertido em Boolean
        conjunto.add("Teste"); // adiciona dado String
        conjunto.add(1); // adiciona dado int convertido em Integer
        conjunto.add('x'); // adiciona dado char convertido em Caracter
        
        // Para exibir o tamanho usa-se  o método "size()", pois hashcode retorna apenas inteiros
        System.out.println("O tamanho é " + conjunto.size());
        
        // Para remover um dado usa-se o método "remove()"
        conjunto.remove(1.25);
        System.out.println("Removi um elemento, o tamanho é: " + conjunto.size());
        
        // Para verificar se há determinado dado na coleção, usa-se o método "contains("dado")"
        System.out.println("Tem a letra 'x' ? " + conjunto.contains('x'));
        
        HashSet nums = new HashSet();
        
        nums.add(1);
        nums.add(2);
        nums.add(3);
        
        conjunto.addAll(nums);
        
        System.out.println(nums);
        System.out.println(conjunto);
        nums.add(321);
        System.out.println(conjunto.retainAll(nums));
        System.out.println(nums);
        System.out.println(conjunto);
        conjunto.retainAll(nums);
    }
    
}
