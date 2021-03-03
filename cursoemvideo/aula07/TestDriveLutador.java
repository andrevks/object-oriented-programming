package cursoemvideo.aula07;
/*
Ultra Emoji Combat
* */
public class TestDriveLutador {
    public static void main(String[] args) {
        /*   declare and instantiate an array of objects
        *     ClassName obj[] = new ClassName[array_length];
        * */
        int arrLength = 6;
        Lutador l[];
        l = new Lutador[6];

        l[0] = new Lutador("Pretty Boy","França",31,1.75f,68.9f,11,2,1);
        l[1] = new Lutador("Putscript","Brasil",29,1.68f,57.8f,14,2,3);
        l[2] = new Lutador("Snapshadow","EUA",35,1.65f,80.9f,12,2,1);
        l[3] = new Lutador("Dead Code","Austrália",28,1.93f,81.6f,13,0,2);
        l[4] = new Lutador("Ufocobol","Brasil",37,1.70f,119.3f,5,4,3);
        l[5] = new Lutador("Nerdaard","EUA",30,1.81f,105.7f,12,2,4);


//        for(byte i = 0; i<6; i++){
//
//            System.out.println("Jogador nº " + i );
//            l[i].apresentar();
//            l[i].status();
//        }
//        l[0].status();
//        l[1].status();
//        System.out.println(">>>>>>");
//        l[0].ganharLuta();
//        l[1].perderLuta();
//        l[0].status();
//        l[1].status();
//
//        l[2].status();
//        l[2].empatarLuta();
//        l[2].setPeso(47);
//        l[2].status();

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[0],l[1]);
        UEC01.lutar();

        l[0].status();
        l[1].status();

        Luta UEC02 = new Luta();
        UEC02.marcarLuta(l[2],l[4]);
        UEC02.lutar();

        Luta UEC03 = new Luta();
        UEC03.marcarLuta(l[5],l[5]);
        UEC03.lutar();

    }
}
