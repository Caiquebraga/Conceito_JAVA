package Orientação_A_Objetos.Modificadores_de_Acesso;

public class protected_Exemple {

    protected String mensagem = "Menssagem protected";

}

class subClasse extends protected_Exemple{

    public void ExibirMenssagem(){
        System.out.println(mensagem);
    }
}
