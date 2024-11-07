package Ex_08;

public class Aluno {

    // Atributos de instância
    private String nome;
    private int idade;
    private String curso;
    private double media;

    public String getNome() {
        return nome;
    }

    //Método de construção
    public Aluno(String nome, int idade, String curso, double media) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.media = media;



    }

    //Método situação
        public String situacao() { //Metodo para

            if (this.media >= 9.5) {
                return "Aprovado!";
            }else{
                return "Reprovado!";
            }
        }

}
