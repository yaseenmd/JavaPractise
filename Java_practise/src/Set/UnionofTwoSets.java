package Set;


import java.util.*;

public class UnionofTwoSets {

    private Set<String> javaTitles;

    
    private Set<String> webTitles;

    public UnionofTwoSets() 
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
    	
    	// Below i have created new hashset and initialized with values of javatitles
    	Set<String> union = new HashSet<>(javaTitles);
    	
    	//this will remove common titles between javaTitles and WebTitles
    	union.removeAll(webTitles);
    	
    	System.out.println(union);
    	
    	//output:
    	//[Leveraging Java Data Structures, Java Lambdas: Getting Started]
    	
    	
    	
    	
    }
}