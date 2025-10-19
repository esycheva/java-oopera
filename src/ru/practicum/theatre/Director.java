package ru.practicum.theatre;

public class Director extends Person {
	public int numberOfShows;
	
	Director(String name, String surname, Gender gender, int numberOfShows){
		super(name, surname, gender);
		this.numberOfShows = numberOfShows;
	}
	
	public String toString() {
		return (name + " " + surname);
	}
}
