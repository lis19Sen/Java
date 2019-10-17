package panimal;

public class Dog extends Animal implements Domesticated{

	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		type = "puppy";
	}

	@Override
	public String speak() {
		// TODO Auto-generated method stub
		return "woof";
	}
	


	public String work()
	{
		return "chase cat";
	}
	public String reward() {
		
		return "bone";
	
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", type=" + type + ", speak()=" + speak() + ", work()=" + work() + ", reward()="
				+ reward() + "]";
	}

	
	
	
	

}
