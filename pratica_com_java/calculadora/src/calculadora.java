//Importação da classe Scanner para poder ler entradada de dados pelo usuário
import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        //Criando o objetvo Scanner para ler entrada do usuário
        Scanner scanner = new Scanner(System.in);

            //Imprimindo uma mensagem que ao final faz uma quebra de linha
            System.out.println("Escolha o número correspondente a operação que deseja utilizar: ");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");

            //Ira ler qual operação o usuário escolheu e ira armazenar na varíavel operacao
            int operacao = scanner.nextInt();

            //Imprimindo uma mensagem para o usuário sem a quebra da linha
            System.out.print("Digite o primerio número: "); 
                   //As varíaveis num1 e num2 iram armazenar a entrada de dados do usuário para o primeiro e segundo número
            double num1 = scanner.nextDouble();
                                  //Método nextDouble permite que o usuário possa inserir o valor de números com casas decimais

            System.out.print("Digite o segundo número: ");
            //O tipo double permite a utilização de número com precisão 
            double num2 = scanner.nextDouble();

            //Declarando varíavel resultado e ira armazenar o resultado da opereção entre o num1 e num2 escolhido pelo usuário 
            double resultado = 0; //Utilizando o valor 0 para evitar erros e ao garantir um valor inicial. O 0 serve como valor neutro

            //Utilizando o switch para permiter testar diferentes casos
            switch (operacao) {
                case 1:
                    resultado = num1 + num2;
                    //Break finaliza a execução do switch
                    break;
                case 2:
                    resultado = num1 - num2;
                    break;
                case 3:
                    resultado = num1 * num2;
                    break;
                case 4:
                    //Verificando se num2 é diferente de 0
                    if (num2 != 0) {
                        resultado = num1 / num2;
                      //Caso num2 seja igual a 0 ira para mensagem de erro
                    } else {
                        System.out.println("Erro. O número não pode ser divido por 0!");
                        return;
                    }
                    break;
            
                default:
                    System.out.println("Opreção inválida");
                    return;
            }

            //Mostrando o resultado da operação com quebra de linha
            System.out.println("O resultado da operação é: " + resultado);
    }
}

