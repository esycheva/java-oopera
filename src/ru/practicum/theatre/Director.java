package ru.practicum.theatre;

import java.util.String;

public class Director extends Person {
	private int numberOfShows;
	
	protected Director(String name, String surname, Gender gender, int numberOfShows){
		super(name, surname, gender);
		this.numberOfShows = numberOfShows;
	}

	public int getNumberOfShows(){
		return nubmerOfShows;		
	}
	
	public String toString() {
		return String.format("%s %s", super.getName(), super.getSurname());;
	}
}
