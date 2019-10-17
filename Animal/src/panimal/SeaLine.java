package panimal;

public class SeaLine extends Animal
{

	public SeaLine(String name) {
		super(name);
		type = "SeaLion";
		// TODO Auto-generated constructor stub
	}

	@Override
	public String speak() {
		// TODO Auto-generated method stub
		return "meh";
	}

	@Override
	public String toString() {
		return "SeaLine [name=" + name + ", type=" + type + ", speak()=" + speak() + "]";
	}

	
	
   
}
