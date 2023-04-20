/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.composicao;

/**
 *
 * @author ADAILTON
 * Criação da classe "Carro" com três métodos de aceleração, condicionados à quantidade mínima e máxima
 * de giros;
 * três métodos de frenagem, condicionados à rotação mínima por minuto;
 * um método para ligar;
 * um método para desligar;
 * um método para verificar se está ligado.
 */
public class Carro {
    // Criando objeto "motor" a partir da classe "Motor"
    Motor motor = new Motor(); // Criando um motor para o Carro
    Roda roda = new Roda();
    Transmissao caixa = new Transmissao();
    
    void acelerarPouco() {
        if((motor.ligado == true))
            if(motor.giros() >= 1000 && motor.giros() < 7000)
                 motor.fatorInjecao += 0.1;
    }
    void acelerarMedio() {
        if((motor.ligado == true))
            if(motor.giros() >= 1000 && motor.giros() < 7000)
                motor.fatorInjecao += 0.25;
    }
    void acelerarMuito() {
        if((motor.ligado == true))
            if(motor.giros() >= 1000 && motor.giros() <7000)
                motor.fatorInjecao += 0.75;
    }
    
    void frearPouco() { 
        if (  motor.giros() >= 1000) {
            motor.fatorInjecao -= 0.2;
        }else {
            motor.fatorInjecao = 1;
        }
        
    }
    void frearMedio() {
        if (motor.giros() > 1000) // Se há apenas uma única linha de comando dispensa-se o uso das  { }
            motor.fatorInjecao -= 0.5;
        else
            motor.fatorInjecao = 1;
    }
    void frearForte() {
        if (motor.giros() > 1000)
            motor.fatorInjecao -= 0.85;
        else
            motor.fatorInjecao = 1;
    }
    
    void ligar() {
        motor.ligado = true;
    }
    void desligar() {
        motor.ligado = false;
    }
    
    boolean estaLigado() {
        return motor.ligado;
    }
  /*  
    double relacao (int x) {
        int [] marcha = new int[6];
        double engrenagem = 0;
        
        for(int pontMarcha: marcha) {
            
            switch (pontMarcha) {
                
                case 1:
                    engrenagem = 6.66;
                    break;
                case 2:
                    engrenagem = 5.66;
                    break;
                case 3:
                    engrenagem = 5.15;
                    break;
                case 4:
                    engrenagem = 4.05;
                    break;
                case 5:
                    engrenagem = 3.05;
                    break;
                default:
                    engrenagem = 0;                    
                    
            }
            
        }
        
        return engrenagem;
    }
    */
}
