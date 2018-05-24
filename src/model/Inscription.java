package model;

public class Inscription {
	public String name;
	public String prenom; 
	public String mdp;
	public String mdp2; 
	public String phone; 
	public String email; 
	public String nationalite; 
	public String paddress; 
	public String genderboxes; 
	public String selectbasic;
	
	public Inscription() {
		super();
	}

	public Inscription(String name, String prenom, String mdp, String mdp2, String phone,
			String email, String nationalite, String paddress, String genderboxes, String selectbasic) {
		super();
		this.name = name;
		this.prenom = prenom;
		this.mdp = mdp;
		this.mdp2 = mdp2;
		this.phone = phone;
		this.email = email;
		this.nationalite = nationalite;
		this.paddress = paddress;
		this.genderboxes = genderboxes;
		this.selectbasic = selectbasic;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public String getMdp2() {
		return mdp2;
	}

	public void setMdp2(String mdp2) {
		this.mdp2 = mdp2;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNationalite() {
		return nationalite;
	}

	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}

	public String getPaddress() {
		return paddress;
	}

	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}

	public String getGenderboxes() {
		return genderboxes;
	}

	public void setGenderboxes(String genderboxes) {
		this.genderboxes = genderboxes;
	}

	public String getSelectbasic() {
		return selectbasic;
	}

	public void setSelectbasic(String selectbasic) {
		this.selectbasic = selectbasic;
	}
	
}