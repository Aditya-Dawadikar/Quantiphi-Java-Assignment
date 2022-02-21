class Person{
	private String name;
	private String id;
	
	Person(){
		this.name=null;
		this.id=null;
	}
	
	public String getName() {
		return this.name;
	}
	
	String getID() {
		return this.id;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setID(String id) {
		this.id = id;
	}
	
}

public class Question2 {
	public static void main(String args[]) {
		Person p = new Person();
		p.setName("Aditya");
		p.setID("BECOC311");
		System.out.println(p.getID()+" "+p.getName());
	}
}
