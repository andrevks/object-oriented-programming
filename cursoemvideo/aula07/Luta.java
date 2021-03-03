package cursoemvideo.aula07;
import java.lang.Math;

public class Luta {
    //Atributos - O que ela tem
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    //Métodos públicos - O que ela faz
    /*
        REGRAS DA LUTA

        - Deve ser da mesma categoria
        - Desafiado e desafiante devem ser lutadores diferentes

        - A luta só acontece se estiver aprovada
        - Só pode ter como resultado a vitória de um dos lutadores
        ou um empate.
    * */
    public void marcarLuta(Lutador dfiado, Lutador dfiante){
        if(dfiado.getCategoria().equals(dfiante.getCategoria()) && dfiado != dfiante){
            this.setAprovada(true);
            this.setDesafiado(dfiado);
            this.setDesafiante(dfiante);
        }else{
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);

        }
    }
    public void lutar(){
        if(this.isAprovada()){
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();

            //Recebe um valor aleatório entre 0 e 2
            //0 = Empate, 1 = Desafiado ganhou, 2 = Desafiante ganhou.
            int vencedor  = (int) (Math.random() * 3);

            System.out.println("\n========= RESULTADO DA LUTA =========");
            switch (vencedor){
                case 0:
                    System.out.println("Empatou !");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                break;
                case 1:
                    System.out.println(desafiado.getNome() + " Ganhou !");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                break;
                case 2:
                    System.out.println(desafiante.getNome() + " Ganhou !");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                break;
            }
            System.out.println("==================================");
        }else{
            System.out.println("Luta não pode acontecer !");
        }
    }

    //Métodos especiais
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    private void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
