package List;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class List_sort_WebsiteClass {
   
    private List<String> urlList;

    public List_sort_WebsiteClass() {
        urlList = new ArrayList<>();
    }

    public void printURLs() {
        urlList.add("https://pluralsight.com/search?q=java");
        urlList.add("https://medium.com/search?q=java");
        urlList.add("https://stackoverflow.com/questions/tagged/java");
        urlList.add("https://stackoverflow.com/search?q=java+list");
        urlList.add("https://reddit.com/r/java");
        urlList.add("https://reddit.com/r/javahelp");

        System.out.println("Links from stackoverflow.com:");
        
           urlList.sort(null);
           
           
        System.out.println(urlList);
    }
    
    public void test_sort()
    {
    	List<String> alpha = new ArrayList<String>();
    	alpha.add("A");
    	alpha.add("B");
    	alpha.add("z");
    	alpha.add("y");
    	System.out.println(alpha);
    	alpha.sort(null);
    	System.out.println(alpha);
    }
    
}
