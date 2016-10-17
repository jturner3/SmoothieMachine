package smoothie;

import java.util.ArrayList;
import java.util.Collection;

import Fruit.Fruit;
import Fruit.favoriteFruit;



public class Recipe {
	
	final String name;
	final Collection<favoriteFruit> fruityIngredients;
	
	public Recipe(String name) {
		this.name = name;
		fruityIngredients = new ArrayList<>();
	}
	
	public Recipe(String name, Collection<favoriteFruit> fruit) {
		this.name = name;
		fruityIngredients = fruit;
		
	}
	
	public void addfavoriteFruit(favoriteFruit fruit){
		fruityIngredients.add(fruit);
	}

		

	public void setName(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setIngredients(Collection<String> ingredients) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
