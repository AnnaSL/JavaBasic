package com.sourceit.java.basic.lesovaya.ht2;

public class Cell {
	private boolean leftBorder;
	private boolean rightBorder;
	private boolean topBorder;
	private boolean bottomBorder;
	
	public boolean getLeftBorder(){
		return leftBorder;
	}
	
	public void setLeftBorder(boolean lb){
		leftBorder = lb;
	}
	
	public boolean getRightBorder(){
		return rightBorder;
	}
	
	public void setRightBorder(boolean rb){
		rightBorder = rb;
	}
	
	public void setTopBorder(boolean tb){
		topBorder = tb;
	}
	
	public boolean getTopBorder(){
		return topBorder;
	}
	
	public void setBottomBorder(boolean bb){
		bottomBorder = bb;
	}

	public boolean getBootomBorder(){
		return bottomBorder;
	}
	/**
	 * 
	 */
	public Cell(boolean leftBorder, boolean rightBorder, boolean topBorder, boolean bottomBorder){
		this.bottomBorder = bottomBorder;
		this.leftBorder = leftBorder;
		this.rightBorder = rightBorder;
		this.topBorder = topBorder;
	}
	/**
	 * Draws maze on console
	 */
	public void drawCell(){
	}
	
	public String toString() {
		return "TopBorder = " + topBorder + "; " + "LeftBorder = " + leftBorder+ "; " + "RightBorder = " + rightBorder + "; " + "BottomBorder = " + bottomBorder ;
	} 
}
