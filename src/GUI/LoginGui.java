package GUI;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginGui{
    RegisterGUI registerGUI;
    private ImageIcon image;
    private JLabel fotografEtiketi;
    private Image imageImage;
    private JFrame window;
    private JPanel panel;
    private JButton girisYap;
    private JButton kayitOl;
    private JLabel username;
    private JLabel password;
    private JTextField userT;
    private JPasswordField passwordT;
    public LoginGui()
    {
        build();
    }
    public void build()
    {
        this.getPanel().add(this.getGirisYap());
        this.getPanel().add(this.getKayitOl());
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
            window=new JFrame("Giris Sayfası");
            window.setBounds(350,100,800,600);
            window.getContentPane().setLayout(new BorderLayout());
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
            girisYap=new JButton("Giriş Yap");
            girisYap.setBounds(280,350,100,20);
            girisYap.setFont(new Font("Arial",Font.BOLD,12));
            girisYap.setBackground(Color.white);
            girisYap.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            girisYap.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    girisYap.setBackground(new Color(240, 230, 140));
                    girisYap.setForeground(new Color(105,105,105));
                    girisYap.setSize(100,22);
                    girisYap.setForeground(Color.black);
                    girisYap.setMargin(new Insets(0,0,0,0));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    girisYap.setBackground(Color.WHITE);
                    girisYap.setForeground(Color.BLACK);
                    girisYap.setSize(100,20);
                    girisYap.setBorderPainted(true);

                }
            });
            this.getGirisYap().addActionListener(new LoginGuiAction(this));

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
            kayitOl.setBounds(450,350,100,20);
            kayitOl.setBackground(Color.white);
            kayitOl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            kayitOl.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    kayitOl.setBackground(new Color(240, 230, 140));
                    kayitOl.setForeground(new Color(105,105,105));
                    kayitOl.setSize(100,22);
                    kayitOl.setForeground(Color.black);
                    kayitOl.setMargin(new Insets(0,0,0,0));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    kayitOl.setBackground(Color.WHITE);
                    kayitOl.setForeground(Color.BLACK);
                    kayitOl.setSize(100,20);
                    kayitOl.setBorderPainted(true);

                }
            });

            this.getKayitOl().addActionListener(new LoginGuiAction(this));
        }
        return kayitOl;
    }
    public void setKayitOl(JButton kayitOl) {
        this.kayitOl = kayitOl;
    }
    public JLabel getUsername() {
        if (this.username==null)
        {
            username=new JLabel("Kullanıcı Adı: ");
            username.setBounds(280,130,100,20);
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
            password.setBounds(280,200,100,20);
            password.setForeground(Color.WHITE);
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
            userT.setBounds(400,130,100,20);
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
            passwordT.setBounds(400,200,100,20);
        }
        return passwordT;
    }
    public void setPasswordT(JPasswordField passwordT) {
        this.passwordT = passwordT;
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
}
