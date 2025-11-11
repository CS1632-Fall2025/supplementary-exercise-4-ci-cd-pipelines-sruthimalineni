package edu.pitt.cs;

public class CatImpl implements Cat {

	// TODO: Fill in with member variables
	private int cat_id;
	private String cat_name;
	private boolean cat_rented;

	public CatImpl(int id, String name) {
		// TODO: Fill in
		cat_id = id;
		cat_name = name;
	}

	public void rentCat() {
		// TODO: Fill in
		cat_rented = true;
	}

	public void returnCat() {
		// TODO: Fill in
		cat_rented = false;
	}

	public void renameCat(String name) {
		// TODO: Fill in
		cat_name = name;
	}

	public String getName() {
		// TODO: Fill in
		return cat_name;
	}

	public int getId() {
		// TODO: Fill in
		return cat_id;
	}

	public boolean getRented() {
		// TODO: Fill in
		return cat_rented;
	}

	public String toString() {
		// TODO: Fill in
		//"ID 1. Jennyanydots"
		return "ID "+cat_id+". "+cat_name;
	}

}