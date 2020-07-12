package List;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class List_add_WebsiteClass {
   
    private List<String> urlList;

    public List_add_WebsiteClass() {
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
        
        Iterator items = urlList.iterator();
        
        while(items.hasNext())
        {
        	String urls = items.next().toString();
        	if(urls.contains("stackoverflow.com"))
        			{
        		          System.out.println(urls);
        			}
        		
        }
        
        
    }
}
