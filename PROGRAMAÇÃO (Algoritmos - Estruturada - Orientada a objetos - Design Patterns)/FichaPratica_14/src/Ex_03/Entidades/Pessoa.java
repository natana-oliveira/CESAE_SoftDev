package Ex_03.Entidades;

public abstract class Pessoa {
    private String nome;
    private int anoNasc;
    private String email;
    private String telemovel;

    public Pessoa(String nome, int anoNasc, String email, String telemovel) {
        this.nome = nome;
        this.anoNasc = anoNasc;
        this.email = email;
        this.telemovel = telemovel;
    }

    public abstract void obterFuncao();
    public abstract void imprimirHorario();

    public void exibirDetalhes() {
        System.out.println("Nome: " + this.nome + "\t| Ano nascimento: " + this.anoNasc + "\t| Email: " + this.email + "\t| Telemovel: " + this.telemovel);
    }


}


