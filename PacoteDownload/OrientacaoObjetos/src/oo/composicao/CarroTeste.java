/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.composicao;
import java.util.Scanner;

/**
 *
 * @author ADAILTON
 */
public class CarroTeste { // início da classe CarroTeste
    
    public static void main(String[] args) { // Início do método main
       Scanner entrada = new Scanner(System.in); // Interface para usuário 
        Carro carro = new Carro();
        Motor motor = new Motor();
        Transmissao marcha = new Transmissao(); // Instanciando objeto [marcha]
        Velocidade velox = new Velocidade();
        System.out.println("Informe o tamanho do aro: ");
        Roda roda = new Roda(); // Instanciando objeto [roda]
        
       roda.aro = Float.parseFloat(entrada.next());
        float aroCentimetro = 15;  /* (float)roda.convertPolToCentimetro(roda.aro); */
        System.out.println("No pneu tem numerações em sequência [largura / altura / aro");
        System.out.println("Informe a altura do perfil do pneu: ");
        float alturaPneu = 75;  /* Float.parseFloat(entrada.next()); */
        roda.bandaRoda = alturaPneu;
        alturaPneu = alturaPneu * 2;
        System.out.printf("Uma volta do pneu equivale a %2.2f metros (aprox). %n",  roda.perimetroRoda());
        float perimetro = (float)roda.perimetroRoda();
        System.out.printf("Um metro necessida de [%2.2f %%] voltas da roda%n",roda.contadorVoltasRoda(perimetro) * 100 );
        System.out.printf("São necessárias %2.2f voltas no pneu para UM quilômetro. %n%n", roda.contadorVoltasRoda(perimetro) * 10000);
        
        System.out.println("Deseja ligar o motor [s/n]? ");
        String opLigar = entrada.next();
               
        if (opLigar.equalsIgnoreCase("s")) {
            carro.ligar();
            System.out.println("Giros motor [" + motor.giros() + "] RPM; ");  
        
        System.out.println("Qual marcha quer engatar? ");
        
        int qualMarcha = Integer.parseInt(entrada.next());
        
        if (qualMarcha == 1 || qualMarcha == 2 || qualMarcha == 3 || qualMarcha == 4 || qualMarcha ==5) {
            
            System.out.println("Velocidade {" +  velox.mostrarVelocidade(qualMarcha, motor.giros()) + "} Km/h");
            
        }
       // double kmH = roda.mostraVelocidade(qualMarcha, carro.motor.giros()); // FALTA CONTINUAR...
     //   System.out.printf("Velocidade nessa marcha é [%2.2f] Km / H", kmH);
        //falta implementar aceleração para relacionar a marcha com o novo giro do motor
        carro.acelerarMedio();
      //  System.out.printf("Velocidade nessa marcha é [%2.2f] Km / H %n", kmH);
        } else {
            carro.desligar();
            System.out.println("Motor DESLIGADO");
        }    
        
        
   //     entrada.close();
    } // Fim do método main
    
} // Fim da classe CarroTeste
