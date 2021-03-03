 public class Exercicios58 {
    /*
        1 - Adicione o modificador de visibilidade ( private , se necessário) para cada atributo e método da
        classe Conta . Tente criar uma Conta no main e modificar ou ler um de seus atributos privados.
        O que acontece?

            Resposta: O compilador dá erro e aparece a seguinte mensagem:
            "java: saldo has private access in Conta", para o saldo e outros
            atributos que tentei acessar diretamente.
            Esta mensagem significa que os atributos não devem ser acessados
            fora do objeto.

        2. Crie apenas os getters e setters necessários da sua classe Conta . Pense sempre se é preciso criar
        cada um deles.


        3. Modifique suas classes que acessam e modificam atributos de uma Conta para utilizar os getters e
        setters recém criados.

        4. Faça com que sua classe Conta possa receber, opcionalmente, o nome do titular da Conta durante
        a criação do objeto. Utilize construtores para obter esse resultado.
        Por que você precisa do construtor sem argumentos para que a passagem do nome seja opcional?

            Resposta: Para refazer o "Constructor Default" que não é chamado quando
            um construtor é feito.

       5. Adicione um atributo na classe Conta de tipo int que se chama identificador. Esse
        identificador deve ter um valor único para cada instância do tipo Conta.

        Crie um getter para o identificador. Devemos ter um setter?

            Resposta: Não precisa de um setter, já que o valor deve ser único, o melhor é
            deixar apenas a classe controlar como identificar cada objeto. A estratégia que foi
            usada é com um identificador auxiliar (Atributo da classe) para ser modificado
            a cada  objeto instânciado, e cada objeto recebia o valor do identificador no momento
            que foi instânciado, assim cada um recebe um valor único.

        6. Como garantir que datas como 31/2/2012 não sejam aceitas pela sua classe Data

            Resposta: Deve se limitar o número dos meses e dias, se caso fosse feito manualmente,
            poderia colocar condições, baseado em cada mês, teria um número máximo de dias permitidos.
            No mês 2 por exemplo, o dia não poderia passar de 28, e segueria este mesmo raciocínio para
            outros meses.

        7. (opcional) Suponha que temos a classe Pessoa Fisica que tem um CPF como atributo. Como
        garantir que pessoa física alguma tenha CPF invalido, nem seja criada PessoaFisica sem cpf
        inicial? (Suponha que já existe um algoritmo de validação de cpf: basta passar o cpf por um método
        valida(String x)... )

            Resposta: Usando o construtor da classe, obrigaria a ser passado o parâmetro do CPF
            para ser calculado, no momento em que o objeto está sendo instânciado, o construtor é
            chamado e o método validaCpf é chamado, caso o cpf seja válido ele é armazenado, caso
            não, é mostrando algum erro na tela, mostrando que deve ser colocado um CPF válido.

     */

//    public static void main(String[] args) {
//
//        //1
//        Conta c1 = new Conta();
//        //Tentar modificar atributos da conta
//        //código não compila
//        //c1.saldo = 1000;
//        //c1.limite = 3000;
//        //System.out.println("Titular: " + c1.titular);
//
//        //3
//        c1.setTitular("Andrew");
//        c1.deposita(3000);
//        c1.saca(1000);
//        c1.deposita(-2000);
//        System.out.println(c1.getTitular());
//        System.out.println(c1.getSaldo());
//
//        //5
//        Conta c2 = new Conta();
//        System.out.println("Identificador: " + c1.getIdentificador());//1
//        System.out.println("C2 - Identificador: " + c2.getIdentificador());//2
//        Conta c3 = new Conta("David Goggins");
//        System.out.println("C3 - Identificador: " + c3.getIdentificador());//3
//        Conta c4 = new Conta("Jocko Willink");
//        System.out.println("C4 - Identificador: " + c4.getIdentificador());//4
//
//
//
//    }
}
