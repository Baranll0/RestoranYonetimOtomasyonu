package Entitiy;

import java.io.Serializable;
import java.util.Date;

public class RestoranSiparis extends Siparis implements Serializable {
    private  int masaNo;
    private Rezervasyon rezervasyonSiparisi;

    public RestoranSiparis(int masaNo)
    {
        super();
        this.masaNo=masaNo;
        this.rezervasyonSiparisi= (new Rezervasyon());//Composition
        //Burada Composition var çünkü Rezervasyon olmadan rezervasyonun Siparişi olması mümkün değil.
        //Dolayısıyla başka bir yöntem kullanarak constructor içinde newleyebiliriz.
        //Böylelikle Rezervasyon olmadan Rezervasyona Sipariş var olamayacaktır.

    }
    public RestoranSiparis(Date siparisTarihi,String siparisDetay,String ekstraNot,int masaNo)
    {
        super(siparisTarihi,siparisDetay,ekstraNot);
        this.masaNo=masaNo;
        this.rezervasyonSiparisi=new Rezervasyon();

    }
    public RestoranSiparis(Date rezervasyonTarihi,Date siparisTarihi,String siparisDetay,String ekstraNot,int masaNo)
    {
        super(siparisTarihi,siparisDetay,ekstraNot);
        this.masaNo=masaNo;
        this.rezervasyonSiparisi=new Rezervasyon(rezervasyonTarihi);

    }

    public int getMasaNo() {
        return masaNo;
    }

    public void setMasaNo(int masaNo) {
        this.masaNo = masaNo;
    }

    public Rezervasyon getRezervasyonSiparisi() {
        return rezervasyonSiparisi;
    }

    public void setRezervasyonSiparisi(Rezervasyon rezervasyonSiparisi) {
        this.rezervasyonSiparisi = rezervasyonSiparisi;
    }
}
