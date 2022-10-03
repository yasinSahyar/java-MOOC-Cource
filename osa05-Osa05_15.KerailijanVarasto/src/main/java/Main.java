
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        // ==Esineet== Items==esine==item
        List<Item> itemList = new ArrayList<>();
        Item item;
        while (true) {
            System.out.println("Syötä esineen tunnus, tyhjä lopettaa.");
            String identifier = lukija.nextLine();
            if (identifier.isEmpty()) {
                break;
            }
            System.out.println("Syötä esineen nimi, tyhjä lopettaa.");
            String nimi = lukija.nextLine();
            if (nimi.isEmpty()) {
                break;
            }
            item = new Item(identifier, nimi);
            if (!itemList.contains(item)) {
                itemList.add(item);
            }
            
        }
        System.out.println("==Items==");
        for (Item items : itemList) {
            System.out.println(items);
        }
        


    }
}
