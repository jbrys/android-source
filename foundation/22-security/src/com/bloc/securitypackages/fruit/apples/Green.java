package com.bloc.securitypackages.fruit.apples;

/************************************************
 *	YOU MAY MODIFY THIS FILE AND/OR ITS LOCATION
/************************************************/
import com.bloc.securitypackages.colors.LimeGreen;

public class Green extends Apple {

	public Green() {
		super(Green.class.getSimpleName(), 230, new LimeGreen(), 0.21d);
	}

	@Override
	void bite() {
		setWeight(getWeight() - 0.02d);
	}

}