package com.bloc.bestpractices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WorstPractices extends Object {

	/************************************************
	 *	ASSIGNMENT:
	 *	Fix code and comments below this block
	/************************************************/

	public static void main(String [] args) {
	
		int magicNumber = WorstPractices.generate(false);
		
		magicNumber *= 5;
		
		if (magicNumber > 18) {
		
			while(magicNumber > 0) {
				magicNumber--;
			}
		}
	
	}

	/**
	* This method takes in a single parameter, isSeeded. Using a very 
	* elaborate and complex algorithm, it calculate a magic number.
	*
	* @param isSeeded 	a boolean flag with helps determine the seed which helps 
	*					generate the magic number
	*
	* @return 			a magical number
	*/
	private static int generate(boolean isSeeded) {
	
		int seed = isSeeded ? 34 : 21;
		float fudgeFactor = .5f;
		
		for (int i = 0; i < seed; i++) { 
			fudgeFactor *= seed;
		} 
		
		return (int) fudgeFactor * seed;
	}

	/************************************************
	 *	ASSIGNMENT
	 *	Fix code and comments above this block
	/************************************************/
}
