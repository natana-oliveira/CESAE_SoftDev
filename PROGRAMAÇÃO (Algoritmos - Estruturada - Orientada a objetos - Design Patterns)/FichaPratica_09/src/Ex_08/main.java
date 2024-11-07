package Ex_08;

import Ex_06.Calculadora;

public class main {
    public static void main(String[] args) {

        Aluno natanaOliviera = new Aluno("Natana Oliveira", 30, "Software Developer", 12);
        Aluno pedroAlves = new Aluno("Pedro Alves", 26, "Software Developer", 8.3);

        System.out.println("Aluno: "+ natanaOliviera.getNome());
        System.out.println(natanaOliviera.situacao());

        System.out.println("\nAluno: "+ pedroAlves.getNome());
        System.out.println(pedroAlves.situacao());



    }
}
