import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        quadrado m = new quadrado();

        System.out.println("Insira um numero que será usado para calcular o quadrado: ");
            int getNumero = entrada.nextInt();

        m.setNumero(getNumero);
        m.calcularQuadrado();
            System.out.println(m.mostrarQuadrado());

    }
}