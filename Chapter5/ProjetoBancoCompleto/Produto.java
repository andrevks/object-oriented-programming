package Chapter5.ProjetoBancoCompleto;

public class Produto {
    
    public Produto(){
        
    }
    
    private int Id;
    private String Descricao;
    private float ValorPadrao;
    
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public float getValorPadrao() {
        return ValorPadrao;
    }

    public void setValorPadrao(float ValorPadrao) {
        this.ValorPadrao = ValorPadrao;
    }
}