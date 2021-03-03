package cursoemvideo.aula11;

public class Ave extends Animal{
    //Atributos
    private String corPena;

    //Métodos
    public void fazerNinho(){
        System.out.println("Construiu um lindo ninho");
    }


    @Override
    public void locomover() {
        System.out.println("Voando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Canto de ave");
    }
}
