
import java.util.Scanner;

public class VanhimmanIka {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        int suurin = 0;
        while (!input.isEmpty()) {
            String[] arr = input.split(",");
            for ( int i = 1; i < arr.length; i= i + 2){
                if(Integer.parseInt(arr[i]) > suurin ){
                    suurin = Integer.parseInt(arr[i]);
                }
            }
            input = scanner.nextLine();
        }
        System.out.println(suurin);
        
        


    }
}
