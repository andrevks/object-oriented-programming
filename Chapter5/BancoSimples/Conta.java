public class Conta {
    //Faz com que esse atributo não seja acessado fora da classe
    //Modificador de acesso
   private double saldo;
   private String titular;
   private double limite;

   //Atributo de classe
    //private static int totalDeContas;

   //Construtor
    Conta(String titular) {
        //Quando você não declara nenhum construtor na sua classe, o Java cria um para você. Esse
        //construtor é o construtor default, ele não recebe nenhum argumento e o corpo dele é vazio.
        System.out.println("Construindo uma conta...");
        this.titular = titular;
        //Para acessar um atributo estático usa-se o nome da classe
       // Conta.totalDeContas += 1;
    }
    public static int getTotalDeContas(){
        return Conta.totalDeContas;
    }
    public boolean saca(double valor){

        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean deposita(double valor){
        if(valor> 0){
            this.saldo += valor;
            return true;
        }
        return false;
    }

    public double getSaldo(){
        return this.saldo + this.limite;
    }

    public String getTitular(){
        return this.titular;
    }
    public String setTitular(String titular){
        return this.titular = titular;
    }
}
