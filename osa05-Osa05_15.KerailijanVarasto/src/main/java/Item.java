/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 800029348
 */
public class Item {
    @Override
    public String toString() {
        return identifier + ": " + nimi;
    }
    
    public Item(String identifier, String nimi) {
        this.identifier = identifier;
        this.nimi = nimi;
    }
    
    private String identifier;
    private String nimi;
    
    public String getIdentifier() {
        return identifier;
    }
    
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
    
    public Item() {
        
    }
    public boolean equals(Object compared) {
        Item item = (Item) compared;
        return this.identifier.equals(item.identifier);
    }
    
    public String getNimi() {
        return nimi;
    }
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }
    
}
