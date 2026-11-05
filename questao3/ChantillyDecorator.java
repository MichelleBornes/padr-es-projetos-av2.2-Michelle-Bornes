package questao3;

public class ChantillyDecorator extends CondimentDecorator{

    public ChantillyDecorator(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String descricao() {
       return bebida.descricao() + ", com chantilly";
    }

    @Override
    public double preco() {
        return bebida.preco() + 2.5;
    }
    
}
