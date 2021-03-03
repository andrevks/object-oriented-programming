package cursoemvideo.aula11;

public class Peixe extends Animal{
    //Atributos
    private String corEscama;

    //Métodos


    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    public void soltarBolha(){
        System.out.println("Blu blu blu ... 0 0 0 0");
    }
    //Métodos herdados
    @Override
    public void locomover() {
        System.out.println("Nadando na água...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som !");
    }
}
