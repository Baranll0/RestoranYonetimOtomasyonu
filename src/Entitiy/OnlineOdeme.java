package Entitiy;

import java.util.Date;

public class OnlineOdeme extends Siparis{
    private String odemeSekli;
    private String tarafindan;
    public OnlineOdeme(Date siparisTarihi, String siparisDetay, String ekstraNot, String odemeSekli, String tarafindan)
    {
        super(siparisTarihi,siparisDetay,ekstraNot);
        this.odemeSekli=odemeSekli;
        this.tarafindan=tarafindan;

    }
    public OnlineOdeme(int siparisID, Date siparisTarihi, String siparisDetay, String ekstraNot, String odemeSekli, String tarafindan) {
        super(siparisID, siparisTarihi, siparisDetay, ekstraNot);
        this.odemeSekli = odemeSekli;
        this.tarafindan = tarafindan;
    }

    public String getOdemeSekli() {
        return odemeSekli;
    }

    public void setOdemeSekli(String odemeSekli) {
        this.odemeSekli = odemeSekli;
    }

    public String getTarafindan() {
        return tarafindan;
    }

    public void setTarafindan(String tarafindan) {
        this.tarafindan = tarafindan;
    }
}

