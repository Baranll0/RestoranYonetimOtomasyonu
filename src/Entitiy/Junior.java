package Entitiy;
import java.io.Serializable;
import java.util.Date;

public class Junior extends Personel implements Serializable {
    private float aylikMaas;
    private Musteri musteri; //aggregation olduğundan dolayı
    //boş bir constructor olmalı. Yani Müşteri olmadan
    //Junior yine de var olabilir.
    public Junior()
    {
        super();
    }
    private Date cikisTarihi;
    public Junior(Date baslangicTarihi,float aylikMaas,Date cikisTarihi)
    {
        super(baslangicTarihi);
        this.aylikMaas=aylikMaas;
        this.cikisTarihi=cikisTarihi;
    }
    public Junior(String name,String cinsiyet,Date dogumTarihi,Date baslangicTarihi,int aylikMaas,Date cikisTarihi,int ID)
    {
        super(name,cinsiyet,dogumTarihi,baslangicTarihi,ID);
        this.aylikMaas=aylikMaas;
        this.cikisTarihi=cikisTarihi;
    }
    @Override
    public int getSalary()
    {
        return (int) aylikMaas;
    }

}

