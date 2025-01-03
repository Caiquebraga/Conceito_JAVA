package Orientação_A_Objetos.abstractClass;

public abstract  class Animal {
    private String nome;

    public Animal(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public abstract void emitirSom();
}

public class cachorro extends Animal{
    public cachorro (String nome){
        super(nome);
    }

    public void emitirSom(){
        System.out.println("Cachorro faz AU  AU");
    }
}
