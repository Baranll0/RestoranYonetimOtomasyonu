package Entitiy;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;
import java.io.Serializable;

public class Siparis implements Odeme,Serializable {
    private static final AtomicInteger count=new AtomicInteger(0);
    private int siparisID;
    private Date siparisTarihi;
    private String siparisDetay;
    private String ekstraNot;
    Musteri musteri;//Composition
    //Burada Composition olduğundan
    //Sipariş sınıfının boş constructoru olmamalı
    //Bu yüzden Müşteri olmadan Sipariş sınıfı var olamayacaktır.

    public Siparis(int siparisID, Date siparisTarihi, String siparisDetay, String ekstraNot) {
        this.siparisID = siparisID;
        this.siparisTarihi = siparisTarihi;
        this.siparisDetay = siparisDetay;
        this.ekstraNot = ekstraNot;
    }
    public Siparis( Date siparisTarihi, String siparisDetay, String ekstraNot) {

        this.siparisTarihi = siparisTarihi;
        this.siparisDetay = siparisDetay;
        this.ekstraNot = ekstraNot;
    }
    public int getSiparisID() {
        return siparisID;
    }

    public void setSiparisID(int siparisID) {
        this.siparisID = siparisID;
    }

    public Date getSiparisTarihi() {
        return siparisTarihi;
    }

    public void setSiparisTarihi(Date siparisTarihi) {
        this.siparisTarihi = siparisTarihi;
    }

    public String getSiparisDetay() {
        return siparisDetay;
    }

    public void setSiparisDetay(String siparisDetay) {
        this.siparisDetay = siparisDetay;
    }

    public String getEkstraNot() {
        return ekstraNot;
    }

    public void setEkstraNot(String ekstraNot) {
        this.ekstraNot = ekstraNot;
    }

    @Override
    public void islemOdemeleri() {
        System.out.println("İslem basarili.Makbuzunuz email üzerinden atılmıştır.");
    }
}

