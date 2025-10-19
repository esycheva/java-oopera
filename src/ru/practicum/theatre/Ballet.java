package ru.practicum.theatre;

import java.util.ArrayList;

public class Ballet extends MusicalShow {
	public String choreographer;
	
	Ballet (String title, int duration, ArrayList<Actor> listOfActors, String musicAuthor, String librettoText){
		super(title, duration, listOfActors, musicAuthor, librettoText);
	}
	
	Ballet (String title, int duration, ArrayList<Actor> listOfActors, String musicAuthor, String librettoText, String choreographer){
		this(title, duration, listOfActors, musicAuthor, librettoText);
		this.choreographer = choreographer;
	}
}
