package Ex_06;
public class Competicao {
    String nomeCompeticao;
    String paisRealizacao;
    private Atleta[] listaAtletas;  //Criar uma lista de atletas que armazena um conjunto de objetos Atleta num array

    public Competicao(String nomeCompeticao, String paisRealizacao) {  //Método construtor
        this.nomeCompeticao = nomeCompeticao;
        this.paisRealizacao = paisRealizacao;
        this.listaAtletas = new Atleta[12];  //Delimita o tamanho do array para 12
    }

    //Crie métodos para adicionar atletas
    public void addAtleta(Atleta novoAtleta) { // leva como parametro o atleta a ser adicionado
        for (int i = 0; i < this.listaAtletas.length; i++) {
            if (this.listaAtletas[i] == null) { // se o array em determinada posição estiver vazio
                this.listaAtletas[i] = novoAtleta; // essa posição recebe um Atleta
                return; // break para não preencher as proximas posições que também vão estar vazias (nulas)
            }
        }
    }
    public void listarAtletas() {
        for (int i = 0; i < this.listaAtletas.length; i++) { // entrar no array
            if (this.listaAtletas[i] != null) { // se a posição do array for diferente de nula para não exibir todos os nulos pra frente que ainda estão vagos
                this.listaAtletas[i].exibirDetalhesAtleta(); // exibe os detalhes apenas dos preenchidos
            }
        }
    }

    //Crie um método para imprimir as informações de uma competição, inclusive a lista de atletas
    public void imprimirDetalhesCompeticao() {
        System.out.println("\n******************************   COMPETIÇÃO    ******************************\n");
        System.out.println("Competição: " + this.nomeCompeticao);
        System.out.println("País de Realização: " + this.paisRealizacao);
        System.out.println("\nLista de atletas: ");
        listarAtletas();
    }
}
