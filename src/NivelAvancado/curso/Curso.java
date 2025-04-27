package NivelAvancado.curso;


import java.util.ArrayList;

public class Curso {
    private ArrayList<Aluno> alunos;

    public Curso() {
        alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        for (Aluno a : alunos) {
            if (a.getNome() != null && a.getNome().equalsIgnoreCase(aluno.getNome())) {
                System.out.println("Aluno " + aluno.getNome() + " já está cadastrado!");
                return;
            }
        }

        alunos.add(aluno);
        System.out.println(aluno.getNome() + " foi adicionado com sucesso!");
    }

    public void removerAluno(String nome) {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getNome().equalsIgnoreCase(nome)) {
                alunos.remove(i);
                System.out.println(nome + " removido com sucesso");
                return;
            }
        }
        System.out.println("Aluno " + nome + " não encontrado");
    }

    public void exibir() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }
        for (Aluno aluno : alunos) {
            aluno.exibirInfo();
        }
    }
}
/*
alunos.remove(aluno);
        System.out.println(aluno.getNome()+" removido com sucesso!");
 */