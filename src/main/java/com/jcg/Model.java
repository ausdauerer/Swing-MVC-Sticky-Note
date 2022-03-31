package com.jcg;

public class Model {

	private String text;
	DataBase db;
	private String version;

	public Model() {
		db=new DataBase();
		text=db.getLatestNote();
		version=db.getLatestVersion();
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

	public void setVersion(String t) {
		version = t;
		System.out.println("Successfully set Version to -> "+t);
	}
	public String getVersion() {
		return version;
	}
	
}
