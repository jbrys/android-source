package com.bloc.recursion;

import java.util.*;

public class RecursionUtils extends Object {
	private static int maxNum = 0;

	/*
	 * findMaxRecursively
	 *
	 * Takes a list of numbers and finds the largest among them
	 * using recursive calls.
	 *
	 * @param numbers a list of numbers, can be odd or even numbered
	 * @return the largest number in the list
	 *
	 * Hint: your base case may be a comparison of 2 numbers
	 */
	public static final int findMaxRecursively(List<Integer> numbers) {
		/************************************************
	 	 *	ASSIGNMENT:
	 	 *	Implement this method, the return value must
	 	 *	change
		/************************************************/
		int base = numbers.get(0);

		if (base > maxNum){
			maxNum = base;
		}

		if (numbers.size() == 1) {
			int retVal = maxNum;
			maxNum = 0;
			return retVal;
		}

		return findMaxRecursively(numbers.subList(1, numbers.size()));

	}
}