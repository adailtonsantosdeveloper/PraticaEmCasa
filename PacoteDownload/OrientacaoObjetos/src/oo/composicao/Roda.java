/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.composicao;

/**
 *
 * @author ADAILTON
 */import java.lang.Math;
/**
 *
 * @author ADAILTON
 */
public class Roda {
    
    float aro;
    float bandaRoda;
    
    Transmissao marcha = new Transmissao();
    Velocidade velocimetro = new Velocidade();
    
    Roda() { } // Construtor padrão
    
    Roda(float raio, float bandaRoda) { // Construtor com 2 parâmetros
        this.aro = aro;
        this.bandaRoda = bandaRoda;
    }
    
    double diametroRoda(float r, float b) { // Calcula o diâmetro da roda
        aro = r;
        double dRaio = aro * 2.546;
        bandaRoda = b;
        
        return (dRaio + b) * 2;
    }
    
    double perimetroRoda(){ // Calcula o "perímetro" da roda
        
        double raio = ((aro *2.54) /100) / 2;
        
        bandaRoda /=  1000;
        aro = aro + bandaRoda;
        return 2 * Math.PI * raio;
    }
    
     double contadorVoltasRoda(double x) {
         
       String y = Double.toString(x); // Armazena em "y" o valor de "x" convertido em String
       double largura = y.length(); // uma vez convertido, dá para contar quantas posições [quantos dígitos]
       largura = 1*Math.pow(10, largura);
       double ajUnidade = ((largura * 100) / x) /10;
       ajUnidade /= largura * 10;
       return (float)ajUnidade ; // Dividir por 10 para converter em metros
    }
    
  /*  double convertCentToPolegada(double valor) {
        return valor / 2.546;
    } */
    double convertPolToCentimetro(float valor) {
        return valor * 2.546;
    }
    
    double mostraVelocidade (int numMarcha, int rpm) {
        double vel = 0;
        
        switch (numMarcha) {
            
            case 1: 
                vel += marcha.marchaPrimeira(rpm);
                break;
            case 2:
                vel += marcha.marchaSegunda(rpm);
                break;
            case 3:
                vel += marcha.marchaTerceira(rpm);
                break;
            case 4:
                vel += marcha.marchaQuarta(rpm);
                break;
            case 5:
                vel += marcha.marchaQuinta(rpm);
                break;
            default:
                marcha.marchaNeutro();
        }
        vel /= 3.6;
        
        
        return vel;
    }
    
}
