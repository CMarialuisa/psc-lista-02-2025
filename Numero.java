import java.util.Scanner;

public class Numero {

    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um numero: "); 

        int x;
        x = scanner.nextInt();
        System.out.println("O numero informado foi: " + x);

        scanner.close();
      
    }
}
