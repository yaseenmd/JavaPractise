package SortingUsingComparator;

import java.util.Comparator;

public class Person{
	
	public String name;
	public int age;
	
	public static Comparator<Person> BY_NAME = Comparator.comparing(Person::getName);
	public static Comparator<Person> BY_AGE = Comparator.comparing(Person::getAge);
	
	public Person(String name, int age)
	{
		 this.name = name;
		 this.age  = age;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	 @Override
	public String toString()
	{
		String retval;
		retval = "Name : " + name +" Age : "+ this.age;
		return retval;
	}
	 
}
