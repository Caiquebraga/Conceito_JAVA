import Orientação_A_Objetos.Encapsulamento.InternetBank;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);

            InternetBank conta = new InternetBank(1000.00);

            System.out.println("Saldo inicial e conta: R$ " + conta.getSaldo());

            conta.depositar(500.00);
            System.out.println("Saldo em conta após depósito: R$ " + conta.getSaldo());

            conta.sacar(300.00);
            System.out.println("Saldo em conta após Saque: R$ " + conta.getSaldo());

            conta.sacar(2000.00);
            System.out.println("Saldo em conta: R$ " + conta.getSaldo());
        }
    }
}