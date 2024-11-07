package Ex_10;

public class main {
    public static void main(String[] args) {

        Funcionario joaoPeres = new Funcionario("João Peres", 1000, "Engenharia mecânica");

        joaoPeres.exibirDados();
        System.out.println();

        joaoPeres.aumentarSalario(100);
        joaoPeres.exibirDados();


    }
}
