package com.ifet.dayfive.overloading;

public class MethodOverloading {
	public static int add(int a,int b) {
		return a+b;
	}
	public static int add(int a,int b,int c) {
		return a+b+c;
	}
	public static String add(String s1,String s2) {
		return s1+s2;
	}
	public static float add(float a,float b) {
		return a+b;
	}
}
