package com.hello;

public class World {
	public static void main(String[] args) {
		
		byte bit = 127;
		short shrt = 12;
		int ynt = 299564;
		long lng = 50000L + 10L*(bit+shrt+ynt);
		System.out.println(lng);
	}
}
