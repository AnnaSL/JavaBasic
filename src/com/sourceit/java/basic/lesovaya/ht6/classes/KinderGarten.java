package com.sourceit.java.basic.lesovaya.ht6.classes;

import java.util.*;

public class KinderGarten {

	private String name;
	private ArrayList<Child>  listOfChildrens;
	
	public KinderGarten(String name){
		this.name = name;
		listOfChildrens = new ArrayList<Child>();
	}
	
	public void addChild(Child newChild){
		listOfChildrens.add(newChild);
	}
	
	public Child getChild(int index){
		return listOfChildrens.get(index);
	}
	
	public int getSizeOfKinderGarten(){
		return listOfChildrens.size();
	}
	
	public String toString(){
		return "Kindergarten " + name + " ";
	}

	
}
