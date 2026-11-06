package questao1;

import java.util.ArrayList;
import java.util.List;

public class Produto {

    private String nome;
    private int quantidadeEstoque;

    private List<ObservadorEstoque> observadores = new ArrayList<>();

    public Produto(String nome, int quantidadeEstoque) {
        this.nome = nome;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void adicionarObservador(ObservadorEstoque observador) {
        if (observador != null && !observadores.contains(observador)) {
            observadores.add(observador);
        }
    }

    public void removerObservador(ObservadorEstoque observador) {
        observadores.remove(observador);
    }

    public void setQuantidadeEstoque(int novaQuantidade) {

        if (novaQuantidade < 0) {
            throw new IllegalArgumentException(
                "A quantidade em estoque não pode ser negativa."
            );
        }

        if (this.quantidadeEstoque == novaQuantidade) {
            return;
        }

        this.quantidadeEstoque = novaQuantidade;

        notificarObservadores();
    }

    private void notificarObservadores() {

        for (ObservadorEstoque observador : observadores) {
            observador.atualizar(nome, quantidadeEstoque);
        }
    }
}