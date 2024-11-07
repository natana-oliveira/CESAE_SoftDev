package FichaPratica07;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static TrabalhoPratico_PE.PE_natanaOliveira.*;

public class PaginaInicial {

    public static void main(String[] args) throws FileNotFoundException {

        String[][] matrizTotal = lerFicheiroParaMatriz("src/TrabalhoPratico_PE/GameStart_V2.csv");

        Scanner input = new Scanner(System.in);

        String tipoUtilizador, ADMIN = "", CLIENTE = "";
        int passwordAdm = 123456789, passwordInserida;

        //Ciclo para entrar como utilizador
        do {
            System.out.println("\n\n********************************************************");
            System.out.println("********************************************************");
            System.out.println("***************  Bem Vindo à GameStart!  ***************");
            System.out.println("********************************************************");
            System.out.println("********************************************************");

            System.out.print("\n\nInsira o tipo de Utilizador (ADMIN || CLIENTE || SAIR): ");
            tipoUtilizador = input.next();

            //aceitar letras minusculas
            tipoUtilizador = tipoUtilizador.toUpperCase();

            switch (tipoUtilizador) {
                case "ADMIN":
                    System.out.print("\nInsira a password\n(Atenção! Tem apenas três tentativas) \n\nPASSWORD: ");
                    passwordInserida = input.nextInt();
                    int tentativas = 1; //Conta uma tentativa

                    if (passwordInserida == passwordAdm){
                        menuAdministrador();  //Entra no menu ADMIN
                    }

                    while (passwordInserida != passwordAdm && tentativas < 3) { //se a pass for diferente e menor que 3 tentativas entra no ciclo
                        System.out.print("\n\nPASSWORD INCORRETA!!! Tente novamente. \n\nPASSWORD: ");
                        passwordInserida = input.nextInt();
                        tentativas++; //As tentativas somam
                        System.out.println("tentativas: " + tentativas);

                        if (passwordInserida == passwordAdm){
                            menuAdministrador();  //Entra no menu ADMIN
                        }

                        if (tentativas==3){ //Na terceira tentativa a conta é bloqueada
                            System.out.println("\nCONTA BLOQUEADA!!!\nVocê atingiu o limite de tentativas.");
                        }
                    }
                    break;

                case "CLIENTE":
                    menuCliente();  //ENTRAR NO MEU CLIENTE
                    break;

                case "SAIR":
                    System.out.println("\n\n***** Sair do sistema ***** \n\nObrigado e até a proxima!!!\n\n\n\n");
                    break;

                default:
                    System.out.println("\nUtilizador inválido... Tente outra vez!");
            }
        }
        while (!tipoUtilizador.equals("SAIR"));
    }
}
