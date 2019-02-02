package controllers;

import java.util.ArrayList;
import java.util.Scanner;

import models.Persister;
import models.Person;

public class PersonController {
	private Persister persister;
	
	public PersonController() {
		this.persister = new Persister();
	}
	
	public void showForm(Scanner sc) {
		while(true) {
			System.out.println("PERSONS FORM VIEW");
			System.out.println("Opcion 1: Add");
			System.out.println("Opcion 2: Show All Persons");
			int option = sc.nextInt();
			if(option == 1) {
				System.out.println("Enter Id");
				int id = sc.nextInt();
				System.out.println("Enter first Name");
				String first_name = sc.next();
				System.out.println("Enter last Name");
				String last_name = sc.next();
				this.AddPerson(id, first_name, last_name);
			}
			else if(option == 2){
				this.showAll();
			}else {
				break;
			}
		}
	}
	
	
	private void AddPerson(int id, String first_name, String last_name) {
		Person person = new Person(id, first_name, last_name);
		this.persister.addPerson(person);
	}
	
	private void showAll() {
		ArrayList<Person> persons = this.persister.getPersons();
		for(Person p : persons) {
			System.out.println(p);
		}
	}
	
	
}
