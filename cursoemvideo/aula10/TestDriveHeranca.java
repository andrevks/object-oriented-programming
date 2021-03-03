package cursoemvideo.aula10;

public class TestDriveHeranca {
    public static void main(String[] args) {
        //A classe abstrata não pode gerar objetos
        //Pessoa p = new Pessoa();
        //Funcionario f = new Funcionario();
        Aluno a = new Aluno();
        Professor pro = new Professor();
        //Visitante é uma classe que somente
        // herda atributos e métodos da classe abstrata
        Visitante v = new Visitante();

        Bolsista b = new Bolsista();
        Tecnico t = new Tecnico();

        a.setNome("Andrew");
        a.setIdade(18);
        a.setSexo("M");
        a.setMatr(123123123);
        a.setCurso("Informática");
        //a.cancelarMatr();
        a.pagarMensalidade();
        System.out.println(a.toString());

        pro.setNome("Jordan Freak");
        pro.setIdade(24);
        pro.setSexo("M");
        pro.setSalario(1000f);
        pro.receberAum(80f);
        System.out.println(pro.toString());
        System.out.println("Salario: " + pro.getSalario());


        v.setNome("João");
        v.setIdade(15);
        v.setSexo("M");
        v.fazerAniv();
        System.out.println(v.toString());

        System.out.println("ESPECIALIZAÇÕES DE ALUNO");

        b.setNome("Larisa");
        b.setIdade(20);
        b.setSexo("F");
        b.setBolsa(700);
        b.pagarMensalidade();
        b.renovarBolsa();
        System.out.println(b.toString());

        t.setNome("Hannah");
        t.setIdade(18);
        t.setSexo("F");
        t.setRegistroProfissional("Tecnico de Informática");
        t.praticar();
        System.out.println(t.toString());

        //        p.setNome("Samatha Jones");
//        p.setIdade(20);
//        p.setSexo("F");
//        System.out.println(p.toString());

//        f.setNome("Seth Godin");
//        f.setIdade(40);
//        f.setSexo("M");
//        f.setSetor("Marketing and Writing");
//        f.setTrabalhando(true);
//        System.out.println(f.toString());

    }
}
