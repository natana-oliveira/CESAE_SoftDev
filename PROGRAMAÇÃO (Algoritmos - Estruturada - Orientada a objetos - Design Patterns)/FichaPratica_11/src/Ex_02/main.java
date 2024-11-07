package Ex_02;

import java.sql.SQLOutput;

public class main {
    public static void main(String[] args) {

        Pessoa harry = new Pessoa("Harry Potter", 18, "956841253", "potter.cicatriz@hogwarts.com");
        Pessoa hermione = new Pessoa("Hermione Granger", 17, "222222222", "viratempo@hogwarts.com");
        Pessoa ronny = new Pessoa("Ronny Weasley", 19, "777777777", "funnyginger@hogwarts.com");
        Pessoa dumbledore = new Pessoa("Albus Dumbledore", 98, "111111111", "orderphoenix@hogwarts.com");
        Pessoa sirius = new Pessoa("Sirius Black", 42, "131313131", "snuffles.dog@azkaban.com");
        Pessoa minerva = new Pessoa("Minerva McGonagall", 67, "121212121", "gryffindor@hogwarts.com");

        Sorteio bingoHogwards = new Sorteio(250);

        System.out.println();
        bingoHogwards.addParticipante(harry);
        bingoHogwards.addParticipante(hermione);
        bingoHogwards.addParticipante(ronny);
        bingoHogwards.addParticipante(dumbledore);
        bingoHogwards.addParticipante(sirius);
        bingoHogwards.addParticipante(minerva);


        bingoHogwards.imprimirParticipantes();

        System.out.println("\n********************  GRANDE VENCEDOR  ********************");
        System.out.println();
        Pessoa vencedor = bingoHogwards.sorteio();
        vencedor.exibirDetalhes();

    }


}

