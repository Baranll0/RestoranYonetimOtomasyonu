package GUI;

import DAO.AbstractDAO;
import DAO.PersonDAO;

import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGuiAction implements ActionListener {
    private LoginGui loginGui;
    private RegisterGUI registerGUI;
    private PersonDAO personDAO;
    private AbstractDAO abstractDAO;
    private guiTool gui;
    public LoginGuiAction(LoginGui loginGui)
    {

        this.loginGui=loginGui;
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

    public PersonDAO getPersonDAO() {
        if (this.personDAO==null)
        {
            this.personDAO=new PersonDAO(getLoginGui());
        }
        return personDAO;
    }

    public void setPersonDAO(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    public guiTool getGui() {
        if (this.gui==null)
        {
            this.gui=new guiTool();

        }
        return gui;
    }

    public void setGui(guiTool gui) {
        this.gui = gui;
    }

    public LoginGui getLoginGui() {
        if (this.loginGui==null)
        {
            this.loginGui=new LoginGui();
            this.loginGui.getWindow().setVisible(true);
        }
        return loginGui;
    }

    public void setLoginGui(LoginGui loginGui) {
        this.loginGui = loginGui;
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==getLoginGui().getKayitOl())
        {
            System.out.println("Kayit ekranina yonlendirildi");
            getRegisterGUI().getWindow().setContentPane(getRegisterGUI().getPanel());
            getRegisterGUI().getWindow().setVisible(true);
        }
        else if(e.getSource()==getLoginGui().getGirisYap())
        {
                if (getAbstractDAO().getData(1,getLoginGui().getUserT().getText(),getLoginGui().getPasswordT().getText())==1)
                {
                    System.out.println("Log başarılı");
                    getGui().getWindow().setContentPane(getGui().getPanel());
                    this.getGui().getWindow().setVisible(true);
                }
                else
                {
                    System.out.println("basarisiz");
                    JOptionPane.showMessageDialog(null,"Parola yanlis");
                }
        }
    }
}
