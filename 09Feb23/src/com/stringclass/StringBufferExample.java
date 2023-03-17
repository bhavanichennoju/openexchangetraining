package com.stringclass;
import java.lang.StringBuffer;
public class StringBufferExample {

	  public static void main(String[] args) {
	    StringBuffer temp = new StringBuffer();
	    System.out.println(temp.capacity());

	    StringBuffer sb = new StringBuffer("Scaler");
	    System.out.println(sb);
	    sb.append(" Articles");
	    System.out.println(sb);
	  }
	}