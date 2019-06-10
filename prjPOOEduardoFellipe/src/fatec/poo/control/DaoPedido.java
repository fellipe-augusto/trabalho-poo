/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.control;

import fatec.poo.model.Cliente;
import fatec.poo.model.Pedido;
import fatec.poo.model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 0030481721024
 */
public class DaoPedido {
    private Connection conn;
    
    public DaoPedido(Connection conn) {
         this.conn = conn;
    }
    
    public void inserir(Pedido pedido) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO pooPedido(numero, dataEmissao, dataPagto, formaPagto, situacao, cpfCliente, cpfVendedor) VALUES(?,?,?,?,?,?,?)");
            ps.setString(1, pedido.getNumero());
            ps.setString(2, pedido.getDataEmissao());
            ps.setString(3, pedido.getDataPagto());
            ps.setBoolean(4, pedido.isFormaPagto());
            ps.setBoolean(5, pedido.isSituacao());
            ps.setString(6, pedido.getCliente().getCpf());
            ps.setString(7, pedido.getVendedor().getCpf());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void alterar(Pedido pedido) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE pooPedido set dataEmissao = ?, dataPagto = ?, formaPagto = ?, situacao = ?, cpfCliente = ?, cpfVendedor = ?" +
                                                 "where numero = ?");
            
            ps.setString(1, pedido.getDataEmissao());
            ps.setString(2, pedido.getDataPagto());
            ps.setBoolean(3, pedido.isFormaPagto());
            ps.setBoolean(4, pedido.isSituacao());
            ps.setString(5, pedido.getCliente().getCpf());
            ps.setString(6, pedido.getVendedor().getCpf());
            ps.setString(7, pedido.getNumero());
           
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public Pedido consultar (String numero) {
        Pedido p = null;
       
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from pooPedido where " +
                                                 "numero = ?");
            
            ps.setString(1, numero);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next() == true) {
                p = new Pedido (numero, rs.getString("dataEmissao"));
                p.setDataPagto(rs.getString("dataPagto"));
                p.setFormaPagto(rs.getBoolean("formaPagto"));
                p.setSituacao(rs.getBoolean("situacao"));
                p.setCliente(new DaoCliente(conn).consultar(rs.getString("cpfCliente")));
                p.setVendedor(new DaoVendedor(conn).consultar(rs.getString("cpfVendedor")));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());
        }
        return (p);
    }
    
    public void excluir(Pedido pedido) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM pooPedido where numero = ?");
            
            ps.setString(1, pedido.getNumero());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());
        }
    }
}
