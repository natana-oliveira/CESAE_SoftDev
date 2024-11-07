package Ex_03.Entidades;

import Ex_03.Enums.AreaFormacao;

import java.util.ArrayList;

public class Professor extends Pessoa {

    private ArrayList<AreaFormacao> areaFormacao;
    private int nivelAcademico;

    public Professor(String nome, int anoNasc, String email, String telemovel, int nivelAcademico) {
        super(nome, anoNasc, email, telemovel);
        this.areaFormacao = new ArrayList<>();
        this.nivelAcademico = nivelAcademico;
    }

    @Override
    public void obterFuncao() {

    }

    @Override
    public void imprimirHorario() {

    }
}
