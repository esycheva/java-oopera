package ru.practicum.theatre;

import java.util.ArrayList;

public class MusicalShow extends Show {
	private String musicAuthor;
	private String librettoText;
	
	protected MusicalShow(String title, int duration, ArrayList<Actor> listOfActors){
		super(title, duration, listOfActors);
	}
	
	protected MusicalShow(String title, int duration, ArrayList<Actor> listOfActors, String musicAuthor, String librettoText){
		this(title, duration, listOfActors);
		this.musicAuthor = musicAuthor;
		this.librettoText = librettoText;
	}

	public String getLibrettoText(){
		return librettoText;
	}

	public String getMusicAuthor(){
		return musicAuthor;
	}
		
	public void printLibrettoText() {
		System.out.println(librettoText);
	}
}
