package questao3;

public abstract class CondimentDecorator implements Bebida{
    
    protected Bebida bebida;

    public CondimentDecorator(Bebida bebida){
        this.bebida = bebida;
    }
}
