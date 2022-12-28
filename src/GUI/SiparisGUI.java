package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
public class SiparisGUI{
    private JPanel panel;
    private JCheckBox yemekSecimiCheckbox;
    private JComboBox adetSecimi;
    private JCheckBox yemekSecimiCheckbox2;
    private Image yeniden;
    private ImageIcon image2;
    private JLabel yemekfiyatiEtiketi1;
    private JLabel yemekfiyatiEtiketi2;
    private JComboBox adetSecimi2;
    private JLabel fotografEtiketi;
    private JLabel fotografEtiketi2;
    private JLabel yemekismiEtiketi1;
    private JLabel yemekismiEtiketi2;
    private ImageIcon image;
    private JPanel yemekPaneli;
    private JFrame window;
    private Image yeniden2;
    private ImageIcon image3;
    private JPanel yemeklerpaneli;
    private JButton Siparisekle;

    private JScrollPane scrollPane;
    private Image yeniden3;
    private String [] adetler;
    private String [] adetler2;
    private String [] adetler3;
    private JLabel fotografEtiketi3;
    private JLabel yemekismiEtiketi3;
    private  JLabel yemekfiyatiEtiketi3;
    private JComboBox adetSecimi3;
    private JCheckBox yemekSecimiCheckbox3;

    private ImageIcon image4;
    private Image yeniden4;
    private JLabel fotografEtiketi4;
    private JLabel yemekismiEtiketi4;
    private JLabel yemekfiyatiEtiketi4;
    private String[] adetler4;
    private JComboBox adetSecimi4;
    private JCheckBox yemekSecimiCheckbox4;

    public String[] getAdetler3() {
        if (this.adetler3==null)
        {
            this.adetler3=new String[]{"0", "1", "2", "3", "4", "5"};
        }
        return adetler3;
    }

    public void setAdetler3(String[] adetler3) {
        this.adetler3 = adetler3;
    }

    public String[] getAdetler2() {
        if (this.adetler2==null)
        {
            this.adetler2=new String[]{"0", "1", "2", "3", "4", "5"};
        }
        return adetler2;
    }

    public void setAdetler2(String[] adetler2) {
        this.adetler2 = adetler2;
    }

    public String[] getAdetler() {
        if (this.adetler==null)
        {
            this.adetler= new String[]{"0", "1", "2", "3", "4", "5"};
        }
        return adetler;
    }

    public void setAdetler(String[] adetler) {
        this.adetler = adetler;
    }

    public SiparisGUI()
    {

    }
    public void build()
    {
        this.getYemekPaneli().add(this.getFotografEtiketi());
        this.getYemekPaneli().add(this.getYemekismiEtiketi1());
        this.getYemekPaneli().add(this.getYemekfiyatiEtiketi1());
        this.getYemekPaneli().add(this.getAdetSecimi());
        this.getYemekPaneli().add(this.getYemekSecimiCheckbox());
        this.getYemekPaneli().add(this.getFotografEtiketi2());
        this.getYemekPaneli().add(this.getYemekismiEtiketi2());
        this.getYemekPaneli().add(this.getYemekfiyatiEtiketi2());
        this.getYemekPaneli().add(this.getAdetSecimi2());
        this.getYemekPaneli().add(this.getYemekSecimiCheckbox2());
        this.getYemekPaneli().add(this.getFotografEtiketi3());
        this.getYemekPaneli().add(this.getYemekismiEtiketi3());
        this.getYemekPaneli().add(this.getYemekfiyatiEtiketi3());
        this.getYemekPaneli().add(this.getAdetSecimi3());
        this.getYemekPaneli().add(this.getYemekSecimiCheckbox3());
        this.getYemekPaneli().add(this.getFotografEtiketi4());
        this.getYemekPaneli().add(this.getYemekismiEtiketi4());
        this.getYemekPaneli().add(this.getYemekfiyatiEtiketi4());
        this.getYemekPaneli().add(this.getAdetSecimi4());
        this.getYemekPaneli().add(this.getYemekSecimiCheckbox4());
        this.getYemeklerpaneli().add(this.getYemekPaneli());
        this.getPanel().add(this.getSiparisekle());
        this.getPanel().add(this.getScrollPane());
        this.getScrollPane().setViewportView(getYemeklerpaneli());
        this.getWindow().setLayout(null);
        this.getWindow().setContentPane(this.getPanel());


    }

    public ImageIcon getImage4() {
        if (this.image4==null)
        {
            this.image4=new ImageIcon(".\\gorsel\\tavuksote.jpg");
        }
        return image4;
    }

    public void setImage4(ImageIcon image4) {
        this.image4 = image4;
    }

    public Image getYeniden4() {
        if (this.yeniden4==null)
        {
            this.yeniden4=getImage4().getImage().getScaledInstance(100,100, Image.SCALE_SMOOTH);
        }
        return yeniden4;
    }

    public void setYeniden4(Image yeniden4) {
        this.yeniden4 = yeniden4;
    }

    public JLabel getFotografEtiketi4() {
        if (this.fotografEtiketi4==null)
        {
            this.fotografEtiketi4=new JLabel(new ImageIcon(getYeniden4()));
        }
        return fotografEtiketi4;
    }

    public void setFotografEtiketi4(JLabel fotografEtiketi4) {
        this.fotografEtiketi4 = fotografEtiketi4;
    }

    public JLabel getYemekismiEtiketi4() {
        if (this.yemekismiEtiketi4==null)
        {
            this.yemekismiEtiketi4=new JLabel(" Tavuk Sote:  ");
        }
        return yemekismiEtiketi4;
    }

    public void setYemekismiEtiketi4(JLabel yemekismiEtiketi4) {
        this.yemekismiEtiketi4 = yemekismiEtiketi4;
    }

    public JLabel getYemekfiyatiEtiketi4() {
        if (this.yemekfiyatiEtiketi4==null)
        {
            this.yemekfiyatiEtiketi4=new JLabel("   35₺  ");
        }
        return yemekfiyatiEtiketi4;
    }

    public void setYemekfiyatiEtiketi4(JLabel yemekfiyatiEtiketi4) {
        this.yemekfiyatiEtiketi4 = yemekfiyatiEtiketi4;
    }

    public String[] getAdetler4() {
        if (this.adetler4==null)
        {
            this.adetler4= new String[]{"0", "1", "2", "3", "4", "5"};
        }
        return adetler4;
    }

    public void setAdetler4(String[] adetler4) {
        this.adetler4 = adetler4;
    }

    public JComboBox getAdetSecimi4() {
        if (this.adetSecimi4==null)
        {
            this.adetSecimi4=new JComboBox(getAdetler4());
        }
        return adetSecimi4;
    }

    public void setAdetSecimi4(JComboBox adetSecimi4) {
        this.adetSecimi4 = adetSecimi4;
    }

    public JCheckBox getYemekSecimiCheckbox4() {
        if (this.yemekSecimiCheckbox4==null)
        {
            this.yemekSecimiCheckbox4=new JCheckBox();
        }
        return yemekSecimiCheckbox4;
    }

    public void setYemekSecimiCheckbox4(JCheckBox yemekSecimiCheckbox4) {
        this.yemekSecimiCheckbox4 = yemekSecimiCheckbox4;
    }

    public JCheckBox getYemekSecimiCheckbox3() {
        if (this.yemekSecimiCheckbox3==null)
        {
            this.yemekSecimiCheckbox3= new JCheckBox();
        }
        return yemekSecimiCheckbox3;
    }

    public void setYemekSecimiCheckbox3(JCheckBox yemekSecimiCheckbox3) {
        this.yemekSecimiCheckbox3 = yemekSecimiCheckbox3;
    }

    public JComboBox getAdetSecimi3() {
        if (this.adetSecimi3==null)
        {
            this.adetSecimi3=new JComboBox(getAdetler3());
        }
        return adetSecimi3;
    }

    public void setAdetSecimi3(JComboBox adetSecimi3) {
        this.adetSecimi3 = adetSecimi3;
    }

    public JLabel getYemekfiyatiEtiketi3() {
        if (this.yemekfiyatiEtiketi3==null)
        {
            this.yemekfiyatiEtiketi3=new JLabel("   60₺  ");
        }
        return yemekfiyatiEtiketi3;
    }

    public void setYemekfiyatiEtiketi3(JLabel yemekfiyatiEtiketi3) {
        this.yemekfiyatiEtiketi3 = yemekfiyatiEtiketi3;
    }

    public JLabel getYemekismiEtiketi3() {
        if (this.yemekismiEtiketi3==null)
        {
            this.yemekismiEtiketi3=new JLabel(" Adana Kebap: ");
        }
        return yemekismiEtiketi3;
    }

    public void setYemekismiEtiketi3(JLabel yemekismiEtiketi3) {
        this.yemekismiEtiketi3 = yemekismiEtiketi3;
    }

    public JLabel getFotografEtiketi3() {
        if (this.fotografEtiketi3==null)
        {
            this.fotografEtiketi3=new JLabel(new ImageIcon(getYeniden3()));
        }
        return fotografEtiketi3;
    }

    public void setFotografEtiketi3(JLabel fotografEtiketi3) {
        this.fotografEtiketi3 = fotografEtiketi3;
    }

    public Image getYeniden3() {
        if (this.yeniden3==null)
        {
            this.yeniden3=getImage3().getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);
        }

        return yeniden3;
    }

    public void setYeniden3(Image yeniden3) {
        this.yeniden3 = yeniden3;
    }

    public ImageIcon getImage3() {
        if (this.image3==null)
        {
            this.image3=new ImageIcon(".\\gorsel\\kebap.jpg");
        }
        return image3;
    }

    public void setImage3(ImageIcon image3) {
        this.image3 = image3;
    }

    public JPanel getPanel() {
        if (this.panel==null)
        {
            panel=new JPanel();
            panel.setLayout(null);
            panel.setSize(800,600);
        }
        return panel;
    }
    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JFrame getWindow() {
        if (this.window==null)
        {
            window=new JFrame("Siparis Ekleme Sayfası");
            window.setBounds(200,150,800,600);
        }
        return window;
    }

    public void setWindow(JFrame window) {
        this.window = window;
    }

    public JScrollPane getScrollPane() {
        if (this.scrollPane==null)
        {
            this.scrollPane=new JScrollPane();
            scrollPane.setBounds(50,50,700,400);
            scrollPane.setBackground(Color.blue);
        }
        return scrollPane;
    }
    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

    public JLabel getFotografEtiketi() {
        if (this.fotografEtiketi==null)
        {
            this.fotografEtiketi=new JLabel(new ImageIcon(getYeniden()));
        }
        return fotografEtiketi;
    }

    public JLabel getYemekismiEtiketi2() {
        if (this.yemekismiEtiketi2==null)
        {
            this.yemekismiEtiketi2=new JLabel(" Ciğer Şiş: ");
        }
        return yemekismiEtiketi2;
    }

    public void setYemekismiEtiketi2(JLabel yemekismiEtiketi2) {
        this.yemekismiEtiketi2 = yemekismiEtiketi2;
    }

    public JCheckBox getYemekSecimiCheckbox() {
        if (this.yemekSecimiCheckbox==null)
        {
            this.yemekSecimiCheckbox=new JCheckBox();
        }
        return yemekSecimiCheckbox;
    }

    public void setYemekSecimiCheckbox(JCheckBox yemekSecimiCheckbox) {
        this.yemekSecimiCheckbox = yemekSecimiCheckbox;
    }

    public void setFotografEtiketi(JLabel fotografEtiketi) {
        this.fotografEtiketi = fotografEtiketi;
    }

    public Image getYeniden() {
        if (this.yeniden==null) {
            this.yeniden=getImage().getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);
        }
        return yeniden;
    }

    public void setYeniden(Image yeniden) {
        this.yeniden = yeniden;
    }

    public Image getYeniden2() {
        if (this.yeniden2==null) {
            this.yeniden2 = getImage2().getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);
        }
        return yeniden2;
    }

    public void setYeniden2(Image yeniden2) {
        this.yeniden2 = yeniden2;
    }

    public JLabel getFotografEtiketi2() {
        if (this.fotografEtiketi2==null)
        {
            this.fotografEtiketi2=new JLabel(new ImageIcon(getYeniden2()));
        }
        return fotografEtiketi2;
    }

    public void setFotografEtiketi2(JLabel fotografEtiketi2) {
        this.fotografEtiketi2 = fotografEtiketi2;
    }

    public JComboBox getAdetSecimi() {
        if (this.adetSecimi==null)
        {
            this.adetSecimi=new JComboBox(getAdetler());
            this.adetSecimi.setPreferredSize(new Dimension(20,20));
        }
        return adetSecimi;
    }

    public void setAdetSecimi(JComboBox adetSecimi) {
        this.adetSecimi = adetSecimi;
    }

    public ImageIcon getImage() {
        if (this.image==null)
        {
            this.image=new ImageIcon(".\\gorsel\\pizza.jpg");
        }
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }

    public JPanel getYemekPaneli() {
        if (this.yemekPaneli==null)
        {
            this.yemekPaneli=new JPanel();
            this.getYemekPaneli().setLayout(new GridLayout(4,1));
        }
        return yemekPaneli;
    }

    public void setYemekPaneli(JPanel yemekPaneli) {
        this.yemekPaneli = yemekPaneli;
    }

    public JLabel getYemekismiEtiketi1() {
        if (this.yemekismiEtiketi1==null)
        {
            this.yemekismiEtiketi1=new JLabel(" Pizza: ");
        }
        return yemekismiEtiketi1;
    }

    public void setYemekismiEtiketi1(JLabel yemekismiEtiketi1) {
        this.yemekismiEtiketi1 = yemekismiEtiketi1;
    }

    public JLabel getYemekfiyatiEtiketi2() {
        if (this.yemekfiyatiEtiketi2==null)
        {
            this.yemekfiyatiEtiketi2=new JLabel("   60₺  ");
        }
        return yemekfiyatiEtiketi2;
    }

    public void setYemekfiyatiEtiketi2(JLabel yemekfiyatiEtiketi2) {
        this.yemekfiyatiEtiketi2 = yemekfiyatiEtiketi2;
    }

    public JLabel getYemekfiyatiEtiketi1() {
        if (this.yemekfiyatiEtiketi1==null)
        {
            this.yemekfiyatiEtiketi1=new JLabel("   45₺  ");
        }
        return yemekfiyatiEtiketi1;
    }

    public void setYemekfiyatiEtiketi1(JLabel yemekfiyatiEtiketi1) {
        this.yemekfiyatiEtiketi1 = yemekfiyatiEtiketi1;
    }

    public ImageIcon getImage2() {
        if (this.image2==null)
        {
            this.image2=new ImageIcon(".\\gorsel\\ciger.jpg");
        }
        return image2;
    }

    public void setImage2(ImageIcon image2) {
        this.image2 = image2;
    }

    public JComboBox getAdetSecimi2() {
        if (this.adetSecimi2==null)
        {
            this.adetSecimi2=new JComboBox(getAdetler2());
        }
        return adetSecimi2;
    }

    public void setAdetSecimi2(JComboBox adetSecimi2) {
        this.adetSecimi2 = adetSecimi2;
    }

    public JCheckBox getYemekSecimiCheckbox2() {
        if (this.yemekSecimiCheckbox2==null)
        {
            this.yemekSecimiCheckbox2=new JCheckBox();
        }
        return yemekSecimiCheckbox2;
    }

    public void setYemekSecimiCheckbox2(JCheckBox yemekSecimiCheckbox2) {
        this.yemekSecimiCheckbox2 = yemekSecimiCheckbox2;
    }

    public JPanel getYemeklerpaneli(){
        if (this.yemeklerpaneli==null)
        {

            this.yemeklerpaneli=new JPanel();
            this.yemeklerpaneli.setLayout(new BoxLayout(this.yemeklerpaneli,BoxLayout.LINE_AXIS));





        }
        return yemeklerpaneli;
    }

    public void setYemeklerpaneli(JPanel yemeklerpaneli) {
        this.yemeklerpaneli = yemeklerpaneli;
    }

    public JButton getSiparisekle() {
        if (this.Siparisekle==null)
        {
            this.Siparisekle=new JButton("Sipariş Ekle");
            this.Siparisekle.setBounds(600,470,130,30);
            Siparisekle.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            Siparisekle.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    Siparisekle.setBackground(new Color(240, 230, 140));
                    Siparisekle.setForeground(new Color(105,105,105));
                    Siparisekle.setSize(130,32);
                    Siparisekle.setForeground(Color.black);
                    Siparisekle.setMargin(new Insets(0,0,0,0));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    Siparisekle.setBackground(Color.WHITE);
                    Siparisekle.setForeground(Color.BLACK);
                    Siparisekle.setSize(130,30);
                    Siparisekle.setBorderPainted(true);

                }
            });
            this.getSiparisekle().addActionListener(new SiparisGUIAction(this));
        }
        return Siparisekle;
    }

    public void setSiparisekle(JButton siparisekle) {
        Siparisekle = siparisekle;
    }
}

