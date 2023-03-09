public class LipogramAnalyzer {

	private String text;
	
	public LipogramAnalyzer(String s)
	{
		text=s;
	}
	
	public String mark(char ch) //Replace all the characters ch in the string with '#"
	{
		text= text.replace(ch, '#');	
		return text;
	}
	
	public String allWordsWith(char ch) //Find all the words with the character ch and 
										//add them to a new return String
										//separated by a new line ("\n")
	{
		String rs = "";
		return rs;
	}

}