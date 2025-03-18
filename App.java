import java.util.Scanner;

public class App {
   
   
//*Faça um programa que peça o valor de uma viagem “eurotrip” que serárealizada por um grupo de amigos. Os brasileiros sairão com destino a
//três locais: 1o Alemanha, 2o Portugal e 3o Itália. O programa deve solicitar o preço atual de cada viagem, a quantidadede pessoas que irão nessa viagem. 
//Após isso, imprimir o valor total da viagem somando a quantidade total de pessoas que visitarão todos os 03 destinos.
   
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
