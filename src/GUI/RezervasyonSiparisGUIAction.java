package GUI;

import DAO.AbstractDAO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RezervasyonSiparisGUIAction implements ActionListener {
    private AbstractDAO abstractDAO;
    private RezervasyonSiparisGUI rezervasyonSiparisGUI;
    public RezervasyonSiparisGUIAction(RezervasyonSiparisGUI rezervasyonSiparisGUI)
    {
        this.rezervasyonSiparisGUI=rezervasyonSiparisGUI;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==getRezervasyonSiparisGUI().getSearchButton())
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
}
