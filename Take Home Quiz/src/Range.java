
public class Range implements NumberGroup{

	private int minValue, maxValue;
	
	public Range(int minValue, int maxValue){
		this.minValue = minValue;
		this.maxValue = maxValue;
	}
	
	@Override
	public boolean contains(int num) {
		return num >= minValue && num <= maxValue;
	}
	
}
