package adicao;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author ADAILTON
 */
public class Adicao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Informe o primeiro número: ");
        Scanner entrada = new Scanner(System.in);
        double primNum = Double.parseDouble(entrada.next());
        System.out.println("Informe o segundo número: ");
        double segNum = Double.parseDouble(entrada.next());
        System.out.println("A soma é: " + (primNum + segNum));
        entrada.close();
    }
    
}
