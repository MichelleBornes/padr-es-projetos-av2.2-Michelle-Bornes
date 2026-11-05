package questao3;

public class LeiteDecorator extends CondimentDecorator{

    public LeiteDecorator(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String descricao() {
        return bebida.descricao() + ", com leite";
    }

    @Override
    public double preco() {
        return bebida.preco() + 1.0;
    }
    
}
