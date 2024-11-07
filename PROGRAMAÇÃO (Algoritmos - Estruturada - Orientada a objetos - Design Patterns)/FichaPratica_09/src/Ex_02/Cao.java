package Ex_02;

public class Cao {

    // Definir atributos de instância
    private String nome;
    private String raca;
    private String latido = "Au au au";

    public Cao(String nome, String raca) {
        this.nome=nome;
        this.raca=raca;
    }

    public void ladrar() {  //Metodo de ladrar
        System.out.println(this.latido);
    }

    public String getNome() {
        return nome;
    }

    public String getRaça() {
        return raca;
    }

    public String getLatido() {
        return latido;
    }

    public void setLatido(String latido) {
        this.latido = latido;
    }
}
