class Animal{
	void makesound() {
		System.out.println("Make SOUND");
	}
}
class Cat extends Animal{
	void makesound() {
		System.out.println("Bark");
	}
}
public class AnimalInheritence {
	public static void main(String[] args)
	{
		Animal animal=new Animal();
		Cat cat=new Cat();
		animal.makesound();
		cat.makesound();
		
	}
}
