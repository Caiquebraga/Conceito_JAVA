package controleDeFluxo;
import java.util.Scanner;

public class switch_Eemple {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade!");
        int idade = scanner.nextInt();

        switch (idade){
            case 62:
            System.out.println("com essa Idade de: " + idade + " anos," +  " ainda não se aposenta");
                break;
            case 68:
            System.out.println("Com essa Idade de: " + idade + " anos. " + "Você já pode se aposentar");
                break;
            default:
                System.out.println("Sem Idade Informada");
                break;
        }
        scanner.close();

    }

}
