package questao2;

public class Mensalista implements PerfilCobrança {

    private static final double VALOR_FIXO_MENSALISTA = 5.00;

    @Override
    public String getNome() {
        return "Mensalista";
    }

    @Override
    public double calcular(Ticket ticket) {

        return VALOR_FIXO_MENSALISTA;
    }
}