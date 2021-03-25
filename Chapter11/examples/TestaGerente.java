package Chapter11.examples;

public class TestaGerente {

    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNome("João");
        gerente.setSalario(5000);
        System.out.println("Bonificação Gerente: " + Double.toString(gerente.getBonificacao()));

        gerente.setSenha(3434);

        Gerente gerente1 = new Gerente();
        Funcionario funcionario = gerente1;
        //A variável de referência funcionário
        //ao pegar a referência para um gerente
        //apenas tem acesso aos atributos e métodos
        //que o gerente herdou de funcionário.
        //Assim, não pode acesssar setSenha(), por exemplo.
        funcionario.setSalario(5000);
        System.out.println("Bonificação do gerente como funcionário: "
                + Double.toString(funcionario.getBonificacao()));

        //Controle de bonificações

        ControleDeBonificacoes controle = new ControleDeBonificacoes();
        Funcionario funcionario1 = new Gerente();
        funcionario1.setSalario(5000.0);
        controle.registra(funcionario1);

        Funcionario funcionario2 = new Funcionario();
        funcionario2.setSalario(1000.0);
        controle.registra(funcionario2);

        System.out.println(controle.getTotalDeBonificacoes());
    }
}
