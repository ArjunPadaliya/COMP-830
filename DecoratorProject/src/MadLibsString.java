public class MadLibsString implements MadLibsDecorator{
	
	public String MyString;
	
	public MadLibsString(String s)
	{
		MyString = s;
	}

	public String decorateString(String input) {
		return MyString;
	}
	
	public String getMadLibsString()
	{
		return MyString;
	}
	

}
