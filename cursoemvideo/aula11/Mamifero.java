package cursoemvideo.aula11;

public class Mamifero extends Animal{
    //Atributos
    private String corPelo;


    //Métodos
    public String getCorPelo(){return corPelo;}

    public void setCorPelo(String corPelo){
        this.corPelo = corPelo;
    }
    //Implementação de métodos abstratos
    //Quanto o progenitor tem métodos abstratos,
    //tem-se a obrigação de desenvolve-los no filho
    @Override
    public void locomover() {
        System.out.println("Correndo...");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando... !");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero !");
    }
}
