/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dataTransferObject;

import java.util.ArrayList;

/**
 *
 * @author caoth
 */
public class Product {
    public static ArrayList<Product> lstProduct = new ArrayList<>();
    
    private int iID, iPnumber;
    private float fPprice;
    private String strPname, strPin, strPout, strPstatus;
//    private boolean bPstatus;

    public static ArrayList<Product> getLstProduct() {
        return lstProduct;
    }

    public int getiID() {
        return iID;
    }
    public int getiPnumber() {
        return iPnumber;
    }

    public float getfPprice() {
        return fPprice;
    }

    public String getStrPname() {
        return strPname;
    }

//    public Boolean getbPstatus() {
//        return bPstatus;
//    }

    public String getStrPstatus(){
        return strPstatus;
    }
    public String getStrPin() {
        return strPin;
    }

    public String getStrPout() {
        return strPout;
    }

    public static void setLstProduct(ArrayList<Product> lstProduct) {
        Product.lstProduct = lstProduct;
    }

    public void setiID(int iID) {
        this.iID = iID;
    }
    public void setiPnumber(int iPnumber) {
        this.iPnumber = iPnumber;
    }

    public void setfPprice(float fPprice) {
        this.fPprice = fPprice;
    }

    public void setStrPname(String strPname) {
        this.strPname = strPname;
    }

//    public void setbPstatus(Boolean bPstatus) {
//        this.bPstatus = bPstatus;
//    }
    public void setStrPstatus(String strPstatus) {
        this.strPstatus = strPstatus;
    }
    public void setStrPin(String strPin) {
        this.strPin = strPin;
    }

    public void setStrPout(String strPout) {
        this.strPout = strPout;
    }

//    }
    public Product(int id, String strPname, String strPstatus, int iPnumber, String strPin, String strPout, float fPprice){
        this.iID = id;
        this.strPname = strPname;
        this.strPstatus = strPstatus;
        this.iPnumber = iPnumber;
        this.strPin = strPin;
        this.strPout = strPout;
        this.fPprice = fPprice;

    }

    public Product() {
        this.iID = 0;
        this.strPname = "";
        this.strPstatus = "";
        this.iPnumber = 0;
        this.strPin = "";
        this.strPout = "";
        this.fPprice = 0;
    }
}
