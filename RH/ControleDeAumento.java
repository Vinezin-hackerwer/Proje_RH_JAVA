public class ControleDeAumento {

    private double totalDeAumento;

    public void registrar(Funcionario funcionario) {
        this.totalDeAumento += funcionario.aumentarSalario();
    }

    public double getTotalDeAumento() {
        return totalDeAumento;
    }
}
