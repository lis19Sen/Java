package panimal;

public abstract class Animal {
  
	protected String name;
	protected String type;
	
	public Animal(String name)
	{
		this.name = name;
		type =this.getClass().getSimpleName();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Animal [name=" + name + ", type=" + type + "]";
	}
	
	public abstract String speak();
	
}
