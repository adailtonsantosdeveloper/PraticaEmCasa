/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

/**
 *
 * @author ADAILTON
 */
public class Produto {
    
    String nome; // Atributo da classe
    double preco; // Atributo da classe
    double desconto; // Atributo da classe
    
    /*
    Por padrão o Java cria implicitamente um método "especial"
    que chamamos de "construtor", e esse construtor 
    obrigatoriamente terá o mesmo nome da classe. 
    Nesse exemplo o construtor tem o nome de [Produto()]
    
    Ao ser chamado pelo [new] em outra "classe"
    o "construtor" criará o objeto com os mesmos [atributos] 
    da classe de origem.
    */
    
    /*
    Construtor padrão:
        Produto()
    
    Pode-se criar construtores diferentes do padrão,
    isso é feito definindo parâmetros, mas os atributos herdados serão os mesmos
    da classe de origem.
    
    Exemplos:
    
        Produto(String a) { ... }
        Produto(double x, double y) { ... }
        Produto(String a, double x, double y) { ... }
    */
   
    Produto() {
        
    }
    Produto(String nome) {
         this.nome = nome;
    }
    Produto(double preco, double desconto) {
        this.preco = preco;
        this.desconto = desconto;
    }
    
    
}
