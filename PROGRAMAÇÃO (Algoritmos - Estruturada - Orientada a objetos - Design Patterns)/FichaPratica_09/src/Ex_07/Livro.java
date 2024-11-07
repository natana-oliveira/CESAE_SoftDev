package Ex_07;

public class Livro {

    //Definir atributos de instância (livro)
    private String titulo;
    private String autor;
    private  String categoria;
    private  int numPaginas;
    private String ISBN;

    // Método construtor de livro
    public Livro(String titulo, String autor, String categoria, int numPaginas, String ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.numPaginas = numPaginas;
        this.ISBN = ISBN;
    }

    public void exibirDetalhes() {
        System.out.println("\nTítulo:" + this.titulo);
        System.out.println("Autor: " + this.autor + "\nCategoria: " + this.categoria);
        System.out.println("Número de páginas: "+ this.numPaginas + "\nISBN: " + this.ISBN);
    }
}
