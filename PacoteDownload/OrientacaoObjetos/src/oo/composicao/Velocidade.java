/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.composicao;

/**
 *
 * @author ADAILTON
 */
public class Velocidade {
    Transmissao cambio = new Transmissao();
    Motor motor = new Motor();
    
    int mostrarVelocidade (int marcha, double giroMotor) {
        
        int velocidade = 0;
        
        switch (marcha) {
            
            case 1:
                velocidade += (int) cambio.marchaPrimeira(giroMotor);
                break;
            case 2 :
                velocidade+= (int)cambio.marchaSegunda(giroMotor);
                break;
            case 3:
                velocidade += (int) cambio.marchaTerceira(giroMotor);
                break;
            case 4:
                velocidade += (int) cambio.marchaQuarta(giroMotor);
                break;
            case 5:
                velocidade += (int) cambio.marchaQuinta(giroMotor);
                break;
            default:
                cambio.marchaNeutro();
            
        }
        
        double vel = velocidade / 3.6;
        velocidade = (int)vel;
        return (velocidade);
    }
    
}
