package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Creating_map {

    
    private Map<String, String> dictionary;

    public Creating_map() 
    {
            dictionary = new HashMap<>();
            dictionary.put("SEO", "Search engine optimization");
            dictionary.put("SaaS", "Software as a service");
            dictionary.put("UX", "User experience");
                
    }
}