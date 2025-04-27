package NivelAvancado.locadora;

public class Filme {
    private String nomeFilme;
    private String genero;
    private int anoLancamento;
    private double precoAluguel;
    private boolean disponivel;

    public Filme(String nomeFilme, String genero, int anoLancamento, double precoAluguel) {
        this.nomeFilme = nomeFilme;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
        this.precoAluguel = precoAluguel;
        this.disponivel = true;
    }

    public boolean isDisponivel(){
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public String getGenero() {
        return genero;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public double getPrecoAluguel() {
        return precoAluguel;
    }

    public void exibirFilmes(){
       System.out.println("Nome do filme: "+nomeFilme);
       System.out.println("Gênero do filme: "+genero);
       System.out.println("Ano de Lançamento: "+anoLancamento);
       System.out.printf("Preço do Aluguel: R$ %.2f\n", precoAluguel);
        System.out.println("Disponível: " + (disponivel ? "Sim" : "Não"));
   }
}
