package GUI;

import DAO.AbstractDAO;
import DAO.PersonDAO;

import javax.print.attribute.standard.NumberUp;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class guiToolAction implements ActionListener {
    guiTool gui;
    private AbstractDAO abstractDAO;
    private YoneticiLoginGUI yoneticiLoginGUI;
    int id=0;
    private LoginGui loginGui;
    private RegisterGUI registerGUI;
    private SiparisGUI siparisGUI;
    private PersonDAO personDAO;
    private RezervasyonGUI rezervasyonGUI;
    private RezervasyonSiparisGUI rezervasyonSiparisGUI;
    private PersonelGUI personelGUI;

    public guiToolAction()
    {

    }
    public guiToolAction(YoneticiLoginGUI yoneticiLoginGUI){this.yoneticiLoginGUI=yoneticiLoginGUI;}
    public guiToolAction(PersonelGUI personelGUI){this.personelGUI=personelGUI;}
    public guiToolAction(RezervasyonSiparisGUI rezervasyonSiparisGUI){this.rezervasyonSiparisGUI=rezervasyonSiparisGUI;}
    public guiToolAction(RezervasyonGUI rezervasyonGUI){this.rezervasyonGUI=rezervasyonGUI;}
    public guiToolAction(SiparisGUI siparisGUI){ this.siparisGUI=siparisGUI;}
    public guiToolAction(LoginGui loginGui)
    {
        this.loginGui=loginGui;
    }
    public guiToolAction(RegisterGUI registerGUI)
    {
        this.registerGUI=registerGUI;
    }
    public guiToolAction(guiTool gui)
    {
        this.gui=gui;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == getLoginGui().getKayitOl()) {
            System.out.println("kyt");
            getRegisterGUI().getWindow().setContentPane(getRegisterGUI().getPanel());
            getRegisterGUI().getWindow().setVisible(true);
        }
        else if (e.getSource() == getLoginGui().getGirisYap()) {

            if (getPersonDAO().getData(".\\Person", getLoginGui().getUserT().getText(), getLoginGui().getPasswordT().getText()) == 1) {
                System.out.println("log basarili");
                getGui().getWindow().setContentPane(getGui().getPanel());
                getGui().getWindow().setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Parola yanlis");
            }
        }
        else if(e.getSource()==getRegisterGUI().getGirisYap())
        {
            System.out.println("logine yonlendirildi");
            getLoginGui().getWindow().setContentPane(getLoginGui().getPanel());
            getLoginGui().getWindow().setVisible(true);
        }
        else if (e.getSource()==getRegisterGUI().getKayitOl())
        {
            id=id+1;
            System.out.println("kayıt olundu");
            getPersonDAO().build(getRegisterGUI());
        }
        else if (e.getSource()==getGui().getSiparis())
        {
            System.out.println("siparis ekrani geldi");
            getSiparisGUI().getWindow().setContentPane(getSiparisGUI().getPanel());
            getSiparisGUI().getWindow().setVisible(true);

        }
        else if (e.getSource()==getSiparisGUI().getSiparisekle())
        {

            if (getSiparisGUI().getYemekSecimiCheckbox().isSelected())
            {
                getPersonDAO().build(getSiparisGUI().getYemekismiEtiketi1().getText().trim(),getSiparisGUI().getYemekfiyatiEtiketi1().getText().trim(), String.valueOf(getSiparisGUI().getAdetSecimi().getSelectedIndex()));
            }
            if(getSiparisGUI().getYemekSecimiCheckbox2().isSelected())
            {
                getPersonDAO().build(getSiparisGUI().getYemekismiEtiketi2().getText().trim(),getSiparisGUI().getYemekfiyatiEtiketi2().getText().trim(), String.valueOf(getSiparisGUI().getAdetSecimi2().getSelectedIndex()));
            }
            if(getSiparisGUI().getYemekSecimiCheckbox3().isSelected())
            {
                getPersonDAO().build(getSiparisGUI().getYemekismiEtiketi3().getText().trim(),getSiparisGUI().getYemekfiyatiEtiketi3().getText().trim(), String.valueOf(getSiparisGUI().getAdetSecimi3().getSelectedIndex()));
            }
            if (getSiparisGUI().getYemekSecimiCheckbox3().isSelected())
            {
                getPersonDAO().build(getSiparisGUI().getYemekismiEtiketi4().getText().trim(),getSiparisGUI().getYemekfiyatiEtiketi4().getText().trim(), String.valueOf(getSiparisGUI().getAdetSecimi4().getSelectedIndex()));
            }
            getSiparisGUI().getWindow().setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            getSiparisGUI().getWindow().setVisible(false);

        }
        else if (e.getSource()==getGui().getRezervasyon())
        {
            getRezervasyonGUI().getWindow().setContentPane(getRezervasyonGUI().getPanel());
            getRezervasyonGUI().getWindow().setVisible(true);
        }
        else if (e.getSource()==getRezervasyonGUI().getRezervasyonEkle())
        {
            int select=-1;
            for (int i=0;i<getRezervasyonGUI().getTableNumbers().length;i++)
            {
                if (getRezervasyonGUI().getTableNumbers()[i].isSelected())
                {
                    select=i+1;
                    break;
                }
            }
            getPersonDAO().build(String.valueOf(select),getRezervasyonGUI().getNameField().getText(),getRezervasyonGUI().getTelefonField().getText(),getRezervasyonGUI().getEmailField().getText(),"m");
            JOptionPane.showMessageDialog(null,"Rezervasyonunuz yapıldı!","Bizi tercih ettiğiniz için teşekkürler!",JOptionPane.INFORMATION_MESSAGE);

            getRezervasyonGUI().getWindow().setVisible(false);
        }
        else if (e.getSource()==getGui().getRezervasyonSiparis())
        {
            System.out.println("Girildi");
            getRezervasyonSiparisGUI().getWindow().setContentPane(getRezervasyonSiparisGUI().getPanel());
            getRezervasyonSiparisGUI().getWindow().setVisible(true);
        }
        else if (e.getSource()==getRezervasyonSiparisGUI().getSearchButton())
        {
            if (getAbstractDAO().getData("Rezervasyon",getRezervasyonSiparisGUI().getSearchField().getText())==1)
            {
                JOptionPane.showMessageDialog(null,"Masa no bulundu.Sipariş veriniz.");

            }
            else
            {
                JOptionPane.showMessageDialog(null,"Masa No Yanlış girdiniz!");
            }
            getRezervasyonSiparisGUI().getWindow().setContentPane(getRezervasyonSiparisGUI().getPanel());
            getRezervasyonSiparisGUI().getWindow().setVisible(true);

        }
        else if (e.getSource()==getRezervasyonSiparisGUI().getButton())
        {
            JOptionPane.showMessageDialog(null,"Siparişiniz Onaylandı.","Bizi tercih ettiğiniz için teşekkürler!",JOptionPane.INFORMATION_MESSAGE);
            getRezervasyonSiparisGUI().getWindow().setVisible(false);
        }
        else if (e.getSource()==getGui().getMusteriEkle())
        {
            JOptionPane.showMessageDialog(null,"Personel Giriş Sayfasına Yönlendiriliyorsunuz...(username=admin,password=personel)(Sadece ödev için bu bilgi verilir.)");
            getPersonelGUI().getWindow().setContentPane(getPersonelGUI().getPanel());
            getPersonelGUI().getWindow().setVisible(true);
        }
        else if (e.getSource()==getPersonelGUI().getGirisYap())
        {
            try {
                getAbstractDAO().Save(getPersonelGUI().getUserT().getText(),getPersonelGUI().getPasswordT().getText());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            if (getAbstractDAO().getData(getPersonelGUI().getUserT().getText(),getPersonelGUI().getPasswordT().getText(),1)==1)
            {
                getPersonelGUI().getAsilWindow().setContentPane(getPersonelGUI().getAsilPanel());
                getPersonelGUI().getAsilWindow().setVisible(true);
                getPersonelGUI().build2();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Giris basarisiz!.");
                getPersonelGUI().getWindow().setVisible(false);
            }

        }
        else if (e.getSource()==getPersonelGUI().getMusteriEkle())
        {
            try {
                getAbstractDAO().Save(getPersonelGUI().getAdSoyadT().getText(),getPersonelGUI().getUsT().getText(),getPersonelGUI().getPassT().getText(),getPersonelGUI().getMailT().getText());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            JOptionPane.showMessageDialog(null,"Müşteri eklendi!");
            getPersonelGUI().getAsilWindow().setVisible(false);
            getPersonelGUI().getWindow().setVisible(false);
        }
        else if (e.getSource()==getGui().getMusteriSil())
        {
            String input=JOptionPane.showInputDialog(null,"Müşteri kullanıcı adı: ","Müşteri Silme Sayfası",JOptionPane.QUESTION_MESSAGE);
            int response=JOptionPane.showConfirmDialog(null,"Silmek istediğinizden emin misiniz?","Müşteri Silme Sayfası",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if (response==JOptionPane.YES_NO_OPTION)
            {
                JOptionPane.showMessageDialog(null,"Müşteri silindi...");
            }
        }
        else if (e.getSource()==getGui().getMusteriDetay())
        {
            String input=JOptionPane.showInputDialog(null,"Müşteri kullanıcı adı: ","Müşteri Detayları",JOptionPane.QUESTION_MESSAGE);
            String bilgiler=getAbstractDAO().getData(input);
            JOptionPane.showMessageDialog(null,bilgiler,"Müşteri Bilgileri",JOptionPane.INFORMATION_MESSAGE);
        }
        else if (e.getSource()==getGui().getTumsiparisler())
        {
            List<String> list = getAbstractDAO().getData();
            StringBuilder sb = new StringBuilder();
            for (String s : list) {
                sb.append(s).append("\n");
            }
            JOptionPane.showMessageDialog(null, sb.toString(), "Tüm siparişler", JOptionPane.INFORMATION_MESSAGE);
        }
        else if (e.getSource()==getGui().getPersonelEkle())
        {
            JOptionPane.showMessageDialog(null,"Yönetici Giriş Sayfasına Yönlendiriliyorsunuz...(username=admin,password=yonetici)(Sadece ödev için bu bilgi verilir.)");
            getYoneticiLoginGUI().getWindow().setContentPane(getYoneticiLoginGUI().getPanel());
            getYoneticiLoginGUI().getWindow().setVisible(true);
        }
        else if(e.getSource()==getYoneticiLoginGUI().getGirisYap())
        {
            try {
                getAbstractDAO().save(getYoneticiLoginGUI().getUserT().getText(),getYoneticiLoginGUI().getPasswordT().getText());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            if (getAbstractDAO().getdata(getYoneticiLoginGUI().getUserT().getText(),getYoneticiLoginGUI().getPasswordT().getText())==1)
            {
                String personelName=JOptionPane.showInputDialog(null,"Personel Adı Soyadı","Personel Ekleme Sayfası",JOptionPane.QUESTION_MESSAGE);
                String personelMaasi=JOptionPane.showInputDialog(null,"Personel Maaşı: ","Personel Ekleme Sayfası",JOptionPane.QUESTION_MESSAGE);
                try {
                    getAbstractDAO().saveManager(personelName,personelMaasi);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                JOptionPane.showMessageDialog(null,"Personel Eklendi...");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Giris basarisiz!.");
                getPersonelGUI().getWindow().setVisible(false);
            }
        }
        else if (e.getSource()==getGui().getPersonelSil())
        {
            String personelName=JOptionPane.showInputDialog(null,"Personel Adı Soyadı","Personel Silme Sayfası",JOptionPane.QUESTION_MESSAGE);
            int response=JOptionPane.showConfirmDialog(null,"Silmek istediğinizden emin misiniz?","Personel Silme Sayfası",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if (response==JOptionPane.YES_NO_OPTION)
            {
                JOptionPane.showMessageDialog(null,"Personel silindi...");
            }
        }
        else if (e.getSource()==getGui().getPersoneller())
        {
            List<String> list = getAbstractDAO().getdata();
            StringBuilder sb = new StringBuilder();
            for (String s : list) {
                sb.append(s).append("\n");
            }
            JOptionPane.showMessageDialog(null, sb.toString(), "Personeller: ", JOptionPane.INFORMATION_MESSAGE);

        }

    }
    public guiTool getGui() {
        if (this.gui==null)
        {
            this.gui=new guiTool();
        }
        return gui;
    }

    public void setGui(guiTool gui) {
        this.gui = gui;
    }


    public LoginGui getLoginGui() {
        if (this.loginGui==null)
        {
            this.loginGui=new LoginGui();
        }
        return loginGui;
    }

    public void setLoginGui(LoginGui loginGui) {
        this.loginGui = loginGui;
    }

    public RegisterGUI getRegisterGUI() {
        if (this.registerGUI==null)
        {
            this.registerGUI=new RegisterGUI();
        }
        return this.registerGUI;
    }

    public void setRegisterGUI(RegisterGUI registerGUI) {
        this.registerGUI = registerGUI;
    }

    public PersonDAO getPersonDAO() {
        if (this.personDAO==null)
        {
            this.personDAO=new PersonDAO(getLoginGui());
        }
        return personDAO;
    }

    public void setPersonDAO(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    public AbstractDAO getAbstractDAO() {
        if (this.abstractDAO==null)
        {
            this.abstractDAO=new AbstractDAO();
        }
        return abstractDAO;
    }

    public void setAbstractDAO(AbstractDAO abstractDAO) {
        this.abstractDAO = abstractDAO;
    }

    public SiparisGUI getSiparisGUI() {
        if (this.siparisGUI==null)
        {
            this.siparisGUI=new SiparisGUI();
        }
        return siparisGUI;
    }

    public void setSiparisGUI(SiparisGUI siparisGUI) {
        this.siparisGUI = siparisGUI;
    }

    public RezervasyonGUI getRezervasyonGUI() {
        if (this.rezervasyonGUI==null)
        {
            this.rezervasyonGUI=new RezervasyonGUI();
        }
        return rezervasyonGUI;
    }

    public void setRezervasyonGUI(RezervasyonGUI rezervasyonGUI) {
        this.rezervasyonGUI = rezervasyonGUI;
    }

    public RezervasyonSiparisGUI getRezervasyonSiparisGUI() {
        if (this.rezervasyonSiparisGUI==null)
        {
            this.rezervasyonSiparisGUI=new RezervasyonSiparisGUI();
        }
        return rezervasyonSiparisGUI;
    }
    public void setRezervasyonSiparisGUI(RezervasyonSiparisGUI rezervasyonSiparisGUI) {
        this.rezervasyonSiparisGUI = rezervasyonSiparisGUI;
    }

    public PersonelGUI getPersonelGUI() {
        if (this.personelGUI==null)
        {
            personelGUI=new PersonelGUI();
        }
        return personelGUI;
    }

    public void setPersonelGUI(PersonelGUI personelGUI) {
        this.personelGUI = personelGUI;
    }

    public YoneticiLoginGUI getYoneticiLoginGUI() {
        if (this.yoneticiLoginGUI==null)
        {
            this.yoneticiLoginGUI=new YoneticiLoginGUI();
        }
        return yoneticiLoginGUI;
    }

    public void setYoneticiLoginGUI(YoneticiLoginGUI yoneticiLoginGUI) {
        this.yoneticiLoginGUI = yoneticiLoginGUI;
    }
}
