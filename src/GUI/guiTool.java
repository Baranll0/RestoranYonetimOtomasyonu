package GUI;

import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.security.Key;
public class guiTool {
    private JFrame window;
    private JPanel panel;
    private ImageIcon image;
    private JLabel fotografEtiketi;
    private Image imageImage;
    private JButton siparis;
    private JButton rezervasyon;
    private JButton rezervasyonSiparis;
    private JButton musteriEkle;
    private JButton musteriSil;
    private JButton musteriDetay;
    private JButton tumsiparisler;

    private JButton personelEkle;
    private JButton personelSil;
    private JButton personeller;

    public guiTool()
    {
        build();
    }
    public void build()
    {
        this.getPanel().setLayout(null);
        this.getPanel().add(this.getRezervasyonSiparis());
        this.getPanel().add(this.getMusteriDetay());
        this.getPanel().add(this.getTumsiparisler());
        this.getPanel().add(this.getPersonelEkle());
        this.getPanel().add(this.getPersonelSil());
        this.getPanel().add(this.getPersoneller());
        this.getPanel().add(this.getMusteriSil());
        this.getPanel().add(this.getMusteriEkle());

        this.getPanel().add(this.getSiparis());
        this.getPanel().add(this.getRezervasyon());
        this.getPanel().add(this.getFotografEtiketi());
        this.getWindow().setLayout(null);

    }
    public JFrame getWindow() {
        if (this.window==null)
        {
            this.window=new JFrame();
            this.window.setSize(1000,600);
            this.window.setBounds(300,100,1000,600);
        }
        return window;
    }
    public void setWindow(JFrame window) {
        this.window = window;
    }
    public JPanel getPanel() {
        if (this.panel==null)
        {
            this.panel=new JPanel();
            this.panel.setBackground(Color.GRAY);
            this.panel.setBounds(300,100,1000,600);
        }
        return panel;
    }
    public void setPanel(JPanel panel) {
        this.panel = panel;
    }
    public JButton getSiparis() {
        if (this.siparis==null)
        {
            siparis=new JButton("Siparis Ekle");
            this.siparis.setBounds(100,100,200,30);
            this.siparis.addActionListener(new guiToolAction(this));
        }
        return siparis;
    }
    public void setSiparis(JButton siparis) {
        this.siparis = siparis;
    }
    public JButton getRezervasyon() {
        if (this.rezervasyon==null)
        {
            rezervasyon=new JButton("Rezervasyon Yap");
            this.rezervasyon.setBounds(100,190,200,30);
            this.rezervasyon.addActionListener(new guiToolAction(this));
        }
        return rezervasyon;
    }
    public void setRezervasyon(JButton rezervasyon) {
        this.rezervasyon = rezervasyon;
    }

    public JButton getRezervasyonSiparis() {
        if (this.rezervasyonSiparis==null)
        {
            rezervasyonSiparis=new JButton("Rezervasyona Sipariş Ekle");
            this.rezervasyonSiparis.setBounds(100,280,200,30);
            this.rezervasyonSiparis.addActionListener(new guiToolAction(this));
        }
        return rezervasyonSiparis;
    }

    public void setRezervasyonSiparis(JButton rezervasyonSiparis) {
        this.rezervasyonSiparis = rezervasyonSiparis;
    }

    public JButton getMusteriEkle() {
        if (this.musteriEkle==null)
        {
            this.musteriEkle=new JButton("Musteri Ekle");
            this.musteriEkle.setBounds(400,100,200,30);
            this.musteriEkle.addActionListener(new guiToolAction(this));
        }
        return musteriEkle;
    }

    public void setMusteriEkle(JButton musteriEkle) {
        this.musteriEkle = musteriEkle;
    }

    public JButton getMusteriSil() {
        if (this.musteriSil==null)
        {
            this.musteriSil=new JButton("Müşteri Sil");
            this.musteriSil.setBounds(400,190,200,30);
            this.musteriSil.addActionListener(new guiToolAction(this));
        }
        return musteriSil;
    }

    public void setMusteriSil(JButton musteriSil) {
        this.musteriSil = musteriSil;
    }

    public JButton getMusteriDetay() {
        if (this.musteriDetay==null)
        {
            this.musteriDetay=new JButton("Muşteri Detayları");
            this.musteriDetay.setBounds(400,280,200,30);
            this.musteriDetay.addActionListener(new guiToolAction(this));
        }
        return musteriDetay;
    }
    public void setMusteriDetay(JButton musteriDetay) {
        this.musteriDetay = musteriDetay;
    }
    public JButton getTumsiparisler() {
        if (this.tumsiparisler==null)
        {
            this.tumsiparisler=new JButton("Tum siparisler");
            this.tumsiparisler.setBounds(400,370,200,30);
            this.tumsiparisler.addActionListener(new guiToolAction(this));
        }
        return tumsiparisler;
    }

    public JButton getPersonelEkle() {
        if (this.personelEkle==null)
        {
            this.personelEkle=new JButton("Personel Ekle");
            this.personelEkle.setBounds(690,100,200,30);
            this.personelEkle.addActionListener(new guiToolAction(this));
        }
        return personelEkle;
    }
    public void setPersonelEkle(JButton personelEkle) {
        this.personelEkle = personelEkle;
    }
    public JButton getPersonelSil() {
        if (this.personelSil==null)
        {
            this.personelSil=new JButton("Personel Sil");
            this.personelSil.setBounds(690,190,200,30);
            this.personelSil.addActionListener(new guiToolAction(this));
        }
        return personelSil;
    }

    public void setPersonelSil(JButton personelSil) {
        this.personelSil = personelSil;
    }



    public JButton getPersoneller() {
        if (this.personeller==null)
        {
            this.personeller=new JButton("Personeller");
            this.personeller.setBounds(690,280,200,30);
            this.personeller.addActionListener(new guiToolAction(this));
        }
        return personeller;
    }

    public void setPersoneller(JButton personeller) {
        this.personeller = personeller;
    }

    public ImageIcon getImage() {
        if (this.image==null)
        {
            this.image=new ImageIcon(".\\gorsel\\guitoolarkaplan.jpg");
        }
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }

    public JLabel getFotografEtiketi() {
        if (this.fotografEtiketi==null)
        {
            this.fotografEtiketi=new JLabel(new ImageIcon(getImageImage()));
            this.fotografEtiketi.setSize(1000,600);
        }
        return fotografEtiketi;
    }

    public void setFotografEtiketi(JLabel fotografEtiketi) {
        this.fotografEtiketi = fotografEtiketi;
    }

    public Image getImageImage() {
        if (this.imageImage==null)
        {
            this.imageImage=getImage().getImage().getScaledInstance(1000,600,Image.SCALE_SMOOTH);
        }
        return imageImage;
    }

    public void setImageImage(Image imageImage) {
        this.imageImage = imageImage;
    }
    @Override
    public String toString() {
        return "guiTool{" +
                "window=" + window +
                ", panel=" + panel +
                ", siparis=" + siparis +
                ", rezervasyon=" + rezervasyon +
                '}';
    }
}
