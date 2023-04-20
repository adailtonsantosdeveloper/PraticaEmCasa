/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package account;

import java.util.Scanner;

public class Account {

    private String nome;
    
    public void setNome(String nome) {
        
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
/**
 *
 * @author ADAILTON
 */
public class AccountTest {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        
        Account myAccount = new Account();
        
        System.out.printf("Nome inicial: %s%n%n",myAccount.getNome());
        
        System.out.println("Digite o nome: ");
        
        String theName = input.nextLine();
        myAccount.setNome(theName);
        System.out.println();
        
        System.out.printf("Nome no objeto myAccount e: %n%s%n", myAccount.getNome());
        
    }
    
}
