import Controllers.SimsController;
import Domain.Objetivo;
import Domain.Pessoa.Jogador;
import Domain.Profissao;
import Domain.Shopping;
import View.PlayerView;

import java.io.FileNotFoundException;

public class MainTeste {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {

        Shopping shopping = new Shopping();

        Jogador jogador1 = new Jogador("Luna", -2000, Objetivo.PROFESSOR_HOGWARTS, new Profissao("Estudante", 500, false, 120, 800), 5, 50, 250, 550, 800);

        SimsController sims = new SimsController();

        //shopping.imprimirShopping(); // Teste imprimir Array na consola

        //shopping.vender(jogador1); // Teste do Método Vender

        //jogador1.exibirDetalhes(); // Teste exibir detalhes

        //sims.imprimirProfissoes(); // Teste imprimir array de profissões

        //sims.procurarProfissao(jogador1); // Teste procurar profissão

        //sims.sorteioCasas(jogador1);  // Teste sortear casa

        //sims.workshop(jogador1);

        //sims.copaQuadribol(jogador1);

        //sims.dueloFinal(jogador1); // Teste duelo Final

        //sims.acaoDiaria(sims.criarPessoa());

        //sims.acaoDiaria(jogador1);

        //sims.imprimirNPCs();

        //sims.casar(jogador1);

        //sims.terFilhos(jogador1);

        //sims.jogo();

        //sims.cicloDiario(jogador1);

        //sims.jogo(jogador1);

       // sims.segurancaSocial(jogador1);

       // sims.fimJogo(jogador1);

       PlayerView.menuEntrada();


    }
}
