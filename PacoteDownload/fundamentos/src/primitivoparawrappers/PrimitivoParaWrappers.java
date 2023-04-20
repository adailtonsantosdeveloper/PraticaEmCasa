/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primitivoparawrappers;

/**
 *
 * @author ADAILTON
 */
public class PrimitivoParaWrappers {
    public static void main(String[] args) {
        System.out.println("Wrapper significa [invólucro], [empacotador]");
        System.out.println("Todo tipo de dado primitivo tem seu wrapper,\n");
        System.out.println("É importante saber disso quando quiser converter um primitivo para um String por exemplo.\n");
        System.out.println("As classes invólucro dos tipos primitivos são: \n");
        System.out.println("[1] - boolean => Boolean;");
        System.out.println("[2] - char => Caracter;");
        System.out.println("[3] - byte => Byte;");
        System.out.println("[4] - short => Short;");
        System.out.println("[5] - int => Integer;");
        System.out.println("[6] - long => Long;");
        System.out.println("[7] - float => Float;");
        System.out.println("[8] - double => Double.\n");
        System.out.println("Para converter um primitivo para um Wrapper, é necessário 'chamar' seu próprio wrapper,");
        System.out.println("e chamar o método() correspondente para conversão. Se for para String usa-se 'toString()'.");
        System.out.println("Exemplo: [int] para [String]");
        System.out.println("int dia = 15;");
        System.out.println("String data = Integer.toString(dia);");
        int dia = 15;
        System.out.println("int dia = " + dia);
        String data = Integer.toString(dia);
        System.out.println("String data = " + data);
        System.out.println();
        System.out.println("Também é possível fazer o contrário, para cada wrapper tem seu método.");
        System.out.println("Para int, usa-se o parseInt();");
        System.out.println("Para double, usa-se o parseDouble();");
        System.out.println("E por aí vai. Exemplo: \n");
        String anoNasc = new String("1986");
        String anoAtual = new String("2023");
        System.out.printf("%s é o ano de nascimento e %s é o ano atual; %n",anoNasc, anoAtual);
        System.out.printf("%s + %s é %s. %n",anoNasc, anoAtual, anoNasc + anoAtual);
        System.out.println("String não faz operações aritméticas, apenas [concatena],\n");
        System.out.println("Para fazer operação a partir de um dado do tipo String é necessário fazer a conversão.");
        System.out.println("Todo dado de entrada é convertido autimaticamente para String.");
        System.out.println("Se o objetifo é fazer operações matemáticas a partir de dados informados pelo usuário");
        System.out.println("é necessário fazer a conversão. Exemplo: \n");
        double nasc = Double.parseDouble(anoNasc);
        double atual = Double.parseDouble(anoAtual);
        System.out.println("double nasc = Double.parseDouble(anoNasc);");
        System.out.println("double atual = Double.parseDouble(anoAtual);");
        System.out.println("Dessa forma dá para somar, subtrair, multiplicar e dividir.");
        double idade = atual - nasc;
        System.out.println("double idade = atual - nasc;");
        System.out.println("idade é = " + idade);
        System.out.println();
        System.out.println("Como podemos ver, para fazer operações só é possível com variáveis de tipo numéricos,");
        System.out.println("ou convertendo String para Wrapper numérico.");
        
    }
    
}
