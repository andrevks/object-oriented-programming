public class TestaAcessoDireto{
    public static void main(String[] args) {
        Conta minhaConta = new Conta("Andrew");
        /*
             não tem como compilar, pois é um atributo private
             minhaConta.saldo = 1000;
        */
        minhaConta.deposita(1000);
        minhaConta.saca(20);
        double saldo = minhaConta.getSaldo();
        System.out.println("Titular: " + minhaConta.getTitular());
        System.out.println("Saldo: "+ saldo);

        Cliente c1 = new Cliente("12321321-01");
        System.out.println("CPF: " + c1.getCpf());


        System.out.println("Total de contas: " + Conta.getTotalDeContas());

    }

}
