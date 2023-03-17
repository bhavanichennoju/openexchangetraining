package com.stringclass;
public class StringPoolExample {

  public static void main(String args[]) {
    String str1 = "Java";
    String str2 = "C++";
    String str3 = "Java";
    String str4 = new String("Java");
    String str5 = new String("C++");
    String str6 = new String("Java").intern();
    System.out.println(str1 == str4);//false 
    System.out.println(str2 == str5);//false
    System.out.println(str1 == str3);//true
    System.out.println(str1 == str6);//true
    String stro = "java";
    String strp = new String("Java").intern();
    System.out.println(stro==strp);
  }
}