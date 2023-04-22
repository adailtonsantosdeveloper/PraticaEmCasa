
public class PassagemOnibus {
    public static void main(String[] args) {
        System.out.println("Calcula passagem");
        double total = 0;
        double passagem = 5.30;
        for (int cont = 0; cont < 20; cont++) {
            total = (cont+1) * passagem;
            System.out.printf("%d passagem = [R$ %2.2f] %n",(cont+1),total);
        }
    }
    
}
