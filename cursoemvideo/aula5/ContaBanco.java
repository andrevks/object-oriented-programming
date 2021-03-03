package CursoEmVideo.aula5;

public class ContaBanco {
    //Atributos - o que ele tem
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;


    //Métodos - O que ele faz
    public void estadoAtual(){
        System.out.println("----------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: Aberta ?" + this.isStatus());
        System.out.println("----------------------------");
    }
    public boolean abrirConta(String tipo){
        if(this.setTipo(tipo)){
            this.setStatus(true);
            if(this.getTipo() == "CC"){
                this.setSaldo(50);
            }
            if(this.getTipo() == "CP"){
                this.setSaldo(150);
            }
            System.out.println("Conta criada com sucesso !");
            return true;
        }

        System.out.println("ERRO! não foi possível criar conta");
        return false;
    }

    public boolean fecharConta(){
        if(this.getSaldo() < 0){
            System.out.println("Pague suas dívidas para que seja possível cancelar a conta !");
            return false;
        }
        if(this.getSaldo() > 0){
            System.out.println("Saque todo seu dinheiro para cancelar a conta !");
            return false;
        }


        this.setStatus(false);
        System.out.println("Sem saldo e sem dívidas, fechando conta...");
        return true;
    }
    public boolean depositar(double valor){

        if(this.isStatus() && valor >0){
            this.setSaldo(getSaldo() + valor);
            System.out.println("Depósito realizado com sucesso na conta da(o) " + this.getDono());
            return true;
        }
        System.out.println("Impossível depositar, conta está fechada");
        return false;
    }
    public boolean sacar(double valor){

        if(this.isStatus()){
            if(this.saldo >= valor){
                this.setSaldo(getSaldo() - valor);
                System.out.println("Saque realizado com sucesso na conta da(o) " + this.getDono());
                return true;
            }else{
                System.out.println("Saldo insuficiente !");
                return false;
            }
        }
        System.out.println("Impossível sacar, a conta está fechada ");
        return false;
//        if(this.isStatus() && valor>0 && valor >= this.getSaldo()){
//            this.setSaldo(getSaldo() - valor);
//            return true;
//        }
//        return false;
    }

    public void pagarMensal(){

        if(this.getTipo() == "CC"){
            this.sacar(12);
        }else
            if(this.getTipo() == "CP"){
            this.sacar(20);
        }

    }

    //Métodos especiais

    //Construtor - chamado somente ao construir o objeto
    public ContaBanco(){
        this.setStatus(false);
        this.setSaldo(0);
    }


    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean setTipo(String tipo) {
      if(tipo == "CC" || tipo == "CP"){
          this.tipo = tipo;
          return true;
      }
      return false;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
