package Ex_10;

public class Funcionario {

    //Declarar atributos
    private String nome;
    private double salario;
    private String departamento;

    //Método construtor
    public Funcionario(String nome, double salario, String departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    //Método aumentarSalario

    public void aumentarSalario(double aumento) {
        double percetagem =aumento/100;
        this.salario+=this.salario*percetagem;
    }

    //Método exibirDados
    public void exibirDados() {
        System.out.println("Nome do funcionário: " + this.nome + "\nSalário: " + this.salario + "\nDepartamento: " + this.departamento);
    }


}
