package NivelIntermediario.funcionario;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentoPercentual(double percentual){
        double valorAumento = salario *(percentual /100);
        salario += valorAumento;
    }

    public double getSalario() {
        return salario;
    }

    public void exibirDados(){
        System.out.println("Nome Funcionário: "+nome);
        System.out.println("Salário: "+salario);
    }
}
