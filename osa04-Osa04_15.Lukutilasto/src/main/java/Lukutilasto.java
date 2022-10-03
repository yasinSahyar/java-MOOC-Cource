/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 800029348
 */
import java.util.ArrayList;

public class Lukutilasto {
    private int lukujenMaara;
    private int lukujenSumma;
    
    public Lukutilasto() {
        this.lukujenMaara = 0;
        this.lukujenSumma = 0;
    }
    
    public void lisaaLuku(int luku) {
        this.lukujenMaara = this.lukujenMaara + 1;
        this.lukujenSumma = this.lukujenSumma + luku;
    }
    
    public int haeLukujenMaara() {
        return this.lukujenMaara;
    }
    
    public int summa() {
        return this.lukujenSumma;
    }
    
    public double keskiarvo() {
        if (this.lukujenMaara == 0) {
            return 0;
        } else return 1.0 * this.lukujenSumma / this.lukujenMaara;
    }
    
    
}
