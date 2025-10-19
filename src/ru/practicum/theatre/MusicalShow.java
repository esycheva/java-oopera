package ru.practicum.theatre;

import java.util.ArrayList;

public class MusicalShow extends Show {
	public String musicAuthor;
	public String librettoText;
	
	MusicalShow(String title, int duration, ArrayList<Actor> listOfActors){
		super(title, duration, listOfActors);
	}
	
	MusicalShow(String title, int duration, ArrayList<Actor> listOfActors, String musicAuthor, String librettoText){
		this(title, duration, listOfActors);
		this.musicAuthor = musicAuthor;
		this.librettoText = librettoText;
	}
	
	public void printLibrettoText() {
		System.out.println(librettoText);
	}
}
