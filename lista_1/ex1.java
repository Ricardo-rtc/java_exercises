import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		        
		Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Informe o segundo número: ");
        int numero2 = scanner.nextInt();

        if (numero1 < numero2) {
            System.out.println("O menor número é: " + numero1);
        } else if (numero2 < numero1) {
            System.out.println("O menor número é: " + numero2);
        } else {
            System.out.println("Os números são iguais.");
        }

        scanner.close();
	}
}
