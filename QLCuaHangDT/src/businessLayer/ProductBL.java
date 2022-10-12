/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLayer;

import dataTransferObject.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author caoth
 */
public class ProductBL {
    public static List<Product> dsProduct(){
        List<Product> rs = null;
        try(Connection ketNoi = CSDL.getKetNoi()){
            rs = new ArrayList<>();
            java.sql.Statement sta = ketNoi.createStatement();
            String sql = "select * from CHDT";
            ResultSet resultSet = sta.executeQuery(sql);
            
            while(resultSet.next()){
                Product p = new Product();
                p.setiID(resultSet.getInt("ID"));
                p.setStrPname(resultSet.getString("TENSP"));
                p.setStrPstatus(resultSet.getString("HANG"));
                p.setStrPin(resultSet.getString("NGAYNHAP"));
                p.setStrPout(resultSet.getString("NGAYXUAT"));
                p.setfPprice(resultSet.getFloat("GIA"));
                p.setiPnumber(resultSet.getInt("SOLUONG"));

               
                rs.add(p);              
            }            
        }catch(Exception e){
            System.out.println("Không thể truy cập CHDT để truy xuất dữ liệu "+e.getMessage());
        }  
        return rs;
    }
    
    public static int ProductIn(Product pd){
        int smt = 0;
        String sql = "insert into CHDT(ID, TENSP, HANG, SOLUONG, NGAYNHAP, NGAYXUAT, GIA) values(?,?,?,?,?,?,?)";
        try(Connection ketNoi=CSDL.getKetNoi()){
            PreparedStatement pst = ketNoi.prepareStatement(sql);      
            
            pst.setInt(1, pd.getiID());
            pst.setString(2, pd.getStrPname());
            pst.setString(3, pd.getStrPstatus());
            pst.setInt(4, pd.getiPnumber());
            pst.setString(5, pd.getStrPin());
            pst.setString(6, pd.getStrPout());
            pst.setFloat(7, pd.getfPprice());            
            smt = pst.executeUpdate();           
        }
        catch(Exception ex)
        {
            System.out.println("Không thể truy cập CHDT để nhập hàng "+ex.getMessage());
        }
        return smt;
    }
    
     public static void ProductOut(int id)
    {
      try(Connection ketNoi = CSDL.getKetNoi()){
      String sql="DELETE FROM CHDT WHERE ID =" + id;
      PreparedStatement statement = ketNoi.prepareStatement(sql);
      statement.execute();
      }
      catch(Exception e)
        {
            System.out.println("Không thể truy cập CHDT dể xuất hàng "+e.getMessage());
        }
    }
     public static List<Product> searchPD(String PDname){
        List<Product> rs = null;
        try(Connection ketNoi = CSDL.getKetNoi()){
            rs=new ArrayList<>();
            java.sql.Statement statement= ketNoi.createStatement();
            String sql="SELECT * FROM CHDT WHERE TENSP like N'%" + PDname + "%'";
            ResultSet resultSet=statement.executeQuery(sql);
        while(resultSet.next())
        {
            Product pd = new Product();
            pd.setiID(resultSet.getInt("ID"));
            pd.setStrPname(resultSet.getString("TENSP"));
            pd.setStrPin(resultSet.getString("NGAYNHAP"));
            pd.setStrPout(resultSet.getString("NGAYXUAT"));
            pd.setStrPstatus(resultSet.getString("HANG"));
            pd.setfPprice(resultSet.getFloat("GIA"));
            pd.setiPnumber(resultSet.getInt("SOLUONG"));

            rs.add(pd);
        }
       }
        catch(Exception e)
        {
            System.out.println("Không thể kết nối CHDT để tìm Sản phẩm "+e.getMessage());
        }
        return rs;
     }
     public static int ProductEdit(Product up){
        int edit = 0;
        try(Connection ketNoi = CSDL.getKetNoi()){            
//            String sql = "UPDATE CHDT SET TENSP='"+up.getStrPname()+"',TINHTRANG='"+(up.getbPstatus()?true:false)+",SOLUONG='"+up.getiPnumber()+"',NGAYNHAP='"+up.getStrPin()+"',NGAYXUAT='"+up.getStrPout()+"',GIA='"+up.getfPprice()+"' where ID='"+up.getiID()+"'";
            String sql = "update CHDT set TENSP = ?,HANG = ?, SOLUONG = ?, NGAYNHAP = ?, NGAYXUAT = ?, GIA = ? where ID = ?";
            PreparedStatement editstatement = ketNoi.prepareStatement(sql);
                editstatement.setString(1, up.getStrPname());
                editstatement.setString(2, up.getStrPstatus());
                editstatement.setInt(3, up.getiPnumber());
                editstatement.setString(4, up.getStrPin());
                editstatement.setString(5, up.getStrPout());
                editstatement.setFloat(6, up.getfPprice());
                editstatement.setInt(7,up.getiID());
            
            edit = editstatement.executeUpdate();
            
            System.err.println(sql);
        }catch(Exception e){
//            e.printStackTrace();
            System.out.println("Hệ thống không update được "+e.getMessage());
        }
        return edit;
     }
}
