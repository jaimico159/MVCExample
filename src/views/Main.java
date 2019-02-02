package views;

import java.util.Scanner;


import controllers.PersonController;
import models.Person;

public class Main {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		PersonController controller = new PersonController();
		
		while(true) {
			System.out.println("Que quieres hacer?");
			System.out.println("Opcion 1: Persons");
			System.out.println("Opcion 2: Exit Program");
			int option = sc.nextInt();
			if(option == 1) {
				controller.showForm(sc);
			}else if(option == 2){
				System.out.println("BYE BYE ... SEE YOU SOON");
				break;
			}else {
				break;
			}
				
		}
		sc.close();
		
	}
}
