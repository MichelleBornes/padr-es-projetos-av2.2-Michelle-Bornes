package questao1;

public class Main {

    public static void main(String[] args) {

        Produto produto = new Produto("Notebook", 10);

        Compras compras = new Compras();
        Vendas vendas = new Vendas();
        Auditoria auditoria = new Auditoria();

        produto.adicionarObservador(compras);
        produto.adicionarObservador(vendas);
        produto.adicionarObservador(auditoria);

        System.out.println("=== SISTEMA DE ESTOQUE ===");
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Estoque inicial: " +
                           produto.getQuantidadeEstoque());

        System.out.println("\n--- Estoque alterado para 4 ---");
        produto.setQuantidadeEstoque(4);

        System.out.println("\n--- Estoque alterado para 0 ---");
        produto.setQuantidadeEstoque(0);

        System.out.println("\n--- Estoque alterado para 8 ---");
        produto.setQuantidadeEstoque(8);

        System.out.println("\n--- Estoque permanece em 8 ---");
        produto.setQuantidadeEstoque(8);

        System.out.println("\n--- Removendo área de Compras ---");
        produto.removerObservador(compras);

        System.out.println("\n--- Estoque alterado para 3 ---");
        produto.setQuantidadeEstoque(3);
    }
}