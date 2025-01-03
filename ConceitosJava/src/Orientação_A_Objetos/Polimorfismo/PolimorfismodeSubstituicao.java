package Orientação_A_Objetos.Polimorfismo;

public class PolimorfismodeSubstituicao {

    public void emitirSomm(){
        System.out.println("emitindo som");
    }
}

class gato extends PolimorfismodeSubstituicao{
    @Override
    public void emitirSomm() {
        System.out.println("Gato Miando");
    }
}

class cachorro extends  PolimorfismodeSubstituicao{
    @Override
    public void emitirSomm() {
        System.out.println("Cachorro Latindo");
    }
}
