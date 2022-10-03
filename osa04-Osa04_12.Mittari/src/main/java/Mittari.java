/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 800029348
 */
public class Mittari {
    private int mitta;
    
    public Mittari(){
        this.mitta = 0;
    }
    public void lisaa(){
        if(this.mitta != 5){
            this.mitta += 1;
        }
    }
    public void vahenna() {
        if(this.mitta != 0){
            this.mitta -= 1;
        }
    }
    public int mitta(){
        return this.mitta;
    }
    public boolean taynna(){
        return this.mitta == 5;
    }
}
