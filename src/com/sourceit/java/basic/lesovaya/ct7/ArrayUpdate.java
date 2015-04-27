package com.sourceit.java.basic.lesovaya.ct7;

import com.sourceit.exercise.IntArrays;

public class ArrayUpdate implements IntArrays {

	private int[] array = new int[0];
	@Override
	public void add(int num) {
		int[] tempArray;
		int len = array.length;		
		if(len == 0){
			array = new int[len + 1];
			array[len] = num;
		} else {
			tempArray = array;
			array = new int[len + 1];
			for(int i = 0; i < tempArray.length; i++){
				array[i] = tempArray[i];
			}
			array[len] = num;
		}
		
	}

	@Override
	public int get(int i) {
		// TODO Auto-generated method stub
		int num = array[i];
		return num;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return array.length;
	}
	

}
