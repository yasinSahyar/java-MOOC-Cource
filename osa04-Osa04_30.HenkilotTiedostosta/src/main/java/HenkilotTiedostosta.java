
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class HenkilotTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Minkä niminen tiedosto luetaan?");
        String tiedosto = lukija.nextLine();

        ArrayList<Henkilo> henkilot = lueHenkilot(tiedosto);
        System.out.println("Henkilöitä: " + henkilot.size());
        System.out.println("Henkilöt:");
        for (Henkilo henkilo : henkilot) {
            System.out.println(henkilo);

        }
    }

    public static ArrayList<Henkilo> lueHenkilot(String tiedosto) {
        ArrayList<Henkilo> henkilot = new ArrayList<>();
        BufferedReader br;
        
        try {
            br = new BufferedReader(new FileReader(tiedosto));
            String str;
            
            while ((str = br.readLine()) != null) {
                String[] strArray = str.split(",");
                String nimi = strArray[0];
                int ika = Integer.parseInt(strArray[1]);
                
                henkilot.add(new Henkilo(nimi,ika));
                
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        

        // toteuta henkilöiden lukeminen ja luominen tänne
        return henkilot;

    }
}
