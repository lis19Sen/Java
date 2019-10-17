package panimal;

public class Tarzier extends Animal {

	public Tarzier(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		type = "Monkey";
	}

	@Override
	public String speak() {
		// TODO Auto-generated method stub
		return "zhizhi";
	}
	
	@Override
	public String toString()
	{
		return "Name: " + name + "    type:" + type + "   sound: " +  this.speak();
	}

}
