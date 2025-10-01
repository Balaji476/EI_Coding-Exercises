//Consider our school has only one bell
import java.util.*;

class SchoolBell {
    
    private static SchoolBell instance = null;

    private SchoolBell() {
        System.out.println("School Bell is installed!");
    }
    
    public static SchoolBell getInstance() {
        if (instance == null) 
            instance = new SchoolBell();  
        return instance; 
                            
        
        }   


    public void ring(String period) {
        System.out.println("Bell rings for " + period + "!");
    }
}



