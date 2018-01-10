
public class Sloth extends Animal implements Endangered{

	public Sloth(){
		super("Sid");
	}
	public Sloth(String name){
		super(name);
	}
	
	@Override
	public String getSound() {
		return "AhAaaaah";
	}
	@Override
	public void survive() {
		System.out.println("I will survive");
	}
}
