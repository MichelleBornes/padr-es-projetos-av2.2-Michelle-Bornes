package questao2;

public class Main {

    public static void main(String[] args) {

        Ticket ticket = new Ticket("ABC1D23", 90);

        CalculadoraEstacionamento calculadora =
                new CalculadoraEstacionamento(new Rotativo());

        System.out.println("=== ESTACIONAMENTO ===");
        System.out.println("Placa: " + ticket.getPlaca());
        System.out.println("Tempo: " + ticket.getTempoPermanencia() + " minutos");

        System.out.println("\nPerfil: " + calculadora.getNomePerfil());

        double valorRotativo = calculadora.calcular(ticket);

        System.out.printf("Valor: R$ %.2f%n", valorRotativo);

        calculadora.setPerfil(new Mensalista());

        System.out.println("\nPerfil: " + calculadora.getNomePerfil());

        double valorMensalista = calculadora.calcular(ticket);

        System.out.printf("Valor: R$ %.2f%n", valorMensalista);

        calculadora.setPerfil(new Conveniado());

        System.out.println("\nPerfil: " + calculadora.getNomePerfil());

        double valorConveniado = calculadora.calcular(ticket);

        System.out.printf("Valor: R$ %.2f%n", valorConveniado);
    }
}