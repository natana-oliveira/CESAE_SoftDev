package Ex_01;

import java.util.ArrayList;

public class GestorTerreno {

    private String proprietario;
    private ArrayList<FiguraGeometrica> terrenos;

    public GestorTerreno(String proprietario) {
        this.proprietario = proprietario;
        this.terrenos = new ArrayList<>();
    }

    public String getProprietario() {
        return proprietario;
    }

    public void addTerreno(FiguraGeometrica terrenoNovo){
        this.terrenos.add(terrenoNovo);
    }

    public double calcularArea(){
        double areaTotal=0;

        for (FiguraGeometrica figuraGeomAtual : terrenos){
            areaTotal+= figuraGeomAtual.area();
        }
        return areaTotal;
    }

    public double calcularPerimetro(){
        double perimetroTotal=0;

        for (FiguraGeometrica figuraGeomAtual : terrenos){
            perimetroTotal+= figuraGeomAtual.perimetro();
        }
        return perimetroTotal;
    }

}
