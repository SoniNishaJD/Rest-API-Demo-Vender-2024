package com.nishasoni.restdemo.model;

public class Vender {
    private String venderId;
    private String venderName;
    private String venderAddress;
    private String venderPhonenumber;

    public Vender(String venderId, String venderName, String venderAddress, String venderPhonenumber) {
        this.venderId = venderId;
        this.venderName = venderName;
        this.venderAddress = venderAddress;
        this.venderPhonenumber = venderPhonenumber;
    }

    public Vender() {
    }

    public Vender(String venderId) {
        this.venderId = venderId;
    }

    public Vender(String venderName, String venderAddress, String venderPhonenumber) {
        this.venderName = venderName;
        this.venderAddress = venderAddress;
        this.venderPhonenumber = venderPhonenumber;
    }

    public String getVenderId() {
        return venderId;
    }

    public void setVenderId(String venderId) {
        this.venderId = venderId;
    }

    public String getVenderName() {
        return venderName;
    }

    public void setVenderName(String venderName) {
        this.venderName = venderName;
    }

    public String getVenderAddress() {
        return venderAddress;
    }

    public void setVenderAddress(String venderAddress) {
        this.venderAddress = venderAddress;
    }

    public String getVenderPhonenumber() {
        return venderPhonenumber;
    }

    public void setVenderPhonenumber(String venderPhonenumber) {
        this.venderPhonenumber = venderPhonenumber;
    }
}
