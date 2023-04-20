/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calcarea;

/**
 *
 * @author ADAILTON
 */
public class AreaTriangulo {
    
    double base;
    double altura;
    
    AreaTriangulo() { }
    
    AreaTriangulo(double b, double h) {
        base = b;
        altura = h;
    }
    
    double calcAreaTriangulo(double base, double altura) {
        double area = (base * altura) / 2;
        return area;
    }
    
}
