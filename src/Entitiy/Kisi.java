package Entitiy;

import java.io.Serializable;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class Kisi implements Serializable {
    private static final AtomicInteger count= new AtomicInteger(0);
    private int ID;
    private String name;
    private String cinsiyet;
    private Date dogumTarihi;
    public Kisi()
    {
        this.ID=count.incrementAndGet();
        this.name="İsim yok";
        this.cinsiyet="Cinsiyet yok";
        this.dogumTarihi=new Date();
    }
    public Kisi(String name,String cinsiyet,Date dogumTarihi,int ID)
    {
        this.ID=count.incrementAndGet();
        this.name=name;
        this.cinsiyet=cinsiyet;
        this.dogumTarihi=dogumTarihi;

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public Date getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(Date dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }
}

