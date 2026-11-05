package questao2;

public class Rotativo implements PerfilCobrança {

    private static final double VALOR_HORA_ROTATIVO = 10.00;

    @Override
    public String getNome() {
        return "Rotativo";
    }

    @Override
    public double calcular(Ticket ticket) {

        int minutos = ticket.getTempoPermanencia();

        int horas = (int) Math.ceil(minutos / 60.0);

        return horas * VALOR_HORA_ROTATIVO;
    }
}