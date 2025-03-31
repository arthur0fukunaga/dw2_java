public class idadePessoa {
    private int ano;
    private int idade;

    public void calcularIdade(int idade, int ano){
        this.ano = ano;
        this.idade = idade;
    }

    public int getIdade(){
       return this.idade;
    }

    public int getAno(){
        return this.ano;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setAno(int ano){
        this.ano = ano;
    }

    public int calcularIdade(){
    return 2025 - this.ano;
    }

    public String mostrarIdade(){
        return "Hoje você tem " + calcularIdade() + " anos de idade.";
    }


}
