package Ex_03;

import java.util.ArrayList;
import java.util.Scanner;

public class Curso {
    private String nome;
    private ArrayList<DisciplinaCurso> disciplinas;
    private boolean longaDuracao;

    public Curso(String nome, boolean longaDuracao) {
        this.nome = nome;
        this.disciplinas = disciplinas;
        this.longaDuracao = longaDuracao;
    }

    public boolean isLongaDuracao() {
        int horas = 0;
        if (horas>100)
            return longaDuracao;
        return true;
    }

    public Curso (){
        int numDisc;
        Scanner input = new Scanner(System.in);
        System.out.println("***** Inserir novo curso *****: ");
        System.out.println("Nome Curso: ");
        this.nome = input.next();
        System.out.println("Número de disciplinas: ");
        numDisc = input.nextInt();
        System.out.println("Quais disciplinas quer adicionar ao curso: ");




    }


}
