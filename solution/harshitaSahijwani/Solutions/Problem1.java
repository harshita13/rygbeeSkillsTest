import java.util.*;
public class Problem1 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		//String input = "Mississippi";
		
		char[] characters = new char[300];//this character array 
		//stores the characters that have already occurred once
		//in the input string
		
		int noOfCharacters = 0;// the number of characters in 'characters'
		
		characters[0]=input.charAt(0);	
		noOfCharacters++;

		//we basically traverse the whole input string, 
		//when we find a character occurring for the first time
		//we add it to 'characters' array. (and let it be in the input string).
		//when we come across a character that is already there in 'characters'
		//we remove that character from the input string
		
		boolean alreadyThere = false;
		for(int i=1;i<input.length();i++)
		{
			alreadyThere = false;
			for(int j=0;j<characters.length;j++)
			{
				if(characters[j]==input.charAt(i))
				{
					alreadyThere=true;
					break;
				}
			}
			if(alreadyThere)
			{
				input = removeChar(input, i);
				i--;
			}
			else
			{
				characters[noOfCharacters++]=input.charAt(i);
			}
		}
		System.out.println(input);
		sc.close();

	}
	
	
	/*method to remove the character at a particular index from a String*/
	public static String removeChar(String input, int index)
	{
		String output = "";
		for(int i=0;i<input.length();i++)
		{
			if(i!=index)
				output+=input.charAt(i)+"";
		}
		return output;
	}

}
