package questao3;

public class Expresso implements Bebida{

    @Override
    public String descricao() {
       return "Expresso";
    }

    @Override
    public double preco() {
       return 3.5;
    }
    
}
