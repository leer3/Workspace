
public class Cat extends Animal{

	public Cat(){
		super("Tom");
	}
	public Cat(String name){
		super(name);
	}
	@Override
	public String getSound() {
		return "meow";
	}
	
	
}
