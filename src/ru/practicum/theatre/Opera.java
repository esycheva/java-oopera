package ru.practicum.theatre;

import java.util.ArrayList;

public class Opera extends MusicalShow {
	private int choirSize;
	
	protected Opera(String title, int duration, ArrayList<Actor>listOfActors, String musicAuthor, String librettoText){
		super(title, duration, listOfActors, musicAuthor, librettoText);
	}
	
	protected Opera(String title, int duration, ArrayList<Actor> listOfActors,String musicAuthor, String librettoText, int choirSize){
		this(title, duration, listOfActors, musicAuthor, librettoText);
		this.choirSize = choirSize;
	}

	public int getChoirSize(){
		return choirSize;
	}

}