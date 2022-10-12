/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author KCNTT
 */
public class CSDL {
    private static Connection ketNoi;
    public static Connection getKetNoi(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://LAPTOP-TFIJGOKB:1433;databaseName=QLCuaHangDT";
            ketNoi=DriverManager.getConnection(url, "sasa", "sasa");
        }
        catch(ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
        }
        return ketNoi;
    }
}
