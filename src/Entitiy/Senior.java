package Entitiy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Senior extends Personel implements Serializable {
    private int yillikMaas;
    private ArrayList<Junior>sorumlu;
    public Senior(Date baslangicTarihi,int yillikMaas)
    {
        super(baslangicTarihi);
        this.yillikMaas=yillikMaas;
        this.sorumlu=new ArrayList<Junior>();

    }
    public Senior(String name,String cinsiyet,Date dogumTarihi,Date baslangicTarihi,int yillikMaas,int ID)
    {
        super(name,cinsiyet,dogumTarihi,baslangicTarihi,ID);
        this.yillikMaas=yillikMaas;
        this.sorumlu=new ArrayList<Junior>();

    }
    @Override
    public int getSalary()
    {
        Date gecerliTarih=new Date();
        int aylikMaas;
        long fark=gecerliTarih.getTime()-getBaslangicTarihi().getTime();
        long calismaYili=fark/(1001*60*60*24*365);
        System.out.println("Calisma Yili: "+(int)calismaYili);
        if (calismaYili>0)
        {
            aylikMaas=(yillikMaas+(yillikMaas/10*(int)yillikMaas/12));

        }
        else
        {
            aylikMaas=yillikMaas/12;
        }
        return aylikMaas;

    }

}

