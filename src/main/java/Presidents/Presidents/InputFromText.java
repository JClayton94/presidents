package Presidents.Presidents;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InputFromText {

	private String csv = "C:/Users/Admin/Desktop/presidents.txt";
	private BufferedReader br = null;
	private String line;
	private List<String> list = new ArrayList<String>();
	private List<President> presidents = new ArrayList<President>();
	private int yearCount = 0;
	private String[] row = new String[5];

	public void reader() {

		try {
			br = new BufferedReader(new FileReader(csv));

			while((line = br.readLine()) != null ) {
				

				row = line.split(",");
				if (!row[0].equals("")) {

					presidents.add(new President(row[0], row[1], row[2], row[3], row[4]));

				}
			}
		}catch(IOException e) {

			e.printStackTrace();
		}

		//presidents.stream().forEach(x -> System.out.println(x.getName() + " " + x.getDoB() + " " + x.getBirthPlace() + " " + x.getDoD() + " " + x.getDeathPlace()));



	}





	public List<President> getPresidents() {
		return presidents;
	}





	public void setPresidents(List<President> presidents) {
		this.presidents = presidents;
	}





	//	public int presidentsAlive() {
	//		
	//
	//		for(President p : presidents) {
	//			for(President p2: presidents) {
	//				if()
	//				
	//				
	//			}
	//			
	//			
	//		}
	//
	//		return 0;
	//
	//
	//	}


}


