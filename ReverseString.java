package com.String.bill;

import java.util.Scanner;

public class ReverseString {

	public static String reverse(String str) {
		  String rev = "";
		  char[] finalarray = str.toCharArray();
		  for (int i = finalarray.length - 1; i >= 0; i--)
		    rev += finalarray[i];
		  return rev;
		}
		public static void main (String args[])
		{
		String r="Hello I am Chanchal";
		String s= reverse (r);
		System.out.println("Reverse String is - " + s);
		}
		}