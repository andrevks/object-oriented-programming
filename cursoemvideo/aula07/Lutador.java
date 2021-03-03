package cursoemvideo.aula07;

public class Lutador {
    //Atributos - O que ele tem
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //Métodos - O que ele faz
    public void apresentar(){
        System.out.println("----------------");
        System.out.format("Agora vai entrar o lutador %s da(o) %s" +
                        ", pesando %.2f Kg \n",
                this.getNome(),this.getNacionalidade(),this.getPeso());
        System.out.println(getIdade() + " anos");
        System.out.println(getAltura() + " m de altura");
        System.out.format("Possui %d vitórias, %d derrotas e %d empates \n",
                this.getVitorias(),this.getDerrotas(),this.getEmpates());
    }
    //Métodos Públicos
    public void status(){
        System.out.format("\n%s concorre na categoria " +
                "%s\n",this.getNome(),this.getCategoria());
        System.out.println(getVitorias() + " Vitórias");
        System.out.println(getDerrotas() + " Derrotas");
        System.out.println(getEmpates() + " Empates");
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
    //Construtor
    public Lutador(String no,String nacio,int id,float alt,float pe,int vi,int de,int em){
        this.setNome(no);
        this.setNacionalidade(nacio);
        this.setIdade(id);
        this.setAltura(alt);
        this.setPeso(pe);
        this.setVitorias(vi);
        this.setDerrotas(de);
        this.setEmpates(em);
    }
    //Métodos especiais


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {

        if(this.peso < 52.2 || this.peso > 120){
            this.categoria = "Inválido";
        }else if(this.peso <= 70.3){
            this.categoria = "Peso leve";
        }else if(this.peso <= 83.9){
            this.categoria = "Peso médio";
        }else if(this.peso <= 120){
            this.categoria = "Peso pesado";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    private void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    private void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    private void setEmpates(int empates) {
        this.empates = empates;
    }
}
