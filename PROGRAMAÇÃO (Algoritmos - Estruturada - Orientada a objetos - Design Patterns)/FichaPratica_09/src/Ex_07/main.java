package Ex_07;

import Ex_05.Carro;

public class main {

    public static void main(String[] args) {

        Livro crônicasNárnia = new Livro("As Crônicas de Nárnia", "C. S. Lewis", "Fantasia", 784, "9780060598242");
        Livro harryPotter = new Livro("Harry Potter - O Calice de Fogo", "J. K. Rowling", "Fantasia",
                592, "9789722326803");


        System.out.println("\n***** LIVROS ***** ");
        crônicasNárnia.exibirDetalhes();
        harryPotter.exibirDetalhes();

    }
}
