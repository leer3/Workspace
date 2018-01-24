
public class StringArray {

	public static void main(String[] args){
		
		String[] words = {"Ryan", "is", "the", "G.O.A.T", "Yo"};
		
		System.out.println(words.length);
		System.out.println(words[0]);
		
		for(int i = 0; i < words.length; i++){ //prints length of each 
			System.out.println(words[i].length()); //individual string
		}
		
		for(String word : words){
			System.out.println(word.length());
		}
	}
}
