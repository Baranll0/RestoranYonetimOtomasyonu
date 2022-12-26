package DAO;
import GUI.LoginGui;
import GUI.RegisterGUI;
import GUI.guiToolAction;

import java.io.IOException;
import java.net.SocketAddress;

public class PersonDAO extends MainDAO{
    private RegisterGUI registerGUI;
    private LoginGui loginGui;
    private guiToolAction gui;
    int id;
    public PersonDAO()
    {

    }
    public PersonDAO(LoginGui loginGui)
    {
        this.loginGui=loginGui;
    }

    public PersonDAO(RegisterGUI registerGUI,int id) {
        this.registerGUI = registerGUI;
        this.id=id;
    }
    public void build(String username,String password)
    {
        AbstractDAO abstractDAO=new AbstractDAO();
        abstractDAO.getData(".\\Person",username,password);
    }
    public void build(RegisterGUI registerGUI){

        AbstractDAO abstractDAO=new AbstractDAO();
        try {
            abstractDAO.Save(registerGUI.getAdSoyadT().getText(),registerGUI.getUserT().getText(),registerGUI.getPasswordT().getText(),registerGUI.getMailT().getText());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public void build(String yemekadi,String fiyat,String adet)
    {
        AbstractDAO abstractDAO=new AbstractDAO();
        try {
            abstractDAO.Save(yemekadi,fiyat,adet);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void build(String masaNo,String ad,String telefon,String mail,String m)
    {
        AbstractDAO abstractDAO=new AbstractDAO();
        try {
            abstractDAO.Save(masaNo,ad,telefon,mail,m);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public void buildGetData()
    {
        AbstractDAO abstractDAO=new AbstractDAO();
        abstractDAO.getData(".\\person",getRegisterGUI().getUserT().getText(),getRegisterGUI().getPasswordT().getText());
    }
    public RegisterGUI getRegisterGUI() {
        if (this.registerGUI==null)
        {
            this.registerGUI=new RegisterGUI();

        }
        return this.registerGUI;
    }
    public void setRegisterGUI(RegisterGUI registerGUI) {
        this.registerGUI = registerGUI;
    }

    public guiToolAction getGui() {
        if (this.gui==null)
        {
            gui=new guiToolAction(getRegisterGUI());
        }
        return gui;
    }

    public void setGui(guiToolAction gui) {
        this.gui = gui;
    }

    @Override
    public String toString() {
        return "PersonDAO{" +
                "registerGUI=" + registerGUI.toString() +
                '}';
    }
}

