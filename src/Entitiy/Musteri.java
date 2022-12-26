package Entitiy;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Musteri extends Kisi implements Serializable {
    Siparis siparis=new Siparis();//Composition
    private Date kayitTarihi;
    private ArrayList<Siparis> siparises;
    private String krediKartDetay;
    private ArrayList<Rezervasyon> rezervasyons;
    public Musteri()
    {

    }
    public Musteri(int ID, String name, Date dogumTarihi, String cinsiyet, Date kayitTarihi, ArrayList<Siparis> siparises, String krediKartDetay, ArrayList<Rezervasyon> rezervasyons) {
        super();
        this.kayitTarihi = kayitTarihi;
        this.siparises = siparises;
        this.krediKartDetay = krediKartDetay;
        this.rezervasyons = rezervasyons;
    }
    public Date getKayitTarihi() {
        return kayitTarihi;
    }
    public void setKayitTarihi(Date kayitTarihi) {
        this.kayitTarihi = kayitTarihi;
    }
    public ArrayList<Siparis> getSiparises() {
        return siparises;
    }
    public void setSiparises(ArrayList<Siparis> siparises) {
        this.siparises = siparises;
    }
    public String getKrediKartDetay() {
        return krediKartDetay;
    }
    public void setKrediKartDetay(String krediKartDetay) {
        this.krediKartDetay = krediKartDetay;
    }
    public ArrayList<Rezervasyon> getRezervasyons() {
        return rezervasyons;
    }
    public void setRezervasyons(ArrayList<Rezervasyon> rezervasyons) {
        this.rezervasyons = rezervasyons;
    }
    public void rezYap(Date rezTarihi)
    {
        this.rezervasyons.add(new Rezervasyon(rezTarihi));
    }
    public void siparisAl(Date siparisTarihi,String siparisDetay,String ekstraNot,String odemeTuru,String tarafindan)
    {
        this.siparises.add(new OnlineOdeme(siparisTarihi,siparisDetay,ekstraNot,odemeTuru,tarafindan));
    }
    public void siparisAl(Date rezervasyonTarihi,Date siparisTarihi,String siparisDetay,String ekstraNot,int tableNumber)
    {
        this.siparises.add(new RestoranSiparis(rezervasyonTarihi,siparisTarihi,siparisDetay,ekstraNot,tableNumber));
    }
    public void print(String siparisDetay)
    {
        System.out.println(siparisDetay);
    }
}

