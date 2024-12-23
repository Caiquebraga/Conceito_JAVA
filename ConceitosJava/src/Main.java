import Orientação_A_Objetos.Construtores.Construtor;
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

            //CONSTRUTOR NOME
            Construtor pessoa = new Construtor("Caique");
            System.out.println("Nome: " + pessoa.getName());

            pessoa.SetName("Caique Braga");
            System.out.println("Novo nome: " + pessoa.getName());

            //CONSTRUTOR IDADE
            Construtor idadePessoa = new Construtor(29);

            System.out.println("Idade: " + idadePessoa.getIdade());

            idadePessoa.setIdade(30);
            System.out.println("Nova idade: " + idadePessoa.getIdade());
        }
    }
}