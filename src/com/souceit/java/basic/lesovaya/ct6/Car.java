package com.souceit.java.basic.lesovaya.ct6;

public class Car extends Vehicle{

	private int volumeOfEngine;
	@Override
	public void go() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		System.out.println("It's Car");
		
	}
	
	public int getVolumeOfEngine(){
		return volumeOfEngine;
	}
	
	public void setVolumeOfEngine(int v){
		volumeOfEngine = v;
	}

	@Override
	public void changeGear() {
		// TODO Auto-generated method stub
		
	}

}
