package model;

public class Formation {
	public String motivation;
	public String school; 
	public String note;
	public String diplome; 
	
	public Formation() {
		super();
	}

	public Formation(String motivation, String school, String note, String diplome) {
		super();
		this.motivation = motivation;
		this.school = school;
		this.note = note;
		this.diplome = diplome;
	}
	
	public void setMotivation(String motivation) {
		this.motivation = motivation;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}
	
	public String getMotivation() {
		return motivation;
	}

	public String school() {
		return school;
	}

	public String getNote() {
		return note;
	}

	public String getDiplome() {
		return diplome;
	}
}