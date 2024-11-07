package Ex_03;

public class Animal {

    // Atributos do animal
    private String nome;
    private String especie;
    private String paisOrigem;
    double pesoAnimal; // PESO EM Kg
    private String[] alimentacao;

    // Método construtor do animal
    public Animal(String nome, String especie, String paisOrigem, double pesoAnimal, String[] alimentacao) {
        this.nome = nome;
        this.especie = especie;
        this.paisOrigem = paisOrigem;
        this.pesoAnimal = pesoAnimal;
        this.alimentacao = alimentacao;
    }

    //Método para o animal comer
    public void comer(String alimento, double pesoAlimento) { //PESO EM gramas

        for (int i = 0; i < this.alimentacao.length; i++) {  //iterar o array de alimentação e comparar todos os alimentos
            if (this.alimentacao[i].equals(alimento)) { //se o array de alimentos na posição i for igual ao alimento que recebeu como parametro
                System.out.println("O " + this.especie + " " + this.nome + " comeu " + alimento); // o animal aceita a comida
                this.pesoAnimal += (pesoAlimento / 1000); // o peso do animal aumenta (divide por 1000 pelo peso do animal ser Kg e o alimento em grama
                System.out.println("Peso do animal: " + pesoAnimal);
                return; // encontrou o alimento e comeu, o ciclo não precisa continuar
            }
        }
        // não tem else pois essa situação tem que estar fora do ciclo porque ele só não come se o alimento não estiver no array
        System.out.println("O " + this.especie + " " + this.nome + " não comeu " + alimento);
    }

    public void imprimirDetalhes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Especie: " + this.especie);
        System.out.println("Pais Origem: " + this.paisOrigem);
        System.out.println("Peso: " + this.pesoAnimal);
        System.out.print("Dieta: ");

        for (int i = 0; i < this.alimentacao.length; i++) { // Para imprimir o array  de alimentação
            System.out.print(this.alimentacao[i] + " | "); // imprime a alimentação
        }
        System.out.println("\n");
    }


}


