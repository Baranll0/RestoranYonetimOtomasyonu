package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RezervasyonGUI{
    private JPanel panel;
    private JFrame window;
    private ImageIcon image;
    private JLabel fotografEtiketi;
    private Image imageImage;
    private JLabel masa;
    ButtonGroup group=new ButtonGroup();
    JCheckBox [] tableNumbers=new JCheckBox[15];
    private JLabel nameLabel;
    private JTextField nameField;
    private JLabel telefonLabel;
    private JTextField telefonField;
    private JLabel emailLabel;
    private JTextField emailField;
    private JButton rezervasyonEkle;
    public RezervasyonGUI()
    {
        build();

    }
    public void build()
    {

        for (int i=0;i<tableNumbers.length;i++)
        {
            this.tableNumbers[i]=new JCheckBox();
            this.tableNumbers[i].setText(String.valueOf(i+1));
            int x=(i%5)*(80+10)+20;
            int y=(i/5)*(40+10)+20;
            group.add(tableNumbers[i]);
            this.tableNumbers[i].setBounds(x,y,80,40);
            this.getPanel().add(this.tableNumbers[i]);
        }
        group.setSelected(null,false);

        this.getPanel().add(this.getNameLabel());
        this.getPanel().add(this.getNameField());
        this.getPanel().add(this.getTelefonLabel());
        this.getPanel().add(this.getTelefonField());
        this.getPanel().add(this.getEmailLabel());
        this.getPanel().add(this.getEmailField());
        this.getPanel().add(this.getRezervasyonEkle());
        this.getRezervasyonEkle().addActionListener(new RezervasyonGUIAction(this));
        this.getPanel().add(this.getMasa());
        this.getPanel().add(this.getFotografEtiketi());
        this.getWindow().setLayout(null);
        this.getWindow().setContentPane(this.getPanel());
    }

    public JPanel getPanel() {
        if (this.panel==null)
        {
            this.panel=new JPanel();
            this.panel.setLayout(null);
            this.panel.setSize(800,600);
            this.panel.setBounds(350,100,800,600);
        }
        return panel;
    }
    public JFrame getWindow() {
        if (this.window==null)
        {
            window=new JFrame("Rezervasyon Sayfası");
            window.setBounds(350,100,800,600);
        }
        return window;
    }


    public void setWindow(JFrame window) {
        this.window = window;
    }

    public JCheckBox[] getTableNumbers() {
        if (this.tableNumbers==null)
        {
            this.tableNumbers=new JCheckBox[50];
        }

        return tableNumbers;
    }

    public void setTableNumbers(JCheckBox[] tableNumbers) {
        this.tableNumbers = tableNumbers;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JLabel getNameLabel() {
        if (this.nameLabel==null)
        {
            this.nameLabel=new JLabel("Ad Soyad: ");
            this.nameLabel.setBounds(100,300,100,30);
            this.nameLabel.setForeground(Color.white);
            this.nameLabel.setFont(new Font("Arial",Font.BOLD,12));
        }
        return nameLabel;
    }

    public void setNameLabel(JLabel nameLabel) {
        this.nameLabel = nameLabel;
    }

    public JTextField getNameField() {
        if (this.nameField==null)
        {
            this.nameField=new JTextField();
            this.nameField.setBounds(200,300,200,30);
        }
        return nameField;
    }

    public void setNameField(JTextField nameField) {
        this.nameField = nameField;
    }

    public JLabel getTelefonLabel() {
        if (this.telefonLabel==null)
        {
            this.telefonLabel=new JLabel("Telefon No: ");
            this.telefonLabel.setForeground(Color.white);
            this.telefonLabel.setFont(new Font("Arial",Font.BOLD,12));
            this.telefonLabel.setBounds(100,350,100,30);
        }
        return telefonLabel;
    }

    public void setTelefonLabel(JLabel telefonLabel) {
        this.telefonLabel = telefonLabel;
    }

    public JTextField getTelefonField() {
        if (this.telefonField==null)
        {
            this.telefonField=new JTextField();
            this.telefonField.setBounds(200,350,200,30);
        }
        return telefonField;
    }

    public void setTelefonField(JTextField telefonField) {
        this.telefonField = telefonField;
    }

    public JLabel getEmailLabel() {
        if (this.emailLabel==null)
        {
            this.emailLabel=new JLabel("Email: ");
            this.emailLabel.setForeground(Color.white);
            this.emailLabel.setFont(new Font("Arial",Font.BOLD,12));
            this.emailLabel.setBounds(100,400,100,30);
        }
        return emailLabel;
    }

    public void setEmailLabel(JLabel emailLabel) {
        this.emailLabel = emailLabel;
    }

    public JTextField getEmailField() {
        if (this.emailField==null)
        {
            this.emailField=new JTextField();
            this.emailField.setBounds(200,400,200,30);
        }
        return emailField;
    }

    public void setEmailField(JTextField emailField) {
        this.emailField = emailField;
    }

    public JButton getRezervasyonEkle() {
        if (this.rezervasyonEkle==null)
        {
            this.rezervasyonEkle=new JButton("Rezervasyon Ekle");
            this.rezervasyonEkle.setBounds(440,350,150,30);
            rezervasyonEkle.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            rezervasyonEkle.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    rezervasyonEkle.setBackground(new Color(240, 230, 140));
                    rezervasyonEkle.setForeground(new Color(105,105,105));
                    rezervasyonEkle.setSize(150,32);
                    rezervasyonEkle.setForeground(Color.black);
                    rezervasyonEkle.setMargin(new Insets(0,0,0,0));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    rezervasyonEkle.setBackground(Color.WHITE);
                    rezervasyonEkle.setForeground(Color.BLACK);
                    rezervasyonEkle.setSize(150,30);
                    rezervasyonEkle.setBorderPainted(true);

                }
            });
        }
        return rezervasyonEkle;
    }

    public void setRezervasyonEkle(JButton rezervasyonEkle) {
        this.rezervasyonEkle = rezervasyonEkle;
    }

    public JLabel getMasa() {
        if (this.masa==null)
        {
            this.masa=new JLabel("Masa numarası seçiniz...");
            this.masa.setBounds(100,180,200,30);
            this.masa.setFont(new Font("Arial",Font.BOLD,14));
            this.masa.setForeground(Color.WHITE);
        }
        return masa;
    }

    public void setMasa(JLabel masa) {
        this.masa = masa;
    }
    public ImageIcon getImage() {
        if (this.image==null)
        {
            this.image=new ImageIcon(".\\gorsel\\rezervasyonarkaplan.jpg");
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
            this.fotografEtiketi.setBounds(0,0,800,600);
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
