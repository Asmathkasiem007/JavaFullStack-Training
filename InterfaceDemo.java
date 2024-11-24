interface Animal {
	void makeSound();
}
interface Tiger {
	void kill();
}
class Dog implements Animal, Tiger {
	public void makeSound() {
		System.out.println("Woof!, Woof!");
	}
	public void kill() {
		System.out.println("The Tiger killed the Dog");
		System.out.println(); {} 
	}
}
class Cat implements Animal {
	public void makeSound() {
		System.out.println("Meow!, Meow!");
	}
}
public class InterfaceDemo {
	public static void main(String[] args) {
		Dog myDog = new Dog();
		Cat myCat = new Cat();
		myDog.makeSound();
		myDog.kill();
		myCat.makeSound();
	}
}




