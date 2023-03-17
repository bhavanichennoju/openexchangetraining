package com.stringclass;

public class Main {
    public static void main(String[] args) {
        String str1 = "Learn Java";
        String str2 = "learn java";
        String str3 = "Learn Kolin";
        int result;

        result = str1.compareToIgnoreCase(str2);
        System.out.println(result); // 0

   
        result = str1.compareToIgnoreCase(str3);
        System.out.println(result); // -1


        result = str3.compareToIgnoreCase(str1);
        System.out.println(result); // 1
        
    }
}