package cursoemvideo.aula09;

public class TestDriveHeranca {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Aluno a = new Aluno();
        Professor pro = new Professor();
        Funcionario f = new Funcionario();

        p.setNome("Samatha Jones");
        p.setIdade(20);
        p.setSexo("F");
        System.out.println(p.toString());


        a.setNome("Andrew");
        a.setIdade(18);
        a.setSexo("M");
        a.setMatr(123123123);
        a.cancelarMatr();
        System.out.println(a.toString());

        pro.setNome("Jordan Freak");
        pro.setIdade(24);
        pro.setSexo("M");

        pro.setSalario(1000f);
        pro.receberAum(80f);
        System.out.println("Salario: " + pro.getSalario());
        System.out.println(pro.toString());

        f.setNome("Seth Godin");
        f.setIdade(40);
        f.setSexo("M");
        f.setSetor("Marketing and Writing");
        f.setTrabalhando(true);
        System.out.println(f.toString());
    }
}
