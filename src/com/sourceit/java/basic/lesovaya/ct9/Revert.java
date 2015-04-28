package com.sourceit.java.basic.lesovaya.ct9;

public class Revert {

	public static void main(String[] args) {
		
		String s = args[0];
		
		System.out.println("params: " + s);
		
		StringBuilder result = new StringBuilder();
		
		char[] charArray = s.toCharArray();
		
		for(int i = s.length() - 1; i>=0; i--){
			result.append(charArray[i]);
		}
		
		//T
		//iT
		//tiT
		//
		
		for(char c: s.toCharArray()){
			result.insert(0, c);
		}
		
		System.out.println("result: " + result);

	}

}
