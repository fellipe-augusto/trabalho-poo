package fatec.poo.model;
import java.util.ArrayList;

/**
 *
 * @author Fellipe Augusto
 */

public class Pedido {
    private String numero;
    private String dataEmissao;
    private String dataPagto;
    private boolean formaPagto;
    private boolean situacao;
    private Cliente cliente;
    private Vendedor vendedor;
    private ArrayList<ItemPedido> itensPedido;

    public Pedido(String numero, String dataEmissao) {
        this.numero = numero;
        this.dataEmissao = dataEmissao;
        itensPedido = new ArrayList<ItemPedido>();
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }
    
    public void setDataPagto(String dataPagto) {
        this.dataPagto = dataPagto;
    }

    public String getDataPagto() {
        return dataPagto;
    }

    public void setFormaPagto(boolean formaPagto) {
        this.formaPagto = formaPagto;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public String getNumero() {
        return numero;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public boolean isFormaPagto() {
        return formaPagto;
    }

    public boolean isSituacao() {
        return situacao;
    }
    
    public void setCliente(Cliente c){
        this.cliente = c;
    }
    public Cliente getCliente() {
        return cliente;
    }
    
    public void setVendedor(Vendedor v){
        this.vendedor = v;
    }
    public Vendedor getVendedor() {
        return vendedor;
    }

    public ArrayList<ItemPedido> getItensPedido() {
        return itensPedido;
    }

    public void setItensPedido(ArrayList<ItemPedido> itensPedido) {
        this.itensPedido = itensPedido;
    }
 
    public void addItemPedido(ItemPedido ip){
        itensPedido.add(ip);
        ip.setPedido(this);
        
        if(formaPagto == true){
            cliente.setLimiteDisp(ip.calcValorItemPedido());
        }
    }
    
    public void listar(){
  
        for(int x =0; x < itensPedido.size();x++){
            System.out.print("\n\n" + itensPedido.get(x).getSequencia());
            System.out.print("\n" + itensPedido.get(x).getQtdeVendida());
            System.out.print("\n" + itensPedido.get(x).getProduto().getDescricao());
            System.out.print("\n" + itensPedido.get(x).getProduto().getCodigo());
            System.out.print("\n" + itensPedido.size());
            System.out.print("\n" + x);
        }
    }
}
