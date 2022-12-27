package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class PersonelGUI {
    private JFrame window;
    private JPanel panel;
    private ImageIcon image;
    private JLabel fotografEtiketi;
    private Image imageImage;
    private ImageIcon image2;
    private JLabel fotografEtiketi2;
    private Image imageImage2;
    private JButton girisYap;
    private JLabel username;
    private JLabel password;
    private JTextField userT;
    private JPasswordField passwordT;
    private JPanel asilPanel;
    private JFrame asilWindow;
    private JLabel adSoyad;
    private JTextField adSoyadT;
    private JButton musteriEkle;

    private JLabel user;
    private JLabel pass;
    private JTextField usT;
    private JPasswordField passT;
    private JLabel mail;
    private JTextField mailT;
    public PersonelGUI()
    {
        build();
    }
    public void build2()
    {
        this.getAsilWindow().add(this.getMusteriEkle());
        this.getAsilPanel().add(this.getAdSoyad());
        this.getAsilPanel().add(this.getAdSoyadT());
        this.getAsilPanel().add(this.getUser());
        this.getAsilPanel().add(this.getUsT());
        this.getAsilPanel().add(this.getPass());
        this.getAsilPanel().add(this.getPassT());
        this.getAsilPanel().add(this.getMail());
        this.getAsilPanel().add(this.getMailT());
        this.getAsilPanel().add(this.getFotografEtiketi2());
        this.getAsilWindow().setContentPane(this.getAsilPanel());
        this.getAsilWindow().setLayout(null);
    }
    public void build()
    {

        this.getPanel().add(this.getGirisYap());
        this.getPanel().add(this.getUsername());
        this.getPanel().add(this.getPassword());
        this.getPanel().add(this.getUserT());
        this.getPanel().add(this.getPasswordT());
        this.getPanel().add(this.getFotografEtiketi());
        this.getWindow().setLayout(null);
        this.getWindow().setContentPane(this.getPanel());
    }
    public JFrame getWindow() {
        if (this.window==null)
        {
            window=new JFrame("Personel Giriş Sayfası");
            window.setBounds(550,100,400,600);
        }
        return window;
    }
    public void setFrame(JFrame window) {
        this.window = window;
    }
    public JPanel getPanel() {
        if (this.panel==null)
        {
            panel=new JPanel();
            panel.setLayout(null);
            panel.setSize(400,600);
            panel.setBounds(550,100,400,600);
        }
        return panel;
    }
    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JFrame getAsilWindow() {
        if (this.asilWindow==null)
        {
            this.asilWindow=new JFrame("Müşteri Ekleme Sayfası");
            asilWindow.setBounds(400,100,800,600);
        }
        return asilWindow;
    }

    public void setAsilWindow(JFrame asilWindow) {
        this.asilWindow = asilWindow;
    }

    public JPanel getAsilPanel() {
        if (this.asilPanel==null)
        {
            this.asilPanel=new JPanel();
            asilPanel.setLayout(null);
            asilPanel.setSize(800,600);
            asilPanel.setBounds(400,100,800,600);
        }
        return asilPanel;
    }
    public void setAsilPanel(JPanel asilPanel) {
        this.asilPanel = asilPanel;
    }
    public JButton getGirisYap() {
        if (this.girisYap==null)
        {
            girisYap=new JButton("Giris Yap");
            girisYap.setBounds(70,350,100,20);
            this.getGirisYap().addActionListener(new PersonelGUIAction(this));
        }
        return girisYap;
    }
    public void setGirisYap(JButton girisYap) {
        this.girisYap = girisYap;
    }
    public JLabel getUsername() {
        if (this.username==null)
        {
            username=new JLabel("Kullanıcı Adı: ");
            username.setBounds(70,180,100,20);
            username.setForeground(Color.WHITE);
            username.setFont(new Font("Arial",Font.BOLD,12));
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
            password.setBounds(70,250,100,20);
            password.setForeground(Color.WHITE);
            password.setFont(new Font("Arial",Font.BOLD,12));
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
            userT.setBounds(200,180,100,20);
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
            passwordT.setBounds(200,250,100,20);
        }
        return passwordT;
    }
    public void setPasswordT(JPasswordField passwordT) {
        this.passwordT = passwordT;
    }

    public JLabel getAdSoyad() {
        if(this.adSoyad==null)
        {
            this.adSoyad=new JLabel("Ad Soyad: ");
            this.adSoyad.setBounds(230,70,100,30);
            this.adSoyad.setForeground(Color.WHITE);
            this.adSoyad.setFont(new Font("Arial",Font.BOLD,12));

        }
        return adSoyad;
    }

    public void setAdSoyad(JLabel adSoyad) {
        this.adSoyad = adSoyad;
    }

    public JTextField getAdSoyadT() {
        if (this.adSoyadT==null)
        {
            this.adSoyadT=new JTextField();
            this.adSoyadT.setBounds(350,70,150,30);
        }
        return adSoyadT;
    }

    public void setAdSoyadT(JTextField adSoyadT) {
        this.adSoyadT = adSoyadT;
    }

    public JLabel getUser() {
        if (this.user==null)
        {
            this.user=new JLabel("Kullanıcı adı: ");
            this.user.setBounds(230,110,100,30);
            this.user.setForeground(Color.WHITE);
            this.user.setFont(new Font("Arial",Font.BOLD,12));
        }
        return user;
    }

    public void setUser(JLabel user) {
        this.user = user;
    }

    public JLabel getPass() {
        if (this.pass==null)
        {
            this.pass=new JLabel("Şifre: ");
            this.pass.setBounds(230,150,100,30);
            this.pass.setFont(new Font("Arial",Font.BOLD,12));
            this.pass.setForeground(Color.WHITE);
        }
        return pass;
    }

    public void setPass(JLabel pass) {
        this.pass = pass;
    }

    public JTextField getUsT() {
        if (this.usT==null)
        {
            this.usT=new JTextField();
            this.usT.setBounds(350,110,150,30);
        }
        return usT;
    }

    public void setUsT(JTextField usT) {
        this.usT = usT;
    }

    public JPasswordField getPassT() {
        if (this.passT==null)
        {
            this.passT=new JPasswordField();
            this.passT.setBounds(350,150,150,30);
        }
        return passT;
    }

    public void setPassT(JPasswordField passT) {
        this.passT = passT;
    }

    public JLabel getMail() {
        if (this.mail==null)
        {
            this.mail=new JLabel("Mail: ");
            this.mail.setBounds(230,200,100,30);
            this.mail.setFont(new Font("Arial",Font.BOLD,12));
            this.mail.setForeground(Color.WHITE);
        }
        return mail;
    }

    public void setMail(JLabel mail) {
        this.mail = mail;
    }

    public JTextField getMailT() {
        if (this.mailT==null)
        {
            this.mailT=new JTextField();
            this.mailT.setBounds(350,200,150,30);
        }
        return mailT;
    }

    public void setMailT(JTextField mailT) {
        this.mailT = mailT;
    }

    public JButton getMusteriEkle() {
        if (this.musteriEkle==null)
        {
            this.musteriEkle=new JButton("Müşteri Ekle");
            this.musteriEkle.setBounds(350,250,150,30);
            this.musteriEkle.addActionListener(new PersonelGUIAction(this));
        }
        return musteriEkle;
    }

    public void setMusteriEkle(JButton musteriEkle) {
        this.musteriEkle = musteriEkle;
    }
    public ImageIcon getImage() {
        if (this.image==null)
        {
            this.image=new ImageIcon(".\\gorsel\\personelarkaplan.jpg");
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
            this.fotografEtiketi.setSize(400,600);
        }
        return fotografEtiketi;
    }

    public void setFotografEtiketi(JLabel fotografEtiketi) {
        this.fotografEtiketi = fotografEtiketi;
    }


    public Image getImageImage() {
        if (this.imageImage==null)
        {
            this.imageImage=getImage().getImage().getScaledInstance(400,600,Image.SCALE_SMOOTH);
        }
        return imageImage;
    }

    public void setImageImage(Image imageImage) {
        this.imageImage = imageImage;
    }

    public ImageIcon getImage2() {
        if (this.image2==null)
        {
            this.image2=new ImageIcon(".\\gorsel\\personelarkaplan2.jpg");
        }
        return image2;
    }

    public void setImage2(ImageIcon image2) {
        this.image2 = image2;
    }

    public JLabel getFotografEtiketi2() {
        if (this.fotografEtiketi2==null)
        {
            this.fotografEtiketi2=new JLabel(new ImageIcon(getImageImage2()));
            this.fotografEtiketi2.setSize(800,600);
        }
        return fotografEtiketi2;
    }

    public void setFotografEtiketi2(JLabel fotografEtiketi2) {
        this.fotografEtiketi2 = fotografEtiketi2;
    }

    public Image getImageImage2() {
        if (this.imageImage2==null)
        {
            this.imageImage2=getImage2().getImage().getScaledInstance(800,600,Image.SCALE_SMOOTH);

        }
        return imageImage2;
    }

    public void setImageImage2(Image imageImage2) {
        this.imageImage2 = imageImage2;
    }
}



