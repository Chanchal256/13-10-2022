//* Q 1.	 A class to encode texts Specification: Realize a Java class to represent encrypted texts. The encryption of the text is obtained by replacing each character with the character whose code is equal to the code of the character to encode augmented by an integer number representing the encryption key. 

// The functionalities of encrypted texts are: 
//1.creation of a new object that represents a text encrypted with a given encryption key; 
//2.creation of a new object that represents a text that is not encrypted (yet); 
//3.return of the encrypted text; 
//4.return of the decrypted text, provided the correct encryption key is provided; 
//5.verification of the correctness of an encryption key; 
//6.Modification of the encryption key; this is possible only if the correct key is provided. *//

package com.String.bill;

public class EncryptedText {

	// Instance variables

	private int key;
	private String text;

	// constructor
	public EncryptedText(String nonEncryptedText) {
		key = 0;
		text = nonEncryptedText;
	}

	public EncryptedText(String nonEncryptedText, int key) {
		this.key = key;
		text = encode(nonEncryptedText, key);
	}

	public String getEncryptedText() {
		return text;
	}

	public String getDecryptedText(int key) {
		if (key == this.key)
			return decode(text, key);
		else
			return null;
	}

	public boolean isKey(int candidateKey) {
		return candidateKey == key;
	}

	public void setKey(int key, int newKey) {
		if (key == this.key) {
			this.key = newKey;
			text = encode(decode(text, key), newKey);
		}
	}

	// auxiliary methods
	private static String encode(String text, int key) {
		String resText;
		char c;
		int ci;
		resText = "";
		for (int i = 0; i < text.length(); i++) {
			c = text.charAt(i);
			ci = (int) c;
			ci = ci + key;
			c = (char) ci;
			resText = resText + String.valueOf(c);
		}
		return resText;
	}

	private static String decode(String text, int key) {
		String resText;
		char c;
		int ci;
		resText = "";
		for (int i = 0; i < text.length(); i++) {
			c = text.charAt(i);
			ci = (int) c;
			ci = ci - key;
			c = (char) ci;
			resText = resText + String.valueOf(c);
		}
		return resText;
	}
}
