package Ex_03;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        UserSessionManager usm = UserSessionManager.getInstance( );

        System.out.println("*****************************************");
        System.out.println("Token de Acesso:" +usm.getSessionToken());
        System.out.println("Último Acesso: " + usm.getLastAccess());

        // Utilizador usa o sistema durante 5 segundos
        sleep(1000);
        System.out.println("1...");
        sleep(1000);
        System.out.println("2...");
        sleep(1000);
        System.out.println("3...");
        sleep(1000);
        System.out.println("4...");
        sleep(1000);
        System.out.println("5...");

        // Atualizo o ultimo acesso
        usm.setLastAccess();

        System.out.println("*****************************************");
        System.out.println("Token de Acesso:" + usm.getSessionToken());
        System.out.println("Último Acesso: " + usm.getLastAccess());

    }
}
