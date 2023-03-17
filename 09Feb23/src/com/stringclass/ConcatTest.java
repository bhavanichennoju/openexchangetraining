package com.stringclass;
import java.lang.StringBuffer;
public class ConcatTest{  
    public static void main(String[] args){  
    	 long   startTime1 = System.currentTimeMillis();  
         StringBuffer sb1 = new StringBuffer("Java");  
         for (int i=0; i<10000; i++){  
         	sb1.append("Tpoint");  
         }  
         System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime1) + "ms");
        long   startTime = System.currentTimeMillis();  
        StringBuilder sb2 = new StringBuilder("Java");  
        for (int i=0; i<10000; i++){  
            sb2.append("Tpoint");  
        }  
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");    
    }  
}  