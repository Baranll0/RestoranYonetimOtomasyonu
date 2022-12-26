package GUI;

import javax.swing.*;
import java.awt.*;
public class RezervasyonSiparisGUI {
    private JFrame window;
    private JPanel panel;
    private JTextField searchField;
    private JButton button;
    private ImageIcon image;
    private JLabel fotografEtiketi;
    private Image imageImage;
    private JButton searchButton;
    private JLabel yemekadiLabel;
    private JTextField yemekadiField;
    private JLabel extraNotLabel;
    private JTextPane extraNotField;

    public RezervasyonSiparisGUI()
    {
        build();
    }
    public void build()
    {
        this.getPanel().add(this.getButton());
        this.getPanel().add(this.getExtraNotField());
        this.getPanel().add(this.getExtraNotLabel());
        this.getPanel().add(this.getYemekadiField());
        this.getPanel().add(this.getYemekadiLabel());
        this.getPanel().add(this.getSearchField());
        this.getPanel().add(this.getSearchButton());
        this.getPanel().add(this.getFotografEtiketi());
        this.getWindow().setContentPane(this.getPanel());
    }

    public JFrame getWindow() {
        if (this.window==null)
        {
            this.window=new JFrame("Rezervasyona Sipariş Ekleme Sayfası");
            this.window.setBounds(350,100,800,600);
            this.window.setLayout(null);

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
            this.panel.setLayout(null);
            this.panel.setSize(800,600);
            this.panel.setBounds(350,100,800,600);
        }
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JTextField getSearchField() {
        if (this.searchField==null)
        {
            this.searchField=new JTextField();
            this.searchField.setBounds(100,50,150,30);
        }
        return searchField;
    }

    public void setSearchField(JTextField searchField) {
        this.searchField = searchField;
    }

    public JButton getSearchButton() {
        if (this.searchButton==null)
        {
            this.searchButton=new JButton("Masa ara");
            this.searchButton.setBounds(260,50,150,30);
            this.searchButton.addActionListener(new guiToolAction(this));
        }
        return searchButton;
    }

    public void setSearchButton(JButton searchButton) {
        this.searchButton = searchButton;
    }

    public JLabel getYemekadiLabel() {
        if (this.yemekadiLabel==null)
        {
            this.yemekadiLabel=new JLabel("Yemek adı girin(Pizza,Ciğer Şiş,Kebap,Tavuk Sote): ");
            this.yemekadiLabel.setBounds(100,100,300,30);
            this.yemekadiLabel.setForeground(Color.white);
            this.yemekadiLabel.setFont(new Font("Arial",Font.BOLD,12));
        }
        return yemekadiLabel;
    }

    public void setYemekadiLabel(JLabel yemekadiLabel) {
        this.yemekadiLabel = yemekadiLabel;
    }

    public JTextField getYemekadiField() {
        if (this.yemekadiField==null)
        {
            this.yemekadiField=new JTextField();
            this.yemekadiField.setBounds(410,100,200,30);
        }
        return yemekadiField;
    }

    public void setYemekadiField(JTextField yemekadiField) {
        this.yemekadiField = yemekadiField;
    }

    public JLabel getExtraNotLabel() {
        if (this.extraNotLabel==null)
        {
            this.extraNotLabel=new JLabel("Ekstra Not: ");
            this.extraNotLabel.setBounds(320,150,80,30);
            this.extraNotLabel.setForeground(Color.WHITE);
            this.extraNotLabel.setFont(new Font("Arial",Font.BOLD,12));
        }
        return extraNotLabel;
    }

    public void setExtraNotLabel(JLabel extraNotLabel) {
        this.extraNotLabel = extraNotLabel;
    }

    public JTextPane getExtraNotField() {
        if (this.extraNotField==null)
        {
            this.extraNotField=new JTextPane();
            this.extraNotField.setBounds(410,150,200,150);
        }
        return extraNotField;
    }

    public void setExtraNotField(JTextPane extraNotField) {
        this.extraNotField = extraNotField;
    }

    public JButton getButton() {
        if (this.button==null)
        {
            this.button=new JButton("Rezervasyona Sipariş Ekle");
            this.button.setBounds(410,320,200,30);
            this.button.addActionListener(new guiToolAction(this));
        }
        return button;
    }

    public void setButton(JButton button) {
        this.button = button;
    }

    public ImageIcon getImage() {
        if (this.image==null)
        {
            this.image=new ImageIcon(".\\gorsel\\rezervasyonSiparisarkaplan.jpg");
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

