package Set;


import java.util.*;

public class Set_add_BlogTitles {

    private Set<String> javaTitles;

    
    private Set<String> webTitles;

    public Set_add_BlogTitles() 
    {
          javaTitles = new HashSet<>();
          webTitles = new HashSet<>();
    }

    public void initalizeTitles() {
    	javaTitles.add("Leveraging Java Data Structures");
    	javaTitles.add("Java Lambdas: Getting Started");
    	javaTitles.add("My First Spring Boot App");
    	javaTitles.add("Spring Boot and React");
        
    	webTitles.add("Creating the Same App with React and Angular");
    	webTitles.add("Learn Kubernetes in Under 4 Hours");
    	webTitles.add("My First Spring Boot App");
    	webTitles.add("Spring Boot and React");
    }
}