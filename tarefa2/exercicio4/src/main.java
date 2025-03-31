import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        loja loja = new loja();

        loja.inserirDadosLoja();
        loja.calcularCompraLoja();
            System.out.println(loja.mostrarDadosLoja());

    }
}