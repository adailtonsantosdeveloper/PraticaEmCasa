/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversaotiposprimitivos;

/**
 *
 * @author ADAILTON
 */
public class ConversaoTiposPrimitivos {
    
    public static void main (String [] args) {
        
        double a = 1; // Conversão IMPLÍCITA
        System.out.println(a);
        
        float b = (float) 1.123456788888; // Conversão EXPLÍCITA
        System.out.println(b);
        
        int c = 256; // [byte] cabe dentro de [int]
        byte d = (byte)c; // Mas [int] não cabe dentro de [byte].
        //Para forçar a conversão é necessário declarar de forma EXPLÍCITA,
        //mas pode haver "perda de informações", a conversão não será precisa
        
        short e = (short) c;
        
        //Abaixo criei uma variável do tipo [String] de nome "binario"
        //Atribuo a classe envelope [Integer], chamo o MÉTODO "toBinaryString
        //para converter o valor numérico em binário.
        String binario = Integer.toBinaryString(d);
        
        System.out.println("Valor de " + c + " em byte: " + d);
        System.out.println("Valor de " + c + " em short: " + e);
        System.out.println("Valor " + c +" em binário: " + binario);
        
    }
    
}
