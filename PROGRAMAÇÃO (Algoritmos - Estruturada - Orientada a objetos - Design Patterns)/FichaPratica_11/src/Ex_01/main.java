package Ex_01;

public class main {
    public static void main(String[] args) {

        Musica theScientist = new Musica("The Scientist", "Rock Alternativo", "Coldplay", 260);
        Musica bohemian = new Musica(" Bohemian Rapsody", "Rock", "Queen", 359);
        Musica mestreCulinaria = new Musica(" Mestre da Culinária", "Heavy Metal", "Quim Barreiros", 233);

        MusicPlayer estacaoRadio = new MusicPlayer();

        estacaoRadio.addMusica(theScientist);
        estacaoRadio.addMusica(bohemian);
        estacaoRadio.addMusica(mestreCulinaria);

        estacaoRadio.imprimirRelatorio();

        estacaoRadio.limparMusicas();
        estacaoRadio.imprimirRelatorio();

    }
}
