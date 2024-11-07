package Ex_11;

public class main {
    public static void main(String[] args) {

        Conta pessoa01 = new Conta(01,  "Alice Silva");

        Conta pessoa02 = new Conta(02,  "Maria Barbosa"); //1825
        Conta pessoa03 = new Conta(03, "Filipe Manso"); //6300

        pessoa01.exibirDetalhes();
        pessoa02.exibirDetalhes();
        System.out.println();

        pessoa01.depositar(1000);
        pessoa01.exibirDetalhes();
        pessoa02.exibirDetalhes();
        System.out.println();

        pessoa01.levantar(650);
        pessoa01.exibirDetalhes();
        pessoa02.exibirDetalhes();
        System.out.println();

        pessoa01.levantar(2500);
        pessoa01.exibirDetalhes();
        pessoa02.exibirDetalhes();
        System.out.println();

        pessoa01.transferencia(4000, pessoa02);
        pessoa01.exibirDetalhes();
        pessoa02.exibirDetalhes();


    }
}
