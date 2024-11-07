package Teste2;

public class Main {
    public static void main(String[] args) {

        Safe safe = Safe.getInstance();
        safe.open();
        safe.close();
        System.out.println("O cofre está trancado?" + safe.isLocked());
    }
}
