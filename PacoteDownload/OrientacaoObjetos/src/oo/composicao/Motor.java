/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.composicao;

/**
 *
 * @author ADAILTON
 */
public class Motor {
    
    boolean ligado = false; // Iniciar motor "desligado"
    double fatorInjecao = 1; // 
    double giroInicial = 1000;
    int giros() {
        
        if (!ligado) {
            return 0;
        } else {
            return (int) Math.round(fatorInjecao * giroInicial);
        }
                
    }
    
    
}
