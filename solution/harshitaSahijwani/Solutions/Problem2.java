import java.util.Scanner;
public class Problem2 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		//String input = "Mississipi";
		
		//We traverse the whole string. Whenever the 'i'th character is the same as the 
		//'i-1'th character, we remove it. 
		
		//e.g. abbbc, 
		//here when we reach the second b it is removed. we get
		//abbc
		//now we're at the b which was originally the third b, but now it's the second
		//it is equal to the character just before it, so it is removed too
		
		for(int i = 1; i<input.length();i++)
		{
			if(input.charAt(i) == input.charAt(i-1))
			{
				input = removeChar(input, i);
				i--;
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