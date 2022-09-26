
public class Kirja {

    private String nimi;
    private int julkaisuvuosi;

    public Kirja(String nimi, int julkaisuvuosi) {
        this.nimi = nimi;
        this.julkaisuvuosi = julkaisuvuosi;
    }

    public String getNimi() {
        return nimi;
    }
    
    public boolean equals(Object compared) {
        Kirja kirja = (Kirja) compared;
        return this.nimi.equals(((Kirja) compared).nimi) && this.julkaisuvuosi == kirja.julkaisuvuosi;
    }

    public int getJulkaisuvuosi() {
        return julkaisuvuosi;
    }

}