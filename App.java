import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
        
        int numeroUm, numeroDois, soma, subtracao, multi;
        Scanner scanner = new Scanner (System.in);

        System.out.println("Informe o primeiro numero: ");
        numeroUm = scanner.nextInt();

        System.out.println("Informe o segundo numero: ");
        numeroDois = scanner.nextInt();

        soma = numeroUm + numeroDois;
        System.out.println("O resultado da soma é: " + soma);

        subtracao = numeroUm - numeroDois;
        System.out.println("O resultado da subtração é: " + subtracao);

        multi = numeroUm * numeroDois;
        System.out.println("O resultado da multiplicação é: " + multi);

        scanner.close();

    }
}
