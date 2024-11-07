package View;

import Controllers.SimsController;
import Domain.Pessoa.Jogador;
import Domain.Shopping;

import java.io.FileNotFoundException;

import static java.lang.Thread.sleep;

public class PlayerView {

    /**
     * Método de Entrada do Jogo (View do Jogador)
     * @throws FileNotFoundException
     * @throws InterruptedException
     */
    public static void menuEntrada() throws FileNotFoundException, InterruptedException {

        SimsController simsController = new SimsController(); // Instanciar Controller

        System.out.println("\n\nIniciando o jogo ... ");
        sleep(800);
        System.out.println("\n... 3 ...");
        sleep(800);
        System.out.println("... 2 ...");
        sleep(800);
        System.out.println("... 1 ...");
        sleep(1000);

        System.out.println("\n");
        System.out.println("                                      _ __\n" +
                "        ___                             | '  \\\n" +
                "   ___  \\ /  ___         ,'\\_           | .-. \\        /|\n" +
                "   \\ /  | |,'__ \\  ,'\\_  |   \\          | | | |      ,' |_   /|\n" +
                " _ | |  | |\\/  \\ \\ |   \\ | |\\_|    _    | |_| |   _ '-. .-',' |_   _\n" +
                "// | |  | |____| | | |\\_|| |__    //    |     | ,'_`. | | '-. .-',' `. ,'\\_\n" +
                "\\\\_| |_,' .-, _  | | |   | |\\ \\  //    .| |\\_/ | / \\ || |   | | / |\\  \\|   \\\n" +
                " `-. .-'| |/ / | | | |   | | \\ \\//     |  |    | | | || |   | | | |_\\ || |\\_|\n" +
                "   | |  | || \\_| | | |   /_\\  \\ /      | |`    | | | || |   | | | .---'| |\n" +
                "   | |  | |\\___,_\\ /_\\ _      //       | |     | \\_/ || |   | | | |  /\\| |\n" +
                "   /_\\  | |           //_____//       .||`      `._,' | |   | | \\ `-' /| |\n" +
                "        /_\\           `------'        \\ |              `.\\  | |  `._,' /_\\\n" +
                "                                       \\|                    `.\\\n"
        );

        sleep(1500);
        System.out.println("\n\n********************************++++**************************************************");
        System.out.println("****************************  Bem-Vindo/a ao Mundo Bruxo  ****************************");
        System.out.println("**************************************************************************************");
        sleep(1500);

        System.out.println("\n\nO tão esperado dia chegou....\n");
        sleep(1700);
        System.out.println(" ,_,\n" +
                "(.,.)\n" +
                "(   )\n" +
                "-\"-\"---------   Uma coruja trapalhona trouxe sua sonhada Carta de Hogwarts.");
        sleep(2000);
        System.out.println("\nO ano letivo vai iniciar e tens de se preparar! ");
        sleep(1700);
        System.out.println("\nUniforme, livros, caldeirão, varinha...\n\nÉ melhor se apressar ou vai perder o comboio.\n\n");

        sleep(2000);
        System.out.println("                                                    &&&&&&&&&\n" +
                "                                                  &&&\n" +
                "                                                 &&\n" +
                "                                                &  _____ ___________ ___________ ___________\n" +
                "                                               II__|[] | |   I I   | |   I I   | |   I I   |\n" +
                "                                              |        |_|_  I I  _|_|_  I I  _|_|_  I I  _|\n" +
                "                                             < OO----OOO   OO---OO     OO---OO     OO---OO\n" +
                "****************************************************************************************************");

        sleep(2000);

        System.out.println("\n\n -----   Hora da Aventura!!!   ----- ");
        sleep(1700);
        System.out.println("\nVamos criar um novo Personagem. \nPrepare os ingredientes da sua Poção...");

        Jogador jogador = simsController.criarPessoa();  // Instancia um novo jogador chamando o Método criar pessoa
        Shopping shopping = new Shopping();

        sleep(800);
        System.out.println("\n**********   Bem-vindo(a) " + jogador.getNomePersonagem() + " sua aventura começa agora   **********\n");

        simsController.jogo(jogador); // Chama método jogo da classe Controller
    }

}
