/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLayer;

import forms.frmStoreManager;
import forms.frmLogin;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JOptionPane;
/**
 *
 * @author caoth
 */
public class LoginBL extends javax.swing.JFrame{
    JButton bt ;
    public void loginTV( String IDLOGIN, String PWLOGIN){
        try(Connection ketNoi = CSDL.getKetNoi()){
            String sql = "select * from DANGNHAP where IDLOGIN ='"+IDLOGIN+"'and PWLOGIN ='"+PWLOGIN+"' ";
            java.sql.Statement statement= ketNoi.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if(rs.next()){
                JOptionPane.showMessageDialog(rootPane,"Đăng nhập thành công !");
                frmStoreManager hm = new frmStoreManager();
                hm.setVisible(true);
                frmLogin lg = new frmLogin();
                lg.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(rootPane, "Thông tin sai hoặc Tài khoản không tồn tại !!");
            }
        }catch(Exception e){
            System.out.println("Hệ thống lỗi "+e.getMessage());
        }  
    }
}
