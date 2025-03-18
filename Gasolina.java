import java.util.Scanner;

public class Gasolina {
   

    public static void main(String[] args) throws Exception {
        
        double precogas, total;
        int litros;
        Scanner scanner = new Scanner(System.in);

       System.out.println("Qual o preço atual da gasolina? ");
       precogas = scanner.nextDouble();

       System.out.println("Quantos litros de gasolina o cliente comprou? ");
       litros = scanner.nextInt();

       total = precogas * litros;
       System.out.println("O valor total que o cliente deve pagar é R$" + total);

       scanner.close();


    }
}
