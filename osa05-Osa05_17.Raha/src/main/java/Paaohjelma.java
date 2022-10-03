
public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne koodia jolla testaat ohjelmoimasi luokan toimintaa
        
        Raha a = new Raha(20,0);
        Raha b = new Raha(5,80);
        
        Raha c = a.miinus(b);
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        c = c.miinus(a);
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
