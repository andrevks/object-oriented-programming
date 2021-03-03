package cursoemvideo.aula08;

public class TestDrivePublicacao {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Jessica",20,"F");
        p[1] = new Pessoa("Samantha Jones", 27,"F");


        l[0] = new Livro("The Dip","Seth Godin",120,p[0]);
        l[1] = new Livro("Can't Hurt Me","David Goggins",366,p[1]);
        l[2] = new Livro("The Richest Man in Babylon","George S. Clason",194,p[1]);


        p[0].fazerAniver();
        System.out.println(p[0].getNome() + " tem " + p[0].getIdade() + " ano(s), do sexo " + p[0].getSexo());

        l[0].abrir();
        l[0].fechar();
        l[0].avancarPag();
        l[0].abrir();
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
        l[0].folhear(5);
        System.out.println(l[0].detalhes());

        System.out.println("\n" +p[1].getNome() + " tem " + p[1].getIdade() + " ano(s), do sexo " + p[1].getSexo());

        l[1].abrir();
        l[1].avancarPag();
        System.out.println(l[1].detalhes());
        l[1].fechar();
        l[1].folhear(366);
        System.out.println(l[1].detalhes());

        System.out.println("\n ----------------------- \n");
        l[2].abrir();
        l[2].avancarPag();
        l[2].avancarPag();
        l[2].avancarPag();
        l[2].avancarPag();
        l[2].voltarPag();
        System.out.println(l[2].detalhes());
        l[2].folhear(100);
        System.out.println(l[2].detalhes());


    }
}
