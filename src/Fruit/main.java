package Fruit;
import java.util.*;

import smoothie.Recipe;

public class main {

	public static void main(String[] args) {
		//Creating new fruit from favoriteFruit class!!!
		
		System.out.println("Available Fruit:");
		System.out.println("----------------------------");
		System.out.println("");
		
		
		favoriteFruit orange = new favoriteFruit("orange", "Orange","Florida");
		orange.name = "Orange";
		orange.color = "orange";
		orange.origin = "Florida";
		orange.peel(true);
		orange.pit(false);
		
		
		favoriteFruit apple = new favoriteFruit("Varies","Apple","Washington");
		apple.name = "Apple";
		apple.color = "Varies by apple";
		apple.origin = "On the vine";
		apple.pit(true);
		apple.pit(false);
		
		Recipe one = new Recipe ("Recipe 1");
		one.addfavoriteFruit(apple);
		one.addfavoriteFruit(orange);
		System.out.println("Smoothie: " + one.toString());
		
		
		
		
		//Getting and setting 
		orange.getName();
		orange.getOrigin();
		orange.setColor("blue");
		orange.pit(true);
		orange.pit(false);
		System.out.println("");
		
		apple.getName();
		apple.getOrigin();
		apple.pit(true);
		apple.pit(false);
		System.out.println("");
		
		
		System.out.println("");
		System.out.println("-----------------------");
		
		
		
		

	}

}
