package Chapter5.ProjetoBancoCompleto;

import java.util.ArrayList;
import java.util.List;


public class Pedido {
    
    private int id;
    private String Data;
    private String NomeCliente;
    private float ValorTotal;
    private List<Item> Itens;
    //Construtor
    public Pedido(){
        Itens = new ArrayList<Item>();
    }
    //métodos Acessores
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    public String getNomeCliente() {
        return NomeCliente;
    }

    public void setNomeCliente(String NomeCliente) {
        this.NomeCliente = NomeCliente;
    }

    public float getValorTotal() {
        return ValorTotal;
    }
    
    private void setValorTotal(float valorTotal) {
        this.ValorTotal = valorTotal;
    }
    
    public void addProduto(Produto produto, float quantidade, float valorUnitario){
        Item item = new Item();
        item.setItemId(1);
        item.setProduto(produto);
        item.setQuantidade(quantidade);
        item.setValorUnitario(valorUnitario);
        Itens.add(item);
        calcularValorTotal();
    }
    
    public void addProduto(int produtoId, String descricaoProduto, float valorPadrao, float quantidade, float valorUnitario){
        Produto produto = new Produto();
        produto.setId(produtoId);
        produto.setDescricao(descricaoProduto);
        produto.setValorPadrao(valorPadrao);        
        this.addProduto(produto, quantidade, valorUnitario);
    }
    
    public void delProduto(Item item){
        Itens.remove(item);
        calcularValorTotal();
    }
    
    public void delProduto(int produtoId){
        for (Item i : Itens) {
            if (i.getProduto().getId() == produtoId) {
                this.delProduto(i);
                break;
            }
        } 
    }
    
    private void calcularValorTotal(){
        float valorTotal = 0;
        for (Item i : Itens) {
            valorTotal += i.getValorTotal();
        }
        this.setValorTotal(valorTotal);
    }
}
