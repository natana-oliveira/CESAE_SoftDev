package FichaExtraNet;

import java.util.Objects;
import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {

        /*
        Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, mostrando
        uma mensagem de erro e voltando a pedir as informações.
         */

        Scanner input = new Scanner(System.in);

        String nome, senha;

        // Ler nome e senha
        do {
            System.out.print("Digite o nome de usuário: ");
            nome = input.next();

            System.out.print("Digite a senha: ");
            senha = input.next();

            if (!senha.equals(nome)){
                    System.out.println("ERRO!!\nNome ou senha inválidos! Tente outra vez");
                }

        } while (!senha.equals(nome)); //Para sair do ciclo o nome e a senha tem de ser diferentes

        System.out.println("Nome e senha válidos!");


        }
}
