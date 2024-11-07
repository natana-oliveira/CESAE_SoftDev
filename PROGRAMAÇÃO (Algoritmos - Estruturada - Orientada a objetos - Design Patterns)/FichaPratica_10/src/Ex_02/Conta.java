package Ex_02;

public class Conta {

    //Declarar atributos

    private String numConta;
    private double saldo;
    private String titularConta;
    private int anoAbertura = 2023;
    private double margemEmprestimo = 0.9;
    private double valorDivida=0;

    //Método construtor
    public Conta(double saldo, String titularConta) {
        this.saldo = saldo;
        this.titularConta = titularConta;
    }
    public void exibirDetalhes() {
        System.out.println("\nTitular: " + this.titularConta);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Margem de emprestimo: " + (saldo * margemEmprestimo));
    }


    //Método pedir Emprestimo

    //Metodo em void
/*
    public void pedirEmprestimo(int valorEmprestimo) {

        //se o valor da dívida for maior que 0 não há emprestimo
        if (valorDivida > 0) {
            System.out.println("Emprestimo não permitido! Valores em dívida a serem acertados.");
        } else {
            //se o valor do emprestimo for maenor ou igual a margem de emprestimo
            if (valorEmprestimo <= (saldo * margemEmprestimo)) {
                saldo += valorEmprestimo; //saldo soma o valor do emprestimo
                valorDivida += valorEmprestimo; //Atualiza o saldo em divida
                System.out.println("Saldo após emprestimo: " + saldo);
                System.out.println("Valor da dívida: " + valorDivida);
            } else {
                System.out.println("Valor do emprestimo não permitido! Acima da margem de emprestimo.");
            }
        }
    }*/
    public boolean pedirEmprestimo(double valorEmprestimo) {

      //  if(valorDivida==0 && this.saldo)

        if (valorDivida > 0) {
            System.out.println("Emprestimo não permitido! Valores em dívida a serem acertados.");
            return false;
        } else {
            //se o valor do emprestimo for menor ou igual a margem de emprestimo
            if (valorEmprestimo <= (saldo * margemEmprestimo)) {
                saldo += valorEmprestimo; //saldo soma o valor do emprestimo
                valorDivida += valorEmprestimo; //Atualiza o saldo em divida
                System.out.println("Saldo após emprestimo: " + saldo);
                System.out.println("Valor da dívida: " + valorDivida);
                return true;
            } else {
                System.out.println("Valor do emprestimo não permitido! Acima da margem de emprestimo.");
                return false;
            }
        }
    }
}
