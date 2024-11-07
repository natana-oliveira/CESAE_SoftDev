package TrabalhoPratico_PE;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PE_natanaOliveira {

    /**
     * Método que retorna o número de linhas totais de um ficheiro
     *
     * @param caminhoFicheiro
     * @return Número total de Linhas
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado
     */
    public static int contarLinhasFicheiro(String caminhoFicheiro) throws FileNotFoundException {

        File ficheiro = new File(caminhoFicheiro);
        Scanner fileScanner = new Scanner(ficheiro);

        int contagemLinhas = 0;

        while (fileScanner.hasNextLine()) {
            fileScanner.nextLine(); //Anda a linha pra frente
            contagemLinhas++; //Adiciona a linha a contagem das linhas
        }

        return contagemLinhas; //retorna a contagem das linhas total (com o cabeçalho)
    }

    /**
     * Método que retorna o número de colunas totais de um ficheiro
     *
     * @param caminhoFicheiro
     * @param delimitador
     * @return Número total de colunas
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado
     */
    public static int contarColunasFicheiro(String caminhoFicheiro, String delimitador) throws FileNotFoundException {

        File ficheiro = new File(caminhoFicheiro);
        Scanner fileScanner = new Scanner(ficheiro);

        int contagemColunas = 0;

        String linha = fileScanner.nextLine(); //Grava a linha na primeira linha do ficheiro
        String[] itensDaLinha = linha.split(delimitador); //Transformar a linha em array de acordo com delimitador

        contagemColunas = itensDaLinha.length; //O números de colunas é igual o tamanho do array

        return contagemColunas;
    }

    /**
     * Método que armazena numa matriz o conteudo de um ficheiro
     *
     * @param caminhoFicheiro
     * @return Matriz String[][] preenchida com o conteudo
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado
     */
    public static String[][] lerFicheiroParaMatriz(String caminhoFicheiro) throws FileNotFoundException {

        File ficheiro = new File(caminhoFicheiro);
        Scanner fileScanner = new Scanner(ficheiro);

        // Contar numero de linhas do ficheiro que recebeu como parametro (-1 que é excluindo o cabecalho)
        int numeroLinhas = (contarLinhasFicheiro(caminhoFicheiro)) - 1;

        // Contar número de colunas do ficheiro
        int numeroColunas = contarColunasFicheiro(caminhoFicheiro, ";"); //É preciso definir o delimitador

        // Declarar uma matriz com o tamanho adequado
        String[][] matrizTotal = new String[numeroLinhas][numeroColunas];

        String linhaAtual = fileScanner.nextLine(); //Guardar a linha do cabeçalho
        int linhaMatriz = 0;

        while (fileScanner.hasNextLine()) {
            linhaAtual = fileScanner.nextLine(); //Avançar a linha do cabeçalho e pegar a proxima
            String[] itensDaLinha = linhaAtual.split(";");

            for (int i = 0; i < itensDaLinha.length; i++) {  //A linha vai passar a frente
                matrizTotal[linhaMatriz][i] = itensDaLinha[i];
            }
            linhaMatriz++;  //Soma uma linha na matriz
        }

        return matrizTotal;
    }


    // *************************************************
    // INICIO DAS FUNÇÕES DO MENU DO ADMINISTRADOR

    /**
     * Método para imprimir uma matriz na consola
     *
     * @param matriz a imprimir
     */
    public static void imprimirMatrizConsola(String[][] matriz) {

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t|\t");
            }
            System.out.println();
        }
    }

    /**
     * Método para calcular valor das vendas
     *
     * @param matrizTotal
     * @return total de vendas
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado
     */
    public static double valorTotalVendas(String[][] matrizTotal) throws FileNotFoundException {

        matrizTotal = lerFicheiroParaMatriz("src/TrabalhoPratico_PE/GameStart_V2.csv");

        double valor, totalVendas = 0;

        for (int linha = 0; linha < matrizTotal.length; linha++) {
            valor = Double.parseDouble(matrizTotal[linha][8]); //O valor é igual a primeira linha matriz na coluna Vetor [8]
            totalVendas += valor; //O valor passar a somar as próximas linhas
        }
        return totalVendas;
    }

    /**
     * Método que calcula o lucro de vendas 20%)
     *
     * @param valorTotalVendas
     * @return o lucro
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado
     */
    public static double lucroTotal(double valorTotalVendas) throws FileNotFoundException {

        String[][] matrizTotal = lerFicheiroParaMatriz("src/TrabalhoPratico_PE/GameStart_V2.csv");

        double lucro;

        lucro = valorTotalVendas(matrizTotal) * 0.2; //Puxar a função do calculo de vendas que já está feita

        return lucro;
    }

    /**
     * Método para pesquisar Cliente
     *
     * @param matrizTotal
     * @param idCliente
     * @throws FileNotFoundException - Caso o ficheiro não seja encontrado
     */
    public static void pesquisarCliente(String[][] matrizTotal, String idCliente) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        matrizTotal = lerFicheiroParaMatriz("src/TrabalhoPratico_PE/GameStart_V2.csv");

        int contador = 0; //contador é 1 para os registros de cliente repetidos não aparecerem

        // verificar se na linha encontra uma palavra igual na coluna 2 (vetor[1])
        for (int linha = 0; linha < matrizTotal.length; linha++) {

            //Comparar os itens do vetor[1] com o idCliente
            if (matrizTotal[linha][1].equals(idCliente) && contador == 0) { //o contador tem que ser igual a 1, caso seja diferente ele não entra no ciclo e não imprime
                System.out.println("\nNome do Cliente: " + matrizTotal[linha][2] + "\t|\t" + "Contacto: " + matrizTotal[linha][3] + "\t|\t" + "E-mail: " + matrizTotal[linha][4]);
                contador++;
            }
        }
        if (Integer.parseInt(idCliente) > 125) {
            System.out.println("\nCliente não encontrado. Tente outra vez");
        }
    }

    /**
     * Método para encontrar o jogo mais caro
     *
     * @param matrizTotal
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado
     */
    public static String jogoMaisCaro(String[][] matrizTotal) throws FileNotFoundException {

        matrizTotal = lerFicheiroParaMatriz("src/TrabalhoPratico_PE/GameStart_V2.csv");

        double valorJogo = 0, jogoMaisCaro = 0;
        String nomeJogo = "", nomeJogoMaisCaro = "";

        for (int linha = 0; linha < matrizTotal.length; linha++) { //Entra na matriz
            valorJogo = Double.parseDouble(matrizTotal[linha][8]); //O valor dos jogos está no vetor [8]
            nomeJogo = matrizTotal[linha][7];

            //Se o valor do jogo for maior que o jogo mais caro
            if (valorJogo > jogoMaisCaro) {
                jogoMaisCaro = valorJogo;// Atualiza o valor mais caro
                nomeJogoMaisCaro = nomeJogo; // Ligar o nome do jogo mais caro ao valor maior
            }
        }
        System.out.println("\nJogo mais caro: " + nomeJogoMaisCaro + "\t|\t" + "Valor: " + jogoMaisCaro);
        return nomeJogoMaisCaro;
    }

    /**
     * Método para imprimir os compradores do jogo mais caro
     *
     * @param nomeJogoMaisCaro
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado
     */
    public static void compradorJogoMaisCaro(String nomeJogoMaisCaro) throws FileNotFoundException {

        String[][] matrizTotal = lerFicheiroParaMatriz("src/TrabalhoPratico_PE/GameStart_V2.csv");

        String linhaJogoMaisCaro = ""; //comparar com a linha

        for (int i = 0; i < matrizTotal.length; i++) {
            if (matrizTotal[i][7].equals(nomeJogoMaisCaro)) { //comparar os itens das linhas (na coluna nome do jogo ([vetor7])) com o nome do jogo mais caro
                linhaJogoMaisCaro += matrizTotal[i][2] + "\t|\t"; //Associar a linha com a coluna nome do cliente (vetro[2]) e somar caso tenham repetidos
            }
        }
        System.out.println("\nCompradores: " + (linhaJogoMaisCaro));
    }


    /**
     * Método para apresentar o Menu do Administrador
     */
    public static void menuAdministrador() throws FileNotFoundException {

        String[][] matrizTotal = lerFicheiroParaMatriz("src/TrabalhoPratico_PE/GameStart_V2.csv");

        Scanner input = new Scanner(System.in);
        int menuAdm;

        do {
            System.out.println("\n\n*****************************************");
            System.out.println("******  ADMINISTRADOR, Bem vindo!  ******");
            System.out.println("*****************************************\n");
            System.out.println("Escolha uma das opções abaixo\n");
            System.out.println("1. Imprimir o relatório");
            System.out.println("2. Imprimir total de vendas e o valor total");
            System.out.println("3. Imprimir o calculo total de lucro (20% de lucro em cada jogo)");
            System.out.println("4. Pesquisar informações associadas a um cliente");
            System.out.println("5. Imprimir o jogo mais caro e os clientes que o compraram");
            System.out.println("0. Sair do menu Administrador");

            System.out.print("\nSelecione a opção desejada: ");
            menuAdm = input.nextInt();

            switch (menuAdm) {

                case 1: // Imprimir o relatório na consola
                    System.out.println("\n\n********  Imprimir relatório de vendas  ********\n");
                    imprimirMatrizConsola(matrizTotal);
                    break;

                case 2: // Imprimir quantas vendas foram executadas e o seu valor total
                    System.out.println("\n********  Imprimir quantas vendas foram executadas e o seu valor total  ********");
                    System.out.println("\nVendas executadas: " + (contarLinhasFicheiro("src/TrabalhoPratico_PE/GameStart_V2.csv") - 1)); //-1 linha do cabeçalho
                    System.out.println("Valor total das vendas: " + (valorTotalVendas(matrizTotal)) + " EUR"); //puxar a função de valorTotal
                    break;

                case 3: // Imprimir o calculo total de lucro (20% de lucro em cada jogo)
                    System.out.println("\n\n********  Imprimir o calculo total de lucro  ********\n");
                    System.out.println("Valor total de lucro: " + lucroTotal(valorTotalVendas(matrizTotal)) + " EUR"); //puxar a função de lucro
                    break;

                case 4: // Dado um idCliente, imprima todas as informações associadas a esse cliente (nome, contacto, email)
                    System.out.println("\n\n********  Pesquisar informações associadas a um cliente  ********\n");
                    System.out.print("\nInsira a idCliente: ");
                    input.nextLine();
                    String idCliente = input.nextLine();

                    pesquisarCliente(matrizTotal, idCliente);
                    break;

                case 5: // Imprimir o jogo mais caro e os clientes que o compraram
                    System.out.println("\n\n********  Imprimir o jogo mais caro e os clientes que o compraram  ********\n");
                    //  jogoMaisCaro(matrizTotal);   NÃO É PRECISO - pois a função compradorJogoMaisCaro já imprime esta
                    String JogoMaisCaro = jogoMaisCaro(matrizTotal);
                    compradorJogoMaisCaro(JogoMaisCaro);
                    break;

                case 0:
                    System.out.println("\nCaro ADMIN, \nobrigado por utilizar os serviços da GameStart!!\nAté a proxima!");
                    break;

                default:
                    System.out.println("\nOpção inválida... Tente outra vez!");
            }
        } while (menuAdm != 0);
    }


    // INICIO DAS FUNÇÕES DO MENU DO CLIENTE

    /**
     * Método para registar Clientes
     */
    public static void registarCliente() {

        String nome, contacto, email;
        Scanner input = new Scanner(System.in);

        System.out.print("Insira seu nome: ");
        nome = input.nextLine();

        System.out.print("Insira seu contacto: ");
        contacto = input.next();

        System.out.print("Insira seu email: ");
        email = input.next();

        System.out.println("\n\n****** CLIENTE INSERIDO COM SUCESSO!! ******\n\nSeja muito bem vindo(a):\n" + nome + "  |  " + contacto + "  |  " + email + "\n\n");
    }

    /**
     * Método para encontrar os lugares de estacionamento que são números triangulares e divisiveis por 5 até 121
     *
     * @param numeroLugares
     * @return os números triangulares divisiveis por 5 (até 121)
     */
    public static int lugaresVagos(int numeroLugares) {

        int somatorio = 0, contador = 1; //o somatorio corresponde aos números triangulares
        numeroLugares = 121;

        while (somatorio < numeroLugares) { //o numero de lugares é o limite para fechar o ciclo
            somatorio += contador;
            contador++;

            //se o somatorio (números triangulares) forem igual ou menor que o número limite de lugares
            //e se também forem divisíveis por 5
            if (somatorio <= numeroLugares && somatorio % 5 == 0) {
                System.out.println(somatorio);
            }
        }
        // Método que avalia se um número é triangular

        return somatorio;
    }


    /**
     * Método para imprimir todos os jogos
     *
     * @param matrizTotal
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado
     */
    public static void imprimirTituloJogos(String[][] matrizTotal) throws FileNotFoundException {

        matrizTotal = lerFicheiroParaMatriz("src/TrabalhoPratico_PE/GameStart_V2.csv");

        int contador = 0; // O contator conta quantas vezes os jogos estão na matriz
        String jogoAtual;  //para comparar os jogos e guardar os titulos

        for (int linha = 0; linha < matrizTotal.length; linha++) { // percorre todas as linhas da matriz
            jogoAtual = matrizTotal[linha][7]; //compara o jogoAtual com o jogo das linhas no vetor [7]
            for (int i = 0; i < linha; i++) { // percorre novamente as linhas para comparar os nomes dos jogos com as linhas anteriores
                if (jogoAtual.equals(matrizTotal[i][7])) { // se o jogo atual for igual ao da matriz no vetor[7]
                    contador++;  // caso seja igual nas duas linhas o contador aumenta se encontrar outro jogo igual
                }
            }
            if (contador == 0) { // se o contador for igual a 0, o jogo só aparece uma vez na matriz (retira os repetidos)
                System.out.println(jogoAtual); // imprimi o jogo na lista
            }
        }
    }

    //Tentativa Ex. 4 Cliente
/*
    public static void imprimirCategoriasJogos(String[][] matrizTotal) throws FileNotFoundException {

        matrizTotal = lerFicheiroParaMatriz("src/TrabalhoPratico_PE/GameStart_V2.csv");

        Scanner input = new Scanner(System.in);

        String editora;

        System.out.println("\nInsira a editora desejada: ");
        editora = input.next();

        //1. criar um array auxiliar e gravar todas as categorias da editora
        String[] categoria = new String[matrizTotal.length];

        for (int linha = 0; linha < matrizTotal.length; linha++) {
            if (matrizTotal[linha][6].equals(categoria)) { //Percorre o array para evitar repetições
                System.out.println(categoria[linha]); //imprimir o array categoria

        //2. imprimir os jogos da editora e do array categoria [i]

*/

    /**
     * Método para apresentar o Menu do Cliente
     *
     * @throws FileNotFoundException
     */
    public static void menuCliente() throws FileNotFoundException {

        String[][] matrizTotal = lerFicheiroParaMatriz("src/TrabalhoPratico_PE/GameStart_V2.csv");

        Scanner input = new Scanner(System.in);
        int menuCliente;

        do {
            System.out.println("\n\n*****************************************");
            System.out.println("*********  CLIENTE, Bem vindo!  *********");
            System.out.println("*****************************************\n");
            System.out.println("Escolha uma das opções abaixo\n");
            System.out.println("1. Registar cliente ");
            System.out.println("2. Procurar estacionamento");
            System.out.println("3. Imprimir todos os títulos de jogos");
            System.out.println("4. Imprimir todas as categorias e os respetivos jogos de uma editora");
            System.out.println("0. Sair do menu Cliente");

            System.out.print("\nSelecione a opção desejada: ");
            menuCliente = input.nextInt();

            switch (menuCliente) {

                case 1: //Registar cliente
                    System.out.println("\n\n********  Registar cliente  ********\n");
                    registarCliente();
                    break;

                case 2: // Procurar estacionamento
                    System.out.println("\n\n********  Procurar vagas de estacionamento  ********\n");
                    int numeroLugares = 121;
                    System.out.println("Os lugares de estacionamento vagos são: ");
                    lugaresVagos(numeroLugares);
                    System.out.println();
                    break;

                case 3: // Imprimir todos os títulos de jogos
                    System.out.println("\n\n********  Imprimir todos os títulos de jogos  ********\n");
                    imprimirTituloJogos(matrizTotal);
                    System.out.println();
                    break;

                case 4: // Imprimir todas as categorias e os respetivos jogos de uma editora
                    System.out.println("\n\n********  Imprimir todas as categorias e os respetivos jogos de uma editora  ********\n");
                    System.out.println("\n:(\nInfelizmente essa opção não está disponível no momento.\nAgradecemos seu interesse e tente novamente mais tarde!");
                    break;

                case 0:
                    System.out.println("\nCaro CLIENTE, \nobrigado por utilizar os serviços da GameStart!!\nAté a proxima!");
                    break;

                default:
                    System.out.println("\nUpppss!!\nOpção inválida... Tente outra vez!");
            }
        }
        while (menuCliente != 0);
    }


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

                    if (passwordInserida == passwordAdm) {
                        menuAdministrador();  //Entra no menu ADMIN
                    }

                    while (passwordInserida != passwordAdm && tentativas < 3) { //se a pass for diferente e menor que 3 tentativas entra no ciclo
                        System.out.print("\n\nPASSWORD INCORRETA!!! Tente novamente. \n\nPASSWORD: ");
                        passwordInserida = input.nextInt();
                        tentativas++; //As tentativas somam
                        System.out.println("tentativas: " + tentativas);

                        if (passwordInserida == passwordAdm) {
                            menuAdministrador();  //Entra no menu ADMIN
                        }

                        if (tentativas == 3) { //Na terceira tentativa a conta é bloqueada
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











