package SortingUsingComparatorJava7;

import java.util.*;
import java.util.ArrayList;

import SortingUsingComparatorJava7.Person;

public class Sorting {
	List<Person> list_person = new ArrayList<>();
	public void test()
	{
		Person p1 = new Person("Rifa", 20);
		Person p2 = new Person("Yaseen", 25);
		Person p3 = new Person("Yusuf", 5);
		
		list_person.add(p1);
		list_person.add(p2);
		list_person.add(p3);
		
		System.out.println(list_person.toString());
	}
	
	public void sortingbasedonAge() {
		 Collections.sort(list_person, new ByAgeSorting());
		 
		 System.out.println(list_person.toString());
	}

}
