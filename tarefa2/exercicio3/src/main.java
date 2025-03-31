import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        idadePessoa pessoa = new idadePessoa();

        System.out.println("Digite o ano em que você nasceu: ");
            int anoNascimento = entrada.nextInt();

        pessoa.setAno(anoNascimento);
            System.out.println(pessoa.mostrarIdade());
            
    }
}