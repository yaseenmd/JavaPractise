package Maps;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Contains_maps {

    
    private Map<String, String> dictionary;

    public Contains_maps() {
        dictionary = new HashMap<>();

        dictionary.put("SEO", "Search engine optimization");
        dictionary.put("SaaS", "Software as a service");
        dictionary.put("UX", "User experience");
    }

    public void runApp() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter lookup word or Q to quit");
            String input = scanner.nextLine();
            if (input.toUpperCase().equals("Q")) {
                System.out.println("Thanks for using Dev Dictionary");
                return;
            }

            if(!dictionary.containsKey(input))
            {
                System.out.println("Word doesn't exist, try again or Q to quit");
            }
            else
            {
                String value = dictionary.get(input);
                System.out.println(input + ": " + value);
            }
        }
    }
}
