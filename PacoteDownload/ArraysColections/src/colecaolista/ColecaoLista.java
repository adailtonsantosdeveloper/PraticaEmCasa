/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecaolista;
import java.util.ArrayList;
// import java.util.Scanner;

/**
 *
 * @author ADAILTON
 */
public class ColecaoLista {
    
    public static void main(String[] args) {
        /*
        Criar o objeto [lista] do tipo "classe" <Usuario>
        a partir do "ArrayList<>()
        */
        ArrayList<Usuario> lista = new ArrayList<>();
        
        System.out.println("O tipo de coleção LISTA é indicado quando se quer acessar os "
                + "objetos através de um índice.\n");
        
        /*
        Criando objeto [u1] do mesmo tipo declarado no ArrayList<>
        e lhe atribuindo um valor
        */
        Usuario u1 = new Usuario("Ana");
        
        // construindo novo objeto do tipo Usuario
        // para incluir na lista
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));
        lista.add(new Usuario("Adailton"));
        
        // Fazendo assim irá exibir apenas a "descrição" do objeto que está na posição (4)
        System.out.println("=> " + lista.get(4) + " <=");
        //Irá exibir => nomepacote.NomeClasse@enderecoMemoria <=
        
        //Para exibir o "valor" contido nesse endereço coloque o nome da instância após o método get()
        System.out.println("=> " + lista.get(4).nome + " <=");
        
        //exibindo a lista usando for each
        for (Usuario pontU: lista) {
            System.out.println(pontU.nome);
        }
        
        System.out.println("Indicando as posições na memória");
        
        for (int tamanho = 0; tamanho < lista.size(); tamanho ++) {
            System.out.println(" [ " + tamanho + " ] => "+ lista.get(tamanho).nome + " (posMemoria) - " + lista.get(tamanho));
        }
        System.out.println();
                        
    }
    
}
