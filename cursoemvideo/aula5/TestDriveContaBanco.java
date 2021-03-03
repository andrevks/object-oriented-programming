package CursoEmVideo.aula5;

import java.security.cert.CRLReason;

public class TestDriveContaBanco {
    public static void main(String[] args) {
        ContaBanco Jubileu = new ContaBanco();
        Jubileu.setNumConta(1233);
        Jubileu.setDono("Jubileu");
        Jubileu.abrirConta("CC");
        Jubileu.depositar(300);



        ContaBanco Creusa = new ContaBanco();
        Creusa.setNumConta(6612);
        Creusa.setDono("Creusa");
        Creusa.abrirConta("CP");
        Creusa.depositar(500);

        Creusa.sacar(500);
        Jubileu.fecharConta();
        Jubileu.sacar(350);
        Jubileu.fecharConta();

        Jubileu.estadoAtual();
        Creusa.estadoAtual();

        //Jubileu.pagarMensal();
        //Creusa.pagarMensal();
    }
}
