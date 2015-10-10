package com.bloc.interfaces.people;

/************************************************
 *	ASSIGNMENT:
 *	Have John implement the Driver interface
/************************************************/

public class John extends Person implements Driver{
	public John() {
		super("John", "Smith", "Male", 1.7d, 69d, "Brown");
	}

	@Override
	public void getInCar(){return;}

	@Override
	public void startEngine(){return;}

	@Override
	public void driveFast(){return;}
}