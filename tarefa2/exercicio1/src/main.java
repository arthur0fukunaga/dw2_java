import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        multiplicacao m = new multiplicacao();

        System.out.print("Digite o número que será multiplicado por 4: ");
            int getValor = scanner.nextInt();

        m.setValor(getValor);
        m.multiplicacao4();
            System.out.println(m.mostrarMultiplicacao());

    }
}