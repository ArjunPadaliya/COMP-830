public class NounReplacementDecorator implements MadLibsDecorator {

	
	public String[] nounsToUse;
	public int indexIntoArray;
	public MadLibsDecorator mlDecorator;
	
	public NounReplacementDecorator(MadLibsDecorator mld)
	{
		nounsToUse = new String[] {"Moon", "Sun", "Stars", "Cat", "Movie", "Train", "Pen", "Clock", "Speaker", "Phone", "Book", "Country"};
		indexIntoArray = 0;
		this.mlDecorator = mld;
	}
	
	
	public String decorateString(String input) {
		String retVal = mlDecorator.decorateString(input);
		
		while(retVal.indexOf("<noun>") > -1)
		{
			retVal = retVal.replaceFirst("<noun>", nounsToUse[indexIntoArray]);
			indexIntoArray++;
			if (indexIntoArray == nounsToUse.length)
				indexIntoArray = 0;

		}
		
		return retVal;
	}
	
}
