package Ex_05;

public class Main {
    public static void main(String[] args) {

        Agenda aMinhaAgenda = new Agenda();

        Pessoa pessoa1= new Pessoa("Vitor",24,"vmvs007@gmail.com","911222333");
        Pessoa pessoa2= new Pessoa("Maria",30,"maria@gmail.com","922333444");
        Pessoa pessoa3 = new Pessoa("Cristiano Ronaldo", 39,"cr7@gmail.com","955666777");

        aMinhaAgenda.addPessoa(pessoa1);
        aMinhaAgenda.addPessoa(pessoa2);
        aMinhaAgenda.addPessoa(pessoa3);

        aMinhaAgenda.listarAgenda();
    }


}
