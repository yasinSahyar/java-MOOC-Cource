/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 800029348
 */
public class Elokuva {
    private String nimi;
    private int ikarja;
    
    public Elokuva(String elokuvanNimi, int elokuvanIkaraja){
        this.nimi = elokuvanNimi;
        this.ikarja = elokuvanIkaraja;
    }
        
    public String nimi(){
            return this.nimi;
        }
    public int ikaraja(){
            return this.ikarja;
        }
    }
    

