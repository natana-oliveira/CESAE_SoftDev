package Ex_01;

import java.util.ArrayList;

public class MusicPlayer {

    private ArrayList<Musica> programacao;  // criação do array objeto (Programação) tipo de dados (Musica)

    public MusicPlayer() { //Método contrutor (select none quando for construir)
        this.programacao = new ArrayList<>();
    }

    // Método para adicionar músicas ao ArrayList
    public void addMusica(Musica musicaNova) { //Recebe como parametro um tipo de musica chamado musica nova
        this.programacao.add(musicaNova);  //nomeDoArray.add(o que sera adicionado)
    }

    // Método para remover músicas ao ArrayList 1
    public void removeMusica(Musica musica) {
        this.programacao.remove(musica); //nomeDoArray.remove(o que sera retirado, neste caso o nome da musica)
    }

    // Método para remover músicas ao ArrayList 2
    public void removeMusica(int index) {
        this.programacao.remove(index); //nomeDoArray.remove(o que sera retirado, neste caso o index (posição da musica))
    }


    // Método para trocar músicas ao ArrayList
    public void trocarMusica(int index1, int index2) {  //Recebe como parametro dois index para serem trocados
        Musica musica1 = this.programacao.get(index1);
        Musica musica2 = this.programacao.get(index2);

        this.programacao.set(index1, musica2);
        this.programacao.set(index2, musica1);
    }

    // Método para remover todas as músicas ao ArrayList
    public void limparMusicas (){
        this.programacao.clear();
    }

    // Método imprimirRelatorio que imprima na consola todas as músicas da programação

    public void imprimirRelatorio (){
       int contador= 1;

       for (Musica musicaAtual : this.programacao){ // Grava em "musicaAtual" uma posição do array "programação", de cada vez (a cada iteração)
           System.out.println("Música " + contador++ + ": ");
           musicaAtual.exibirDetalhes();
       }
    }

    public void imprimirRelatorioTradicional(){

        for (int i=0; i< this.programacao.size(); i++){
            Musica musicaAtual = this.programacao.get(i);
            System.out.println("Musica: " + (i+1)+ ": ");
            musicaAtual.exibirDetalhes();
        }
    }

    // Método duracao que calcule e imprima na consola no formato hh:mm:ss a duração total da programação definida.





}
