package Presidents.Presidents;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class President {

	private String name;
	private Date doB = new Date();
	private String birthPlace;
	private Date doD = new Date();
	private String deathPlace;

	public President(String name, String doB, String birthPlace, String doD, String deathPlace) {
		this.name = name;
		this.birthPlace = birthPlace;
		this.deathPlace = deathPlace;

		SimpleDateFormat formatter = new SimpleDateFormat("MMM dd yyyy");

		try {
			
			this.doB = formatter.parse(doB.trim());
			this.doD = formatter.parse(doD.trim());
			
		} catch (ParseException pe) {

			pe.printStackTrace();

		}
	}
	
	public String extractYear(String whatYear){
		
		if(whatYear == "doB") {
			return new SimpleDateFormat("yyyy").format(doB);	
		}
		else {
			return new SimpleDateFormat("yyyy").format(doD);	
		}
		
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDoB() {
		return doB;
	}
	
	public String getBirthPlace() {
		return birthPlace;
	}
	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}
	public Date getDoD() {
		return doD;
	}
	
	public String getDeathPlace() {
		return deathPlace;
	}
	public void setDeathPlace(String deathPlace) {
		this.deathPlace = deathPlace;
	}


}
