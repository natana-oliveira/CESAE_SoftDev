package Controllers;

import Domain.Objetivo;
import Domain.Pessoa.Jogador;
import Domain.Pessoa.NPC;
import Domain.Profissao;
import Domain.Propriedade.AcessoriosModa;
import Domain.Propriedade.Imovel;
import Domain.Propriedade.Propriedade;
import Domain.Shopping;
import View.PlayerView;

import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;

import static Domain.Objetivo.JOGADOR_QUADRIBOL;
import static java.lang.Thread.sleep;

public class SimsController {

    /**
     * Método para criar uma Pessoa (Personagem)
     *
     * @return Novo Personagem
     */
    public Jogador criarPessoa() throws InterruptedException {

        Scanner input = new Scanner(System.in);

        String nomePersonagem;
        double dinheiro = 0;
        Objetivo objetivoVida = null;
        int necessidadeSono = 100, necessidadeRefeicao = 100, necessidadeSocial = 100, estatuto = 0, educacao = 0;

        sleep(1700);
        System.out.println("\n\n**********   Criar Novo Personagem   **********");

        System.out.print("\nNome do Personagem: ");  // Inserir Nome
        nomePersonagem = input.nextLine();

        System.out.println("\n- Bem-vindo(a) " + nomePersonagem + ". Agora escolha um objetivo de vida.");
        System.out.println("\n --- Objetivos de Vida --- \n");
        int contador = 1;

        for (Objetivo objetivoVidaAtual : Objetivo.values()) { // Apresentar os Objetivo de vida disponíveis
            System.out.println(contador++ + ": " + objetivoVidaAtual);
        }

        System.out.print("\nObjetivo de Vida: "); // Inserir Objetivo de vida
        int indexObjetivoVida = input.nextInt();

        contador = 1;

        for (Objetivo objetivoVidaAtual : Objetivo.values()) {
            if (indexObjetivoVida == contador) {
                objetivoVida = objetivoVidaAtual;
            }
            contador++;
        }

        sleep(800);
        System.out.println("\nLumus!!! \nO(A) personagem  ***  " + nomePersonagem + "  ***  foi criado(a) com sucesso!");
        sleep(1000);
        System.out.println("\n\n----- Atenção, o Expresso de Hogwarts vai sair. Corra até a plataforma 9 3/4 e não se atrase! -----\n");
        sleep(2000);
        System.out.println("                      &&&&&&&&&\n" +
                "                    &&&\n" +
                "                   &&\n" +
                "                  &  _____ ___________ ___________ ___________\n" +
                "                 II__|[] | |   I I   | |   I I   | |   I I   |\n" +
                "                |        |_|_  I I  _|_|_  I I  _|_|_  I I  _|\n" +
                "               < OO----OOO   OO---OO     OO---OO     OO---OO\n" +
                "****************************************************************************************************\n");
        System.out.println();

        // Istancia o novo jogador
        Jogador jogador = new Jogador(nomePersonagem, 0, objetivoVida, null, 100, 100, 100, 0, 0);

        return jogador; // Retorna o novo personagem
    }


    /**
     * Método para criar um array de Profissoes (de acordo com as Profissões instanciadas)
     *
     * @return Array Profissoes
     */
    public ArrayList<Profissao> criarListaProfissoes() {

        ArrayList<Profissao> listaProfissoes = new ArrayList<>();  //Instanciar um novo array

        //Instanciar todas as profissoes
        Profissao estudante = new Profissao("Aluno de Hogwarts", 1, false, 0, 0);
        Profissao monitorChefe = new Profissao("Monitor-chefe Casa Hogwarts", 15, false, 0, 8);
        Profissao staffTorneio = new Profissao("Staff no Torneio Tribuxo", 40, false, 10, 10);
        Profissao staffCorujal = new Profissao("Staff de Manutenção do Corujal", 50, false, 15, 5);
        Profissao garcom = new Profissao("Garçom no Três Vassouras", 80, false, 25, 5);
        Profissao vendedor = new Profissao("Vendedor ambulante nos jogos de Quadribol", 25, false, 55, 5);
        Profissao limpador = new Profissao("Limpador de Caldeirões", 70, false, 45, 5);
        Profissao animador = new Profissao("Animador de fantasmas", 75, false, 75, 8);
        Profissao motorista = new Profissao("Motorista do Knight Bus", 85, false, 70, 8);
        Profissao adestrador = new Profissao("Adestrador de Hipogrifos", 80, false, 85, 8);
        Profissao alimentador = new Profissao("Alimentador de Trestrálios", 95, false, 80, 8);
        Profissao estagiario = new Profissao("Estágio de verão no Ministério da Magia", 60, true, 100, 15);
        Profissao enfrentador = new Profissao("Enfrentador de Bichos Papões", 80, false, 75, 8);
        Profissao estilista = new Profissao("Estilista do professor Gilderoy Lockhart", 85, true, 85, 10);
        Profissao jogadorDeQuadribol = new Profissao("Jogador de quadribol", 105, true, 135, 20);
        Profissao magizoologista = new Profissao("Magizoologista", 95, true, 95, 25);
        Profissao inspetor = new Profissao("Inspetor de Chaves de Portais no Departamento de Transportes Mágicos", 100, true, 150, 20);
        Profissao diretorDep = new Profissao("Diretor do Departamento para Regulamentação e Controle das Criaturas Mágicas", 200, true, 125, 25);
        Profissao auror = new Profissao("Auror", 170, true, 320, 25);
        Profissao professor = new Profissao("Professor em Hogwards", 130, true, 450, 120);
        Profissao diretorHogwarts = new Profissao("Diretor de Hogwarts", 200, true, 500, 120);
        Profissao oficial = new Profissao("Oficial do Ministério", 210, true, 500, 100);
        Profissao ministroMagia = new Profissao("Ministro da Magia", 250, true, 600, 120);

        // Adicionar as profissoes a lista (Array)
        listaProfissoes.add(estudante);
        listaProfissoes.add(monitorChefe);
        listaProfissoes.add(staffCorujal);
        listaProfissoes.add(staffTorneio);
        listaProfissoes.add(garcom);
        listaProfissoes.add(vendedor);
        listaProfissoes.add(limpador);
        listaProfissoes.add(animador);
        listaProfissoes.add(motorista);
        listaProfissoes.add(adestrador);
        listaProfissoes.add(alimentador);
        listaProfissoes.add(estagiario);
        listaProfissoes.add(enfrentador);
        listaProfissoes.add(estilista);
        listaProfissoes.add(jogadorDeQuadribol);
        listaProfissoes.add(magizoologista);
        listaProfissoes.add(inspetor);
        listaProfissoes.add(diretorDep);
        listaProfissoes.add(auror);
        listaProfissoes.add(professor);
        listaProfissoes.add(diretorHogwarts);
        listaProfissoes.add(oficial);
        listaProfissoes.add(ministroMagia);

        return listaProfissoes; //Retorna o array
    }


    /**
     * Método para imprimir a Lista de Profissões disponíveis
     */
    public void imprimirProfissoes() {

        ArrayList<Profissao> listaProfissoes = criarListaProfissoes();  //Chamar o array a partir do método criarProfissoes

        int contador = 0;

        for (Profissao profissaoAtual : listaProfissoes) { //Percorre o array de profissões
            System.out.print("Profissão " + contador + ": ");
            profissaoAtual.exibirDetalhes();  // exibe todos os detalhes da profissao
            System.out.println();
            contador++;
        }
    }


    /**
     * Método para Personagem procurar nova profissão
     *
     * @param jogador
     */
    public void procurarProfissao(Jogador jogador) {

        Scanner input = new Scanner(System.in);
        int profissaoEscolhidaIndex;

        if (jogador.getProfissaoAtual() == null) {  //Caso o jogador ainda não tenha um profissão (NULL)
            System.out.println("\nVocê ainda não tem uma profissão. Que tal começar como um Aluno de Hogwarts?!");
            System.out.println("Escolha esta opção e vamos avançar!");
        }

        System.out.println("_______________________________________________________________________________________________");
        System.out.println("\nEssas são as nossas profissões disponíveis: \n");
        imprimirProfissoes(); // Imprimi array de profissões
        System.out.print("\nEscolha a profissão desejada: ");
        profissaoEscolhidaIndex = input.nextInt(); // Inserir o index da profissão desejada

        ArrayList<Profissao> listaProfissoes = criarListaProfissoes(); // cria uma lista de profissão chamando o método

        Profissao profissaoEscolhida = listaProfissoes.get(profissaoEscolhidaIndex); // A profissão escolhida = o index da profissão na lista

        // Verificar se o jogador tem o nível mínimo de educação e estatuto para a profissao
        if (jogador.getEducacao() >= profissaoEscolhida.getNivelMinimoEducacao() && jogador.getEstatuto() >= profissaoEscolhida.getEstatuto()) {

            if (profissaoEscolhida.isFormal()) { //Se a profissão for formal
                boolean acessorioFormal = false;

                for (Propriedade propriedade : jogador.getPropriedades()) { //Iterar o array de propriedades do jogador
                    if (propriedade instanceof AcessoriosModa) { // Se a propriedade é instancia de Acessorio de Moda
                        AcessoriosModa acesssorioModa = (AcessoriosModa) propriedade; // casting de acessorioModa para acessar o método é formal

                        if (acesssorioModa.isFormal()) { // Se o acessorio é formal
                            acessorioFormal = true; // Confirma que o acessório é formal TRUE
                            break;  // Para a busca porque já encontrou um acessório formal
                        }
                    }
                }
                if (acessorioFormal) { // Se possui Acessorio formal
                    jogador.setProfissaoAtual(profissaoEscolhida); // Atribui a profissão (Referente ao acessorio formal)
                    System.out.println("\n\uD83D\uDE4C YEAHH!!! Você passou nos N.O.M. S (Níveis Ordinários de Magia) e agora é um(a) " + profissaoEscolhida.getNome());
                } else { // Não é apto para a profissao
                    System.out.println("\nAhnnn!! Pelas Barbas de Merlin... Infelizmente você ainda não é apto para esta profissão.");
                    System.out.println("Não desista e volte mais tarde. Mas não se esqueça de estudar mais!!");
                }
            } else { // Atribui a profissão (Referente ao nível mínimo de educação e estatuto)
                jogador.setProfissaoAtual(profissaoEscolhida);
                System.out.println("\n\uD83D\uDE4C YEAHH!!! Você passou nos N.O.M. S (Níveis Ordinários de Magia) e agora é um(a) " + profissaoEscolhida.getNome());
                jogador.setDinheiro(jogador.getDinheiro() + profissaoEscolhida.getSalarioDia()); // Aumenta o salario
            }
        } else { // Não é apto para a profissao
            System.out.println("\nAhnnn!! Pelas Barbas de Merlin... Infelizmente você ainda não é apto para esta profissão.");
            System.out.println("Não desista e volte mais tarde. Mas não se esqueça de estudar mais!!");
        }
    }


    /**
     * Método para criar um array de NPCs disponíveis (de acordo com NPCs instanciados)
     *
     * @return Array de NPCs
     */
    public ArrayList<NPC> criarlistaNPCs() {

        ArrayList<NPC> listaNPCs = new ArrayList<>();  //Instanciar um novo array

        //Instanciar NPCs
        NPC nevilleLongbottom = new NPC("Neville Longbottom", 10000, 130);
        NPC cedricDiggory = new NPC("Cedric Diggory", 9000, 100);
        NPC remoLupin = new NPC("Remo Lupin", 6000, 175);
        NPC ninfadoraTonks = new NPC("Ninfadora Tonks", 9000, 170);
        NPC alastorMoody = new NPC("Alastor Moody", 8000, 75);
        NPC fleurDelacour = new NPC("Fleur Delacour", 8500, 140);
        NPC argoFilch = new NPC("Argo Filch", 1000, 40);
        NPC choChang = new NPC("Cho Chang", 9000, 100);
        NPC pansyParkinson = new NPC("Pansy Parkinson", 12000, 160);
        NPC parvatiPatil = new NPC("Parvati Patil", 7000, 95);
        NPC lilaBrown = new NPC("Lilá Brown", 8000, 95);
        NPC guiWeasley = new NPC("Gui Weasley", 7000, 120);
        NPC lilian = new NPC("Lilian Luna Potter", 0, 0);
        NPC alvo = new NPC("Alvo Severo Potter", 0, 0);
        NPC tiago = new NPC("Tiago Sirius Potter", 0, 0);
        NPC hugo = new NPC("Hugo Weasley", 0, 0);
        NPC rose = new NPC("Rose Granger-Weasley", 0, 0);
        NPC lorcan = new NPC("Lorcan Scamander", 0, 0);
        NPC lysander = new NPC("Lysander Scamander", 0, 0);

        // Adicionar NPCs a lista (Array)
        listaNPCs.add(nevilleLongbottom);
        listaNPCs.add(cedricDiggory);
        listaNPCs.add(remoLupin);
        listaNPCs.add(ninfadoraTonks);
        listaNPCs.add(alastorMoody);
        listaNPCs.add(fleurDelacour);
        listaNPCs.add(argoFilch);
        listaNPCs.add(choChang);
        listaNPCs.add(pansyParkinson);
        listaNPCs.add(parvatiPatil);
        listaNPCs.add(lilaBrown);
        listaNPCs.add(guiWeasley);
        listaNPCs.add(lilian);
        listaNPCs.add(alvo);
        listaNPCs.add(tiago);
        listaNPCs.add(hugo);
        listaNPCs.add(rose);
        listaNPCs.add(lorcan);
        listaNPCs.add(lysander);

        return listaNPCs; //Retorna o array
    }


    /**
     * Método para imprimir a Lista de NPCs disponíveis
     */
    public void imprimirNPCs() {

        ArrayList<NPC> listaNPCs = criarlistaNPCs(); //Chamar o array a partir do método

        int contador = 0;

        System.out.println("\nNPCs disponíveis: \n");

        for (NPC npcAtual : listaNPCs) { //Percorre o array de NPCs
            System.out.print(contador + ": ");
            npcAtual.exibirDetalhes();
            System.out.println();
            contador++;
        }
    }


    /**
     * Método para sortear (random) uma Casa em Hogwarts para o jogador
     *
     * @param jogador
     */
    public void sorteioCasas(Jogador jogador) {

        Random random = new Random();

        System.out.println("\n\uD83D\uDD2E Seu primeiro dia foi emocionante, certo?! E agora temos uma missão que definirá seu rumo em Hogwarts...");
        System.out.println("É a hora da decisão do Chapéu Seletor. Entre na fila para descobrir qual a sua casa em Hogwarts \uD83C\uDFF0");
        System.out.println("\n\uD83E\uDD81 Gryffindor - Lar dos bravos e cavalheiros. \nA Casa valoriza feitos de coragem e superação pessoal que costumam ser realizados por altruísmo. Seus estudantes tendem a ser bastante aventureiros, mas se destacam, sobretudo, pela lealdade.");
        System.out.println("\n\uD83E\uDD85 Ravenclaw - Os sabios e criativos. \nA Casa se destaca por sua exímia inteligência e personalidade única dos alunos. A valorização exacerbada do academicismo pode torná-lo perfeccionista, frio, e demasiadamente crítico em relação às outras Casas.");
        System.out.println("\n\uD83E\uDDA8 Hufflepuff - Os gentis, pacientes e tolerantes. \nA Casa se destaca pela dedicação, paciência e honestidade. São trabalhadores árduos e receptivos a todos os demais tipos de bruxos. Porém podem ser complacentes, dependentes de outros e ingênuos.");
        System.out.println("\n\uD83D\uDC0D Slytherin - Os ambiciosos, calculistas e orgulhosos. \nGrandes alunos e líderes natos. Se dedicam a alcançar e expandir metas com inteligência em diversas áreas da magia. Porém com um senso de competição muito aflorado, o que os torna presunçosos e egoístas.");


        String[] casasHogwarts = {"\uD83E\uDD81 Gryffindor", "\uD83E\uDD85 Ravenclaw", "\uD83E\uDDA8 Hufflepuff", "\uD83D\uDC0D Slytherin"}; //Array das casas de Hogwarts
        int indexChapeuSeletor = random.nextInt(casasHogwarts.length); //Escolhe aleatóriamente usando o tamanho do array

        String casaSorteada = casasHogwarts[indexChapeuSeletor];

        if (casaSorteada.equals("\uD83E\uDD81 Gryffindor")) { // se for sorteado para Gryffindor
            jogador.setEducacao(jogador.getEducacao() + 10);
            jogador.setNecessidadeSocial(jogador.getNecessidadeSocial() + 15);
            jogador.setEstatuto(jogador.getEstatuto() + 5);
        }
        if (casaSorteada.equals("\uD83E\uDD85 Ravenclaw")) { // se for sorteado para Ravenclaw
            jogador.setEducacao(jogador.getEducacao() + 15);
            jogador.setNecessidadeSocial(jogador.getNecessidadeSocial() - 10);
            jogador.setEstatuto(jogador.getEstatuto() + 2);
        }
        if (casaSorteada.equals("\uD83E\uDDA8 Hufflepuff")) { // se for sorteado para Hufflepuff
            jogador.setEducacao(jogador.getEducacao() + 5);
            jogador.setNecessidadeSocial(jogador.getNecessidadeSocial() + 20);
            jogador.setEstatuto(jogador.getEstatuto() + 2);
        }
        if (casaSorteada.equals("\uD83D\uDC0D Slytherin")) { // se for sorteado para Slytherin
            jogador.setEducacao(jogador.getEducacao() + 10);
            jogador.setNecessidadeSocial(jogador.getNecessidadeSocial() - 5);
            jogador.setEstatuto(jogador.getEstatuto() + 5);
        }

        System.out.println("\n________________________________________________________________________________________________");
        System.out.println("Parabéns bruxinho(a)!!! Você foi selecionado(a) para a casa ***  " + casaSorteada + "!!   ***");
        System.out.println("\nCorra e vá se juntar aos seus colegas e monitores!");
        System.out.println("________________________________________________________________________________________________\n");
    }


    /**
     * Método participar workshop
     *
     * @param jogador
     */
    public void workshop(Jogador jogador) {

        Scanner input = new Scanner(System.in);
        String escolhaEscola;

        System.out.println("\n\uD83E\uDDF3 OOWWW.... Hoje tens a possiblidade de visitar a incrível BEAUXBATONS ACADEMY OF MAGIC para um workshop de ´História da Magia e Bruxas Francesas´.");
        System.out.println("\nEscolha se desejar participar deste workshop. \nCaso afirmativo ganha conhecimento. São 100 pontos a mais investidos em sua educação.");
        System.out.println("Mas há custos, claro! BEAUXBATONS é uma escola de elite e você deve desembolsar 90 galeões para participar do workshop.");

        do {
            System.out.print("\nEu sei, é uma escolha dificíl, mas pense bem... \nDesejas participar do workshop? (S/N): ");
            escolhaEscola = input.next();
            if (escolhaEscola.equalsIgnoreCase("S")) { // Se optar por ir ao workshop
                jogador.setEducacao(jogador.getEducacao() + 100); // ganha 50 pontos educação
                jogador.setDinheiro(jogador.getDinheiro() - 90); // perde 3000 dinheiros
                System.out.println("\n- Você optou ir ao Workshop. \nVamos lá aprender alguma coisa nova!!");
                System.out.println("\n____________________________________________________________");
                System.out.println("\n\uD83D\uDCD6 Nível de educação atual: " + jogador.getEducacao());
                System.out.println("\uD83D\uDCB5 Dinheiro atual: " + jogador.getDinheiro() + " Galeões");
                System.out.println("____________________________________________________________");
            } else if (escolhaEscola.equalsIgnoreCase("N")) { // optar por não ir ao workshop
                System.out.println("____________________________________________________________");
                System.out.println("\nVocê resolveu economizar e não ir ao Workshop!");
                System.out.println("____________________________________________________________");
            } else { // Repete a opção caso não seja inserida a resposta correta S ou N
                System.out.println("____________________________________________________________");
                System.out.println("\nResposta inálida bruxinho(a)! Tente S ou N");
                System.out.println("____________________________________________________________");
            }
        } while (!escolhaEscola.equalsIgnoreCase("S") && !escolhaEscola.equalsIgnoreCase("N")); // O ciclo só acaba quando inserida a resposta correta S ou N

    }


    /**
     * Método casar
     *
     * @param jogador
     */
    public void casar(Jogador jogador) {

        Scanner input = new Scanner(System.in);
        String escolhaCasamento;

        System.out.println("\n\uD83D\uDC8D Chegamos à um dia muito importante e hoje tens uma decisão muito séria a fazer. É a altura dos casamentos");
        System.out.println("Não se apavore. Pense em todos os seus sonhos e objetivos de vida. Isso é muito importante para seu futuro.");

        do {
            System.out.print("\nAfinal, deseja se casar? (S/N): ");
            escolhaCasamento = input.next();

            if (escolhaCasamento.equalsIgnoreCase("S")) { // Se optar por sim

                imprimirNPCs(); // Apresentar a lista de NPCs disponíveis

                System.out.print("\nEscolha o(a) parceiro(a) com quem deseja se casar: ");
                int parceiroEscolhidoIndex = input.nextInt(); // Inserir o index do parceiro desejado
                ArrayList<NPC> listaNPCs = criarlistaNPCs(); // cria a lista de NPCs chamando o método

                NPC parceiroEscolhido = listaNPCs.get(parceiroEscolhidoIndex); // O parceiro escolhido = index na lista de NPCs

                // Verificar se o jogador já possui pelo menos um imovel
                boolean possuiImovel = false;
                for (Propriedade propriedade : jogador.getPropriedades()) { //Iterar o array de propriedades do jogador

                    if (propriedade instanceof Imovel) { // Se a propriedade é instancia Imovel
                        Imovel imovel = (Imovel) propriedade; // casting de imovel para get capacidade de pessoas
                        possuiImovel = true;
                    } else {
                        System.out.println("\nVocê ainda não possui nenhum imóvel e por isso não pode se casar!");
                    }
                }

                // Verificar se o jogador tem o estatuto mínimo para casar com determinado NPC
                if (jogador.getEstatuto() >= parceiroEscolhido.getEstatutoMinimo()) {

                    // Verificar se o jogador tem uma propriedade que albergue 2 ou mais pessoas
                    boolean imovel2Quartos = false;
                    for (Propriedade propriedade : jogador.getPropriedades()) { //Iterar o array de propriedades do jogador

                        if (propriedade instanceof Imovel) { // Se a propriedade é instancia Imovel
                            Imovel imovel = (Imovel) propriedade; // casting de imovel para get capacidade de pessoas

                            if (imovel.getCapacidadePessoas() >= 2) { // Se a capacidade do imovel é = ou maior que 2
                                imovel2Quartos = true; // O imóvel é apto para casamento

                                // O jogador se casa ...
                                jogador.setDinheiro(jogador.getDinheiro() + parceiroEscolhido.getDinheiro()); // e o dinheiro do jogador aumenta o total de dinheiro do NPC
                                jogador.getFamilia().add(parceiroEscolhido); // Adiciona o parceiro ao array Familia

                                System.out.println("\nPelos Mantos Sagrados dos Bruxos Casamenteiros... Você se casou com " + parceiroEscolhido.getNomePersonagem());
                                System.out.println("Parabéns!! Agora já podem viver juntos e planear o futuro.");

                                for (int dia = 1; dia <= 100; dia++) { // A cada dia do ciclo
                                    jogador.setDinheiro(jogador.getDinheiro() + 30); // O dinheiro aumenta 30 por dia
                                }
                            } else {
                                System.out.println("\nAhhh... Pelos Pomos Dourados Perdidos! \nInfelizmente seu imóvel é pequeno demais e não caberia você e " + parceiroEscolhido.getNomePersonagem());
                            }
                        }
                    }
                } else {
                    System.out.println("\nAhhh... Pelos Pomos Dourados Perdidos! \nInfelizmente você não atende aos requisitos para se casar com " + parceiroEscolhido.getNomePersonagem());
                }
            } else if (escolhaCasamento.equalsIgnoreCase("N")) { // optar por não casar
                System.out.println("_______________________________________________");
                System.out.println("\nAinda não estás preparado para casar! \nÉ compreensível. Uma decisão tão séria não deve ser tomada às pressas!");
                System.out.println("_______________________________________________");
            } else { // Repete a opção caso não seja inserida a resposta correta S ou N
                System.out.println("____________________________________________________________");
                System.out.println("\nResposta inálida bruxinho(a)! Tente S ou N");
                System.out.println("____________________________________________________________");
            }
        } while (!escolhaCasamento.equalsIgnoreCase("S") && !escolhaCasamento.equalsIgnoreCase("N")); // O ciclo só acaba quando inserida a resposta correta S ou N

        System.out.println("\n____________________________________________________________");
        System.out.println("\uD83D\uDCB5 Dinheiro atual: " + jogador.getDinheiro() + " Galeões");
        System.out.println("____________________________________________________________");

    }


    /**
     * Método ter filhos
     *
     * @param jogador
     */
    public void terFilhos(Jogador jogador) {

        Scanner input = new Scanner(System.in);
        String escolhaFilhos;

        System.out.println("\n\uD83D\uDC76\uD83C\uDFFB Olha só como temos evoluído, e com o tempo vem grandes responsabilidades. \nAgora que já és um(a) bruxo(a) crescido está na hora de decidir sobre as próximas gerações. É hora de decidir se queres um herdeiro ou herdeira!");
        System.out.println("Pense bem pois é uma grande responsabilidade criar e educar os futuros bruxinhos.");

        do {
            System.out.print("\nDeseja ter / adotar filhos? (S/N): ");
            escolhaFilhos = input.next();

            if (escolhaFilhos.equalsIgnoreCase("S")) { // Escolher ter filho

                ArrayList<NPC> listaNPCs = criarlistaNPCs(); // cria a lista de todos os NPCs chamando o método
                ArrayList<NPC> filhosNPC = new ArrayList<>(); // cria um novo array para os NPCs que podem ser filhos do jogador
                Random random = new Random();

                if (jogador.getFamilia().isEmpty()) { // Se o array da família estiver vazio, ou seja, se não estiver casado
                    System.out.println("_______________________________________________________________________________________________");
                    System.out.println("\nVocê precisar estar casado para ter filhos!!!"); // não pode ter filhos
                    System.out.println("_______________________________________________________________________________________________");
                    return; // Para de rodar o método
                }

                for (NPC filhoAtual : listaNPCs) { // Itera o array listaNPCs
                    if (filhoAtual.getDinheiro() == 0 && filhoAtual.getEstatutoMinimo() == 0) { // se o NPC tiver 0 dinheiro e 0 estatuto
                        filhosNPC.add(filhoAtual); // Adiciona o NPC ao array de possiveis filhos
                    }
                }

                if (!filhosNPC.isEmpty()) { // Se o array de filhos não estiver vazio
                    int indexFilho = random.nextInt(filhosNPC.size()); // Escolhe o filho aleatoriamente no tamanho do array de filhos

                    // Verificar se a propriedade do jogador tem capacidade para aumentar a familia
                    for (Propriedade propriedade : jogador.getPropriedades()) { //Iterar o array de propriedades do jogador

                        if (propriedade instanceof Imovel) { // Se a propriedade é instancia Imovel
                            Imovel imovel = (Imovel) propriedade; // casting de imovel para get capacidade de pessoas

                            if (jogador.getFamilia().size() <= imovel.getCapacidadePessoas()) { // Se o tamanho da familia é menor ou igual a capacidade de pessoas do imovel do jogador
                                NPC filhoJogador = filhosNPC.get(indexFilho); // Filho do jogador passa a ser o index sorteado aleatoriamente
                                jogador.getFamilia().add(filhoJogador); // adiciona o novo filho a familia do jogador (Array familia)
                                System.out.println("_______________________________________________________________________________________________");
                                System.out.println("\nParabéns!!! As corujas te trouxeram um pacote muito especial.");
                                System.out.println("Você acabou de ter um filho(a) chamado(a) " + filhoJogador.getNomePersonagem());
                                System.out.println("_______________________________________________________________________________________________");

                                // Cobrar 10 dinheiros/dia por cada pessoa da família
                                int gastoDiarioPorPessoa = 10; // Gasto por pessoa/dia
                                int gastoTotalFamiliaDiario; // Gasto total da família toda por dia

                                gastoTotalFamiliaDiario = gastoDiarioPorPessoa * jogador.getFamilia().size(); // Gasto de 1 pessoa/dia * o tamanho da família (array)

                                jogador.setDinheiro(jogador.getDinheiro() - gastoTotalFamiliaDiario);

                            } else {  // Capacidade da casa não cabe
                                System.out.println("_______________________________________________________________________________________________");
                                System.out.println("\nAhhh... Infelizmente sua casa é muito pequena para aumentar a família.");
                                System.out.println("_______________________________________________________________________________________________");
                            }
                        }
                    }
                }

                System.out.print("\nDeseja ter/adotar mais um filho? (S/N): ");
                String aumentarFilhos = input.next();

                while (aumentarFilhos.equalsIgnoreCase("S")) { // Caso queira adotar mais filhos enquanto a resposta for S
                    //Repete o processo anterior
                    int indexFilho = random.nextInt(filhosNPC.size()); // Escolhe o filho aleatoriamente no tamanho do array de filhos
                    // Verificar a capacidade Máxima do Imovel
                    for (Propriedade propriedade : jogador.getPropriedades()) { //Iterar o array de propriedades do jogador
                        if (propriedade instanceof Imovel) { // Se a propriedade é instancia Imovel
                            Imovel imovel = (Imovel) propriedade; // casting de imovel para get capacidade de pessoas
                            if (jogador.getFamilia().size() <= imovel.getCapacidadePessoas()) { // Se o tamanho da familia é menor ou igual a capacidade de pessoas do imovel do jogador
                                NPC filhoJogador = filhosNPC.get(indexFilho); // Filho do jogador passa a ser o index sorteado aleatoriamente
                                jogador.getFamilia().add(filhoJogador); // adiciona o novo filho a familia do jogador (Array familia)

                                System.out.println("\nParabéns!!! As corujas te trouxeram um pacote muito especial.");
                                System.out.println("Você acabou de ter um filho(a) chamado(a) " + filhoJogador.getNomePersonagem());
                            }
                        }
                    }
                }

            } else if (escolhaFilhos.equalsIgnoreCase("N")) { // Escolher não ter nenhum filho
                System.out.println("_________________________________________________________________________________________________");
                System.out.println("Você optou por não ter filhos. \nÉ uma responsabilidade para qual você ainda não está preparado!");
                System.out.println("_________________________________________________________________________________________________");

            } else { // Repete a opção caso não seja inserida a resposta correta S ou N
                System.out.println("____________________________________________________________");
                System.out.println("\nResposta inálida bruxinho(a)! Tente S ou N");
                System.out.println("____________________________________________________________");
            }
        } while (!escolhaFilhos.equalsIgnoreCase("S") && !escolhaFilhos.equalsIgnoreCase("N")); // O ciclo só acaba quando inserida a resposta correta S ou N
    }


    /**
     * Método S.S para o jogador pagar 10 dinheiros/dia por cada pessoa da família e verificar o limite de dinheiro
     *
     * @param jogador
     */
    public void segurancaSocial(Jogador jogador) {

        int gastoDiarioPorPessoa = 10; // Gasto por pessoa/dia
        int gastoTotalFamiliaDiario; // Gasto total da família toda por dia

        gastoTotalFamiliaDiario = gastoDiarioPorPessoa * jogador.getFamilia().size(); // Gasto de 1 pessoa/dia * o tamanho da família (array)

        //Verificar o limite mínimo de dinheiro
        if (jogador.getDinheiro() - gastoTotalFamiliaDiario < -3250) {
            jogador.getFamilia().clear(); // Retira todos os integrantes da família (não é o ideal mas foi o que se conseguiu)
            System.out.println("\nVocê ultrapassou o limite de dívida e a S.S. veio buscar seus filhos!");
            System.out.println("Infelizmente seu(ua) parceiro(a) também teve de ser levado(a). É um processo muito burocrático e complicado e não conseguimos levar apenas os seus filhos");
            System.out.println("Espero que não faça falta. E seus filhos também precisam mais do que você!");
        }
    }


    /**
     * Método para verificar as necessidades do jogador e impedir que ele faça outras escolhas quando em deficit
     */
    public void necessidadesJogador(Jogador jogador) {

        String acao = null;


        if (jogador.getNecessidadeSono() < 25) { // se a necessidade de sono for abaixo de 25
            System.out.println("\nVocê está muito cansado(a)!! É preciso descansar antes de fazer outras escolhas.");
            if (acao != "2") {
                System.out.println("Você só pode escolher dormir no momento.");
            } else {
                jogador.setNecessidadeSono(100);
            }
        }

        if (jogador.getNecessidadeRefeicao() < 25) { // se a necessidade de refeição for abaixo de 25
            System.out.println("\nVocê está com muita fome!! É preciso comer antes de fazer outras escolhas.");
            if (acao != "3") {
                System.out.println("Você só pode escolher fazer refeições no momento.");
            }
        }
        if (jogador.getNecessidadeSocial() < 25) { // se a necessidade social for abaixo de 25
            System.out.println("\nVocê está muito deprimido(a) e isolado(a)!! É preciso socializar antes de fazer outras escolhas.");
            if (acao != "4") {
                System.out.println("Você só pode jogar / assistir Quadribol no momento.");
            }
        }

    }


    /**
     * Método assistir copa de Quadribol
     *
     * @param jogador
     */
    public void copaQuadribol(Jogador jogador) {

        Scanner input = new Scanner(System.in);
        String escolhaFinalJogo;

        System.out.println("\n\uD83C\uDFDF Ufffaa... Tens se dedicado e se esforçado muito, por isso mereces se divertir um pouco. \nEstá na altura do evento desportivo mais emocionante do Mundo Bruxo, a Copa Mundial de Quadribol.");
        System.out.println("Podes se juntar aos grandes e assistir a incrível final entre Irlanda x Bulgária, sediada em Devon, Inglaterra. Definitivamente, esse evento não é para qualquer um. Entretanto, é preciso bilhetes e gastar com outras relagias....");
        System.out.println("Tem duas opções de assento: Arquibancada (1000 Galeões) ou Tribuna (3000 Galeões), mas lembre-se, quanto mais caro mais será visto e mais perto dos grandes bruxos estará.");

        do {
            System.out.print("\nVamos lá!!! Desejas assistir a grande final da Copa Mundial de Quadribol? (S/N): ");
            escolhaFinalJogo = input.next();

            if (escolhaFinalJogo.equalsIgnoreCase("S")) { // Se optar por ir ao Jogo
                System.out.print("\n1 - Arquibancada \n2 - Tribuna\nQual assento deseja comprar? (Insira apenas o número): ");
                int assentoLugar = input.nextInt();
                if (assentoLugar == 1) { //Arquibancada
                    System.out.println("\nIngresso Autorizado: \nNome: " + jogador.getNomePersonagem());
                    System.out.println("Assento: Arquibancada\nValor: 1000 Galeões");
                    jogador.setDinheiro(jogador.getDinheiro() - 1000);
                    jogador.setEstatuto(jogador.getEstatuto() + 200);
                } else if (assentoLugar == 2) { //Tribuna
                    System.out.println("\nIngresso Autorizado: \nNome: " + jogador.getNomePersonagem());
                    System.out.println("Assento: Tribuna\nValor: 3000 Galeões");
                    jogador.setDinheiro(jogador.getDinheiro() - 3000);
                    jogador.setEstatuto(jogador.getEstatuto() + 500);
                }
            } else if (escolhaFinalJogo.equalsIgnoreCase("N")) { // optar por não ir ao Jogo
                System.out.println("____________________________________________________________");
                System.out.println("Afinal você resolveu não assistir a partida! \nTalvez daqui a quatro anos!");
                System.out.println("____________________________________________________________");
            } else { // Repete a opção caso não seja inserida a resposta correta S ou N
                System.out.println("____________________________________________________________");
                System.out.println("\nResposta inálida bruxinho(a)! Tente S ou N");
                System.out.println("____________________________________________________________");
            }
        } while (!escolhaFinalJogo.equalsIgnoreCase("S") && !escolhaFinalJogo.equalsIgnoreCase("N")); // O ciclo só acaba quando inserida a resposta correta S ou N

        System.out.println("\n____________________________________________________________");
        System.out.println("\uD83D\uDCB5 Dinheiro atual: " + jogador.getDinheiro() + " Galeões");
        System.out.println("\uD83C\uDF96\uFE0F Estatuto atual: " + jogador.getEstatuto());
        System.out.println("____________________________________________________________");
    }


    /**
     * Método resultado do Duelo
     *
     * @return resultado final do duelo
     */
    public String resultadoDuelo() {

        Random random = new Random();

        String[] resultadoFinal = {"Vencer", "Perder"}; //Array do resultado
        int indexResultado = random.nextInt(resultadoFinal.length); //Escolhe aleatóriamente usando o tamanho do array

        return resultadoFinal[indexResultado];
    }


    /**
     * Método Duelo Final
     *
     * @param jogador
     */
    public void dueloFinal(Jogador jogador) throws InterruptedException {

        Scanner input = new Scanner(System.in);
        String escolhaDuelo;

        System.out.println("\n⚔\uFE0F Já és um(a) bruxo(a) completo para decidir qual caminho deseja tornar. Forças malígnas avançam cada vez mais e é preciso de um reforço para lutar contra as Artes das Trevas.");
        System.out.println("Podes ingressar na Ordem da Fênix e lutar ao lado de grande bruxos. Mas é preciso ser forte pois enfrentará grandes perigos, talvez até a morte, ou pior... ´Aquele-que-não-deve-ser-nomeado.´");
        System.out.println("Se ingressar ao grupo, será eternamente lembrado como o(a) bruxo(a) corajoso(a) que és.");

        do {
            System.out.print("\nCoragem!!! Desejas ingressar na Ordem da Fênix? (S/N): ");
            escolhaDuelo = input.next();


            if (escolhaDuelo.equalsIgnoreCase("S")) { // Se optar por entrar na Ordem
                sleep(800);
                System.out.println("_____________________________________________________________________________");
                System.out.println("\n--- \uD83E\uDD85 \uD83D\uDD25   Parabéns pela escolha e Bem-vindo(a) à Ordem da Fênix   \uD83D\uDD25 \uD83E\uDD85 ---");
                System.out.println("\nNunca se sabe o que podemos enfrentar pelo caminho... \nTerás um duelo e deverá enfrentar seu oponente. \nBoa Sorte! ");

                Random random = new Random();

                String[] comensaisDaMorte = {"Belatriz Lestrange", "Bartô Crouch Jr.", "Draco Malfoy", "Pedro Pettigrew", "Lucius Malfoy", "Lord Voldemort"}; //Array de vilões Comensais da Morte
                int indexMarcaNegra = random.nextInt(comensaisDaMorte.length); //Escolhe aleatóriamente usando o tamanho do array
                String resultado = resultadoDuelo();
                String vilaoSorteado = comensaisDaMorte[indexMarcaNegra];
                System.out.println("_____________________________________________________________________________");
                sleep(2000);
                System.out.println("\nVocê vai duelar contra: \uD83E\uDE84๋  " + vilaoSorteado + "  \uD83E\uDE84๋ \n\nPrepare-se para duelar... \n");
                System.out.println("\uD83E\uDDD9\u200D♀\uFE0F \uD83D\uDCA5 \uD83E\uDDD9\u200D♂\uFE0F \n");

                sleep(1500);
                System.out.println("_____________________________________________________________________");
                if (vilaoSorteado.equals("Lord Voldemort")) { // se o vilão for Lord Voldemort
                    System.out.println("Resultado do Duelo: " + resultado);
                    if (resultado.equals("Vencer")) { // Caso vença o duelo
                        System.out.println("_____________________________________________________________________");
                        System.out.println("\nBoa, venceu o seu duelo!!\nGanhará recompensas por esse feito!");
                        jogador.setNecessidadeSono(jogador.getNecessidadeSono() - 35);
                        jogador.setNecessidadeRefeicao(jogador.getNecessidadeRefeicao() - 35);
                        jogador.setEstatuto(jogador.getEstatuto() + 75);
                    } else {// Caso perca o duelo
                        System.out.println("_____________________________________________________________________");
                        System.out.println("\nAhhh, que pena! Perdeu o seu duelo!!\nAgora sofrerá as consequências");
                        jogador.setNecessidadeSono(jogador.getNecessidadeSono() - 40);
                        jogador.setNecessidadeRefeicao(jogador.getNecessidadeRefeicao() - 40);
                        jogador.setEstatuto(jogador.getEstatuto() - 85);
                    }
                }
                if (vilaoSorteado.equals("Belatriz Lestrange")) { // se o vilão for Belatriz Lestrange
                    System.out.println("Resultado do Duelo: " + resultado);
                    if (resultado.equals("Vencer")) { // Caso vença o duelo
                        System.out.println("_____________________________________________________________________");
                        System.out.println("\nBoa, venceu o seu duelo!!\nGanhará recompensas por esse feito!");
                        jogador.setNecessidadeSono(jogador.getNecessidadeSono() - 25);
                        jogador.setNecessidadeRefeicao(jogador.getNecessidadeRefeicao() - 25);
                        jogador.setEstatuto(jogador.getEstatuto() + 65);
                    } else {// Caso perca o duelo
                        System.out.println("_____________________________________________________________________");
                        System.out.println("\nAhhh, que pena! Perdeu o seu duelo!!\nAgora sofrerá as consequências");
                        jogador.setNecessidadeSono(jogador.getNecessidadeSono() - 30);
                        jogador.setNecessidadeRefeicao(jogador.getNecessidadeRefeicao() - 30);
                        jogador.setEstatuto(jogador.getEstatuto() - 70);
                    }
                }
                if (vilaoSorteado.equals("Bartô Crouch Jr.")) { // se o vilão for Bartô Crouch Jr.
                    System.out.println("Resultado do Duelo: " + resultado);
                    if (resultado.equals("Vencer")) { // Caso vença o duelo
                        System.out.println("_____________________________________________________________________");
                        System.out.println("\nBoa, venceu o seu duelo!!\nGanhará recompensas por esse feito!");
                        jogador.setNecessidadeSono(jogador.getNecessidadeSono() - 20);
                        jogador.setNecessidadeRefeicao(jogador.getNecessidadeRefeicao() - 20);
                        jogador.setEstatuto(jogador.getEstatuto() + 50);
                    } else {// Caso perca o duelo
                        System.out.println("_____________________________________________________________________");
                        System.out.println("\nAhhh, que pena! Perdeu o seu duelo!!\nAgora sofrerá as consequências");
                        jogador.setNecessidadeSono(jogador.getNecessidadeSono() - 20);
                        jogador.setNecessidadeRefeicao(jogador.getNecessidadeRefeicao() - 20);
                        jogador.setEstatuto(jogador.getEstatuto() - 60);
                    }
                }
                if (vilaoSorteado.equals("Lucius Malfoy")) { // se o vilão for Lucius Malfoy
                    System.out.println("Resultado do Duelo: " + resultado);
                    if (resultado.equals("Vencer")) { // Caso vença o duelo
                        System.out.println("_____________________________________________________________________");
                        System.out.println("\nBoa, venceu o seu duelo!!\nGanhará recompensas por esse feito!");
                        jogador.setNecessidadeSono(jogador.getNecessidadeSono() - 20);
                        jogador.setNecessidadeRefeicao(jogador.getNecessidadeRefeicao() - 20);
                        jogador.setEstatuto(jogador.getEstatuto() + 40);
                    } else {// Caso perca o duelo
                        System.out.println("_____________________________________________________________________");
                        System.out.println("\nAhhh, que pena! Perdeu o seu duelo!!\nAgora sofrerá as consequências");
                        jogador.setNecessidadeSono(jogador.getNecessidadeSono() - 20);
                        jogador.setNecessidadeRefeicao(jogador.getNecessidadeRefeicao() - 20);
                        jogador.setEstatuto(jogador.getEstatuto() - 50);
                    }
                }
                if (vilaoSorteado.equals("Pedro Pettigrew")) { // se o vilão for Pedro Pettigrew
                    System.out.println("Resultado do Duelo: " + resultado);
                    if (resultado.equals("Vencer")) { // Caso vença o duelo
                        System.out.println("_____________________________________________________________________");
                        System.out.println("\nBoa, venceu o seu duelo!!\nGanhará recompensas por esse feito!");
                        jogador.setNecessidadeSono(jogador.getNecessidadeSono() - 15);
                        jogador.setNecessidadeRefeicao(jogador.getNecessidadeRefeicao() - 15);
                        jogador.setEstatuto(jogador.getEstatuto() + 40);
                    } else {// Caso perca o duelo
                        System.out.println("_____________________________________________________________________");
                        System.out.println("\nAhhh, que pena! Perdeu o seu duelo!!\nAgora sofrerá as consequências");
                        jogador.setNecessidadeSono(jogador.getNecessidadeSono() - 15);
                        jogador.setNecessidadeRefeicao(jogador.getNecessidadeRefeicao() - 15);
                        jogador.setEstatuto(jogador.getEstatuto() - 40);
                    }
                }
                if (vilaoSorteado.equals("Draco Malfoy")) { // se o vilão for Draco Malfoy
                    System.out.println("Resultado do Duelo: " + resultado);
                    if (resultado.equals("Vencer")) { // Caso vença o duelo
                        System.out.println("_____________________________________________________________________");
                        System.out.println("\nBoa, venceu o seu duelo!!\nGanhará recompensas por esse feito!");
                        jogador.setNecessidadeSono(jogador.getNecessidadeSono() - 10);
                        jogador.setNecessidadeRefeicao(jogador.getNecessidadeRefeicao() - 10);
                        jogador.setEstatuto(jogador.getEstatuto() + 20);
                    } else {// Caso perca o duelo
                        System.out.println("_____________________________________________________________________");
                        System.out.println("\nAhhh, que pena! Perdeu o seu duelo!!\nAgora sofrerá as consequências");
                        jogador.setNecessidadeSono(jogador.getNecessidadeSono() - 10);
                        jogador.setNecessidadeRefeicao(jogador.getNecessidadeRefeicao() - 10);
                        jogador.setEstatuto(jogador.getEstatuto() - 30);
                    }
                }
            } else if (escolhaDuelo.equalsIgnoreCase("N")) { // Se optar por Não entrar na Ordem
                System.out.println("\n____________________________________________________________");
                System.out.println("Você ainda não está preparado para um duelo!\nNão faz mal. Siga em frente de cabeça erguida.");
                System.out.println("____________________________________________________________");
            } else { // Repete a opção caso não seja inserida a resposta correta S ou N
                System.out.println("____________________________________________________________");
                System.out.println("\nResposta inálida bruxinho(a)! Tente S ou N");
                System.out.println("____________________________________________________________");
            }
        } while (!escolhaDuelo.equalsIgnoreCase("S") && !escolhaDuelo.equalsIgnoreCase("N")); // O ciclo só acaba quando inserida a resposta correta S ou N


        System.out.println("\n____________________________________________________________");
        System.out.println("\uD83D\uDCA4 Necessidade de sono atual: " + jogador.getNecessidadeSono());
        System.out.println("\uD83C\uDF7D\uFE0F Necessidade de refeição atual: " + jogador.getNecessidadeRefeicao());
        System.out.println("\uD83C\uDF96\uFE0F Estatuto atual: " + jogador.getEstatuto());
        System.out.println("____________________________________________________________");
    }


    /**
     * Método resultado final do Jogo
     *
     * @param jogador
     */
    public void resultadoJogo(Jogador jogador) throws FileNotFoundException, InterruptedException {

        String objetivo = String.valueOf(jogador.getObjetivoVida()); // busca o objetivo de vida do jogador

        if (jogador.getDinheiro() >= 0) { //Se o jogador não possui dívidas

            switch (objetivo) {
                case "MILIONARIO":

                    // Verificar Patrimonio Total
                    double valorTotalPropriedades = 0;
                    ArrayList<Propriedade> propriedadesAtuaisJogador = jogador.getPropriedades(); // O array propriedadesAtuaisJogador vai buscar as propriedades por meio do get

                    if (!propriedadesAtuaisJogador.isEmpty()) { // Se o array não estiver vazio
                        for (Propriedade propriedade : propriedadesAtuaisJogador) { // Itera o array de propriedadesAtuaisJogador
                            valorTotalPropriedades += propriedade.getCusto(); // Pega o custo de cada propriedade e acrescenta no valor Total
                        }
                        jogador.setDinheiro(jogador.getDinheiro() + valorTotalPropriedades); // Soma o dinheiro mais o valor das propriedades
                    }

                    //Confirmar se atingiu objetivo
                    if (jogador.getDinheiro() > 1000000) {
                        System.out.println("\n\uD83C\uDF89 UHUUU!!! Você alcançou seu objetivo de ser " + objetivo);
                        System.out.println("Parabéns! Você VENCEU!!!");
                    } else {
                        System.out.println("\nVocê PERDEU!!!\nInfelizmente você não alcançou seu objetivo de ser " + objetivo);
                        System.out.println("Tente mais uma vez!");
                        fimJogo(jogador);
                    }
                    break;

                case "FAMILIA_COMPLETA":
                    if (jogador.getFamilia().size() >= 5) {
                        System.out.println("\n\uD83C\uDF89 UHUUU!!! Você alcançou seu objetivo de ser " + objetivo);
                        System.out.println("Parabéns! Você VENCEU!!!");
                    } else {
                        System.out.println("\nVocê PERDEU!!!\nInfelizmente você não alcançou seu objetivo de ser " + objetivo);
                        System.out.println("Tente mais uma vez!");
                        fimJogo(jogador);
                    }
                    break;

                case "CELEBRIDADE":
                    if (jogador.getEstatuto() > 950) {
                        System.out.println("\n\uD83C\uDF89 UHUUU!!! Você alcançou seu objetivo de ser " + objetivo);
                        System.out.println("Parabéns! Você VENCEU!!!");
                    } else {
                        System.out.println("\nVocê PERDEU!!!\nInfelizmente você não alcançou seu objetivo de ser " + objetivo);
                        System.out.println("Tente mais uma vez!");
                        fimJogo(jogador);
                    }
                    break;

                case "PROFESSOR_HOGWARTS":
                    if ("Professor em Hogwards".equals(jogador.getProfissaoAtual().getNome())) {
                        System.out.println("\n\uD83C\uDF89 UHUUU!!! Você alcançou seu objetivo de ser " + objetivo);
                        System.out.println("Parabéns! Você VENCEU!!!");
                    } else {
                        System.out.println("\nVocê PERDEU!!!\nInfelizmente você não alcançou seu objetivo de ser " + objetivo);
                        System.out.println("Tente mais uma vez!");
                        fimJogo(jogador);
                    }
                    break;

                case "DIRETOR_HOGWARTS":
                    if ("Diretor de Hogwarts".equals(jogador.getProfissaoAtual().getNome())) {
                        System.out.println("\n\uD83C\uDF89 UHUUU!!! Você alcançou seu objetivo de ser " + objetivo);
                        System.out.println("Parabéns! Você VENCEU!!!");
                    } else {
                        System.out.println("\nVocê PERDEU!!!\nInfelizmente você não alcançou seu objetivo de ser " + objetivo);
                        System.out.println("Tente mais uma vez!");
                        fimJogo(jogador);
                    }
                    break;

                case "MINISTRO_DA_MAGIA":
                    if ("Ministro da Magia".equals(jogador.getProfissaoAtual().getNome())) {
                        System.out.println("\n\uD83C\uDF89 UHUUU!!! Você alcançou seu objetivo de ser " + objetivo);
                        System.out.println("Parabéns! Você VENCEU!!!");
                    } else {
                        System.out.println("\nVocê PERDEU!!!\nInfelizmente você não alcançou seu objetivo de ser " + objetivo);
                        System.out.println("Tente mais uma vez!");
                        fimJogo(jogador);
                    }
                    break;

                case "JOGADOR_QUADRIBOL":
                    if ("Jogador de quadribol".equals(jogador.getProfissaoAtual().getNome())) {
                        for (Propriedade propriedade : jogador.getPropriedades()) {
                            if ("Firebolt".equals(propriedade.getNomePropriedade())) { // Tem que tr uma Firebolt
                                System.out.println("\n\uD83C\uDF89 UHUUU!!! Você alcançou seu objetivo de ser " + objetivo);
                                System.out.println("Parabéns! Você VENCEU!!!");
                            }
                        }
                    } else {
                        System.out.println("\nVocê PERDEU!!!\nInfelizmente você não alcançou seu objetivo de ser " + objetivo);
                        System.out.println("Tente mais uma vez!");
                        fimJogo(jogador);
                    }
                    break;
            }
        } else { //Se o jogador possui dívidas - PERDE
            System.out.println("Você PERDEU!!!\nInfelizmente você deixou uma grande dívida no Banco Gringotes e os anões vieram buscar todos os seus bens.");
            System.out.println("Não tentes escapar ou, além de pobre, vais parar na Prisão de Azkaban.");
        }

    }


    /**
     * Método para reiniciar o jogo
     *
     * @param jogador
     * @throws FileNotFoundException
     * @throws InterruptedException
     */
    public void fimJogo(Jogador jogador) throws FileNotFoundException, InterruptedException {

        Scanner input = new Scanner(System.in);
        String reiniciar, trocaPersonagem;

        do {
            System.out.print("Deseja jogar novamente? (S/N): ");
            reiniciar = input.next();

            if (reiniciar.equalsIgnoreCase("S")) { // Quer jogar mais

                do {
                    System.out.print("Deseja trocar de Personagem? (S/N): ");
                    trocaPersonagem = input.next();
                    if (trocaPersonagem.equalsIgnoreCase("S")) { // Troca de Personagem
                        PlayerView.menuEntrada();
                    } else if (reiniciar.equalsIgnoreCase("N")) { // Não troca de personagem
                        jogo(jogador);
                    } else { // Repete a opção caso não seja inserida a resposta correta S ou N
                        System.out.println("____________________________________________________________");
                        System.out.println("\nResposta inválida bruxinho(a)! Tente S ou N");
                        System.out.println("____________________________________________________________");
                    }
                } while (!reiniciar.equalsIgnoreCase("S") && !reiniciar.equalsIgnoreCase("N")); // O ciclo só acaba quando inserida a resposta correta S ou N

            } else if (reiniciar.equalsIgnoreCase("N")) { // Não quer jogar mais
                System.out.println("____________________________________________________________");
                System.out.println("\nObrigada por jogar!! \nEspero você em uma próxima aventura!");
                return;
            } else { // Repete a opção caso não seja inserida a resposta correta S ou N
                System.out.println("____________________________________________________________");
                System.out.println("\nResposta inválida bruxinho(a)! Tente S ou N");
                System.out.println("____________________________________________________________");
            }
        } while (!reiniciar.equalsIgnoreCase("S") && !reiniciar.equalsIgnoreCase("N")); // O ciclo só acaba quando inserida a resposta correta S ou N

    }


    /**
     * Método das ações diárias do Sim
     */
    public void acaoDiaria(Jogador jogador) throws FileNotFoundException, InterruptedException {

        Shopping shopping = new Shopping();
        ArrayList<Profissao> listaProfissoes = criarListaProfissoes();

        Scanner input = new Scanner(System.in);

        String acao;

        System.out.println();
        System.out.println("1. Ir trabalhar");
        System.out.println("2. Dormir");
        System.out.println("3. Ter uma refeição");
        System.out.println("4. Jogar / Assistir Quadribol");
        System.out.println("5. Ir às compras");
        System.out.println("6. Ter formação");
        System.out.println("7. Ver as minhas propriedades");
        System.out.println("8. Procurar nova profissão");

        System.out.print("\nQual das ações acima deseja realizar? ");
        acao = input.next();

        switch (acao) {

            case "1": // Caso a ação escolhida seja ir trabalhar
                if (jogador.getProfissaoAtual() == null) {  //Caso o jogador ainda não tenha um profissão (NULL)
                    System.out.println("\nVocê ainda não tem uma profissão. Que tal começar como um Aluno de Hogwarts?!");
                    System.out.println("Escolha esta opção e vamos avançar!");
                    procurarProfissao(jogador); // Acede o método de procurar profissão
                } else { // Caso já tenha profissão
                    Profissao profissaoAtual = jogador.getProfissaoAtual(); // Profissão atual do jogador
                    jogador.setDinheiro(jogador.getDinheiro() + profissaoAtual.getSalarioDia()); // o dinheiro muda para o valor do dinheiro atual +  salário/dia
                    System.out.println("\n- Você optou por ir trabalhar. \nVamos lá fazer alguns Galeões!!");
                    System.out.println("\n____________________________________________________________");
                    System.out.println("\uD83D\uDCB5 Dinheiro atual: " + jogador.getDinheiro() + " Galeões");
                    System.out.println("____________________________________________________________");
                }
                break;

            case "2": // Caso a ação escolhida seja dormir
                jogador.setNecessidadeSono(100); //repõe a necessidade de sono de volta a 100
                System.out.println("\n- Você optou por ir dormir. \nNinguém é de ferro, vá descansar um pouco!!");
                System.out.println("\n____________________________________________________________");
                System.out.println("\n\uD83D\uDCA4 Necessidade do sono atual: " + jogador.getNecessidadeSono());
                System.out.println("____________________________________________________________");
                break;

            case "3": // Caso a ação escolhida seja Ter uma refeição
                jogador.setNecessidadeRefeicao(100); // repõe a necessidade de refeição de volta a 100
                jogador.setDinheiro(jogador.getDinheiro() - 5); // e diminui 5 dinheiros.
                System.out.println("\n- Você optou por ter uma refeição. \nVá ao caldeirão pegar sua comida mágica!!");
                System.out.println("\n____________________________________________________________");
                System.out.println("\n\uD83C\uDF7D\uFE0F Necessidade de refeição atual: " + jogador.getNecessidadeRefeicao());
                System.out.println("\uD83D\uDCB5 Dinheiro atual: " + jogador.getDinheiro() + " Galeões");
                System.out.println("____________________________________________________________");
                break;

            case "4": // Caso a ação escolhida seja socializar
                jogador.setNecessidadeSocial(100); // repõe a necessidade social de volta a 100
                System.out.println("\n- Você optou por socializar. \nCorra ou vai perder o jogo!!");
                System.out.println("\n____________________________________________________________");
                System.out.println("\n\uD83C\uDFC6 Necessidade social atual: " + jogador.getNecessidadeSocial());
                System.out.println("____________________________________________________________");
                break;

            case "5": // Caso a ação escolhida seja Ir às compras
                shopping.vender(jogador); // invoca o método vender de shopping
                break;

            case "6": // Caso a ação escolhida seja Ter formação
                jogador.setEducacao(jogador.getEducacao() + 2); // aumenta a educação em 2
                System.out.println("\n- Você optou por ter formação. \nVamos lá aprender alguma coisa nova!!");
                System.out.println("\n____________________________________________________________");
                System.out.println("\n\uD83D\uDCD6 Nível de educação atual: " + jogador.getEducacao());
                System.out.println("____________________________________________________________");
                break;

            case "7": //Caso a ação escolhida seja Visitar as propriedades
                ArrayList<Propriedade> propriedadesAtuaisJogador = jogador.getPropriedades(); // O array propriedadesAtuaisJogador vai buscar as propriedades por meio do get

                if (propriedadesAtuaisJogador.isEmpty()) { // Se o tamanho do array for igual a 0 (propriedadesAtuaisJogador.size()==0) Ou estar vazio
                    System.out.println("\nVocê ainda não possui nenhuma propriedade! Tens de investir em uma.");
                } else { // Caso tenha propriedades
                    System.out.println("\n\uD83C\uDFE6 Suas propriedades: ");
                    for (Propriedade propriedade : propriedadesAtuaisJogador) { // Itera o array de propriedadesAtuaisJogador
                        propriedade.exibirDetalhes(); // Método exibir detalhes das propriedades
                    }
                }
                break;

            case "8": //Caso a ação escolhida seja Procurar nova profissão
                System.out.println("\n- Você optou por procurar uma nova profissão. \nBoa sorte!!");
                procurarProfissao(jogador); // invoca o método procurarProfissão
                break;
        }
    }


    /**
     * Método dos ciclos diários (Manhã, meio-dia, tarde, noite)
     */
    public void cicloDiario(Jogador jogador) throws FileNotFoundException, InterruptedException {

        Scanner input = new Scanner(System.in);

        for (int dia = 1; dia <= 100; dia++) {   // Ciclo de 100 dias
            sleep(1200);
            System.out.println("\n\n***************************************   Dia " + dia + ":   **************************************");
            System.out.println();
            System.out.println("__________________________________________________________________________________________________");
            jogador.exibirNecessidades();
            System.out.println("__________________________________________________________________________________________________");


            switch (dia) {
                case 2: // Sorteio das Casas
                    System.out.println("\n\uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8  \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 ");
                    sorteioCasas(jogador); // Método Sorteio casas
                    break;

                case 5: // Escolhe se quer ir pra outra Escola
                    System.out.println("\n\uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8  \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 ");
                    workshop(jogador); // Método workshop
                    break;

                case 22: // escolhe se quer casar
                    System.out.println("\n\uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8  \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 ");
                    casar(jogador); // invoca o metodo casar
                    break;

                case 37: // escolhe se quer assistir a Copa de Quadribol
                    System.out.println("\n\uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8  \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 ");
                    copaQuadribol(jogador);
                    break;

                case 60: // Escolhe sobre filhos
                    System.out.println("\n\uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8  \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 ");
                    terFilhos(jogador);
                    break;

                case 78: // escolhe se quer duelar
                    System.out.println("\n\uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8  \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 \uD83D\uDEA8 ");
                    dueloFinal(jogador); // Método duelo final
                    break;
            }

            segurancaSocial(jogador); // Chama o método para averiguar a condição de dívidas

            for (int momentoDia = 1; momentoDia <= 4; momentoDia++) { // Ciclo dos momentos do dia (4 momentos)
                switch (momentoDia) {
                    case 1:
                        System.out.println("\n☀\uFE0F Manhã ☀\uFE0F");
                        System.out.println("\nBom dia!! Qual ação desejar fazer pela manhã?");
                        acaoDiaria(jogador);
                        necessidadesJogador(jogador);
                        break;

                    case 2:
                        System.out.println("\n\n\uD83D\uDD55 Meio-dia \uD83D\uDD55");
                        System.out.println("\nWow, já são 12h!! Preciso correr... Qual ação desejar fazer agora?");
                        acaoDiaria(jogador);
                        necessidadesJogador(jogador);
                        break;

                    case 3:
                        System.out.println("\n\n\uD83C\uDF05 Tarde \uD83C\uDF05");
                        System.out.println("\nO tempo está voando como uma Firebolt!! Qual ação desejar fazer agora pela tarde?");
                        acaoDiaria(jogador);
                        necessidadesJogador(jogador);
                        break;

                    case 4:
                        System.out.println("\n\n\uD83C\uDF03 Noite \uD83C\uDF03");
                        System.out.println("\nFenix!! Precisas de um vira-tempo para lidar com tudo isto em um dia.\nQual ação desejar fazer à noite?");
                        acaoDiaria(jogador);
                        necessidadesJogador(jogador);
                        break;

                    default:
                        System.out.println("\nOpção inválida... Tente outra vez!");
                }
            }

            jogador.setNecessidadeSono(jogador.getNecessidadeSono() - 25); // a cada iteração do ciclo, a necessidade sono diminui 25 pontos,
            jogador.setNecessidadeRefeicao(jogador.getNecessidadeRefeicao() - 20);// a necessidade refeição diminui 20 pontos
            jogador.setNecessidadeSocial(jogador.getNecessidadeSocial() - 15);// e a necessidade social diminui 15 pontos.

        }
        resultadoJogo(jogador);
        fimJogo(jogador);
    }


    /**
     * Método jogo (Menu principal Jogo)
     *
     * @throws FileNotFoundException
     * @throws InterruptedException
     */
    public void jogo(Jogador jogador) throws FileNotFoundException, InterruptedException {

        Scanner input = new Scanner(System.in);

        int opcao;
        sleep(1000);
        do {
            System.out.println("\n1. Iniciar jornada ");
            System.out.println("2. Trocar de Personagem");
            System.out.println("0. Sair");
            //   sleep(1500);
            System.out.print("\nPreparado?! Vamos começar: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1: // Iniciar ciclo
                    System.out.println("\n_____________________________________________________________________________________");
                    System.out.println("\nOlá " + jogador.getNomePersonagem() + ",\n");
                    System.out.println("Estes são seus dados: ");
                    jogador.exibirDetalhes();
                    cicloDiario(jogador);
                    break;

                case 2: // Criar outro personagem
                    Jogador jogador1 = criarPessoa();  // Instancia um novo jogador chamando o Método criar pessoa
                    break;


                case 0: // Sair do jogo
                    sleep(2000);
                    System.out.println("\n\nAh, já vais??... É uma pena!!");
                    sleep(1200);
                    System.out.println("\n\nPodíamos correr atrás de mais pomos dourados por aí ou conjurar feitiços proibidos (shhhh!!)\n");
                    System.out.println("Mas fica para uma próxima. Vou preparar nossa próxima aventura para quando voltares.");
                    sleep(2000);
                    System.out.println("\n\n\n********   Incendium   ********\n\n\n\n");
                    break;
            }

        } while (opcao != 0);
    }
}

