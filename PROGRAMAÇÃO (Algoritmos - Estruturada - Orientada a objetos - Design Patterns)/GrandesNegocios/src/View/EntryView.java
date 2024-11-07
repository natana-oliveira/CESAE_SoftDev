package View;

import Controllers.LoginController;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class EntryView {
    public EntryView() {
    }

    public static void menuLogin() throws IOException {
        Scanner input = new Scanner(System.in);

        LoginController loginController = new LoginController();

        int opcao = 0;
        String username, password, tipoAcesso;

        do {


            System.out.println("\n********** Bem-Vindo/a ao Minimercado Grandes Negócios **********");
            System.out.println("1. Cliente");
            System.out.println("2. Funcionario");
            System.out.println("3. Administrador");
            System.out.println("0. Sair");
            System.out.print("Selecione uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1: // Cliente
                    ClienteView.menuCliente();
                    break;

                case 2: // Funcionario
                    tipoAcesso = "FUNC";

                    System.out.print("\nNome Utilizador: ");
                    username = input.next();
                    System.out.print("Password: ");
                    password = input.next();

                    if (loginController.validarLogin(tipoAcesso, username, password)) {
                        FuncionarioView.menuFuncionario();
                    } else {
                        System.out.println("\nAcesso Inválido");
                    }

                    break;

                case 3: // Administrador
                    tipoAcesso = "ADMIN";

                    System.out.print("\nNome Utilizador: ");
                    username = input.next();
                    System.out.print("Password: ");
                    password = input.next();

                    if (loginController.validarLogin(tipoAcesso, username, password)) {
                        AdministradorView.menuAdmin();
                    } else {
                        System.out.println("\nAcesso Inválido");
                    }
                    break;

                case 0:
                    System.out.println("\n*** Encerrar Programa... ***\n");
                    break;


            }

        } while (opcao != 0);

    }


}