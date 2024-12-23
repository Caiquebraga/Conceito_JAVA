package Orientação_A_Objetos.Construtores;

public class Construtor {

    private String nome = "Caique";
    private int idade = 29;

        //Meu construtor
    public Construtor(String nome){
        this.nome = nome;
    }

    public Construtor(int idade){
        this.idade = idade;
    }
      //getter para acessar o nome
    public String getName(){
        return nome;
    }
        //setter para modificar o nome
    public void SetName(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
}
