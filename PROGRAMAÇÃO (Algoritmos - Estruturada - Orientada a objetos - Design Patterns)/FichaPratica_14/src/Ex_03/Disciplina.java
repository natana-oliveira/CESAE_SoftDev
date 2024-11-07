package Ex_03;

import Ex_03.Enums.AreaFormacao;

import java.util.Scanner;

public class Disciplina {

    private String nome;
    private AreaFormacao area;
    private int duracaoHoras;

    public Disciplina(String nome, AreaFormacao area, int duracaoHoras) {
        this.nome = nome;
        this.area = area;
        this.duracaoHoras = duracaoHoras;
    }


    public Disciplina() {
        Scanner input = new Scanner(System.in);
        System.out.println("***** Inserir nova disciplina *****: ");
        System.out.println("Nome Disciplina: ");
        this.nome = input.next();
        System.out.println("Área de formação: ");
        this.area = AreaFormacao.valueOf(input.next());
        System.out.println("Duração da formação (em h): ");
        duracaoHoras = input.nextInt();

        Disciplina disciplina1 = new Disciplina(this.nome, this.area, this.duracaoHoras);
    }


}


