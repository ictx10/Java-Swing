/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLayer;

import dataTransferObject.Customer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author caoth
 */
public class CustomerBL {
    public static int addCustomer(Customer c){
        int smtC = 0;
            String sql = "INSERT INTO KHACHHANG(KH, TENKH, NGAYSINH, EMAIL, PHAI, SDT) VALUES (?,?,?,?,?,?)";
         try(Connection ketNoi=CSDL.getKetNoi()){
           PreparedStatement pstC = ketNoi.prepareStatement(sql);
            pstC.setInt(1, c.getId());
            pstC.setString(2, c.getStrCname());
            pstC.setString(3, c.getstrCbirthday());
            pstC.setString(4, c.getStrCemail());
            pstC.setBoolean(5, c.getbCgender());
            pstC.setString(6, c.getStrCsdt());
            
            smtC = pstC.executeUpdate();           
        }
        catch(Exception ex)
        {
            System.out.println("Lỗi kết nối với KHACHHANG "+ex.getMessage());
        }
        return smtC;
    }
    
    public static List<Customer> searchC(String Csdt){
        List<Customer> rs=null;
        try(Connection ketNoi = CSDL.getKetNoi()){
            rs=new ArrayList<>();
            java.sql.Statement statement= ketNoi.createStatement();
            String sql="SELECT * FROM KHACHHANG WHERE SDT like N'%" + Csdt + "%'";
            ResultSet resultSet=statement.executeQuery(sql);
        while(resultSet.next())
        {
             Customer c = new Customer();
             c.setId(resultSet.getInt("KH"));
             c.setStrCname(resultSet.getString("TENKH"));
             c.setstrCbirthday(resultSet.getString("NGAYSINH"));
             c.setStrCemail(resultSet.getString("EMAIL"));
             c.setbCgender(resultSet.getBoolean("PHAI"));
             c.setStrCsdt(resultSet.getString("SDT"));

             rs.add(c);
        }
       }
        catch(Exception e)
        {
            System.out.println("Không thể kết nối KHACHHANG để tìm Khách hàng  "+e.getMessage());
        }
        return rs;
    }
}
