package GUI;

import DAO.AbstractDAO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class YoneticiLoginGUIAction implements ActionListener {
    private AbstractDAO abstractDAO;
    private PersonelGUI personelGUI;
    private YoneticiLoginGUI yoneticiLoginGUI;

    public YoneticiLoginGUIAction(YoneticiLoginGUI yoneticiLoginGUI)
    {
        this.yoneticiLoginGUI=yoneticiLoginGUI;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==getYoneticiLoginGUI().getGirisYap())
        {
            try {
                getAbstractDAO().save(getYoneticiLoginGUI().getUserT().getText(),getYoneticiLoginGUI().getPasswordT().getText());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            if (getAbstractDAO().getdata(getYoneticiLoginGUI().getUserT().getText(),getYoneticiLoginGUI().getPasswordT().getText())==1)
            {
                String personelName= JOptionPane.showInputDialog(null,"Personel Adı Soyadı","Personel Ekleme Sayfası",JOptionPane.QUESTION_MESSAGE);
                String personelMaasi=JOptionPane.showInputDialog(null,"Personel Maaşı: ","Personel Ekleme Sayfası",JOptionPane.QUESTION_MESSAGE);
                try {
                    getAbstractDAO().saveManager(personelName,personelMaasi);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                JOptionPane.showMessageDialog(null,"Personel Eklendi...");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Giris basarisiz!.");
                getPersonelGUI().getWindow().setVisible(false);
            }
        }

    }

    public YoneticiLoginGUI getYoneticiLoginGUI() {
        if (this.yoneticiLoginGUI==null)
        {
            this.yoneticiLoginGUI=new YoneticiLoginGUI();
        }
        return yoneticiLoginGUI;
    }

    public void setYoneticiLoginGUI(YoneticiLoginGUI yoneticiLoginGUI) {
        this.yoneticiLoginGUI = yoneticiLoginGUI;
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
