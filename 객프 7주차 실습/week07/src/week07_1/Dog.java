package week07_1;

public class Dog extends Animal{
	public Dog(String name) {
		this.name = name;
	}
	
	@Override
	public void sound() {
		System.out.println("¸Û¸Û");
	}
}
