package com.example.adminn;

public class Data {
    private String alamat;
    private String emaill;
    private String nama;
    private String telpon;

    public Data() {
    }

    public Data(String alamat, String emaill, String nama, String telpon) {
        this.alamat = alamat;
        this.emaill = emaill;
        this.nama = nama;
        this.telpon = telpon;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getEmaill() {
        return emaill;
    }

    public void setEmaill(String emaill) {
        this.emaill = emaill;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTelpon() {
        return telpon;
    }

    public void setTelpon(String telpon) {
        this.telpon = telpon;
    }

    public void add(Data data) {
    }
}
