
import java.util.Scanner;

public class VanhimmanNimi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        String vanhin = null;
        int suurin = 0;
        String[] arr = new String[0];
        while (!input.isEmpty()) {
             arr = input.split(",");
            for ( int i = 1; i < arr.length; i= i + 2){
                if(Integer.parseInt(arr[i]) > suurin ){
                    suurin = Integer.parseInt(arr[i]);
                    vanhin = arr [i - 1];
                }
            }
            input = scanner.nextLine();
        }
        System.out.println(vanhin);
        


    }
}
