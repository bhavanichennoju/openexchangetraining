import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class AllStringMethodsWithExample {

	public static void main(String[] args) {
		String str = "Zoho Payroll";
		System.out.println(str.length());
		System.out.println(str.charAt(0));// at index 0 which element present it will print
		System.out.println(".................................");
		String str1 = "MADAM";
		String strRev = "";
		for (int i = str1.length() - 1; i >= 0; i--) {
			strRev = strRev + str1.charAt(i);
		}
		// System.out.print(strRev);
		if (str1.equals(strRev)) {
			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}
		System.out.println(".................................");
		System.out.println(str.indexOf("Z"));// Z letter ..index
		System.out.println(str.replace("Z", "z"));
		// convert string to charArray
		char[] ch = str.toCharArray();
		System.out.println(ch);
		// compareTo()
		String s1 = "A";
		String s2 = "B";
		System.out.println(s1.compareTo(s2));
		String s3 = "Hello";
		String s4 = "hello";
		System.out.println(s3.compareToIgnoreCase(s4));
		/*
		 * Appends a string to the end of another string
		 */
		System.out.println(".................................");
		System.out.println(s3.concat(s4));
		System.out.println(s3 + s4);
		/*
		 * Checks whether a string contains a sequence of characters
		 */
		System.out.println(".................................");
		String c = "This is Spring Boot Application";
		System.out.println(c.contains("Boot"));
		System.out.println(".................................");
		/*
		 * Checks whether a string ends with the specified character(s)
		 */
		System.out.println(c.endsWith("Application"));
		/*
		 * 	Compares two strings. Returns true if the strings are equal, and false if not
		 * Compares two strings, ignoring case 
		 */
		System.out.println(s3.equals(s4));//false will come(content checking)
		System.out.println(s3.equalsIgnoreCase(s4));//true
		System.out.println(".................................");
		/*
		 * 
		 * format()...format(format,args)
		 */
		int i=1;
		System.out.println(String.format("lanaguage:%s",s4));
		System.out.println(String.format("%d lanaguage:%s",i,s4));
		String ss="ABCD";
		byte[] byteArr = ss.getBytes();  
		System.out.println(byteArr);//encodes the string into a sequence of bytes and stores it in a byte array
		System.out.println(Arrays.toString(byteArr));
		String newStr = new String(byteArr);
		System.out.println(newStr);
		/*
		 * The hashCode() method returns the hash code of a string.
		 */
		System.out.println(".................................");
		System.out.println(s3.hashCode());
		/*
		 * Returns the position of the first found occurrence of specified characters in a string
		 */
		String l1="Hello welcome";
		String l2=new String("Hello welcome");
		String l3=new String("Hello welcome").intern();
		System.out.println(l1.indexOf("c"));
		System.out.println(".................................");
		System.out.println(l3.intern()==l1);
		System.out.println(".................................");
		System.out.println(l1==l2);
		  StringBuffer buffer = new StringBuffer(str);
		   System.out.println(buffer.reverse().toString());;
		
		String magicLink = "https://entoeegola.dev-open-exchange.net?ml_access_token=eyJjb250ZW50Ijp7ImV4cGlyYXRpb25EYXRlIjoiMjAyMi0xMS0yM1QwOTo0Mzo1Mi40MTNaIiwiZW1haWwiOiJzcmluaXZhcy5ndW5yZWRkeUBvcGVuZXhjLmNvbSIsImV2ZW50SWQiOjkzMzAwfSwic2lnbmF0dXJlIjoiTUVVQ0lFR3liRHVlcGlBYk9ERVFja2c4UVEyWUlxMDRpTjlVNHRQU2hIUjBrdHhGQWlFQWtjN2FWRk5HYS8zZVlraTk3cmxHWW40RXB2dnZqMnIrcWpNME1VZWxWYVE9In0=";
	       int j=magicLink.indexOf('?');//40
	       String s12=magicLink.substring(0,j);
	       System.out.println(s12);
	      
	       String strNew = "SoftwareEngineerTestingEngineerSoftwareEngineer";
	        String[] splits = strNew.split("Engineer");
	         
	        for(String splits2: splits) {
	            System.out.println(splits2);
	        }
	}

}
