/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comparacaostring;
import java.util.Scanner;
/**
 *
 * @author ADAILTON
 */
public class ComparacaoString {
    
    public static void main(String[] args) {
        
        System.out.println("Compara valor == valor");
        System.out.println("2 == 2 ? " + ("2"=="2"));
        
        /*
        Criando o objeto [s1] a partir da classe [String]
        ao chamar o "construtor" [String] através do comando "new"
        e atribuindo o valor "2" como parâmetro.
        */
        String s1 = new String("2"); // Invocação do construtor
        // O "objeto" [s1] vale "2"
        System.out.println("2 == s1 ?");
        System.out.println("2" == s1);
        System.out.println("2.equals(s1)? ");
        System.out.println("2".equals(s1));
        
        /*
        Para solicitar que o usuário informe dados (interaja) é necessário
        importar a classe "Scanner" da biblioteca "java.util" e criar um objeto
        a partir desta classe.
        
        Aqui é criado a "variável" [entrada] a ártir da classe "Scanner" ao chamar o
        construtor [Scanner] pelo comando "new" e definindo como parâmetro
        de [entrada de dados no sistema] (System.in);
        */
        Scanner entrada = new Scanner(System.in);
        /*
        É importante saber que todo dado de entrada é tratado como String,
        ou seja, se digitar 12, a
        */
        
        // Criando "objeto" [s2] e atribuindo o valor informado pelo usuário
        String s2 = entrada.next();
        System.out.println("Se chamar o método .trim() o Java ignora os espaços vazios.");
        System.out.println("Exemplo: \n" + "(2==s2.trim()) ?");
        System.out.println("2"==s2.trim());
       /*
        Aqui, ao digitar 2 == verifica se os objetos são idênticos, se ocupam o MESMO espaço na memória
        só testa conteúdo se estiver comparando apenas tipos primitivos.
        */
        
        System.out.println("O ideal é utilizar (.equals())");
        System.out.println("2".equals(s2.trim()));
        /*
        o método .equals() testa se os CONTEÚDOS são idênticos
        */
        
        entrada.close(); // É importante sempre fechar o Scanner.
    }
    
}
