package cursoemvideo.aula08;

public class Livro implements Publicacao{
    //Atributos - O que a classe tem
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    Livro(String tit, String aut,int tot, Pessoa lei){
        this.setTitulo(tit);
        this.setAutor(aut);
        this.setAberto(false);
        this.setPagAtual(0);
        this.setTotPaginas(tot);
        this.setLeitor(lei);

    }
    //Métodos - O que a classe faz


    public String detalhes() {
        return "\nLivro{" +
                "titulo='" + titulo + '\'' +
                "\n, autor='" + autor + '\'' +
                "\n, totPaginas=" + totPaginas +
                "\n, pagAtual=" + pagAtual +
                "\n, aberto=" + aberto +
                "\n, leitor=" + leitor.getNome() +
                '}';
    }

    //Métodos acessores

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    //Métodos abstratos
    //Subescrevendo

    @Override
    public void abrir() {
        this.setAberto(true);
        this.setPagAtual(1);
        //System.out.println("Abrindo livro...");
    }

    @Override
    public void fechar() {
        this.setAberto(false);
        this.setPagAtual(0);
        //System.out.println("Fechando livro...");
    }

    @Override
    public void folhear(int atePag) {
        //System.out.println("Folheando livro...");

        if(atePag > this.getTotPaginas()){
            this.setPagAtual(1);
        }else{
            for(int pag = 1; this.isAberto() && pag <= atePag; pag++){
                this.setPagAtual(pag);
            }
        }


    }

    @Override
    public void avancarPag() {
        if(this.isAberto() && this.getPagAtual() < this.getTotPaginas()){
            this.setPagAtual(this.getPagAtual() + 1);
        }else{
            System.out.println("Não é possível avançar página");
        }


    }

    @Override
    public void voltarPag() {
        if(this.isAberto() && this.getPagAtual() > 0){
            this.setPagAtual(this.getPagAtual() - 1);
        }else{
            System.out.println("Não é possível retroceder página");
        }
    }

}
