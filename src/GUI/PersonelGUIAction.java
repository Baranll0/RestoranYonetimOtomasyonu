package GUI;

import DAO.AbstractDAO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class PersonelGUIAction implements ActionListener {
    private AbstractDAO abstractDAO;
    private PersonelGUI personelGUI;

    public PersonelGUIAction(PersonelGUI personelGUI)
    {
        this.personelGUI=personelGUI;
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==getPersonelGUI().getGirisYap())
        {
            try {
                getAbstractDAO().Save(getPersonelGUI().getUserT().getText(),getPersonelGUI().getPasswordT().getText());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            System.out.println(getPersonelGUI().getUserT().getText()+getPersonelGUI().getPasswordT().getText());
            if (getAbstractDAO().getData(getPersonelGUI().getUserT().getText(),getPersonelGUI().getPasswordT().getText(),1)==1)
            {
                getPersonelGUI().getAsilWindow().setContentPane(getPersonelGUI().getAsilPanel());
                getPersonelGUI().getAsilWindow().setVisible(true);
                getPersonelGUI().build2();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Giris basarisiz!.");
                getPersonelGUI().getWindow().setVisible(false);
            }

        }
        else if (e.getSource()==getPersonelGUI().getMusteriEkle())
        {
            try {
                getAbstractDAO().Save(getPersonelGUI().getAdSoyadT().getText(),getPersonelGUI().getUsT().getText(),getPersonelGUI().getPassT().getText(),getPersonelGUI().getMailT().getText());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            JOptionPane.showMessageDialog(null,"Müşteri eklendi!");
            getPersonelGUI().getAsilWindow().setVisible(false);
            getPersonelGUI().getWindow().setVisible(false);
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

    public PersonelGUI getPersonelGUI() {
        if (this.personelGUI==null)
        {
            this.personelGUI=new PersonelGUI();
        }
        return personelGUI;
    }

    public void setPersonelGUI(PersonelGUI personelGUI) {
        this.personelGUI = personelGUI;
    }
}
