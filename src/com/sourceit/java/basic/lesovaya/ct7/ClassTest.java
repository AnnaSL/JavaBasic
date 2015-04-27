package com.sourceit.java.basic.lesovaya.ct7;

import com.sourceit.exercise.IntArrays;

public class ClassTest {
	
	public static void main(String[] args){
		
		IntArrays newArr = new ArrayUpdate();
		
		newArr.add(1);
		newArr.add(150);
		
		System.out.println(newArr.size());//2
		System.out.println(newArr.get(1));//150
	}

}
