package ru.practicum.theatre;

import java.util.Objects;
import java.util.String;

public class Actor extends Person {
	private double height;
	
	protected Actor(String name, String surname, Gender gender, double height){
		super(name, surname, gender);
		this.height = height;
	}
	
	public String toString() {
		return String.format("%s %s (%s)", super.getName(), super.getSurname(), getHeight());
	}

    public double getHeight(){
        return height;
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
        return Objects.equals(getName(), otherObj.getName()) &&
               Objects.equals(getSurname(), otherObj.getSurname()) &&
               Objects.equals(height, otherObj.height);
    }
	
	@Override 
    public int hashCode() {        
        return Objects.hash(super.getName(), super.getSurname(), height);
    }
}
