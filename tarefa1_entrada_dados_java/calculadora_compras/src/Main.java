import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nomeProduto;
        int quantidadeComprada;
        double precoUnitario, total;

            System.out.print("Digite o nome do produto: ");
                nomeProduto = scanner.nextLine();

            System.out.print("Digite a quantidade comprada: ");
                quantidadeComprada = scanner.nextInt();

            System.out.print("Digite o preço unitário do produto: ");
                precoUnitario = scanner.nextDouble();

                total = quantidadeComprada * precoUnitario;

            System.out.println("\nProduto: " + nomeProduto);
            System.out.println("O valor total a pagar é: R$ " + total);

        scanner.close();

    }
}
