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
    private guiTool gui;
    private AbstractDAO abstractDAO;
    private PersonelGUI personelGUI;
    private YoneticiLoginGUI yoneticiLoginGUI;

    private SiparisGUI siparisGUI;
    private PersonDAO personDAO;
    private RezervasyonGUI rezervasyonGUI;
    private RezervasyonSiparisGUI rezervasyonSiparisGUI;


    public guiToolAction()
    {

    }

    public guiToolAction(guiTool gui)
    {
        this.gui=gui;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==getGui().getSiparis())
        {
            getSiparisGUI().getWindow().setContentPane(getSiparisGUI().getPanel());
            getSiparisGUI().getWindow().setVisible(true);
            System.out.println("siparis ekrani geldi");

        }
        else if (e.getSource()==getGui().getRezervasyon())
        {
            getRezervasyonGUI().getWindow().setContentPane(getRezervasyonGUI().getPanel());
            getRezervasyonGUI().getWindow().setVisible(true);
        }
        else if (e.getSource()==getGui().getRezervasyonSiparis())
        {
            System.out.println("Girildi");
            getRezervasyonSiparisGUI().getWindow().setVisible(true
            );
        }
        else if (e.getSource()==getGui().getMusteriEkle())
        {
            JOptionPane.showMessageDialog(null,"Personel Giriş Sayfasına Yönlendiriliyorsunuz...(username=admin,password=personel)(Sadece ödev için bu bilgi verilir.)");
            getPersonelGUI().getWindow().setContentPane(getPersonelGUI().getPanel());
            getPersonelGUI().getWindow().setVisible(true);
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
            getPersonelGUI().getWindow().setVisible(true);
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



    public PersonDAO getPersonDAO() {
        if (this.personDAO==null)
        {
            this.personDAO=new PersonDAO();
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
            this.siparisGUI.build();
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
