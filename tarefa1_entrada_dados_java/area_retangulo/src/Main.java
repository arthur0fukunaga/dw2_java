import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double ladoA, ladoB, area, perimetro;

            System.out.print("Digite a medida em cm do lado A: ");
                ladoA = scanner.nextDouble();

            System.out.print("Digite a medida em cm do lado B: ");
                ladoB = scanner.nextDouble();

                area = ladoA * ladoB;
                perimetro = 2 * (ladoA + ladoB);

            System.out.println("\nÁrea do retângulo: " + area + " cm²");
        System.out.println("Perímetro do retângulo: " + perimetro + " cm");

        scanner.close();
    }
}
