package Ex_02;

import Ex_01.Musica;

import java.util.ArrayList;
import java.util.Random;

public class Sorteio {

    private double premio;

    private ArrayList<Pessoa> participantes;

    public Sorteio(double premio) {
        this.premio = premio;
        this.participantes = new ArrayList<>(); //Inicializar o array a vazio
    }

    // Método adicionarParticipante que receba uma Pessoa como parâmetro e adicione a Pessoa ao Array de Participantes.
    // Deve verificar se a idade é igual ou maior a 18, sendo que deve apresentar a mensagem de aviso caso a pessoa seja menor de idade

    public void addParticipante(Pessoa pessoaNova) {

        if (pessoaNova.getIdade() >= 18) { //Pode estar inscrito
            System.out.println("Participante " + pessoaNova.getNome() + ": Inscrito com sucesso!!!");
            this.participantes.add(pessoaNova);
        } else {
            System.out.println("Participante " + pessoaNova.getNome() + ": Inscrição Recusada. Menor de idade!!!");  //É menor de idade e não pode estar inscrito
        }
    }


    // Método imprimir lista de participantes que imprime a lista

    public void imprimirParticipantes() {

        System.out.println("\nPARTICIPANTES INSCRITOS: \n");
        for (Pessoa pessoaAtual : this.participantes) {
            pessoaAtual.exibirDetalhes();
        }
    }

    // Método sortear que retorna uma Pessoa que será o vencedor do sorteio. (O vencedor deve fazer uso da biblioteca random de java, para escolher um índice do Array.
    public Pessoa sorteio() { //Vai retornar uma pessoa que será a vencedora
        Random random = new Random();  //
        int indexVencedor; // variavel criada para gravar o resultado da função random

        indexVencedor = random.nextInt(0, this.participantes.size());

        return this.participantes.get(indexVencedor);
    }

}
