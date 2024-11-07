package Ex_05;

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

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    //Método aumentarSalario
    public void aumentarSalario(double aumento) {
        double percetagem =aumento/100;
        this.salario+=this.salario*percetagem;
    }


}
