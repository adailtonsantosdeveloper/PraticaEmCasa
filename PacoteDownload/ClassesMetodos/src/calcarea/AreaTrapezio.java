/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calcarea;

/**
 *
 * @author ADAILTON
 */
public class AreaTrapezio {
    
    double baseMaior;
    double baseMenor;
    double altura;
    
    AreaTrapezio() { }
    
    AreaTrapezio(double bMai, double bMen) {
        baseMaior = bMai;
        baseMenor = bMen;
    }
    
    double calcAreaTrapezio (double b1, double b2, double h) {
        
        double area = ((b1 + b2)*h) /2;
        return area;
    }
    
}
