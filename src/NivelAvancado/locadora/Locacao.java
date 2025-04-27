package NivelAvancado.locadora;

import java.util.Date;

public class Locacao {
    private Filme filme;
    private Cliente cliente;

    public Locacao(Filme filme, Cliente cliente) {
        this.filme = filme;
        this.cliente = cliente;
    }

    public Filme getFilme() {
        return filme;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
