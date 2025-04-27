package NivelIntermediario.empresa;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Funcionario> funcionarios;

    public Empresa(){
        funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
        System.out.println("Funcionário adicionado com Sucesso");
    }

    public void calculaAumento(double porcentagem){
       for (Funcionario f : funcionarios){
           f.aumentarSalario(porcentagem);
       }
    }

    public void exibir(){
        for (Funcionario funcionario : funcionarios){
            funcionario.exibirDados();
        }
    }
}
