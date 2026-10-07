public class Aplicacao {

    public static void main(String[] args) {
        ControleDeAumento controle = new ControleDeAumento();

        Gerente gerente = new Gerente("Maria Silva", "111.111.111-11", 5000.0, "G-001");
        Funcionario funcionario = new Funcionario("João Souza", "222.222.222-22", 4000.0);

        controle.registrar(gerente);
        controle.registrar(funcionario);

        System.out.printf("Valor aumento do gerente: %.2f%n", gerente.aumentarSalario());
        System.out.printf("Valor aumento do funcionário: %.2f%n", funcionario.aumentarSalario());
        System.out.printf("Total de aumento: %.2f%n", controle.getTotalDeAumento());
    }
}
