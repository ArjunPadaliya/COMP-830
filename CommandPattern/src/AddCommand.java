
public class AddCommand implements GameCmdInterface {

	private String myString; 
	
 	public AddCommand(String myString) {
 		this.myString = myString; 
 	}
 	
	@Override
	public void excecute() {
		ListOfWords.getInstance().addWord(myString);
	}

	@Override
	public void undo() {
		ListOfWords.getInstance().removeWord(myString);
			
	}

	@Override
	public void redo() {
		ListOfWords.getInstance().addWord(myString);
	}

}
