package com.bloc.interfaces.people;

/************************************************
 *	ASSIGNMENT:
 *	Have Mary implement the Skydiver interface
/************************************************/
import com.bloc.interfaces.people.hobbies.Skydiver;

public class Mary extends Person implements Skydiver {
	public Mary() {
		super("Mary", "Whiters", "Female", 1.65d, 62d, "Blue");
	}

	@Override
	public void getInPlane(){return;}

	@Override
	public void jumpFromPlane(){return;}

	@Override
	public void releaseParachute(){return;}
}