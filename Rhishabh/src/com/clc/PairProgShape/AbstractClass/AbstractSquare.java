package com.clc.PairProgShape.AbstractClass;

import com.clc.PairProgShape.Interface.ISquare;

/**
 * This abstract class initializes length and breadth and implements
 * selectedShape method from upper interface
 * 
 * @author Hrishabh
 * @Date 3/10/2015
 */
public abstract class AbstractSquare implements ISquare {

	// initilaizes side of the square
	public float sideOfSquare;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.clc.PairProgShape.Interface.IShape#selectedShape()
	 * 
	 * prints name of this shape
	 */
	@Override
	public String selectedShape() {
		// TODO Auto-generated method stub

		return " square ";
	}

}
