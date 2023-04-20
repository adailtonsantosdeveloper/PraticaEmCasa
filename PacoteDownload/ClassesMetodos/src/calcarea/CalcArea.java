/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calcarea;

import java.util.Scanner;
/**
 *
 * @author ADAILTON
 */
public class CalcArea { // Classe PRINCIPAL
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // A desenvolver o código
        System.out.println("Bem vindos ao CalcArea!");
        System.out.println("Podemos calcular área de:");
        System.out.println("Círculo, Losango, Quadrado,");
        System.out.println("Retângulo, Trapézio e Triângulo.");
        String operacao;
        operacao = "";
        String tipoArea = new String();
        
        AreaCirculo circulo = new AreaCirculo();
        AreaLosango losango = new AreaLosango();
        AreaQuadrado quadrado = new AreaQuadrado();
        AreaRetangulo retangulo = new AreaRetangulo();
        AreaTrapezio trapezio = new AreaTrapezio();
        AreaTriangulo triangulo = new AreaTriangulo();
        
        double ladoX;
        double ladoY;
        double ladoZ;
        
        double areaTotal;
        //double ladoB;
        //double ladoC;
        laco:
        while(!operacao.equalsIgnoreCase("sair")) {
            System.out.println("Digite qual área geométrica -- sem acento -- deseja calcular, ou digite [sair]");
            operacao = entrada.nextLine();
            
            if (operacao.equalsIgnoreCase("circulo")) {
                tipoArea = "c";
                
            }else if (operacao.equalsIgnoreCase("losango")) { 
                tipoArea = "l";
                
            }else if (operacao.equalsIgnoreCase("quadrado")) { 
                tipoArea = "q";
               
            }else if (operacao.equalsIgnoreCase("retangulo")) { 
                tipoArea = "r";
                
            }else if (operacao.equalsIgnoreCase("trapezio")) { 
                tipoArea = "T";
               
            }else if (operacao.equalsIgnoreCase("triangulo")) { 
                tipoArea = "t";
               
            }else {
                System.out.println("Você não informou nenhuma área conhecida pelo programa.");
                System.out.println("Reinicie o programa e tente sem usar acentuaçãoo");
                
            }
            opcoes:
            switch (tipoArea) {
                case "c": // CÍRCULO
                    System.out.println("Informe o RAIO da circunferência: ");
                    circulo.raio = Double.parseDouble(entrada.next());
                    ladoZ = circulo.raio;
                    areaTotal = circulo.calcAreaCirculo(circulo.pi,ladoZ);
                    System.out.println("A área desse círculo é de" + areaTotal);
                    
                     
                    break;
                    
                case "l": // LOSANGO
                    System.out.println("Informe o lado MENOR: ");
                    losango.largMenor = Double.parseDouble(entrada.next());
                    ladoX = losango.largMenor;
                    System.out.println("Informe o lado MAIOR: ");
                    losango.largMaior = Double.parseDouble(entrada.next());
                    ladoY = losango.largMaior;
                    areaTotal = losango.calcAreaLosango(ladoX, ladoY);
                    System.out.println("A área desse losango é: " + areaTotal);
                    break;
                    
                case "q": // QUADRADO
                    System.out.println("Informe o a largura do quadrado: ");
                    quadrado.lado = Double.parseDouble(entrada.next());
                    ladoZ = quadrado.lado;
                    areaTotal = quadrado.calcAreaQuadrado(ladoZ);
                    System.out.println("A área desse quadrado é: " + areaTotal);
                    break;
                
                case "r": // RETÂNGULO
                    System.out.println("Informe a medida da BASE do retângulo: ");
                    retangulo.comprimento = Double.parseDouble(entrada.next());
                    ladoX = retangulo.comprimento;
                    System.out.println("Informe a madida da ALTURA do retângulo: ");
                    retangulo.largura = Double.parseDouble(entrada.next());
                    ladoY = retangulo.largura;
                    areaTotal = retangulo.calcAreaRetangulo(ladoX,ladoY);
                    System.out.println("A área deste retângulo é " + areaTotal);
                    break;
                    
                case "T": // TRAPEZIO
                    System.out.println("Informe a medida da BASE MENOR: ");
                    trapezio.baseMenor = Double.parseDouble(entrada.next());
                    System.out.println("Informe a medida da BASE MAIOR: ");
                    trapezio.baseMaior = Double.parseDouble(entrada.next());
                    System.out.println("Agora informe a ALTURA: ");
                    trapezio.altura = Double.parseDouble(entrada.next());
                    areaTotal = trapezio.calcAreaTrapezio(trapezio.baseMenor, trapezio.baseMaior, trapezio.altura);
                    System.out.println("A área deste trapézio é " + areaTotal);
                    break;
                    
                case "t": // triângulo
                    System.out.println("Informe a medida da BASE do triângulo: ");
                    triangulo.base = Double.parseDouble(entrada.next());
                    System.out.println("Informe a ALTURA do triângulo: ");
                    triangulo.altura = Double.parseDouble(entrada.next());
                    areaTotal = triangulo.calcAreaTriangulo(triangulo.base, triangulo.altura);
                    System.out.println("A área desse triangulo é " + areaTotal);
                    break;
                    
                default:
                    System.out.println("Nenhuma área foi informada, não há nada para calcular");
                   
            }
            System.out.printf("Deseja efetuar outro cálculo [s/n]? ou digite [sair]");
            operacao = entrada.nextLine();
        }
        
    }
    
}
