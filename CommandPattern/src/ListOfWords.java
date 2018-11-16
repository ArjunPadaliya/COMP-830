import java.util.ArrayList;
import java.util.List;

public class ListOfWords {
	private List<String> listOfWords;
	private static ListOfWords instance;
	
	
	private ListOfWords(){
		listOfWords = new ArrayList<String>();	
	}
	
	public static ListOfWords getInstance() {
		
		if (instance == null)
			instance = new ListOfWords();
		
		return instance;
	}
	
	public void addWord(String myString) {
		this.listOfWords.add(myString);
	}
	
	public void removeWord(String myString) {
		this.listOfWords.remove(myString);
	}
	
	public String toString() {	
		return this.listOfWords.toString();
	}
}
