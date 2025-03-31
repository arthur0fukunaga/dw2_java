public class quadrado {
    private int numero;
    private int resultado;

    public void quadrado() {

    }

    public void quadrado(int numero, int resultado) {
        this.numero = numero;
        this.resultado = numero * numero;
    }

    public int getNumero() {
        return numero;
    }

    public int getResultado(){
        return resultado;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void setResultado(int resultado){
        this.resultado = numero * numero;
    }

    public void calcularQuadrado() {
        this.resultado = numero * numero;
    }

    public String mostrarQuadrado() {
        return "O quadrado de " + this.numero + " é: " + this.resultado;
    }
}
