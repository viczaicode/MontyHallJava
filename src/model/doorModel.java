
package model;

import java.nio.file.Path;
import java.nio.file.Paths;


public class doorModel {
    
    private int id;
    private int prize;
    private Path eleres;
    
    public doorModel(int id, int prize, String eleres) {
        this.setId(id);
        this.setPrize(prize);
    }

    public void setId(int id) {
        
        if (id < 1 || id > 3) {
            throw new NumberFormatException("Az ajtó sorszáma csak 1,2,3 lehet!");
        }
        
        this.id = id;
        
    }

    public void setPrize(int prize) {
        
        if (prize != 0 && prize != 1) {
            throw new NumberFormatException("A nyeremény csak 0(kecske) vagy 1(autó) lehet!");
        }
       
         this.prize = prize;
         
    }

    public int getId() {
        return id;
    }

    public int getPrize() {
        return prize;
    }
    
    public void setImagePath(String kep) {
        this.eleres = Paths.get(kep);
    }

    public Path getImagePath() {
        return this.eleres;
    }
    
}
