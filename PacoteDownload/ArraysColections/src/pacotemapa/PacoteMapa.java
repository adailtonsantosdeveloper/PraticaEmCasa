/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacotemapa;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author ADAILTON
 */
public class PacoteMapa {
    public static void main(String[] args) {
        /*
        A sintaxe de Map é:
        Map <TipoChave, TipoObjeto> nomeObjeto
        */
        Map<Integer, String> usuarios = new HashMap();
        
        /*
        O método "put(chave, objeto)" serve para inserir os objetos e suas respectivas "chaves" (ou referência)
        à coleção do objeto do tipo Map
        */
        usuarios.put(1, "Adailton");
        usuarios.put(10, "João");
        usuarios.put(20, "Anderson");
        usuarios.put(200, "Udemy");
        usuarios.put(300, "Cruzeiro do Sul");
        
        System.out.println("Quantidade de objetos [" + usuarios.size() + "]; ");
        System.out.println("Está vazio [true/false]? " + usuarios.isEmpty());
        
        System.out.println("Array de chaves dos elementos: \n" + usuarios.keySet());
        // O método "keySet()" exibe as <chaves> contidas na coleção no Array
        
        System.out.println("Array de valores dos elementos:\n" + usuarios.values());
        // O método "values()" exibe os <valores> contidos na coleção no Array
        
        System.out.println("O que exibe com .entrySet()?\n" + usuarios.entrySet());
        // O método "entrySet() exibe as <chaves> = <valores> no Array
        
        // O tipo de chave não precisa ser número
        Map<Character, String> nomeLetras;
        nomeLetras = new HashMap();
        nomeLetras.put('a', "Letra A");
        nomeLetras.put('f',"Efi");
        nomeLetras.put('h', "Agá");
        
        // O método "containsKey()" verifica se há a [chave] no registro, retorna valor booleano [true/false]
        System.out.println("Contém a chave 'a' ? " + nomeLetras.containsKey('a'));
        System.out.println("Contém a chave 'b' ? " + nomeLetras.containsKey('b'));
        
        // O método "containsValue()" verifica se há o [valor] no registro. Retorna valor booleano [true/false]
        System.out.println("Contém o valor [Efi] ? " + nomeLetras.containsValue("Efi"));
        System.out.println("Contém o valor [Emi] ? " + nomeLetras.containsValue("Efi"));
        
        // Usando "ForEach" para percorrer as chaves
        for (Character pontChar: nomeLetras.keySet()) {
            System.out.println(pontChar);
        }
        
        // Usando "ForEach" para percorrer os valores
        for (String pontVal: nomeLetras.values()) {
            System.out.println(pontVal);
        }
        
        // Omplementando "Entry" no "ForEach" para percorrer [chave] e [valor]
        for (Entry<Integer, String> registro: usuarios.entrySet()) {
            System.out.print(registro.getKey() + " => ");
            System.out.println(registro.getValue());
        }
        //Para usar o [Entry] é necessário importar o pacote "java.util.Map.Entry"
        
    }
}
