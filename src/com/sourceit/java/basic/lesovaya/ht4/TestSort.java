package com.sourceit.java.basic.lesovaya.ht4;

public class TestSort {
	static int n = 10;
	int array[];
	
	public static void main(String[] args){
		TestSort test = new TestSort();
		test.generateArray(n);
		System.out.println("Unsorted array: ");
		test.printArray();
		System.out.println("*********************************************");
		System.out.println("Ascending sorted array: ");
		test.bubleSortAsc();
		test.printArray();
		System.out.println("*********************************************");
		System.out.println("Descending sorted array: ");
		test.bubleSortDesc();
		test.printArray();
	}
	
	public void bubleSortAsc(){		
		int temp = 0;
		int flagOfSwap= 0;
		for (int j=array.length-1; j>=0; j--){
			for(int i=0; i<j; i++){
				if(array[i]>array[i+1]){
					temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
					flagOfSwap++;					
				}				
			}
		}
		System.out.println("Count of swaps: " + flagOfSwap);
		
	}
	
	public void bubleSortDesc(){		
		int temp = 0;
		int flagOfSwap= 0;
		for (int j=array.length-1; j>=0; j--){
			for(int i=0; i<j; i++){
				if(array[i]<array[i+1]){
					temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
					flagOfSwap++;
				}
			}
		}
		System.out.println("Count of swaps: " + flagOfSwap);
		
	}
	
	public void generateArray(int k){
		array = new int[k];
		for(int i=0; i<k; i++){
				array[i] = (int)(Math.random() * 100);
		}
	}
	
	public void printArray(){
		for(int i=0; i<array.length; i++){
				System.out.print(array[i]+" ");			
		}
		System.out.println();
	}
}
