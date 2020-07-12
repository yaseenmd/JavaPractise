package java_presistence.JPAPractise;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        PersonServices  ps = new PersonServices();
        
        Persons person = new Persons(1, "Yaseen", "Mohammed", "Erode", "City");
        Persons person1 = new Persons(2, "Yaseen", "Mohammed", "Erode", "City");
        Persons person2 = new Persons(3, "Yaseen", "Mohammed", "Erode", "City");
        Persons person3 = new Persons(4, "Yaseen", "Mohammed", "Erode", "City");
        
        ps.CreatePerson(person1);
        ps.CreatePerson(person2);
        ps.CreatePerson(person3);
    }
}
