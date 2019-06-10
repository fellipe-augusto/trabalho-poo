/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.control;

import fatec.poo.model.ItemPedido;
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
public class DaoItemPedido {
    
    private Connection conn;
    
    public DaoItemPedido(Connection conn) {
         this.conn = conn;
    }
    
    public void inserir(ItemPedido itemPedido) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO pooItemPedido(sequencia, qtdeVendida, numeroPedido, codigoProduto) VALUES(?,?,?,?)");
            ps.setInt(1, itemPedido.getSequencia());
            ps.setDouble(2, itemPedido.getQtdeVendida());
            ps.setString(3, itemPedido.getPedido().getNumero());
            ps.setString(4, itemPedido.getProduto().getCodigo());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void alterar(ItemPedido itemPedido) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE pooItemPedido set qtdeVendida = ?, numeroPedido = ?, codigoProduto = ?" +
                                                 "where sequencia = ?");
            
            ps.setDouble(1, itemPedido.getQtdeVendida());
            ps.setString(2, itemPedido.getPedido().getNumero());
            ps.setString(3, itemPedido.getProduto().getCodigo());
            ps.setInt(4, itemPedido.getSequencia());
           
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());
        }
    }
    
    public ItemPedido consultar (String numero) {
        ItemPedido ip = null;
       
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from pooItemPedido where " +
                                                 "numero = ?");
            
            ps.setString(1, numero);
            ResultSet rs = ps.executeQuery();
           
            /*while(rs.next() == true) {
                ip = new ItemPedido (rs.getInt("sequencia"), rs.getDouble("qtdeVendida"), new DaoProduto(conn).consultar(rs.getString("codigoProduto")));
                ip.setFormaPagto(rs.getBoolean("formaPagto"));
                ip.setSituacao(rs.getBoolean("situacao"));
                ip.setCliente(new DaoCliente(conn).consultar(rs.getString("cpfCliente")));
                ip.setVendedor(new DaoVendedor(conn).consultar(rs.getString("cpfVendedor")));
            }*/
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());
        }
        return (ip);
    }
}
