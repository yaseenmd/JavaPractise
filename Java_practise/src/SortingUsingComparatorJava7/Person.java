package SortingUsingComparatorJava7;

import java.util.Comparator;

public class Person {

	public String Name;
	
	public String getName() {
		return Name;
	}
	public int getAge() {
		return Age;
	}

	public int Age;
	
	public Person(String name, int age)
	{
		this.Name = name;
		
		this.Age = age;
	}
	@Override
	public String toString() {
		return "Person [Name=" + Name + ", Age=" + Age + "]";
	}
	
	

}
