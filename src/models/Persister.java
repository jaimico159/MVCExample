package models;
import java.util.ArrayList;

import models.*;

public class Persister { 
	private ArrayList<Person> persons;
	
	public Persister() {
		persons = new ArrayList<Person>();
	}
	
	public void addPerson(Person person) {
		persons.add(person);
		System.out.println("Person Added");
		System.out.println(person);
	}
	
	public ArrayList<Person> getPersons(){
		return this.persons;
	}
	
	public void deleteLastPerson() {
		persons.remove(-1);
	}
}
