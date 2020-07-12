package java_presistence.JPAPractise;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Persons 
{
	@Id
    public int personid;
    
    public String lastname;
    
    public String firstname;
    
    public String address;
    
    public String city;
    
    public int getPersonid() {
		return personid;
	}

	public void setPersonid(int personid) {
		this.personid = personid;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public Persons()
	{
		
	}
	
	public Persons(int id, String lastname, String firstname, String address, String city)
	{
		this.personid = id;
		this.lastname = lastname;
		this.firstname = firstname;
		this.address = address;
		this.city= city;
	}

	
    
    
    
	
}
