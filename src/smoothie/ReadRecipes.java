package smoothie;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import Fruit.Fruit;
import Fruit.banana;
import Fruit.favoriteFruit;
import Fruit.mango;

public class ReadRecipes {

	public static void main(String[] args) {
		//File Reference 
		ReadRecipes readRecipes = new ReadRecipes();
		final Collection <Recipe> recipes =
				readRecipes.loadRecipes("recipes.csv");
		System.out.println(recipes);
	}
	
	public Collection<Recipe> loadRecipes(String filename){
File recipeFile = new File ("recipes.csv");
		
		final InputStream recipeStream;
		final Collection <Recipe> recipes = new ArrayList<>();
		try{
			 recipeStream = new FileInputStream(recipeFile);
		} catch (FileNotFoundException e){
			//System.out.println("Couldn't find the file:"+ recipeFile.getAbsolutePath());
			return recipes;
		}
		
		//Reading data from the file where its stored
		
		try(Scanner input = new Scanner(recipeStream)){
			while(input.hasNextLine()){
				 String[] items = input.nextLine().split(",");
				recipes.add( buildRecipe( items ));
				//System.out.println(input.nextLine());
			}
		}
		return recipes;
	}
	
	public Recipe buildRecipe(String[] items){
		Recipe recipe = new Recipe(items[0]);
		
		
		Collection<String> ingredients = new ArrayList<>();
		for (int i = 1; i< items.length; i++){
			ingredients.add(items[i]);
		}
		recipe.setIngredients(ingredients);
		return recipe;
	}

	public favoriteFruit createFruit(String fruitFruit){
		if ("mango".equalsIgnoreCase(fruitFruit)){
			return new mango();
		} else if ("banana".equalsIgnoreCase(fruitFruit)){
			return new banana();
		}
		return null; 
		
	}
}
