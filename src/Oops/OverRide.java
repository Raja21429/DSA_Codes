package Oops;


		class Animal {
		    public void makeSound() {
		        System.out.println("Some generic sound");
		    }
		}

		// Subclass
		class Dog extends Animal {
		   @Override
			public void makeSound() {
				System.out.println("woooh");
		    }
		}

		// Subclass
		class Cat extends Animal {
		    @Override
		    public void makeSound() {
		        System.out.println("Meow"
		        		);
		    }
		}

		// Usage
		public class OverRide {
		    public static void main(String[] args) {
		        Animal dog = new Dog();
		        Animal cat = new Cat();

		        dog.makeSound();  // Calls Dog's makeSound
		        cat.makeSound();  // Calls Cat's makeSound
		    
		

	}

}
