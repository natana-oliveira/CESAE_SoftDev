package Ex_09;

public class main {
    public static void main(String[] args) {

        Produto tShirtAzul = new Produto("T-shirt Azul", 59.90);

        tShirtAzul.comprar(15);
        tShirtAzul.vender(2);
        tShirtAzul.comprar(3);
        tShirtAzul.vender(18);
    }
}
