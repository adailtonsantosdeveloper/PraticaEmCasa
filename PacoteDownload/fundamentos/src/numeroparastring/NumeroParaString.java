/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numeroparastring;

/**
 *
 * @author ADAILTON
 */
public class NumeroParaString {
    
    public static void main (String [] args) {
        
        Integer num1 = 1000; // Criado o "objeto' [num1] a partir da Classe [Integer]
        
        // Chama o "método" [toString()] para converter o objeto [num1] em String
        System.out.println(num1.toString());
        
        //Também pode fazer assim...
        String S_num1 = num1.toString();
        
        /*
        Uma vez convertido número para String é possível solicitar quantos
        dígitos tem o número.
        */
        System.out.println(S_num1.length());
        
        /*
        Outra forma de converter número para String a partir do tipo PRIMITIVO
        */
        int num2 = 18091986;
        //Isso é possível se chamar a classe "Invólucro" do tipo primitivo,
        //e chamar o método [toString()] passando a variável como "parâmetro"
        System.out.println(Integer.toString(num2));
        
        // Ou dessa forma: Criando uma váriavel String recebendo o valor
        // de uma variável numérica.
        String S_num2= Integer.toString(num2);
        System.out.println(S_num2.length());
    }
}
