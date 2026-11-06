package questao1;

public class Compras implements ObservadorEstoque {

    private static final int LIMITE_ESTOQUE = 5;

    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {

        if (novaQuantidade < LIMITE_ESTOQUE) {

            System.out.println(
                "[COMPRAS] ALERTA: " + nomeProduto +
                " está com estoque baixo! Quantidade: " + novaQuantidade
            );
        }
    }
}