package panimal;

public class Horse extends Animal implements Domesticated {

	public Horse(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		type = "zebra";
	}

	@Override
	public String work() {
		// TODO Auto-generated method stub
		return "eat";
	}

	@Override
	public String reward() {
		// TODO Auto-generated method stub
		return "grass";
	}

	@Override
	public String speak() {
		// TODO Auto-generated method stub
		return "hahhah";
	}

	@Override
	public String toString() {
		return "Horse [name=" + name + ", type=" + type + ", work()=" + work() + ", reward()=" + reward() + ", speak()="
				+ speak() + "]";
	}
	

}
