/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

/**
 *
 * @author ADAILTON
 */
public class ProdutoTeste {
    public static void main(String[] args) {
        /*
        Criando o "objeto" [p1] a partir da "classe" [Produto],
        ao chamar o construtor [Produto()] através do comando "new"
        */
        Produto p1 = new Produto();
        
        /*
        Atribuindo o [valor] "Notebook" para o "atributo" [nome]
        do "objeto" [p1]
        */
        p1.nome = "Notebook";
        
        /*
        Atribuindo o [valor] "4356.89" para o "atributo" [preco]
        do "objeto [p1]
        */
        p1.preco = 4356.89;
        
        /*
        Atribuindo o [valor] "0.25" para o "atributo" [desconto]
        do "objeto" [p1]
        */
        p1.desconto = 0.25;
        
        Produto p2 = new Produto();
        
        p2.nome = "caneta preta";
        p2.preco = 12.56;
        p2.desconto = 0.29;
        
        System.out.println(p1.nome);
        System.out.println(p2.nome);
        System.out.println(p1.nome + " custa R$ " + p1.preco);
        System.out.println(p2.nome +" custa R$ "+ p2.preco);
        System.out.println(p1.nome +" desconto " + p1.desconto);
        System.out.println(p2.desconto + " desconto "+ p2.desconto);
        System.out.printf(p1.nome + " com desconto custa R$ %2.2f %n" , p1.preco *(1 - p1.desconto));
        System.out.printf(p2.nome + " com desconto custa R$ %2.2f %n%n" , p2.preco *(1 - p2.desconto));
        
    }
}
