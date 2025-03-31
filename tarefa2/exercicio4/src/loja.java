import java.util.Scanner;

public class loja {
    Scanner entrada = new Scanner(System.in);

    private String razaoSocial;
    private String cpfCliente;
    private double valorCompra;
    private double qtdItensComp;
    private double valorTotalCompra;

    public loja(String razaoSocial, String cpfCliente, double valorCompra, double qtdItensComp) {
        this.razaoSocial = razaoSocial;
        this.cpfCliente = cpfCliente;
        this.valorCompra = valorCompra;
        this.qtdItensComp = qtdItensComp;
        this.valorTotalCompra = valorCompra * qtdItensComp;
    }

    public loja() {}

    public String getRazaoSocial() {
        return this.razaoSocial;
    }

    public String getCpfCliente() {
        return this.cpfCliente;
    }

    public double getValorCompra() {
        return this.valorCompra;
    }

    public double getQtdItensComp() {
        return this.qtdItensComp;
    }

    public double getValorTotalCompra() {
        return this.valorTotalCompra;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public void setQtdItensComp(double qtdItensComp) {
        this.qtdItensComp = qtdItensComp;
    }

    public void setValorTotalCompra(double valorTotalCompra) {
        this.valorTotalCompra = valorTotalCompra;
    }

    public void inserirDadosLoja() {
        System.out.print("Insira a Razão Social: ");
        this.razaoSocial = entrada.nextLine();

        System.out.print("Insira o seu CPF: ");
        this.cpfCliente = entrada.nextLine();

        System.out.print("Insira o valor total da compra: ");
        this.valorCompra = entrada.nextDouble();

        System.out.print("Insira a quantidade de itens da compra: ");
        this.qtdItensComp = entrada.nextDouble();

        this.valorTotalCompra = calcularCompraLoja();
    }

    public double calcularCompraLoja(){
        return this.valorCompra * this.qtdItensComp;
    }

    public String mostrarDadosLoja(){
        return "\nRazão Social: " + getRazaoSocial() + "\nCPF: " + getCpfCliente() +
                "\nValor total da compra: R$" + getValorCompra() + "\nQuantidade total comprada: " + getQtdItensComp() +
                "\nValor total da compra: R$" + getValorTotalCompra();
    }
}