
import java.util.ArrayList;
import java.util.Scanner;

public class HenkilotietojenTarkastelu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String pisinNimiStr = null;
        int pisinNimi = 0;
        int sum = 0;
        int count = 0;
        double ikien = 0;
        
        while (true) {
            String input = scanner.nextLine();
            String[] arr = input.split(",");
            
            if (input.equals("")) {
                break;
            }
            if (arr[0].toCharArray().length > pisinNimi) {
                pisinNimi = arr[0].toCharArray().length;
                pisinNimiStr = arr[0];
            }
            count++;
            sum += Integer.parseInt(arr[1]);
        }
        ikien = (double) sum / count;
        System.out.println("Pisin nimi: " + pisinNimiStr);
        System.out.println("Syntymävuosien keskiarvo: " + ikien);
        
        


    }
}
