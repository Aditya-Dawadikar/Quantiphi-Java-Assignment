interface SomeInterface{
	public void greetMe(String name);
}

abstract class SomeAbstractClass{
	public void greetWorld() {
		System.out.println("abstract class method");
	}
}

class SomeClass extends SomeAbstractClass{
	@Override
	public void greetWorld() {
		System.out.println("hello world!");
	}
}

class AnotherClass implements SomeInterface{
	@Override
	public void greetMe(String name) {
		System.out.println("hello! "+name);
	}
}

public class Question1 {
	public static void main(String args[]) {
		SomeClass sc = new SomeClass();
		AnotherClass ac = new AnotherClass();
		
		sc.greetWorld();
		ac.greetMe("aditya");
	}
}
