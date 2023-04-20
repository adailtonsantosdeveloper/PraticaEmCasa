/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author ADAILTON
 */
public class Jogo {
    public static void main(String[] args) {
        
        Monstro monstro  = new Monstro();
        monstro.x = 1;
        monstro.y = 1;
        
        System.out.printf(" Posição do Jogador 1 => [%d , %d] %n", monstro.x, monstro.y);
        System.out.printf("Vida do Jogador 1 => (%d) %n", monstro.vida);
        
        Heroi heroi = new Heroi();
        heroi.x = 2;
        heroi.y = 1;
        
         System.out.printf(" Posição do Jogador 2 => [%d , %d] %n", heroi.x, heroi.y);
        System.out.printf("Vida do Jogador 2 => (%d) %n", heroi.vida);
   /*     
        j1.andar(Direcao.NORTE);
        j1.andar(Direcao.NORTE);
        j1.andar(Direcao.NORTE);
        
        System.out.println(j1.y);
       */
       monstro.atacar(heroi);
       heroi.atacar(monstro);
       heroi.andar(Direcao.NORTE);
        System.out.printf("Posição jogador 2 [%d , %d ] %n",heroi.x, heroi.y);
        
        System.out.println("Vida MONSTRO [" + monstro.vida + "] ;");
        System.out.println("Vida HEROI [" + heroi.vida + "];");
    }
}
