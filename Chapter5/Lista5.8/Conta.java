/*
	Aluno: André Geraldo Curso: Eng. Da Computação.

	Professor: Tiago de Almeida Lacerda

	Disciplina: Linguagem de Programação I

	Objetivo: Realizar os exemplos propostos sobre ENCAPSULAMENTO, CONSTRUTORES E STATICO cap 5.8 do FJ11
*/

public class Conta {

    //Faz com que esse atributo não seja acessado fora da classe
    //Modificador de acesso
    private double saldo;
    private String titular;
    private double limite;
    private int identificador;
    private static int auxIdentificador;

    Conta(){
        //Construtor sem argumentos, para o caso de uma
        //pessoa não querer passar o titular da conta.
        Conta.auxIdentificador += 1;
        this.identificador = auxIdentificador;//Cada objeto conta tem um identificador único
    }
    Conta(String titular){
        this();//Para chamar um construtor teve ser o primeiro statment a ser feito.
        this.titular = titular;
    }


    public int getIdentificador(){
        return this.identificador;
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
