package com.clc.PairProgShape.AbstractClass;

import com.clc.PairProgShape.Interface.IRectangle;

/**
 * This abstract class initializes length and breadth and implements
 * selectedShape method from upper interface
 * 
 * @author Hrishabh
 * @Date 3/10/2015
 */
public abstract class AbstractRectangle implements IRectangle {

	// initilaizes length and breadth of the rectangle
	public float breath, length;

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

		return " rectangle ";
	}

}
