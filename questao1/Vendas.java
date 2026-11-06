package questao1;

import java.util.HashMap;
import java.util.Map;

public class Vendas implements ObservadorEstoque {

    private Map<String, Integer> estoquesAnteriores = new HashMap<>();

    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {

        Integer quantidadeAnterior = estoquesAnteriores.get(nomeProduto);

        if (quantidadeAnterior != null &&
            quantidadeAnterior == 0 &&
            novaQuantidade > 0) {

            System.out.println(
                "[VENDAS] ALERTA: " + nomeProduto +
                " voltou a ter estoque! Quantidade: " + novaQuantidade
            );
        }

        estoquesAnteriores.put(nomeProduto, novaQuantidade);
    }
}