package Orientação_A_Objetos.Herança;

public class Heranca_Exemple {

    public void  animaisSom(){
        System.out.println("Animais faz som");
    }

}

class lobo extends Heranca_Exemple{
    public void loboGuara(){
        System.out.println("CORRER");
    }
}
public class Main {

    public static void main(String[] Args) {
         lobo herancaLobo = new lobo();

        herancaLobo.animaisSom();
        herancaLobo.loboGuara();
    }
}