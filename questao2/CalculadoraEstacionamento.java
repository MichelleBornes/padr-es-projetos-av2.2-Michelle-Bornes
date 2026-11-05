package questao2;

public class CalculadoraEstacionamento {

    private PerfilCobrança perfil;

    public CalculadoraEstacionamento(PerfilCobrança perfil) {
        setPerfil(perfil);
    }

    public void setPerfil(PerfilCobrança perfil) {

        if (perfil == null) {
            throw new IllegalArgumentException("O perfil não pode ser nulo.");
        }

        this.perfil = perfil;
    }

    public double calcular(Ticket ticket) {

        return perfil.calcular(ticket);
    }

    public String getNomePerfil() {
        return perfil.getNome();
    }
}