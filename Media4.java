import java.util.Scanner;

public class Media4 {
    
    public static void main(String[] args) throws Exception {
        
        int notaUm, notaDois, notaTres, notaQuatro;
        double media;
    
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        notaUm = scanner.nextInt();

         System.out.println("Informe a segunda nota: ");
        notaDois = scanner.nextInt();
         
         System.out.println("Informe a terceira nota: ");
        notaTres = scanner.nextInt();

         System.out.println("Informe a quarta nota: ");
        notaQuatro = scanner.nextInt();

        media = (notaUm + notaDois + notaTres + notaQuatro) /4; 
        System.out.println("A média das notas do bimestre foi: " + media);

        scanner.close();

    }
}
