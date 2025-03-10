import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int quantidadeMoveisVendidos;

            System.out.print("Digite a quantidade de móveis que foram vendidos: ");
                quantidadeMoveisVendidos = scanner.nextInt();

        double salarioTotal = 1000 + (quantidadeMoveisVendidos * 50);

            System.out.println("\nO salário do funcionário é de: R$ " + salarioTotal);

        scanner.close();

    }
}
