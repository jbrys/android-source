package com.bloc.securitypackages.fruit.apples;

/************************************************
 *	YOU MAY MODIFY THIS FILE AND/OR ITS LOCATION
/************************************************/

class Green extends Apple {

	Green() {
		super(Green.class.getSimpleName(), 230, new LimeGreen(), 0.21d);
	}

	@Override
	void bite() {
		setWeight(getWeight() - 0.02d);
	}

}