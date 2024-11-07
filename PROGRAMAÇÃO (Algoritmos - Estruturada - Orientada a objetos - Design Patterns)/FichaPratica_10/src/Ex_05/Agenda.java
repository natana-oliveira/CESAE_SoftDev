package Ex_05;

public class Agenda {

    private Pessoa[] agenda;  //Criar uma classe chamada "Agenda" que armazena um conjunto de objetos Pessoa num array

    public Agenda() {  //Método construtor
        this.agenda = new Pessoa[100];  //Delimita o tamanho do array para 100
    }

    //método para adicionar novas pessoas
    public void addPessoa(Pessoa pessoaNova) { // leva como parametro uma pessoa nova a ser adicionada
        for (int i = 0; i < this.agenda.length; i++) { //ciclo pro array que tem o tamanho da agenda
            if (this.agenda[i] == null) { // se o array agenda em determinada posição estiver vazio
                this.agenda[i] = pessoaNova; // essa posição recebe uma pessoa nova
                return; // break para não preencher as proximas posições que também vão estar vazias (nulas)
            }
        }
    }

    //método para listar todas as pessoas registadas.
    public void listarAgenda() {

        for (int i=0; i<this.agenda.length; i++) { // entrar no array
            if(this.agenda[i]!=null){ // se a posição do array for diferente de nula para não exibir todos os nulos pra frente que ainda estão vagos
                this.agenda[i].exibirDetalhes(); // exibe os detalhes apenas dos preenchidos
            }
        }

    }

}
