package com.jcg;

/**
 * @author ashraf
 *
 */
public class Model {

	private String text;
	DataBase db;

	public Model() {
		db=new DataBase();
		text=db.getLatestNote();
	}
	
	public Model(String n, String t) {
		text = t;
	}
	
	public void setText(String t) {
		text = t;
		System.out.println("Successfully set text to -> "+t);
	}
	public String getText() {
		return text;
	}

	@Override
	public String toString() {
		return text;
	}
	
}
