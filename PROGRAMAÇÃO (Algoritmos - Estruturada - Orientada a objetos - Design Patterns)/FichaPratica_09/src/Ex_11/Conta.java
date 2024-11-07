package Ex_11;

public class Conta {

    //Declarar atributos

    private int numConta;
    private double saldo = 0;
    private String titularConta;

    //Método construtor
    public Conta(int numConta, String titularConta) {
        this.numConta = numConta;
        this.titularConta= titularConta;
    }

    //Método transferencia
    public void transferencia(double valorTransferir, Conta contaDestinatario) {

        if (this.saldo >= valorTransferir) { //Transferencia valida
            System.out.println("Dinheiro transferido: "+ valorTransferir);
            this.saldo -= valorTransferir;
            contaDestinatario.depositar(valorTransferir);
        } else {
            System.out.println("Saldo insuficiente para realizar transferencia!");
        }
    }

    //Método depositar
    public void depositar(double valorDepositar) {
        System.out.println("Depositado: " + valorDepositar);
        this.saldo += valorDepositar;
    }

    //Método levantar
    public void levantar(double valorLevantar) {
        if (this.saldo >= valorLevantar) {
            System.out.println("Levantamento efetuado: " + valorLevantar);
        } else {
            System.out.println("SALDO INSUFICIENTE!\nNão é possível realizar a operação.");
        }
    }

    public void exibirDetalhes() {
        System.out.println("Número conta: " + this.numConta + "\t| Titular: " + this.titularConta + "\t| Saldo: " + this.saldo);
    }


}


