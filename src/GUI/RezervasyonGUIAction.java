package GUI;

import DAO.PersonDAO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RezervasyonGUIAction implements ActionListener {
    private RezervasyonGUI rezervasyonGUI;
    private PersonDAO personDAO;
    public RezervasyonGUIAction(RezervasyonGUI rezervasyonGUI)
    {
        this.rezervasyonGUI=rezervasyonGUI;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==getRezervasyonGUI().getRezervasyonEkle())
        {
            int select=-1;
            for (int i=0;i<getRezervasyonGUI().getTableNumbers().length;i++)
            {
                if (getRezervasyonGUI().getTableNumbers()[i].isSelected())
                {
                    select=i+1;
                    break;
                }
            }
            getPersonDAO().build(String.valueOf(select),getRezervasyonGUI().getNameField().getText(),getRezervasyonGUI().getTelefonField().getText(),getRezervasyonGUI().getEmailField().getText(),"m");
            JOptionPane.showMessageDialog(null,"Rezervasyonunuz yapıldı!","Bizi tercih ettiğiniz için teşekkürler!",JOptionPane.INFORMATION_MESSAGE);
            getRezervasyonGUI().getWindow().setVisible(false);
        }

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
}
