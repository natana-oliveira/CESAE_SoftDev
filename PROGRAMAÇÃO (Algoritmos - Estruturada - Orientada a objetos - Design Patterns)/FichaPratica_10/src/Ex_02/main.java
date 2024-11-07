package Ex_02;

public class main {
    public static void main(String[] args) {


        Conta conta01 = new Conta(5000, "Alice Silva");


        conta01.exibirDetalhes();
        System.out.println();
        conta01.pedirEmprestimo(900);

        System.out.println("\nQuero pegar emprestado + 300EUR\n");

        conta01.pedirEmprestimo(300);

    }


}
