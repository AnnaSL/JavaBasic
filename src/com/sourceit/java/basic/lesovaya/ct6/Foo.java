package com.sourceit.java.basic.lesovaya.ct6;

public class Foo {
	
	public static void main(String[] args){
		Foo f = new Foo();
		f.printNumber(255);
	}

	public void printNumber(int n){
		
		for(int i = 1; i <= n; i++){
			if(i%3 == 0 || i%5 == 0){
				if(i%3 == 0 && i%5 == 0){
					
					System.out.println("FooBar");
				}	else {
					if(i%3 == 0){
						System.out.println("Foo");
					}
					if(i%5 == 0){
						System.out.println("Bar");
					}
				}
			}else{
				System.out.println(i);
			}
			
			
		}
	}
}
