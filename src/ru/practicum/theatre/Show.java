package ru.practicum.theatre;

import java.util.ArrayList;

public class Show {
	private String title;
	private int duration;
	private ArrayList<Actor> listOfActors;
	
	protected Show(String title, int duration, ArrayList<Actor> listOfActors){
		this.title = title;
		this.duration = duration;
		this.listOfActors = listOfActors;	
	}
	
	public void printActors() {		
		for(Actor actor : listOfActors) {
			System.out.println(actor);	
		}
	}
	
	public void addActor(Actor newActor) {
		boolean isNeeded = true;
		
		for(Actor actor : listOfActors) {
			if (actor.equals(newActor)) {
				System.out.println("Такой актер уже сущестует!");
				isNeeded = false;
			}
		}
		if (isNeeded) {
			listOfActors.add(newActor);
		}	
	 }
	
	
	public void replaceActor(Actor oldActor, Actor newActor) {
		for(Actor actor : listOfActors) {
			if (actor.equals(oldActor)) {
				listOfActors.remove(oldActor);
				listOfActors.add(newActor);
			} 
		}
		
	}

}
