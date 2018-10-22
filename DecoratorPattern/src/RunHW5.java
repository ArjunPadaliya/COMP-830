public class RunHW5 {
	public static void main(String[] args)
	{
		String s1 = "Without precise <noun>s we could <verb> right through a <noun> or <verb> too close to a <noun>, and that’d end your <noun> real quick, wouldn’t it?";
		MadLibsString mls1 = new MadLibsString(s1);
		VerbReplacementDecorator vrd1 = new VerbReplacementDecorator(mls1);
		NounReplacementDecorator nrd1 = new NounReplacementDecorator(vrd1);
		System.out.println(nrd1.decorateString(s1));
		
		String s2 = "Honkey <noun>s and ancient <noun> are no <verb> for a good <noun> at your side, kid";
		MadLibsString mls2 = new MadLibsString(s2);
		VerbReplacementDecorator vrd2 = new VerbReplacementDecorator(mls2);
		NounReplacementDecorator nrd2 = new NounReplacementDecorator(vrd2);
		System.out.println(nrd2.decorateString(s2));
	}
}
