/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calcarea;
import java.lang.Math;
/**
 *
 * @author ADAILTON
 */
public class AreaCirculo {
    
    final double pi = 3.141593;
    double raio;
    
    AreaCirculo() { }
    
    AreaCirculo(double raio) {
        
        this.raio = raio;
        
    }
    
    double calcAreaCirculo (double numPi, double numRaio) {
        numPi = pi;
        double area = numPi *Math.pow(numRaio, 2);
        return area;
       
    }
    
}
