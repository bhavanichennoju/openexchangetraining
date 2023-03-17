package com.stringclass;

public class StringTest {

	public static void main(String[] args) {
		String str="Madam";
		String s1="";
		for(int i=str.length()-1;i>=0;i--) {
			s1+=str.charAt(i);
			
		}
		System.out.println(s1);
		if(s1.equalsIgnoreCase(str))
		System.out.println("its is madam is palindrome");
		  StringBuffer buffer = new StringBuffer(str);
	   System.out.println(buffer.reverse().toString());;
	
	String magicLink = "https://entoeegola.dev-open-exchange.net?ml_access_token=eyJjb250ZW50Ijp7ImV4cGlyYXRpb25EYXRlIjoiMjAyMi0xMS0yM1QwOTo0Mzo1Mi40MTNaIiwiZW1haWwiOiJzcmluaXZhcy5ndW5yZWRkeUBvcGVuZXhjLmNvbSIsImV2ZW50SWQiOjkzMzAwfSwic2lnbmF0dXJlIjoiTUVVQ0lFR3liRHVlcGlBYk9ERVFja2c4UVEyWUlxMDRpTjlVNHRQU2hIUjBrdHhGQWlFQWtjN2FWRk5HYS8zZVlraTk3cmxHWW40RXB2dnZqMnIrcWpNME1VZWxWYVE9In0=";
       int i=magicLink.indexOf('?');
       System.out.println(i);
       String s12=magicLink.substring(0,i);
       System.out.println(s12);
       
	}
}

