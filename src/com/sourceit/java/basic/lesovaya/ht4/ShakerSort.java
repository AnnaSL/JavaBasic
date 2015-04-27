package com.sourceit.java.basic.lesovaya.ht4;

public class ShakerSort {
	static int n = 50;
	int array[];
	
	public static void main(String[] args){
		ShakerSort test = new ShakerSort();
		test.generateArray(n);
		System.out.println("Unsorted array: ");
		test.printArray();
		System.out.println("*********************************************");
		System.out.println("Ascending sorted array: ");
		test.shakerSortAsc();
		test.printArray();
		System.out.println("*********************************************");
	}
/**
 * Implements of "shaker" or "coctail" sorting algorithm (ascending)
 */
	public void shakerSortAsc(){		
		int temp = 0;	
		int i = -1;
		int j = -1;
		int start = 0;
		int end = n-1;		
		
		while(start != end){
			for(i=start; i<end; i++){
				if(array[i]>array[i+1]){
					temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
				}
			}
			/** TODO
			 * 
			 */
			temp = start;
			start = end;
			end = temp;
			/**TODO
			 * 
			 */
			for(j=start; j>end; j--){
				if(array[j]<array[j-1]){
					temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}
			}
			temp = start;
			start = end+1;
			end = temp;
		}		
	}

/**
 * Fills array of numbers from 0 to 100
 * @param k - amount of elements in array
 */
	public void generateArray(int k){
		array = new int[k];
		for(int i=0; i<k; i++){
				array[i] = (int)(Math.random() * 100);
		}
	}
/**
 * Prints array	
 */
	public void printArray(){
		for(int i=0; i<array.length; i++){
				System.out.print(array[i]+" ");			
		}
		System.out.println();
	}
}
