# Java
**a Java project use Java Swing connect to SQL Server**



How to run project (with SQL Server and Netbeans)

1/ Connect Netbeans to MS SQL Server:
    Step 1: use MS SQL Server and open file QLCuaHangDT.sql then execute the file
    Step 2: use Netbeans to open java project "QLCuaHangDT"
    Step 3: check your connect between SQL Server and Netbeans:
            - in tab Services/Databases/Driver make sure you add driver Mircrosoft SQL Server (MS jdbc for SQL server)*
            - open file businessLayer/CSDL.java
            - check driver line 20: add driver link in the double quotes
            - change the device's name (LAPTOP-TFIJGOKB) 
            - replace id,pw by your SQL Server Authenication in line 22
    Step 4: run file TestKetNoi (if it build successful more forward, then try again)
2/ Run the project:
    Step 1: run file frmLogin in folder forms and type down "admin" for Tài Khoản and "1234" for Mật Khẩu, then click Đăng Nhập
    Step 2: a main form (frmStoreManager) will appear with 3 jTabbedPane:
            - the first one will show you all database in table CDHT. You can also add new value for table CHDT by button "Nhập hàng".
            - the second is search in CHDT by name (not Primary Key) then show it in the table below. And you can change the column what you search before with button "Cập nhật thiết bị" (you can only change what isn't the Primary Key "Mã SP").
            - the third is search by customer's number (not Primary Key) and show it when you click "Tìm khách hàng". Another button "Thêm khách hàng mới" just like "Nhập hàng" in the 1st tab, but it add new Customer to Database "KHACHHANG". (you can't delete Customer by using Netbeans, only in Database)
