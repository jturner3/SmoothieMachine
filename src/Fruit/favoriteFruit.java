package Fruit;

public class favoriteFruit implements Peelable, Pittable {

		String color;
		String name;
		String origin;

		
		public favoriteFruit (String color, String name, String origin) {
		
				this.name = name;
				this.color = color;
				this.origin = origin;
				
		
		}
		
		public void peel(boolean x){
			if (x == true){
				System.out.println("You peel the " + this.name);
			}
			else if (x == false){
				System.out.println("You cannot peel the " + this.name);
			}
		}
		
		public void pit(boolean x){
			if (x == true){
				System.out.println("You pit the " + this.name);
			}
			else if (x == false){
				System.out.println("You don't pit the " + this.name);
			}
		}
		
		
		//Automatically generated getters and setters by right clicking on the window and clicking source
		//Then generate getters & setters and it should format correctly.
		
		public void getName() {
			System.out.println("The name of this fruit is: " + name);
	
		}
		public void setName(String name) {
			this.name = name;
		}
		public void getColor() {
			System.out.println("The color of this fruit is: " + color);
		}
		public void setColor(String color) {
			this.color = color;
		}
		public void getOrigin() {
			System.out.println("This fruit originated from: " + origin);
		}
		public void setOrigin(String origin) {
			this.origin = origin;
		}		

}
