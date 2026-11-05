package questao2;

public class Ticket {

    private final String placa;
    private final int tempoPermanencia;

    public Ticket(String placa, int tempoPermanencia) {
        this.placa = placa;
        this.tempoPermanencia = tempoPermanencia;
    }

    public String getPlaca() {
        return placa;
    }

    public int getTempoPermanencia() {
        return tempoPermanencia;
    }
}

