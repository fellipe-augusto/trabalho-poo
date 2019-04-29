package fatec.poo.model;
import java.util.ArrayList;

/**
 *
 * @author Fellipe Augusto
 */

public class Pedido {
    private String numero;
    private String dataEmissao;
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
    
    public void setVendedor(Vendedor v){
        this.vendedor = v;
    }
    
    public void addItemPedido(ItemPedido ip){
        itensPedido.add(ip);
        ip.setPedido(this);
        
        if(formaPagto == true){
            cliente.setLimiteDisp(ip.calcValorItemPedido());
        }
    }
}
