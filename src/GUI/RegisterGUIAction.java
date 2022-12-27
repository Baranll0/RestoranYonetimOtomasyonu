package GUI;

import DAO.PersonDAO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterGUIAction implements ActionListener {
    private RegisterGUI registerGUI;
    private LoginGui loginGui;
    private PersonDAO personDAO;
    public RegisterGUIAction(RegisterGUI registerGUI)
    {
        this.registerGUI=registerGUI;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==getRegisterGUI().getGirisYap())
        {
            System.out.println("Logine yonlendirildi");
            getLoginGui().getWindow().setContentPane(getLoginGui().getPanel());
            getLoginGui().getWindow().setVisible(true);
        }
        else if (e.getSource()==getRegisterGUI().getKayitOl())
        {
            System.out.println("Kayit olundu.");
            getPersonDAO().build(getRegisterGUI());
        }
    }

    public RegisterGUI getRegisterGUI() {
        if (this.registerGUI==null)
        {
            this.registerGUI=new RegisterGUI();
        }
        return registerGUI;
    }

    public void setRegisterGUI(RegisterGUI registerGUI) {
        this.registerGUI = registerGUI;
    }

    public LoginGui getLoginGui() {
        if (this.loginGui==null)
        {
            this.loginGui=new LoginGui();
        }
        return loginGui;
    }

    public void setLoginGui(LoginGui loginGui) {
        this.loginGui = loginGui;
    }

    public PersonDAO getPersonDAO() {
        if (this.personDAO==null)
        {
            this.personDAO=new PersonDAO(getRegisterGUI(),1);
        }
        return personDAO;
    }

    public void setPersonDAO(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }
}
