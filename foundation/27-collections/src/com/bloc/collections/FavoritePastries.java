package com.bloc.collections;

import java.util.*;

/*
 * FavoritePastries
 * 
 * This class maintains a record of Pastry objects and their
 * relation to a 1 to 5 rating scale.
 *
 * For example:
 * 5 Star Pastries: Cronut, Cherry Pie
 * 4 Star Pastries: Strudel, Apple Pie
 * 3 Star Pastries: Bear Claw
 * 2 Star Pastries: Pop-Tart
 * 1 Star Pastries: Pot Pie
 *
 * A pastry may not have duplicate entries
 */
public class FavoritePastries {

	/************************************************
 	 *	ASSIGNMENT:
	 *	Use a HashMap to store the relationship
	 *	between rating and pastry: HashMap<Integer, List<Pastry>>
	/************************************************/
	static private HashMap<Integer, List<Pastry>> pastryRatings;
	// private List<Pastry> pastryList;

	public FavoritePastries() {
		pastryRatings = new HashMap<Integer, List<Pastry>>();
	}

	/* 
	 * addPastry
	 *
	 * Add a Pastry to the FavoritePastries class.
	 *
	 * This method stores this Pastry and its
	 * associated rating in some sort of data structure.
	 *
	 * If this Pastry already exists in FavoritePastries,
	 * its old rating should be updated.
	 *
	 * @param pastry The Pastry to store
	 * @param rating The rating to associate with it
	 * @return nothing
	 */
	public void addPastry(Pastry pastry, int rating) {
		
		List<Pastry> list;
		// check if any pastries have this rating. If so grab the current ratings. 
		// If not, make a new list.
		if (pastryRatings.containsKey(rating)){
			list = pastryRatings.get(rating);
		} else {
			list = new ArrayList<Pastry>();
		}

		// check if this pastry has already been rated.
		// if so, update it
		if (this.getRatingForPastry(pastry) != -1){

			this.removePastry(pastry);
			addPastry(pastry, rating);
		} else {
		
			list.add(pastry);
			pastryRatings.put(rating, list);
		}
		
	}

	/* 
	 * removePastry
	 *
	 * Remove a Pastry from FavoritePastries
	 *
	 * This method removes any reference to this exact
	 * Pastry object and its associated rating
	 *
	 * @param pastry The Pastry to remove
	 * @return true if the Pastry was found and removed,
	 *		   false otherwise
	 */
	public boolean removePastry(Pastry pastry) {
		
		List<Pastry> list;

		for (int key : pastryRatings.keySet()){
			
			list = pastryRatings.get(key);

			if(list.contains(pastry)){
				
				pastryRatings.remove(key);
				list.remove(pastry);
				pastryRatings.put(key, list);

				return true;
			} 
		}

		return false;

	}

	/* 
	 * getRatingForPastry
	 *
	 * Return the associated rating for a given Pastry
	 *
	 * This method will find the associated rating for
	 * this Pastry inside of FavoritePastries and return
	 * it to its caller.
	 *
	 * @param  pastry The Pastry for which a rating must
	 * 		   be recovered
	 * @return the rating associated with this Pastry or
	 *		   -1 if not found among FavoritePastries
	 */
	public int getRatingForPastry(Pastry pastry) {
		
		int retVal = -1;
		List<Pastry> list;
		for (int rating : pastryRatings.keySet()){
			list = pastryRatings.get(rating);

			if(list.contains(pastry)){
				retVal = rating;
			}
		}

		return retVal;

	}

	/* 
	 * getPastriesForRating
	 *
	 * Return a Set of all the Pastries with a given
	 * rating.
	 *
	 * This method returns a Set<Pastry> object containing
	 * references to all of the Pastries associated with
	 * a particular rating.
	 *
	 * @param  rating The rating of the Pastry objects the
	 *		   caller wishes to recover
	 * @return A Set of all the Pastry objects with a rating
	 * 		   of `rating`. Returns an empty set if none are
	 *         found
	 */
	public Collection<Pastry> getPastriesForRating(int rating) {
		List<Pastry> list = pastryRatings.get(rating);

		return rating == -1 ? new ArrayList<Pastry>() : list;
	}

}