package Set;


import java.util.*;

public class Sort_Set {

    private Set<String> javaTitles;

    
    private Set<String> webTitles;

    public Sort_Set() 
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
    	
    	// Below i have created new Treeset and initialized with values of javatitles set
    	Set<String> union = new TreeSet<>(javaTitles);
    	
    	
    	union.addAll(webTitles);
    	
    	System.out.println(union);
    	
    	//output:
    	//[Creating the Same App with React and Angular, Java Lambdas: Getting Started, Learn Kubernetes in Under 4 Hours, Leveraging Java Data Structures, My First Spring Boot App, Spring Boot and React]

    	
    	
    	
    	
    }
}