package com.accessmodifiersprivate;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import java.lang.reflect.*;
class PrivateAccess

{

  public static void main(String args[]) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException

  {

    PrivateClass obj=new PrivateClass();
/*
 *  System.out.println(obj.x);  //Compile Time Error

    obj.show();  //Compile Time Error
 */
    Method m = PrivateClass.class.getDeclaredMethod("show");//String name means private method name
    //m.invoke(d);// throws java.lang.IllegalAccessException
    m.setAccessible(true);//  
    m.invoke(obj);// now its OK 

  }

}