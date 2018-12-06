package Presidents.Presidents;

public class President {
	
	private String name;
	private String doB;
	private String birthPlace;
	private String doD;
	private String deathPlace;
	
	public President(String name, String doB, String birthPlace, String doD, String deathPlace) {
		this.name = name;
		this.doB = doB;
		this.birthPlace = birthPlace;
		this.doD = doD;
		this.deathPlace = deathPlace;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDoB() {
		return doB;
	}
	public void setDoB(String doB) {
		this.doB = doB;
	}
	public String getBirthPlace() {
		return birthPlace;
	}
	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}
	public String getDoD() {
		return doD;
	}
	public void setDoD(String doD) {
		this.doD = doD;
	}
	public String getDeathPlace() {
		return deathPlace;
	}
	public void setDeathPlace(String deathPlace) {
		this.deathPlace = deathPlace;
	}
	

}
