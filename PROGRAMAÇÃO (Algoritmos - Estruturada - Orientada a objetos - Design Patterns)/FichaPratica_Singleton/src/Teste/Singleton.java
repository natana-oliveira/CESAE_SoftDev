package Teste;

public class Singleton {

    private Singleton instance;
    private String atributo_1;
    private int atributo_2;

    public Singleton(Singleton instance, String atributo_1, int atributo_2) {
        this.instance = instance;
        this.atributo_1 = atributo_1;
        this.atributo_2 = atributo_2;
    }

    public Singleton getInstance(Singleton instance, String atributo_1, int atributo_2){
        if (instance==null){
            instance= new Singleton(instance,atributo_1,atributo_2);
                    }
        return instance;
    }
}
