package NivelIntermediario.empresa;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo= cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void aumentarSalario(double porcentagem) {
        this.salario += this.salario * (porcentagem / 100);
    }

    public void exibirDados() {
        System.out.println("Nome Funcionário: " + nome);
        System.out.println("Cargo do Funcionário: "+cargo);
        System.out.printf("Salário: R$ %.2f\n", salario);
    }
}
