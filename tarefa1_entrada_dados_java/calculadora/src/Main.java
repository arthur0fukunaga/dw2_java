import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double n1, n2, resultado1, resultado2, resultado3, resultado4;

            System.out.println("Olá senhor(a), seja bem vindo a Calculadora");

            System.out.print("Digite o valor do primeiro número: ");
                n1 = scanner.nextDouble();

            System.out.print("Digite o valor do segundo número: ");
                n2 = scanner.nextDouble();

                resultado1 = n1 + n2;
                    resultado2 = n1 * n2;
                    resultado3 = n1 / n2;
                resultado4 = n1 - n2;

            System.out.println("O resultado da Soma é: " + resultado1);
            System.out.println("O resultado da multiplicaão é: " + resultado2);
        System.out.println("O resultado da divisão é: " + resultado3);
        System.out.println("O resultado da subtraão é: " + resultado4);

        scanner.close();

    }
}