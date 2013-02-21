
public class RomanComputer {

	public String compute(String string) 
	{
	
		StringParser Parser = new StringParser ();
		RomanToNumber converter =  new RomanToNumber();
		NumberToRoman conv = new NumberToRoman();
		
		String [] tab = Parser.Parse(string, "+");

		int x = converter.toNumber(tab[0]);
		int y = converter.toNumber(tab[2]);
		
		int z = x + y;
		
		String Res = conv.toRoman(z); 
		
		return Res;
	}

}
