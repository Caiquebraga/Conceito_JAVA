package Orientação_A_Objetos.Polimorfismo;

public class Calculadora {

    public int somar (int a, int b){
        return a + b;
    }

    public int somar (int a, int b, int c){
        return a + b;
    }
}

public class main{
    public static void main(String[] args ){
        Calculadora calc = new Calculadora();


        System.out.println("Somar dois numeros inteiros: " + calc.somar(4,1));
        System.out.println("Somar três numeros inteiros: " + calc.somar(8,10, 15));
    }
}
