/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 package stringparanumero;

import javax.swing.JOptionPane;
/**
 *
 * @author ADAILTON
 */
public class StringParaNumero {
    
    public static void main (String[] args) {
        
        //Criando um objeto a partir da classe String
        //e atribuir-lhe o valor informado na "caixa de diálogo
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo número: ");
        System.out.println("Valores tipo [String] somados "+ valor1 + valor2);
        //A soma em String é "concatenação", ou seja, une lado a lado os valores
        
        /*
        Criando variável numérica do tipo "primitivo [DOUBLE],
        chamando a classe "invólucro [Double] no "método" [parseDouble()]
        e passando o dado do tipo "String" como parâmetro 
        */
        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble (valor2);
        
        System.out.println("A soma é: " + numero1 + numero2);
        System.out.println("A média é: " + (numero1 + numero2)/2);
    }
    
}
