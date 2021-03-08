package Chapter5.ProjetoBancoCompleto;

public class Item {
    
    private int ItemId;
    private Produto Produto;
    private float Quantidade;
    private float ValorUnitario;
    private float ValorTotal;    

    public int getItemId() {
        return ItemId;
    }

    public void setItemId(int ItemId) {        
        this.ItemId = ItemId;
    }

    public Produto getProduto() {
        return Produto;
    }
    
    public int getProdutoId(){
        return Produto.getId();
    }

    public void setProduto(Produto Produto) {
        this.Produto = Produto;
    }

    public float getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(float Quantidade) {
        this.Quantidade = Quantidade;   
        calcularValorTotal();
    }

    public float getValorUnitario() {
        return ValorUnitario;
    }

    public void setValorUnitario(float ValorUnitario) {
        this.ValorUnitario = ValorUnitario;        
        calcularValorTotal();
    }

    public float getValorTotal() {
        return ValorTotal;
    }

    private void setValorTotal(float ValorTotal) {
        this.ValorTotal = ValorTotal;
    }

    private void calcularValorTotal(){
        float quantidade = this.getQuantidade();
        float valorUnitario = this.getValorUnitario();
        float valorTotal = 0;        
        if (quantidade > 0 && valorUnitario > 0)
            valorTotal = quantidade * valorUnitario;        
        this.setValorTotal(valorTotal);
    }
}
