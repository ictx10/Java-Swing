/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dataTransferObject;

import java.sql.Date;

/**
 *
 * @author caoth
 */
public class Customer {
    private int id;
    private String strCname, strCbirthday, strCemail, strCsdt;
    private Boolean bCgender;

    public int getId() {
        return id;
    }

    public String getStrCname() {
        return strCname;
    }

    public String getstrCbirthday() {
        return strCbirthday;
    }

    public String getStrCemail() {
        return strCemail;
    }

    public String getStrCsdt() {
        return strCsdt;
    }

    public Boolean getbCgender() {
        return bCgender;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStrCname(String strCname) {
        this.strCname = strCname;
    }

    public void setstrCbirthday(String strCbirthday) {
        this.strCbirthday = strCbirthday;
    }

    public void setStrCemail(String strCemail) {
        this.strCemail = strCemail;
    }

    public void setStrCsdt(String strCsdt) {
        this.strCsdt = strCsdt;
    }

    public void setbCgender(Boolean bCgender) {
        this.bCgender = bCgender;
    }

    public Customer(int id, String strCname, String strCbirthday, String strCemail, String strCsdt, Boolean bCgender) {
        this.id = id;
        this.strCname = strCname;
        this.strCbirthday = strCbirthday;
        this.strCemail = strCemail;
        this.strCsdt = strCsdt;
        this.bCgender = bCgender;
    }

    public Customer() {
        this.strCname = "";
        this.strCbirthday = "";
        this.strCemail = "";
        this.strCsdt = "";
        this.bCgender = true;
    }

    
}
