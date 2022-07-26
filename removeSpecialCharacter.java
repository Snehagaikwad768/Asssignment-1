/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class removeSpecialCharacter {
    static void removeSpecialCharacter(String s)
	{
		for (int i = 0; i < s.length(); i++)
		{

			// Finding the character whose
			// ASCII value fall under this
			// range
			if (s.charAt(i) < 'A' || s.charAt(i) > 'Z' &&
					s.charAt(i) < 'a' || s.charAt(i) > 'z')
			{
				
				// erase function to erase
				// the character
				s = s.substring(0, i) + s.substring(i + 1);
				i--;
			}
		}
		System.out.print(s);
	}
	
	// Driver code
	public static void main(String[] args)
	{
		String s = "$Gee*k;s..fo, r'Ge^eks?";
		removeSpecialCharacter(s);
	}
}

// This code is contributed by Rajput-Ji


