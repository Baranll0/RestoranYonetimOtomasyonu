package GUI;

import DAO.PersonDAO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SiparisGUIAction implements ActionListener {
    private SiparisGUI siparisGUI;
    private PersonDAO personDAO;
    public SiparisGUIAction(SiparisGUI siparisGUI)
    {
        this.siparisGUI=siparisGUI;
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==getSiparisGUI().getSiparisekle())
        {

            if (getSiparisGUI().getYemekSecimiCheckbox().isSelected())
            {
                getPersonDAO().build(getSiparisGUI().getYemekismiEtiketi1().getText().trim(),getSiparisGUI().getYemekfiyatiEtiketi1().getText().trim(), String.valueOf(getSiparisGUI().getAdetSecimi().getSelectedIndex()));
            }
            if(getSiparisGUI().getYemekSecimiCheckbox2().isSelected())
            {
                getPersonDAO().build(getSiparisGUI().getYemekismiEtiketi2().getText().trim(),getSiparisGUI().getYemekfiyatiEtiketi2().getText().trim(), String.valueOf(getSiparisGUI().getAdetSecimi2().getSelectedIndex()));
            }
            if(getSiparisGUI().getYemekSecimiCheckbox3().isSelected())
            {
                getPersonDAO().build(getSiparisGUI().getYemekismiEtiketi3().getText().trim(),getSiparisGUI().getYemekfiyatiEtiketi3().getText().trim(), String.valueOf(getSiparisGUI().getAdetSecimi3().getSelectedIndex()));
            }
            if (getSiparisGUI().getYemekSecimiCheckbox3().isSelected())
            {
                getPersonDAO().build(getSiparisGUI().getYemekismiEtiketi4().getText().trim(),getSiparisGUI().getYemekfiyatiEtiketi4().getText().trim(), String.valueOf(getSiparisGUI().getAdetSecimi4().getSelectedIndex()));
            }
            JOptionPane.showMessageDialog(null,"Sipariş Verildi.");
            getSiparisGUI().getWindow().setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            getSiparisGUI().getWindow().setVisible(false);
        }

    }

    public SiparisGUI getSiparisGUI() {
        if (this.siparisGUI==null)
        {
            this.siparisGUI=new SiparisGUI();
            this.siparisGUI.build();
        }
        return siparisGUI;
    }

    public void setSiparisGUI(SiparisGUI siparisGUI) {
        this.siparisGUI = siparisGUI;
    }

    public PersonDAO getPersonDAO() {
        if (this.personDAO==null){
            this.personDAO=new PersonDAO();
        }
        return personDAO;
    }

    public void setPersonDAO(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }
}
