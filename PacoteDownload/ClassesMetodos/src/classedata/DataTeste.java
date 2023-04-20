/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classedata;

/**
 *
 * @author ADAILTON
 */
public class DataTeste {
    
    public static void main(String[] args) {
        
        // Chama o construtor Data() da classe Data, através do operador "new"
        // para "construir" o objeto [d1]
        Data d1 = new Data(); // "Objeto" ou "Instância" é a mesma coisa
        
        /*
        Quando se cria um novo "Objeto" o Java reserva um NOVO espaço na memória
        para armazenar este objeto.
        Em outras palavras, cada novo Objeto criado é tbm gerado um novo endereço na memória.
        */
        
        d1.dia = 7;
        d1.mes = 11;
        d1.ano = 2021;
        
        System.out.printf("%d/%d/%d%n",d1.dia,d1.mes,d1.ano);
        
        Data d2 = new Data();
        
        d2.dia = 31;
        d2.mes = 12;
        d2.ano = 2020;
        
        System.out.printf("%d/%d/%d%n",d2.dia,d2.mes,d2.ano);
        /*
        O objeto [d1] tem um endereço e o objeto [d2] tem outro endereço.
        Por mais que possuam os mesmos [atributos], possuem valores diferentes.
        Se alterar o valor de [d1] não irá interferir no [d2] e vice e versa.
        */
    }
    
}
