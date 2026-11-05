package questao2;


public class Conveniado implements PerfilCobrança {

    private static final int MINUTOS_GRATUITOS = 30;
    private static final double VALOR_HORA_CONVENIADO = 10.00;
    private static final double DESCONTO_CONVENIADO = 0.30;

    @Override
    public String getNome() {
        return "Conveniado";
    }

    @Override
    public double calcular(Ticket ticket) {

        int minutos = ticket.getTempoPermanencia();

        if (minutos <= MINUTOS_GRATUITOS) {
            return 0.0;
        }

        int minutosCobrados = minutos - MINUTOS_GRATUITOS;

        int horas = (int) Math.ceil(minutosCobrados / 60.0);

        double valor = horas * VALOR_HORA_CONVENIADO;

        return valor * (1 - DESCONTO_CONVENIADO);
    }
}