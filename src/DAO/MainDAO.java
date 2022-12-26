package DAO;
import java.io.IOException;
import java.util.ArrayList;

public class MainDAO extends AbstractDAO{
    @Override
    public void Save(String  ad,String username,String password,String mail) throws IOException {
        super.Save(ad,username,password,mail);
    }
    @Override
    public int getData(String fileName,String username,String password) {
        return super.getData(fileName,username,password);
    }
}

