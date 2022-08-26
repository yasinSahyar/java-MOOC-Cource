
import java.util.Scanner;

public class Tarina {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        System.out.println("Kerron kohta tarinan, mutta tarvitsen siihen hieman tietoja."
                + "\n Minkä niminen tarinassa esiintyvä hahmo on?");
        String hahmo = lukija.nextLine();
        System.out.println("Mikä hahmon ammatti on?");
        String ammatti = lukija.nextLine();
        System.out.println("Tässä tarina:");
        System.out.print("Olipa kerran " + hahmo + ", joka oli ammatiltaan " + ammatti + "." + "\nMatkatessaan töihin, "
                + hahmo);
        System.out.println(" mietti arkeaan.");

        System.out.println("Ehkäpä " + hahmo + " ei olekaan koko " + "elämäänsä " + ammatti + ".");
        //System.out.println(" mietti arkeaan. Kun työnä" + "on " + ammatti + ", tekemistä riittää välillä hyvin paljon ja" );
        //System.out.println("välillä ei lainkaan. Ehkäpä " + hahmo + " ei olekaan koko" + "elämäänsä " + ammatti + ".");
    }
}
