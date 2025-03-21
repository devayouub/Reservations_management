package TP01_EXO2;

public class Tp {
	 public float grade;
	 public boolean wasPresent; 

	public Tp(float grade, boolean wasPresent) throws AbsentPupilException{
		if(wasPresent == false ) {
			throw new AbsentPupilException("EXCEPTION : THE PUPIL WAS ABSENT");
		}
		this.grade = grade;
		this.wasPresent = wasPresent;
	}
   public float getGrade() {
		return grade;
	}
   public void setGrade(float tp) throws InvalidGradeException{
		if( tp <0 || tp >20) {
			throw new InvalidGradeException("THE GRADE YOU ENTERED IS INVALID");
		} 
		this.grade = tp;
	}
	public boolean WasPresent() {
		return wasPresent;
	}
	public void setWasPresent(boolean wasPresent) {
		this.wasPresent = wasPresent;
	}
}


