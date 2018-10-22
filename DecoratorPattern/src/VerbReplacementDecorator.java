public class VerbReplacementDecorator implements MadLibsDecorator {
	
	public String[] verbsToUse;
	public int indexIntoArray;
	public MadLibsDecorator mlDecorator;
	
	public VerbReplacementDecorator(MadLibsDecorator mld)
	{
		verbsToUse = new String[] {"beat", "feeling", "run", "begin", "break", "bite", "choose", "cost", "cut", "draw", "dream", "do" };
		indexIntoArray = 0;
		this.mlDecorator = mld;
	}

	@Override
	public String decorateString(String input) {
		String retVal = mlDecorator.decorateString(input);
		
		while (retVal.indexOf("<verb>") > -1) 
		{
			retVal = retVal.replaceFirst("<verb>", verbsToUse[indexIntoArray]);
			indexIntoArray++;
			if (indexIntoArray == verbsToUse.length)
				indexIntoArray = 0;
		}
		
		return retVal;
	}
	
	
}
