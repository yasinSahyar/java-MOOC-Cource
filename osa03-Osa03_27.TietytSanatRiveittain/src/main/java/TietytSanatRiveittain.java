
import java.util.Scanner;

public class TietytSanatRiveittain {

     public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        while (true) {
            String teksti = lukija.nextLine();
            if (teksti.equals("")) {
                break;
            }
            String sanat[] = teksti.split("\\s+");
            int i = 0;
            while (i < sanat.length) {
                if(sanat[i].contains("av")) {
                    System.out.println(sanat[i]);
                }
                i++;
            }
        }
     }

}
