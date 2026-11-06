package questao1;

public class Auditoria implements ObservadorEstoque {

    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {

        System.out.println(
            "[AUDITORIA] Alteração registrada: " +
            nomeProduto + " | Novo estoque: " + novaQuantidade
        );
    }
}