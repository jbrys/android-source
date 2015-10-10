package com.bloc.securitypackages.apples;

/************************************************
 *	YOU MAY MODIFY THIS FILE AND/OR ITS LOCATION
/************************************************/
import com.bloc.securitypackages.Fruit;
import com.bloc.securitypackages.Color;

abstract class Apple extends Fruit {

	Apple(String name, int weight, Color color, double calories){
		super(name, weight, color, calories);
	}

	abstract void bite();

}