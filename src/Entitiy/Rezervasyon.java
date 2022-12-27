package Entitiy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class Rezervasyon implements Serializable {
    private static final AtomicInteger count=new AtomicInteger(0);
    private Date rezervasyonTarihi;
    private int rezervasyonID;
    private ArrayList<RestoranSiparis> restSiparis;
    Musteri musteri=new Musteri();//Aggregation
    //Burada aggregation olduğundan dolayı
    //Rezervasyon sınıfının boş bir constructoru bulunmalı
    //Dolayısıyla müşteri olmadan rezervasyon sınıfı var olabilir.
    public Rezervasyon()
    {
        this.rezervasyonTarihi=new Date();
        this.rezervasyonID=count.incrementAndGet();
        this.restSiparis=new ArrayList<>(1);

    }
    public Rezervasyon(Date rezervasyonTarihi)
    {
        this.rezervasyonTarihi=rezervasyonTarihi;
        this.rezervasyonID=count.incrementAndGet();
        this.restSiparis=new ArrayList<>(1);
    }

    public Date getRezervasyonTarihi() {
        return rezervasyonTarihi;
    }

    public void setRezervasyonTarihi(Date rezervasyonTarihi) {
        this.rezervasyonTarihi = rezervasyonTarihi;
    }

    public int getRezervasyonID() {
        return rezervasyonID;
    }

    public void setRezervasyonID(int rezervasyonID) {
        this.rezervasyonID = rezervasyonID;
    }

    public ArrayList<RestoranSiparis> getRestSiparis() {
        return restSiparis;
    }

    public void setRestSiparis(ArrayList<RestoranSiparis> restSiparis) {
        this.restSiparis = restSiparis;
    }

    public void ResSiparisAl(Date siparisTarihi, String siparisDetay, String ekstraNot, int tableNumber)
    {
        this.restSiparis.add(new RestoranSiparis(siparisTarihi,siparisDetay,ekstraNot,tableNumber));
    }
}

