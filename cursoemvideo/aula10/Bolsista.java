package cursoemvideo.aula10;

public class Bolsista extends Aluno{
    //Herança para diferença - Herda e adiciona novos atributos e métodos
    //Neste caso já está incluso o que a classe Aluno herdou da classe Pessoa

    //Atributos - O que o objeto terá
    private float bolsa;

    //Métodos - O que o objeto fará
    public void renovarBolsa(){
        //Implementanção da renovação de bolsa
        //No final a mensagem é mostrada caso teve sucesso
        // na operação...
        System.out.println("Renovando bolsa de " + this.nome);
    }
    //Polimorfismo significa fazer a mesma coisa de várias maneiras diferentes.
    //Neste caso o método herdado da classe Aluno será subescrito,
    //já que Bolsista possui outra maneira de pagar a mensalidade
    @Override
    public void pagarMensalidade(){
        //Simulando um pagamento de mensalidade
        System.out.println(this.nome +" é bolsista ! então, tem o pagamento facilitado :D");
    }

    //Métodos especiais

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
