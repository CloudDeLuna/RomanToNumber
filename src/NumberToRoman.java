
public class NumberToRoman {

	public String toRoman(int z) {
		
		String Res = "";
		
		while ( z >= 1000)
		{
			Res += "M";
			z -= 1000;
		}
		while ( z >= 900)
		{
			Res += "CM";
			z -= 900;
		}
		while ( z >= 500)
		{
			Res += "D";
			z -= 500;
		}
		while ( z >= 400)
		{
			Res += "CD";
			z -= 400;
		}
		while ( z >= 100)
		{
			Res += "C";
			z -= 100;
		}
		while ( z >= 90)
		{
			Res += "XC";
			z -= 90;
		}
		while ( z >= 50)
		{
			Res += "L";
			z -= 50;
		}
		while ( z >= 40)
		{
			Res += "XL";
			z -= 40;
		}
		while ( z >= 10)
		{
			Res += "X";
			z -= 10;
		}
		while ( z >= 9)
		{
			Res += "IX";
			z -= 9;
		}
		while ( z >= 5)
		{
			Res += "V";
			z -= 5;
		}
		while ( z >= 4)
		{
			Res += "IV";
			z -= 4;
		}
		while ( z > 0)
		{
			Res += "I";
			z -= 1;
		}
		return Res;
	}
}
