package cursoemvideo.aula11;

public class TestDriveAnimal {
    public static void main(String[] args) {
        //Programa principal
        //Animal n = new Animal();
//        Mamifero m = new Mamifero();
//        Reptil r = new Reptil();
//        Peixe p = new Peixe();
//        Ave a = new Ave();
//
//        System.out.println("\n ____ Mamífero ____");
//
//        m.setPeso(85f);
//        m.setIdade(2);
//        m.setQtdMembros(4);
//        m.locomover();
//        m.alimentar();
//        m.emitirSom();
//
//        System.out.println("\n ____ Peixe ____");
//
//        p.setPeso(0.35f);
//        p.setIdade(1);
//        p.setQtdMembros(0);
//        p.locomover();
//        p.alimentar();
//        p.emitirSom();
//        p.soltarBolha();
//
//        System.out.println("\n ____ Ave ____");
//
//        a.setPeso(0.89f);
//        a.setIdade(2);
//        a.setQtdMembros(2);
//        a.locomover();
//        a.alimentar();
//        a.emitirSom();
//        a.fazerNinho();

        System.out.println("\n Mais especializações");

        Mamifero m = new Mamifero();
        Canguru c = new Canguru();
        Cachorro cao = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldfish gf = new Goldfish();
        Arara ara = new Arara();


        System.out.println("\n ____ Mamifero ____");

        m.setPeso(5.7f);
        m.setIdade(8);
        m.setQtdMembros(4);
        m.locomover();
        m.alimentar();
        m.emitirSom();

        System.out.println("\n ____ Canguru ____");

        c.setPeso(55.3f);
        c.setIdade(3);
        c.setQtdMembros(4);
        c.locomover();
        c.alimentar();
        c.emitirSom();
        c.usarBolsa();

        System.out.println("\n ____ Cachorro ____");

        cao.setPeso(3.94f);
        cao.setIdade(5);
        cao.setQtdMembros(4);
        cao.locomover();
        cao.alimentar();
        cao.emitirSom();
        cao.abanarRabo();

    }
}
