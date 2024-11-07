package Teste2;

public class Safe {
    private static Safe instance;
    private boolean locked;

   private Safe() {
        locked = true;
    }

    public static  Safe getInstance(){
        if (instance==null){
            instance=new Safe();
        }
        return instance;
    }

    public void open(){
        if (locked){
            System.out.println("O COFRE FOI ABERTO");
            locked=false;
        }else {
            System.out.println("O COFRE JÁ estÁ ABERTO");
        }
    }

    public void close(){
        if (!locked){
            System.out.println("O COFRE FOI FECHADO");
            locked=true;
        }else {
            System.out.println("O COFRE JÁ estÁ FECHADO");
        }
    }

    public boolean isLocked(){
        return locked;
    }


}
