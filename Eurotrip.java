import java.util.Scanner;

public class Eurotrip {
   
   
        public static void main(String[] args) throws Exception {
       
        double precoAlemanha, precoPortugal, precoItalia, valorTotal;
        int pessoasAle, pessoasPor, pessoasIta, pessoasTotal;
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Informe o preço da viagem para Alemanha: ");
        precoAlemanha = scanner.nextDouble();
        System.out.println("Informe quantas pessoas irão para a Alemanha: ");
        pessoasAle = scanner.nextInt();
        
        System.out.println("Informe o preço da viagem para Portugal: ");
        precoPortugal = scanner.nextDouble();
        System.out.println("Informe quantas pessoas irão para Portugal: ");
        pessoasPor = scanner.nextInt();
        
        System.out.println("Informe o preço da viagem para Itália: ");
        precoItalia = scanner.nextDouble();
        System.out.println("Informe quantas pessoas irão para itália: ");
        pessoasIta = scanner.nextInt();

        valorTotal = precoPortugal + precoAlemanha + precoItalia;
        pessoasTotal= pessoasAle + pessoasIta + pessoasPor;

        System.out.println("O preço total da viagem é R$" + valorTotal +  " e o numero de pessoas que vão na viagem é " + pessoasTotal);

        scanner.close();

    }
}
