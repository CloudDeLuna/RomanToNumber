public class StringParser 
{
	
  public String [] Parse (String string, String splitter)
  {
	String [] Tab = string.split(splitter);
	return Tab;
  }
}
