package Tipos_de_dados;

class Pessoa{
    String nome;
    int idade;

    void ExibirInformmacoes(){
        System.out.println("Nome " + nome + "Idade " + idade);
    }
}
    public class Classes_e_Objetos{

    public static void main(String[] args){

        Pessoa pessoa = new Pessoa();

        pessoa.nome = "Caique";
        pessoa.idade = 29;

        pessoa.ExibirInformmacoes();
    }
}