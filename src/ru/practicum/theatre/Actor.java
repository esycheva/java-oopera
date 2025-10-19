package ru.practicum.theatre;

import java.util.Objects;

public class Actor extends Person {
	public double height;
	
	Actor(String name, String surname, Gender gender, double height){
		super(name, surname, gender);
		this.height = height;
	}
	
	public String toString() {
		return (name + " " + surname + "(" + height + ")");
	}
	
	@Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if(this.getClass() != obj.getClass()){
            return false;
        }

        Actor otherObj = (Actor) obj;
        return Objects.equals(name, otherObj.name) &&
               Objects.equals(surname, otherObj.surname) &&
               Objects.equals(height, otherObj.height);
    }
	
	@Override 
    public int hashCode() {
		/*
        int hash = 17; 
        if (name != null) {
            hash = hash + name.hashCode();
        }
        hash = hash * 31; 

        if (surname != null) { 
            hash = hash + surname.hashCode();
        }
        
        hash = hash * 31; 

        if (height != null) { 
            hash = hash + height.hashCode();
        }
        return hash;
        */
        
        return Objects.hash(name, surname, height);
    }
}
