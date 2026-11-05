package questao3;

public class CaldaDecorator extends CondimentDecorator{

    public CaldaDecorator(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String descricao() {
       return bebida.descricao() + ", com calda";
    }

    @Override
    public double preco() {
       return bebida.preco() + 1.5;
    }
}
