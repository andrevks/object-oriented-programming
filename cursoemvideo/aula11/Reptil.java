package cursoemvideo.aula11;

public class Reptil extends Animal{
    //Atributos
    private String corEscama;


    //Implementação de métooos abstratos
    //Existe a obrigação de implementar
    //estes métooos
    @Override
    public void locomover() {
        System.out.println("Rastejando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais ou comendo carne fresca da sua presa");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Réptil !");
    }
}
