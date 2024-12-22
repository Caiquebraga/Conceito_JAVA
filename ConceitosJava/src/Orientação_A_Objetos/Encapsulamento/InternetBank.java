package Orientação_A_Objetos.Encapsulamento;

public class InternetBank {

    private double saldo;

    //Construtor da minha classe

    public InternetBank(double saldoInicial){

        this.saldo = saldoInicial;
    }

    // Meu metodo para consultar saldo
    public double getSaldo(){
        return saldo;
    }

    //Meu metodo para deposito
    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
            System.out.println("Deposito realizado com sucesso");
        } else {
            System.out.println("O valor dde depósito deve ser positivio!");
        }
    }

    public void sacar (double valor){
        if(valor > 0 && valor <= saldo){
            saldo -= valor;
            System.out.println("Saque Realizaddo com sucesso!");
        } else {
            System.out.println("Saque inválido! Verifique o valor!");
        }
    }
}
