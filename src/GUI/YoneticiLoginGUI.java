package GUI;

import javax.swing.*;
import java.awt.*;

public class YoneticiLoginGUI {
    private JFrame window;
    private JPanel panel;
    private ImageIcon image;
    private JLabel fotografEtiketi;
    private Image imageImage;
    private JButton girisYap;
    private JLabel username;
    private JLabel password;
    private JTextField userT;
    private JPasswordField passwordT;
    public YoneticiLoginGUI()
    {
        build();

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
            window=new JFrame("Yonetici Giriş Sayfası");
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
    public JButton getGirisYap() {
        if (this.girisYap==null)
        {
            girisYap=new JButton("Giris Yap");
            girisYap.setBounds(70,350,100,20);
            this.getGirisYap().addActionListener(new YoneticiLoginGUIAction(this));
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
    public ImageIcon getImage() {
        if (this.image==null)
        {
            this.image=new ImageIcon(".\\gorsel\\yoneticiarkaplan.jpg");
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
}

