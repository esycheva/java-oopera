package ru.practicum.theatre;

import java.util.ArrayList;

public class Opera extends MusicalShow {
	public int choirSize;
	
	Opera(String title, int duration, ArrayList<Actor>listOfActors, String musicAuthor, String librettoText){
		super(title, duration, listOfActors, musicAuthor, librettoText);
	}
	
	Opera(String title, int duration, ArrayList<Actor> listOfActors,String musicAuthor, String librettoText, int choirSize){
		this(title, duration, listOfActors, musicAuthor, librettoText);
		this.choirSize = choirSize;
	}

}