package SortingUsingComparator;
import java.util.*;
import java.util.ArrayList;

public class Sorting 
{
	Person p1 = new Person("Yaseen", 25);
	Person p2 = new Person("Mohammed", 30);
	Person p3 = new Person("Yusuf", 5);
	
	List<Person> list_person = new ArrayList<>();
		
	public void test()
	{
		list_person.add(p1);
		list_person.add(p2);
		list_person.add(p3);
		
		System.out.println(list_person.toString());
	}
	
	public void sortingbasedonAge()
	{
		list_person.sort(Person.BY_NAME);
		System.out.println(list_person.toString());
		list_person.sort(Person.BY_AGE);
		System.out.println(list_person.toString());
	}

	

}
