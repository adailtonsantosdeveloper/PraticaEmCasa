/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tamanhotiposprimitivos;
import java.lang.Math;

/**
 *
 * @author ADAILTON
 */
public class Basico {
    public static void main(String[] args) {
        byte bPos = 127; // 8 bits
        byte bNeg = -128; // 8 bits
        System.out.println(bNeg + " ... 0 ... " + bPos + " => Tipo BYTE");
        
        short sPos = 32767; // 16 bits
        short sNeg = -32768; // 16 bits
        System.out.println(sNeg + "...0... "  + sPos + " => tipo SHORT");
        
        int iPos = 2147483647; // 32 bits
        int iNeg = -2147483648; // 32 bits
        System.out.println( iNeg+ ". .. 0 ... " + iPos + " => tipo INT");
        
        long lPos = 9223372036854775807l; //64 bits
        long lNeg = -9223372036854775808L; // 64 bits
        System.out.println(lNeg + " ... 0 ... " + lPos + " => Tipo LONG");
        
        float fPos = (float)Math.PI; // 32 bits 
        float fNeg = -(float)Math.PI; // 32 bits
        System.out.println(fNeg + " ... 0 ... " + fPos + " => Aqui é FLOAT");
        
        double dPos = Math.PI; // 64 bits
        double dNeg= Math.PI; // 64 bits
        System.out.println(dNeg + " ... 0 ... " + dPos + " => Aqui é DOUBLE");
        
        char unMin = '\u0000'; // 16 bits
        char unMax = '\uffff'; // 16 bits
        System.out.println(unMin + " => Tipo CHAR valor mínimo.");
        System.out.println(unMax + " => Tipo CHAR valor máximo");
        boolean verdadeiro = true; // 1 bit
        boolean falso = false; // 1 bit
        System.out.println(verdadeiro + " => Tipo BOOLEAN verdadeiro");
        System.out.println(falso + " => Tipo BOOLEAN falso");
        
    }
}
