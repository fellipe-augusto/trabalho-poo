/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.control;

import fatec.poo.model.ItemPedido;
import fatec.poo.model.Pedido;
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
    
    public void inserir(ItemPedido itempedido) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO pooItemPedido(sequencia, qtdeVendida, numeroPedido, codigoProduto) VALUES(?,?,?,?)");
            ps.setInt(1, itempedido.getSequencia());
            ps.setDouble(2, itempedido.getQtdeVendida());
            ps.setObject(3, itempedido.getPedido());
            ps.setObject(4, itempedido.getProduto());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}
