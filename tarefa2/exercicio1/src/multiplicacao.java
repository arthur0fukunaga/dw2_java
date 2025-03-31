public class multiplicacao {
    private int valor;
    private int resultado;

    public multiplicacao() {
    }

    public int getValor() {
        return valor;
    }

    public int getResultado() {
        return resultado;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setResultado(int resultado) {
        this.resultado = valor * 4;
    }

    public void multiplicacao4() {
        this.resultado = this.valor * 4;
    }

    public String mostrarMultiplicacao() {
        return "O número " + this.valor + " multiplicado por 4 da o total de: " + this.resultado;
    }

}