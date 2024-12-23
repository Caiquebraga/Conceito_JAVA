package Orientação_A_Objetos.Modificadores_de_Acesso;

public class Modificador_public {

    //MODDIFICADORES Métodos e Variáveis

    //istância da classe e não a uma estância especifica
    //Visibilidade: O atributo, metodo ou classe esta acessivel de qualquer lugar do programa.
    //Uso Comum: Para métodos ou classes que precisam ser acessados globalmente.

    public String nome;

    public  void exibirNome(){
        System.out.println("Nome: " + nome);
    }

    //EXEMPLO EM OUTRA CLASSE

    Modificador_public exemplo = new Modificador_public();

    exemplo.nome = "Caique";
    exemplo.exibirNome();
}


