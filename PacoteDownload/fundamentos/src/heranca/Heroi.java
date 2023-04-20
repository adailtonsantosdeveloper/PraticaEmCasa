/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author ADAILTON
 */
public class Heroi extends Jogador { // A classe Heroi herda as características da classe Jogador
    
    @Override
    boolean atacar (Jogador oponente) {
        
        int deltaX = Math.abs(x - oponente.x); // diferença entre posição x para cada jogador [ignorando valores negativos]
        int deltaY = Math.abs(y - oponente.y); // diferença entre a posição y para cada jogador [ignorando valores negativos]
        
        if (deltaX == 0 && deltaY == 1) { // Se está na mesma linha e coluna for diferente LIBERA ATAQUE
            oponente.vida -= 20; // Subtrai 10 pontos da vida do oponente
            return true;
        } else if (deltaX == 1 && deltaY == 0) { // Se está em linha diferente e mesma coluna LIBERA ATAQUE
            oponente.vida -= 20; // subtrai 10 pontos da vida do oponente
            return true;
        } else {
            return false;
        }
        
    }
    
    
}
