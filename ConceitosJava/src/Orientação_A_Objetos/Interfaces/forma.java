package Orientação_A_Objetos.Interfaces;

interface forma {

    void desenhar();

    void area();
}

class circulo implements forma{
    private  double raio;

    public circulo(double raio){
        this.raio = raio;
    }

    public void desenhar(){
        System.out.println("Desenhar circulo");
    }

    public void area(){
        System.out.println("Area de uma forma");
    }
}
