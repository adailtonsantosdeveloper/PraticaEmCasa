//import java.util.Scanner;
import javax.swing.JOptionPane;
public class PassagemOnibus {
    public static void main(String[] args) {
       // Scanner entrada = new Scanner(System.in);
        System.out.println("Esse App exibe o valor de 20 passagens");
        System.out.println("Informe o valor unitário da passagem [use ponto ao invés de vírgula]");
        String valPass = JOoptionPane.showInputDialog("Qual valor unitário da passagem? [use ponto no lugar da vírgula]");
        double passagem = Double.parseDouble(valPass);
        double total = 0;
        for (int cont = 0; cont < 20; cont++) {
            total = (cont+1) * passagem;
            System.out.printf("%d X %2.2f = [R$ %2.2f] %n", passagem,(cont+1),total);
        }
       // entrada.close();
    }
    
}
