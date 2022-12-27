package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.http.HttpHeaders;

public class RegisterGUI{
    private JFrame window;
    private JPanel panel;
    private ImageIcon image;
    private JLabel fotografEtiketi;
    private Image imageImage;
    private JButton girisYap;
    private JButton kayitOl;
    private JLabel adSoyad;
    private JTextField adSoyadT;

    private JLabel username;
    private JLabel password;
    private JTextField userT;
    private JPasswordField passwordT;
    private JLabel mail;
    private JTextField mailT;
    public RegisterGUI()
    {
        build();
    }
    public void build()
    {

        this.getPanel().setLayout(null);
        this.getPanel().add(this.getGirisYap());
        this.getPanel().add(this.getKayitOl());
        this.getPanel().add(this.getAdSoyad());
        this.getPanel().add(this.getAdSoyadT());
        this.getPanel().add(this.getUsername());
        this.getPanel().add(this.getPassword());
        this.getPanel().add(this.getMail());
        this.getPanel().add(this.getMailT());
        this.getPanel().add(this.getUserT());
        this.getPanel().add(this.getPasswordT());
        this.getPanel().add(this.getFotografEtiketi());
        this.getWindow().add(this.panel);
        this.getWindow().setLayout(null);
        this.getWindow().setContentPane(this.getPanel());

    }
    public JFrame getWindow() {
        if (this.window==null)
        {
            window=new JFrame("Giris Sayfası");
            window.setBounds(350,100,800,600);
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        return window;
    }

    public void setWindow(JFrame window) {
        this.window = window;
    }

    public JPanel getPanel() {
        if (this.panel==null)
        {
            panel=new JPanel();
            panel.setLayout(null);
            panel.setSize(800,600);
            panel.setBackground(new Color(0,0,0,0));
        }
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JButton getGirisYap() {
        if (this.girisYap==null)
        {
            girisYap=new JButton("Giris Yap");
            girisYap.setBounds(230,350,100,20);
            girisYap.setFont(new Font("Arial",Font.BOLD,12));
            this.girisYap.addActionListener(new RegisterGUIAction(this));
        }
        return girisYap;
    }

    public void setGirisYap(JButton girisYap) {
        this.girisYap = girisYap;
    }

    public JButton getKayitOl() {
        if (this.kayitOl==null)
        {
            kayitOl=new JButton("Kayit ol");
            kayitOl.setBounds(400,350,100,20);
            this.getKayitOl().addActionListener(new RegisterGUIAction(this));
        }
        return kayitOl;
    }

    public void setKayitOl(JButton kayitOl) {
        this.kayitOl = kayitOl;
    }

    public JLabel getAdSoyad() {
        if (this.adSoyad==null)
        {
            adSoyad=new JLabel("Ad Soyad: ");
            adSoyad.setBounds(230,130,100,20);
            adSoyad.setForeground(Color.white);
        }
        return adSoyad;
    }


    public void setAdSoyad(JLabel adSoyad) {
        this.adSoyad = adSoyad;
    }

    public JTextField getAdSoyadT() {
        if (this.adSoyadT==null)
        {
            adSoyadT=new JTextField();
            adSoyadT.setBounds(350,130,100,20);
        }
        return adSoyadT;
    }

    public void setAdSoyadT(JTextField adSoyadT) {
        this.adSoyadT = adSoyadT;
    }

    public JLabel getUsername() {
        if (this.username==null)
        {
            username=new JLabel("Kullanıcı Adı: ");
            username.setBounds(230,180,100,20);
            username.setForeground(Color.white);
        }
        return username;
    }

    public void setUsername(JLabel username) {
        this.username = username;
    }

    public JLabel getPassword() {
        if (this.password==null)
        {
            password=new JLabel("Sifre: ");
            password.setBounds(230,220,100,20);
            password.setForeground(Color.white);
        }
        return password;
    }

    public void setPassword(JLabel password) {
        this.password = password;
    }

    public JTextField getUserT() {
        if (this.userT==null)
        {
            userT=new JTextField();
            userT.setBounds(350,180,100,20);
        }
        return userT;
    }

    public void setUserT(JTextField userT) {
        this.userT = userT;
    }

    public JPasswordField getPasswordT() {
        if (this.passwordT==null)
        {
            passwordT=new JPasswordField();
            passwordT.setBounds(350,220,100,20);
        }
        return passwordT;
    }

    public void setPasswordT(JPasswordField passwordT) {
        this.passwordT = passwordT;
    }

    public JLabel getMail() {
        if (this.mail==null)
        {
            mail=new JLabel("E-mail: ");
            mail.setBounds(230,260,100,20);
            mail.setForeground(Color.white);
        }
        return mail;
    }

    public void setMail(JLabel mail) {
        this.mail = mail;
    }

    public JTextField getMailT() {
        if (this.mailT==null)
        {
            mailT=new JTextField();
            mailT.setBounds(350,260,100,20);
        }
        return mailT;
    }

    public void setMailT(JTextField mailT) {
        this.mailT = mailT;
    }

    public ImageIcon getImage() {
        if (this.image==null)
        {
            this.image=new ImageIcon(".\\gorsel\\loginarkaplan.jpg");
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
            this.fotografEtiketi.setSize(800,600);
        }
        return fotografEtiketi;
    }

    public void setFotografEtiketi(JLabel fotografEtiketi) {
        this.fotografEtiketi = fotografEtiketi;
    }

    public Image getImageImage() {
        if (this.imageImage==null)
        {
            this.imageImage=getImage().getImage().getScaledInstance(800,600,Image.SCALE_SMOOTH);
        }
        return imageImage;
    }

    public void setImageImage(Image imageImage) {
        this.imageImage = imageImage;
    }

    @Override
    public String toString() {
        return "RegisterGUI{" +
                "window=" + window +
                ", panel=" + panel +
                ", girisYap=" + girisYap +
                ", kayitOl=" + kayitOl +
                ", adSoyad=" + adSoyad +
                ", adSoyadT=" + adSoyadT +
                ", username=" + username +
                ", password=" + password +
                ", userT=" + userT +
                ", passwordT=" + passwordT +
                ", mail=" + mail +
                ", mailT=" + mailT +
                '}';
    }
}

