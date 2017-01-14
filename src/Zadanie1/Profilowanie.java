package Zadanie1;

import java.util.Map;
import java.util.Objects;

/**
 *
 * @author Kamil Zemczak
 */
public class Profilowanie {

    public final String key;
    
    public Profilowanie(String key){
        this.key = key;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Profilowanie other = (Profilowanie) obj;
        return Objects.equals(this.key, other.key);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.key);
        return hash;
    }
    
    public static void main(String[] args) {
        try{
            Map map = System.getProperties();
            
            for(;;){
                map.put(new Profilowanie("key"), "value");
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
    
}