//*  Q 3.	Take a sentence as a user input. 
//			Break up the sentence into words.
//			Sort the words based on the length of the word - and print out.
//			Example: If user inputs the sentence: "Hi, welcome to this mentoring session", the output should be:
//			to
//			Hi,
//			this
//			welcome
//			session
//			mentoring



package com.String.bill;

import java.util.Scanner;

public class Words {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Sentence");
		String s = sc.nextLine();
		s= s+" ";
		int start=0;
		for(int i=0; i<s.length(); i++) 
		{
		   char c = s.charAt(i);
		   if(c == ' ')
		   {
			   String word = s.substring(start,i);
			   System.out.println(word + " " + word.length());
			   start = i+1;
		   }
		}
	}
}

