/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author ADAILTON
 */
public class Jogador {
    
    int vida = 100;
    int x; // Posição x [linha]
    int y; // Posição y [coluna]
    
    boolean atacar (Jogador oponente) {
        
        int deltaX = Math.abs(x - oponente.x); // diferença entre posição x para cada jogador [ignorando valores negativos]
        int deltaY = Math.abs(y - oponente.y); // diferença entre a posição y para cada jogador [ignorando valores negativos]
        
        if (deltaX == 0 && deltaY == 1) { // Se está na mesma linha e coluna for diferente LIBERA ATAQUE
            oponente.vida -= 10; // Subtrai 10 pontos da vida do oponente
            return true;
        } else if (deltaX == 1 && deltaY == 0) { // Se está em linha diferente e mesma coluna LIBERA ATAQUE
            oponente.vida -= 10; // subtrai 10 pontos da vida do oponente
            return true;
        } else {
            return false;
        }
        
    }
    
    boolean andar(Direcao direcao) { //Abre método andar()
        
        switch(direcao) { // Abre SWITCH
            
            case NORTE:
                y++;
                break;
            
            case LESTE:
                x++;
                break;
            
            case OESTE:
                x--;
                break;
            
            case SUL:
                y--;
                break;
            
        } // Fecha SWITCH
        /*
        FALTA CONTINUAR AS AULAS
        */
        
        return true;
    } // Fecha método andar()
    
}
