package Entitiy;

import java.io.Serializable;
import java.util.Date;

public class Personel extends Kisi implements Calisan, Serializable {
    private Date baslangicTarihi;
    public Personel(Date baslangicTarihi)
    {
        super();
        this.baslangicTarihi=baslangicTarihi;
    }
    public Personel(String name, String cinsiyet, Date dogumTarihi, Date baslangicTarihi,int ID)
    {
        super(name,cinsiyet,dogumTarihi,ID);
        this.baslangicTarihi=baslangicTarihi;
    }
    public Date getBaslangicTarihi()
    {
        return baslangicTarihi;
    }
    public void setBaslangicTarihi()
    {
        this.baslangicTarihi=baslangicTarihi;
    }
    @Override
    public int getSalary()
    {
        return 0;
    }

}
