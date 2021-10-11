public class Main {

	public static void main(String[] args) {
		Factory factory = new Factory();
		
		Animal animal1 = factory.get("Kangaroo");
		animal1.createAnimal();
		
		Animal animal2 = factory.get("Cheetah");
		animal2.createAnimal();
		
		Animal animal3 = factory.get("Lion");
		animal3.createAnimal();
	}
}