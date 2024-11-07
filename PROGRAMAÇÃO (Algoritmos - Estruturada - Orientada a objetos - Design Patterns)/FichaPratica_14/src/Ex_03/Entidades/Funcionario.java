package Ex_03.Entidades;

import Ex_03.Enums.Funcao;

public class Funcionario extends Pessoa {

    private Funcao funcao;

    public Funcionario(String nome, int anoNasc, String email, String telemovel, Funcao funcao) {
        super(nome, anoNasc, email, telemovel);
        this.funcao = funcao;
    }

    @Override
    public void obterFuncao() {

    }

    @Override
    public void imprimirHorario() {

    }
}
