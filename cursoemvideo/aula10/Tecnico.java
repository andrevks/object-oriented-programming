package cursoemvideo.aula10;

public class Tecnico extends Aluno{
    //Herança para diferença - Herda e adiciona novos atributos e métodos

    //Atributos - o que o objeto terá
    private String registroProfissional;

    //Métodos - o que o objeto fará
    public void praticar(){
        //Apenas uma simulação de uma prática de um técnico
        for (byte i = 0; i < 4; i++){
            System.out.println("Praticando...");
        }
    }
    //Métodos especiais

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}
