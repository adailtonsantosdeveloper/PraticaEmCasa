/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecaoset;
import java.util.HashSet;
import java.util.Set; // serve para definir o tipo de dado a ser armazenado
import java.util.TreeSet; // serpe para devinir pela "ordem" de insersão

/**
 *
 * @author ADAILTON
 */
public class HomogeneoSet {
    public static void main(String[] args) {
        
        Set <String> lista = new HashSet<>();
        // [ lista.add(1.2); ] não é permitido porque  é <Double / Float>
        // [ lista.add('1'); ] não é permitido porque  é <Charactere>
        lista.add("1.2"); // é permitido porque é uma <String>
        lista.add("Ana");
        lista.add("Carlos");
        lista.add("Luca");
        lista.add("Pedro");
        
        for (String ponteiroLista: lista) {
            System.out.println(ponteiroLista);
        }
        
        Set <String> listaOrdenada = new TreeSet<>();
        
        listaOrdenada.add("Abel");
        listaOrdenada.add("Abgail");
        listaOrdenada.add("Bruna");
        listaOrdenada.add("Carol");
        listaOrdenada.add("Daniel");
        listaOrdenada.add("Elias");
        listaOrdenada.add("Fabrício");
        listaOrdenada.add("Giselle");
        listaOrdenada.add("Homero");
        listaOrdenada.add("Ingrid");
        listaOrdenada.add("Jorge");
        listaOrdenada.add("Kelly");
        listaOrdenada.add("Letícia");
        listaOrdenada.add("Manoel");
        listaOrdenada.add("Nadir");
        listaOrdenada.add("Olga");
        listaOrdenada.add("Pedro");
        listaOrdenada.add("Quesia");
        listaOrdenada.add("Ricardo");
        listaOrdenada.add("Sabrina");
        listaOrdenada.add("Tainá");
        listaOrdenada.add("Udson");
        listaOrdenada.add("Valentina");
        listaOrdenada.add("Weslley");
        listaOrdenada.add("Xena");
        listaOrdenada.add("Yasmin");
        listaOrdenada.add("Zaqueu");
        
        // Usando o foreach
        for(String pontOrdem: listaOrdenada) {
            System.out.println(pontOrdem);
        }
        
    }
    
}
