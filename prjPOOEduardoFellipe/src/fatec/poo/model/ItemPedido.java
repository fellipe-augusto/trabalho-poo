package fatec.poo.model;

/**
 *
 * @author Fellipe Augusto
 */

public class ItemPedido {
    private int sequencia;
    private double qtdeVendida;
    private Produto produto;
    private Pedido pedido;

    public ItemPedido(int sequencia, double qtdeVendida, Produto produto) {
        this.sequencia = sequencia;
        this.qtdeVendida = qtdeVendida;
        this.produto = produto;
    }

    public void setQtdeVendida(double qtdeVendida) {
        this.qtdeVendida = qtdeVendida;
        produto.setQtdeEstoque(produto.getQtdeEstoque() - qtdeVendida);
    }
    
    public int getSequencia() {
        return sequencia;
    }

    public double getQtdeVendida() {
        return qtdeVendida;
    }
    
    public void setPedido(Pedido p){
        this.pedido = p;
    }
    
    public double calcValorItemPedido(){
        return produto.getPreco() * qtdeVendida;
    }
    
    public Produto getProduto() {
        return produto;
    }
    
    public Pedido getPedido() {
        return pedido;
    }

    public void setSequencia(int sequencia) {
        this.sequencia = sequencia;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
