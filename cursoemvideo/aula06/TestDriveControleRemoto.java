package cursoemvideo.aula06;

public class TestDriveControleRemoto {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.maisVolume();
        c.play();
        c.abrirMenu();
        c.fecharMenu();
    }

}
