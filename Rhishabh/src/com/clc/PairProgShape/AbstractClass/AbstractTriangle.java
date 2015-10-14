package com.clc.PairProgShape.AbstractClass;

import com.clc.PairProgShape.Interface.ITriangle;

/**
 * This abstract class initializes base and height and implements selectedShape
 * method from upper interface
 * 
 * @author Hrishabh
 * @Date 3/10/2015
 */
public abstract class AbstractTriangle implements ITriangle {

	// initilaizes base and height of the triangle
	public float base, heightTriangle;

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

		return " triangle ";
	}

}
