package DAO;
import GUI.LoginGui;

import java.io.*;
import java.sql.Savepoint;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AbstractDAO {
    public void Save(String ad,String username,String password,String mail)throws IOException
    {
        int id=1;
        String Filename = "Person";
        File f = new File(Filename);
        if (!f.exists()) {
            f.createNewFile();
            System.out.println("Dosya olusturuldu. " + Filename);
        } else {
            FileWriter fw = new FileWriter(f, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("-"+ad+"-"+username+"-"+password+"-"+mail);
            bw.newLine();
            bw.close();
            id++;
            System.out.println("Dosyaya yazildi.");
        }
    }
    public void Save(String yemekAdi,String fiyat,String adet)throws IOException
    {
        String Filename = "Siparis";
        LoginGui loginGui=new LoginGui();
        loginGui.getWindow().setVisible(false);
        File f = new File(Filename);
        if (!f.exists()) {
            f.createNewFile();
            System.out.println("Dosya olusturuldu. " + Filename);
        } else {
            FileWriter fw = new FileWriter(f, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("-"+yemekAdi+"-"+fiyat+"-"+adet);
            bw.newLine();
            bw.close();
            System.out.println("Dosyaya yazildi.");
        }
    }
    public void Save(String masaNo,String ad,String telefon,String mail,String m) throws IOException {
        String Filename = "Rezervasyon";
        File f = new File(Filename);
        if (!f.exists()) {
            f.createNewFile();
            System.out.println("Dosya olusturuldu. " + Filename);
        } else {
            FileWriter fw = null;
            fw = new FileWriter(f, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("-"+masaNo+"-"+ad+"-"+telefon+"-"+mail+"-");
            bw.newLine();
            bw.close();
            System.out.println("Dosyaya yazildi.");
        }
    }
    public void Save(String username,String password)throws IOException
    {
        String Filename = "Personel";
        File f = new File(Filename);
        if (!f.exists()) {
            f.createNewFile();
            System.out.println("Dosya olusturuldu. " + Filename);
        } else {
            FileWriter fw = null;
            fw = new FileWriter(f, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("-"+"admin"+"-"+"personel");
            bw.newLine();
            bw.close();
            System.out.println("Dosyaya yazildi.");
        }
    }
    public void saveManager(String ad,String maas)throws IOException
    {
        String Filename = "PersonelManager";
        File f = new File(Filename);
        if (!f.exists()) {
            f.createNewFile();
            System.out.println("Dosya olusturuldu. " + Filename);
        } else {
            FileWriter fw = null;
            fw = new FileWriter(f, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("-"+ad+"-"+maas);
            bw.newLine();
            bw.close();
            System.out.println("Dosyaya yazildi.");
        }


    }
    public void save(String username,String password)throws IOException
    {

        File f = new File(".\\Yonetici");
        if (!f.exists()) {
            f.createNewFile();
            System.out.println("Dosya olusturuldu. ");
        } else {
            FileWriter fw = null;
            fw = new FileWriter(f, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("-"+"admin"+"-"+"yonetici");
            bw.newLine();
            bw.close();
            System.out.println("Dosyaya yazildi.");
        }
    }
    public String getData(String username)
    {
        try {
            FileReader fileReader=new FileReader(".\\Person");
            BufferedReader reader=new BufferedReader(fileReader);
            String line;
            int i=0;
            while ((line=reader.readLine())!=null)
            {
                String[] bilgiler=line.split("-");
                String ad=bilgiler[1];
                String user=bilgiler[2];
                String sifre=bilgiler[3];
                String mail=bilgiler[4];
                if (user.equals(username))
                {
                    return "Ad Soyad: "+ad+"\nKullanıcı adı: "+user+"\nMail: "+mail;
                }

            }
            reader.close();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return "Müşteri bilgileri bulunamadı.";
    }
    public List getdata()
    {
        String ad=null;
        String maas = null;
        String yemekadeti=null;
        ArrayList<String> arrayList=new ArrayList<String>();
        try {
            FileReader fileReader=new FileReader(".\\PersonelManager");
            BufferedReader reader=new BufferedReader(fileReader);
            String line;
            int i=0;
            while ((line=reader.readLine())!=null)
            {
                String[] bilgiler=line.split("-");
                ad=bilgiler[1];
                maas=bilgiler[2];
                arrayList.add(ad);
                arrayList.add(maas);
            }
            reader.close();
            return arrayList;

        }catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }


    }
    public List getData()
    {
        String yemekadi=null;
        String yemekfiyati = null;
        String yemekadeti=null;
        ArrayList<String> arrayList=new ArrayList<String>();
        try {
            FileReader fileReader=new FileReader(".\\Siparis");
            BufferedReader reader=new BufferedReader(fileReader);
            String line;
            int i=0;
            while ((line=reader.readLine())!=null)
            {
                String[] bilgiler=line.split("-");
                yemekadi=bilgiler[1];
                yemekfiyati=bilgiler[2];
                yemekadeti=bilgiler[3];
                arrayList.add(yemekadi);
                arrayList.add(yemekfiyati);
                arrayList.add(yemekadeti);
            }
            reader.close();
            return arrayList;

        }catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("hata");
            return null;
        }


    }
    public int getdata(String username,String password)
    {

        try {
            FileReader fileReader=new FileReader(".\\Yonetici");
            BufferedReader reader=new BufferedReader(fileReader);
            String line;
            int i=0;
            while ((line=reader.readLine())!=null)
            {
                String[] bilgiler=line.split("-");
                String user=bilgiler[1];
                String pass=bilgiler[2];
                if (user.equals(username)&&pass.equals(password))
                {

                    return 1;
                }

            }
            reader.close();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return 0;
    }
    public int getData(String username,String password,int m)
    {

        try {
            FileReader fileReader=new FileReader(".\\Personel");
            BufferedReader reader=new BufferedReader(fileReader);
            String line;
            int i=0;
            while ((line=reader.readLine())!=null)
            {
                String[] bilgiler=line.split("-");
                String user=bilgiler[1];
                String pass=bilgiler[2];

                if (user.equals(username)&&pass.equals(password))
                {
                    return 1;
                }

            }
            reader.close();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return 0;

    }
    public int getData(int a,String username,String password)
    {
        try {
            FileReader fileReader=new FileReader(".\\Person");
            BufferedReader reader=new BufferedReader(fileReader);
            String line;
            int i=0;
            while ((line=reader.readLine())!=null)
            {
                String[] bilgiler=line.split("-");
                String ad=bilgiler[1];
                String user=bilgiler[2];
                String sifre=bilgiler[3];
                String mail=bilgiler[4];

                if (user.equals(username)&&sifre.equals(password))
                {
                    return 1;
                }

            }
            reader.close();
        }catch (Exception e)
        {
            e.printStackTrace();

        }

        return 0;
    }
    public int getData(String filename,String masaNo)
    {
        File file=new File(filename);
        try {
            FileReader fileReader=new FileReader(file);
            BufferedReader reader=new BufferedReader(fileReader);
            String line;
            int i=0;
            while ((line=reader.readLine())!=null)
            {
                String[] bilgiler=line.split("-");
                String masa=bilgiler[1];

                if (masa.equals(masaNo))
                {
                    return 1;
                }

            }
            reader.close();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return 0;

    }
}
