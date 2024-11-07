package Domain.Pessoa;

import Domain.Objetivo;
import Domain.Profissao;
import Domain.Propriedade.Propriedade;

import java.util.ArrayList;

/**
 * Classe Jogador (Dados do Personagem) que extend Pessoa
 */
public class Jogador extends Pessoa {

    private Objetivo objetivoVida;
    private Profissao profissaoAtual;
    private int necessidadeSono;
    private int necessidadeRefeicao;
    private int necessidadeSocial;
    private int estatuto;
    private int educacao;
    private ArrayList<Propriedade> propriedades;
    private ArrayList<NPC> familia;

    public Jogador(String nomePersonagem, double dinheiro, Objetivo objetivoVida, Profissao profissaoAtual, int necessidadeSono, int necessidadeRefeicao, int necessidadeSocial, int estatuto, int educacao) {
        super(nomePersonagem, dinheiro);
        this.objetivoVida = objetivoVida;
        this.profissaoAtual = profissaoAtual;
        this.necessidadeSono = necessidadeSono;
        this.necessidadeRefeicao = necessidadeRefeicao;
        this.necessidadeSocial = necessidadeSocial;
        this.estatuto = estatuto;
        this.educacao = educacao;
        this.propriedades = new ArrayList<>();
        this.familia = new ArrayList<>();
    }

    public void addPropriedade(Propriedade propriedadeAdquirida) {
        this.propriedades.add(propriedadeAdquirida);
    }

    /**
     * Método Exibir detalhes do Personagem
     */
    public void exibirDetalhes() {
        System.out.println("\nNome do Personagem: " + this.nomePersonagem);
        System.out.println("Dinheiro: " + this.dinheiro + " Galeões");
        System.out.println("Objetivo do Jogo: " + this.objetivoVida);
        if (profissaoAtual == null) {
            System.out.print("Profissão: Ainda sem profissão");
        } else {
            profissaoAtual.exibirDetalhes();
        }
        System.out.println();
        System.out.println("Necessidade de Dormir: " + this.necessidadeSono + " Sonos");
        System.out.println("Necessidade de Alimentar: " + this.necessidadeRefeicao + " Comidas Mágicas");
        System.out.println("Necessidade de Divertir: " + this.necessidadeSocial + " Poções do Riso");
        System.out.println("Estatuto: " + this.estatuto);
        System.out.println("Nível de Formação: " + this.educacao);
            if (propriedades.isEmpty()) {
                System.out.print("Propriedades: Ainda não tem propriedades");
            } else {
                System.out.print("Propriedades: ");
                for (Propriedade propriedadeAtual : propriedades) {
                propriedadeAtual.exibirDetalhes();
            }
        }
        System.out.println();
            if (familia.isEmpty()) {
                System.out.print("Família: Ainda não tem família");
            } else {
                System.out.println("Família: ");
                for (NPC npcAtual : familia) {
                npcAtual.exibirDetalhes();
            }
        }
    }

    /**
     * Método Exibir as Necessidades do Personagem
     */
    public void exibirNecessidades() {
        System.out.println("\uD83D\uDCB5 Dinheiro: " + this.dinheiro + " Galeões");
        if (profissaoAtual == null) {
            System.out.print("\uD83D\uDCBC Profissão: Ainda sem profissão");
        } else {
            System.out.print("\uD83D\uDCBC Profissão: ");
            profissaoAtual.exibirDetalhes();
        }
        System.out.println();
        System.out.println("\uD83D\uDCD6 Necessidade de Dormir: " + this.necessidadeSono + " Sonos");
        System.out.println("\uD83C\uDF7D\uFE0F Necessidade de Alimentar: " + this.necessidadeRefeicao + " Comidas Mágicas");
        System.out.println("\uD83C\uDFC6 Necessidade de Divertir: " + this.necessidadeSocial + " Poções do Riso");
        System.out.println("\uD83C\uDF96\uFE0F Estatuto: " + this.estatuto);
        System.out.println("\uD83D\uDCD6 Nível de Formação: " + this.educacao);

    }


    public Objetivo getObjetivoVida () {
            return objetivoVida;
        }

        public Profissao getProfissaoAtual () {
            return profissaoAtual;
        }

        public int getNecessidadeSono () {
            return necessidadeSono;
        }

        public int getNecessidadeRefeicao () {
            return necessidadeRefeicao;
        }

        public int getNecessidadeSocial () {
            return necessidadeSocial;
        }

        public int getEstatuto () {
            return estatuto;
        }

        public int getEducacao () {
            return educacao;
        }

        public ArrayList<Propriedade> getPropriedades () {
            return propriedades;
        }

        public ArrayList<NPC> getFamilia () {
            return familia;
        }

        public void setObjetivoVida (Objetivo objetivoVida){
            this.objetivoVida = objetivoVida;
        }

        public void setProfissaoAtual (Profissao profissaoAtual){
            this.profissaoAtual = profissaoAtual;
        }

        public void setNecessidadeSono ( int necessidadeSono){
            this.necessidadeSono = necessidadeSono;
        }

        public void setNecessidadeRefeicao ( int necessidadeRefeicao){
            this.necessidadeRefeicao = necessidadeRefeicao;
        }

        public void setNecessidadeSocial ( int necessidadeSocial){
            this.necessidadeSocial = necessidadeSocial;
        }

        public void setEstatuto ( int estatuto){
            this.estatuto = estatuto;
        }

        public void setEducacao ( int educacao){
            this.educacao = educacao;
        }
    }

