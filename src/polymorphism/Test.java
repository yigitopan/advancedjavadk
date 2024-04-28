package polymorphism;

public class Test {

	public static void main(String[] args) {

		Dog doggy = new Dog();
		System.out.println(doggy.bewegen());
		Snake snake = new Snake();
		System.out.println(snake.bewegen());
	}

	public static int add(int a, int b) {
		return a+b;
	}
	
	public static int add(int a, int b, int c) {
		return a+b+c;
	}
	
	public static int add(String x, int y) {
		return 0;
	}
}

class Animal{
	public String bewegen() {
		return "Ich bewege mich.";
	}
}

class Dog extends Animal{
	@Override
	public String bewegen() {
		return "Ich renne.";
	}
}

class Snake extends Animal{
	
}
