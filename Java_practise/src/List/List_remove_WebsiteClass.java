package List;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class List_remove_WebsiteClass {
   
    private List<String> urlList;

    public List_remove_WebsiteClass() {
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
        
       boolean removedStatus = urlList.remove("https://medium.com/search?q=java");
       System.out.println(removedStatus);
        
    }
}
