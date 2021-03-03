package cursoemvideo.aula11;

public class Canguru extends Mamifero{
    //Métodos
    public void usarBolsa(){
        System.out.println("Usando bolsa...");
    }
    @Override
    public void locomover(){
        System.out.println("Saltando...");
    }
}
