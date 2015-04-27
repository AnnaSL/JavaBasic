package com.sourceit.java.basic.lesovaya.ct6;

public class Velobike extends Vehicle {

	private int countOfWheel;
	@Override
	public void go() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getInfo() {
		System.out.println("It's Velobike");
		
	}
	
	public int getCountOfWheel(){
		return countOfWheel;
	}
	public void setCountOfWheel(int cw){
		countOfWheel = cw;
	}

	@Override
	public void changeGear() {
		// TODO Auto-generated method stub
		
	}
}
