package questao3;

public class Main {
    
    public static void main(String[] args) {
        
        Bebida expresso = new Expresso();
        System.out.println("Bebida pedida: "+ expresso.descricao());
        System.out.println("Preço: " + expresso.preco());

        expresso = new LeiteDecorator(expresso);
        System.out.println("Bebida pedida: "+ expresso.descricao());
        System.out.println("Preço: " + expresso.preco());

        expresso = new LeiteDecorator(expresso);
        System.out.println("Bebida pedida: "+ expresso.descricao());
        System.out.println("Preço: " + expresso.preco());

        expresso = new ChantillyDecorator(expresso);
        System.out.println("Bebida pedida: "+ expresso.descricao());
        System.out.println("Preço: " + expresso.preco());

        expresso = new CaldaDecorator(expresso);
        System.out.println("Bebida pedida: "+ expresso.descricao());
        System.out.println("Preço: " + expresso.preco());

        Bebida cha = new Cha();
        System.out.println("Bebida pedida: "+ cha.descricao());
        System.out.println("Preço: " + cha.preco());

        cha = new LeiteDecorator(cha);
        System.out.println("Bebida pedida: "+ cha.descricao());
        System.out.println("Preço: " + cha.preco());

        cha = new ChantillyDecorator(cha);
        System.out.println("Bebida pedida: "+ cha.descricao());
        System.out.println("Preço: " + cha.preco());

        cha = new ChantillyDecorator(cha);
        System.out.println("Bebida pedida: "+ cha.descricao());
        System.out.println("Preço: " + cha.preco());

        cha = new CaldaDecorator(cha);
        System.out.println("Bebida pedida: "+ cha.descricao());
        System.out.println("Preço: " + cha.preco());



    }
}
