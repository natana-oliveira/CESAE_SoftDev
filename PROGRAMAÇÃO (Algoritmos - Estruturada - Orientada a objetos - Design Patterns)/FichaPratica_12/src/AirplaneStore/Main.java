package AirplaneStore;


import AirplaneStore.Enums.Armas;
import AirplaneStore.Enums.CategoriaJato;
import AirplaneStore.Enums.Instalacao;

public class Main {
    public static void main(String[] args) {

        JatosParticulares gulfstream = new JatosParticulares(111, "Gulfstream W115", 2015, 3000, 25, 7, 2.5, 2, 3550, 740, 15000, 12, 1000, CategoriaJato.Light_Jet);
        gulfstream.addInstalacao(Instalacao.WC);
        gulfstream.addInstalacao(Instalacao.WIFI);
        gulfstream.addInstalacao(Instalacao.Tomadas);

        AvioesCombate f16 = new AvioesCombate(9030, "Jetfighter F16", 2005, 900, 7.5, 2, 1.2, 1, 900, 1050, 90000, "USA", false);
        f16.addArma(Armas.Metralhadoras);
        f16.addArma(Armas.Foguetes);

        AvioesCombate  f22 = new AvioesCombate (9850, "Jetfighter F22", 2018, 990, 7.8, 2.4, 1.3, 2, 1300, 1600, 100000, "USA", true);
        f22.addArma(Armas.Foguetes);
        f22.addArma(Armas.Metralhadoras);
        f22.addArma(Armas.Misseis);
        f22.addArma(Armas.Bombas);

        Catalogo lojaAvioesXPTO = new Catalogo();
        lojaAvioesXPTO.adquirirAviao(gulfstream);
        lojaAvioesXPTO.adquirirAviao(f22);
        lojaAvioesXPTO.adquirirAviao(f16);

        System.out.println("Valor Total do Catálogo: "+ lojaAvioesXPTO.calcularTotal() + "€");
        System.out.println();
        lojaAvioesXPTO.imprimirCatalogo();
    }
}
