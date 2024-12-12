package controleDeFluxo;
import java.util.Scanner;

public class IfElse_Exemple {

    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade:");
             int idade = scanner.nextInt();

     if(idade < 18){
         System.out.println("com essa Idade de: " + idade + " anos," +  " Não é permitido dirigir");
     } else {
         System.out.println("com essa Idade de: " + idade + " anos," + "é permitido dirigir");
     }

     scanner.close();
    }

}
