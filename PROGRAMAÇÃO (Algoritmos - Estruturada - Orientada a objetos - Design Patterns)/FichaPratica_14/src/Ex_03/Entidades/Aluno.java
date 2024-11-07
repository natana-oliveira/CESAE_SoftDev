package Ex_03.Entidades;

import Ex_03.Enums.Curso;

public class Aluno extends Pessoa{

    private Curso curso;
    private double mediaNotas;
    private String [][] pauta;

    public Aluno(String nome, int anoNasc, String email, String telemovel, Curso curso, double mediaNotas) {
        super(nome, anoNasc, email, telemovel);
        this.curso = curso;
        this.mediaNotas = mediaNotas;
        this.pauta = new String[][2];
    }

    @Override
    public void obterFuncao() {

    }

    @Override
    public void imprimirHorario() {

    }
}
