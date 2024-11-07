package FichaPratica01;

import java.util.Scanner;

public class Ex_08 {

    public static void main(String[] args) {

        // Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int mTotais, sTotais, sTotaisdoAlbum, segundos, minutos, horas;

        // Ler variáveis
        System.out.print("Minutos música 1: ");
        mTotais = input.nextInt();

        System.out.print("Segundos música 1: ");
        sTotais = input.nextInt();

        System.out.print("Minutos música 2: ");
        mTotais = input.nextInt() + mTotais;

        System.out.print("Segundos música 2: ");
        sTotais = input.nextInt() + sTotais;

        System.out.print("Minutos música 3: ");
        mTotais = input.nextInt() + mTotais;

        System.out.print("Segundos música 3: ");
        sTotais = input.nextInt() + sTotais;

        // Apresentar valores
       /* System.out.println("Total minutos: " + mTotais);
        System.out.println("Total segundos: " + sTotais);*/

        //Calcular os segundos totais do album
        sTotaisdoAlbum = sTotais + (mTotais * 60);
       /* System.out.println("Segundos totais do album: " + sTotaisdoAlbum); */

        // Calcular horas do album
        horas = sTotaisdoAlbum/ 3600;

        //Calcular minutos
        minutos= (sTotaisdoAlbum/60)-(horas*60);

        // Calcular segundos
        segundos = sTotaisdoAlbum - (horas*3600) - (minutos*60);

        System.out.println(horas+"h " + minutos + "min " + segundos+ "seg ");

    }
}



/*
....

* Achar os segundos totais do album => 8505 (transformar esse valor em h e minutos)
* Para calcular as horas eu divido 8505 por 3600 (porque eu sei que 1h tem 3600s) ou seja em 8505 tem 2horas (7200segundos)
   horas = segundos totais do album (8505) / 3600 --> horas = 2
* O album tem 2h e (X minutos e x segundos) --> restante dos segundos -7200
* Os minutos = (segundos totais do album / 60) - ( horas * 60)

* Os segundos tem que tirar o valor que ja foi atribuido em horas e em minutos
  segundos = (segTotais do Album) - (horas * 3600) - (minutos * 60)


*/