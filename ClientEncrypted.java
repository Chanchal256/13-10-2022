package com.String.pill;

import com.String.bill.EncryptedText;

public class ClientEncrypted {
	public static void main(String[] args) {
		EncryptedText t = new EncryptedText("Hey guys ,i Love java ...",10);
		System.out.println(t.getEncryptedText());
		System.out.println(t.getDecryptedText(10));
		t.setKey(10, 20);
		System.out.println(t.getDecryptedText(10));
		System.out.println(t.getDecryptedText(20));
	}
}
