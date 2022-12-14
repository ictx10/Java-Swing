/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import businessLayer.CustomerBL;
import businessLayer.ProductBL;
import dataTransferObject.Customer;
import dataTransferObject.Product;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author caoth
 */
public class frmStoreManager extends javax.swing.JFrame {

    /**
     * Creates new form frmStoreManager
     */
    public frmStoreManager() {
        initComponents();
        initProduct();
//        initCustomer();
    }
    void initProduct(){
        List<Product> listPD;
        listPD = ProductBL.dsProduct();
        System.out.println(listPD.size());
        
        if(listPD.size()>0){
            model = (DefaultTableModel)tblPdetail.getModel();
            model.setRowCount(0);
            for(Product p:listPD)
            {   
//                String status ;
//                if (p.getbPstatus() == true) 
//                    status = "Còn hàng";
//                else
//                    status = "Hết hàng";
                model.addRow(new Object[] {p.getiID(),p.getStrPname(),p.getStrPstatus(),p.getiPnumber(),p.getStrPin(),p.getStrPout(),p.getfPprice()});
            }            
        }
        
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPdetail = new javax.swing.JTable();
        btnPrefresh = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtPsbname = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPsbname = new javax.swing.JTable();
        btnPsearch = new javax.swing.JButton();
        btnPedit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtCbysdt = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCbysdt = new javax.swing.JTable();
        btnCnew = new javax.swing.JButton();
        btnCsearch = new javax.swing.JButton();
        btnPin = new javax.swing.JButton();
        btnPout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jLabel1.setText("QUẢN LÝ CỬA HÀNG ĐIỆN THOẠI");

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        tblPdetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã SP", "Tên Sản phẩm", "Hãng", "Số lượng", "Ngày nhập", "Ngày xuất", "Giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPdetail);
        if (tblPdetail.getColumnModel().getColumnCount() > 0) {
            tblPdetail.getColumnModel().getColumn(0).setMinWidth(15);
            tblPdetail.getColumnModel().getColumn(0).setMaxWidth(50);
            tblPdetail.getColumnModel().getColumn(2).setMinWidth(100);
            tblPdetail.getColumnModel().getColumn(2).setMaxWidth(125);
            tblPdetail.getColumnModel().getColumn(3).setMinWidth(35);
            tblPdetail.getColumnModel().getColumn(3).setMaxWidth(75);
            tblPdetail.getColumnModel().getColumn(4).setMinWidth(100);
            tblPdetail.getColumnModel().getColumn(4).setMaxWidth(175);
            tblPdetail.getColumnModel().getColumn(5).setMinWidth(100);
            tblPdetail.getColumnModel().getColumn(5).setMaxWidth(175);
        }

        btnPrefresh.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnPrefresh.setText("Refresh");
        btnPrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 947, Short.MAX_VALUE)
                    .addComponent(btnPrefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrefresh)
                .addGap(9, 9, 9))
        );

        jTabbedPane1.addTab("Chi tiết cửa hàng", jPanel1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel2.setText("Tên Thiết bị:");

        tblPsbname.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã SP", "Tên Sản phẩm", "Hãng", "Số lượng", "Ngày nhập", "Ngày xuất", "Giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPsbname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPsbnameMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPsbname);
        if (tblPsbname.getColumnModel().getColumnCount() > 0) {
            tblPsbname.getColumnModel().getColumn(0).setMinWidth(15);
            tblPsbname.getColumnModel().getColumn(0).setMaxWidth(50);
            tblPsbname.getColumnModel().getColumn(2).setMinWidth(100);
            tblPsbname.getColumnModel().getColumn(2).setMaxWidth(125);
            tblPsbname.getColumnModel().getColumn(3).setMinWidth(35);
            tblPsbname.getColumnModel().getColumn(3).setMaxWidth(75);
            tblPsbname.getColumnModel().getColumn(4).setMinWidth(100);
            tblPsbname.getColumnModel().getColumn(4).setMaxWidth(175);
            tblPsbname.getColumnModel().getColumn(5).setMinWidth(100);
            tblPsbname.getColumnModel().getColumn(5).setMaxWidth(175);
        }

        btnPsearch.setText("Tìm thiết bị");
        btnPsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPsearchActionPerformed(evt);
            }
        });

        btnPedit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnPedit.setText("Cập nhật thiết bị");
        btnPedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 947, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPedit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPsbname, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(btnPsearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnPsearch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(txtPsbname, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPedit, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Tìm kiếm thiết bị", jPanel2);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("SDT Khách hàng:");

        tblCbysdt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Tên khách hàng", "Ngày sinh", "Giới tính", "Số điện thoại", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblCbysdt);
        if (tblCbysdt.getColumnModel().getColumnCount() > 0) {
            tblCbysdt.getColumnModel().getColumn(0).setMaxWidth(50);
            tblCbysdt.getColumnModel().getColumn(2).setMinWidth(125);
            tblCbysdt.getColumnModel().getColumn(2).setMaxWidth(150);
            tblCbysdt.getColumnModel().getColumn(3).setMinWidth(75);
            tblCbysdt.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        btnCnew.setText("Thêm khách hàng mới");
        btnCnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCnewActionPerformed(evt);
            }
        });

        btnCsearch.setText("Tìm khách hàng");
        btnCsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCsearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCbysdt, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnCnew, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCbysdt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCnew, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCsearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Tra cứu khách hàng", jPanel3);

        btnPin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnPin.setText("Nhập hàng");
        btnPin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPinActionPerformed(evt);
            }
        });

        btnPout.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnPout.setText("Xuất hàng");
        btnPout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 976, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPin, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPout, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(110, 110, 110))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPout, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPin, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCnewActionPerformed
        frmNewCustomer nc = new frmNewCustomer();        
        nc.setVisible(true);        
    }//GEN-LAST:event_btnCnewActionPerformed

    private void btnPinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPinActionPerformed
        frmAddProduct add = new frmAddProduct();
        add.setVisible(true);
    }//GEN-LAST:event_btnPinActionPerformed

    
    DefaultTableModel model;
    private void btnPsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPsearchActionPerformed
        String click = txtPsbname.getText();
        if ("".equals(click)){
            JOptionPane.showMessageDialog(null,"Vui lòng nhập Tên Sản phẩm");
        }else{
            List<Product> listPd;
            String PDname = txtPsbname.getText();
            listPd = ProductBL.searchPD(PDname);
            if (listPd.size() <= 0)
            {
                JOptionPane.showMessageDialog(null,"Không thể tìm được Sản phẩm");
            }else{
                model = (DefaultTableModel)tblPsbname.getModel();
                model.setRowCount(0);
                for (Product pd:listPd)
                {
                    model.addRow(new Object[] {pd.getiID(),pd.getStrPname(),pd.getStrPstatus(),pd.getiPnumber(),pd.getStrPin(),pd.getStrPout(),pd.getfPprice()});
                }
            }
        }
    }//GEN-LAST:event_btnPsearchActionPerformed

    private void btnPoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoutActionPerformed
        // TODO add your handling code here:
        String click = txtPsbname.getText();
        if ("".equals(click)){
            JOptionPane.showMessageDialog(null,"Vui lòng nhập Tên Sản phẩm");
        }else{
            int reply = JOptionPane.showConfirmDialog(rootPane,"Bạn muốn xuất mặt hàng: "+ txtPsbname.getText() + "?","Confirm", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION)
            {
                ProductBL.ProductOut(id);
                model.removeRow(tblPsbname.getSelectedRow());
                txtPsbname.setText("");
            }
        }
    }//GEN-LAST:event_btnPoutActionPerformed
        int id;
        
    private void tblPsbnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPsbnameMouseClicked
        // TODO add your handling code here:     
       txtPsbname.setText(String.valueOf(model.getValueAt(tblPsbname.getSelectedRow(),1)));
       id=Integer.parseInt(String.valueOf(model.getValueAt(tblPsbname.getSelectedRow(),0)));
    }//GEN-LAST:event_tblPsbnameMouseClicked

    private void btnCsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCsearchActionPerformed
        // TODO add your handling code here:
        String click = txtCbysdt.getText();
        if ("".equals(click)){
            JOptionPane.showMessageDialog(null,"Vui lòng nhập SDT Khách hàng");
        }else{
            List<Customer> listC;
            String Cname = txtCbysdt.getText();
            listC = CustomerBL.searchC(Cname);
                if (listC.size() <= 0)
                    {
                         JOptionPane.showMessageDialog(null,"Không thể tìm được Khách hàng");
          
                    }
                else 
                {
                    model = (DefaultTableModel)tblCbysdt.getModel();
                    model.setRowCount(0);
                    for (Customer c:listC)
                    {
                        String gender ;
                          if (c.getbCgender() == true) 
                              gender = "Nam";
                          else
                              gender = "Nữ";
                        model.addRow(new Object[] {c.getId(), c.getStrCname(), c.getstrCbirthday(), gender, c.getStrCsdt(), c.getStrCemail()});
                    }
                }
            }                           
    }//GEN-LAST:event_btnCsearchActionPerformed

    private void btnPrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrefreshActionPerformed
        initProduct();
    }//GEN-LAST:event_btnPrefreshActionPerformed

    private void btnPeditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeditActionPerformed
        // TODO add your handling code here:
       Product test = new Product();

        model = (DefaultTableModel)tblPsbname.getModel();
        test.setiID((int) model.getValueAt(tblPsbname.getSelectedRow(), 0));
        test.setStrPname((String) model.getValueAt(tblPsbname.getSelectedRow(), 1));
//        test.setbPstatus(String.valueOf(model.getValueAt(tblPsbname.getSelectedRow(), 2)).equals("Còn hàng")?true:false);
        test.setStrPstatus((String) model.getValueAt(tblPsbname.getSelectedRow(), 2));
        test.setiPnumber((int) model.getValueAt(tblPsbname.getSelectedRow(), 3));
        test.setStrPin((String) model.getValueAt(tblPsbname.getSelectedRow(), 4));
        test.setStrPout((String) model.getValueAt(tblPsbname.getSelectedRow(), 5));
        test.setfPprice((float) model.getValueAt(tblPsbname.getSelectedRow(), 6));

        frmEditProduct ep = new frmEditProduct();
        ep.setAbc(test);
        ep.setVisible(true);        
    }//GEN-LAST:event_btnPeditActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmStoreManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmStoreManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmStoreManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmStoreManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmStoreManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCnew;
    private javax.swing.JButton btnCsearch;
    private javax.swing.JButton btnPedit;
    private javax.swing.JButton btnPin;
    private javax.swing.JButton btnPout;
    private javax.swing.JButton btnPrefresh;
    private javax.swing.JButton btnPsearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblCbysdt;
    private javax.swing.JTable tblPdetail;
    private javax.swing.JTable tblPsbname;
    private javax.swing.JTextField txtCbysdt;
    private javax.swing.JTextField txtPsbname;
    // End of variables declaration//GEN-END:variables
}
