/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecaofila;
import java.lang.Math;
/**
 *
 * @author ADAILTON
 */
public class Roda {
    
    int raio;
    double bandaRoda;
    
    double diametroRoda(int r, double b) {
        raio = r;
        bandaRoda = b;
        
        return (r + b) * 2;
    }
    
    double perimetroRoda(){
        
        return 2 * Math.PI * diametroRoda(raio, bandaRoda);
    }
    
}
