package Presidents.Presidents;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputFromText {

	private String csv = "C:/Users/Admin/Desktop/presidents.txt";

	BufferedReader br = null;
	String line;

	List<String> list = new ArrayList<String>();
	List<President> presidents = new ArrayList<President>();


	public void reader() {

		try {
			br = new BufferedReader(new FileReader(csv));

			while((line = br.readLine()) != null ) {

				//list = Arrays.asList(line.split(","));
				
				presidents.add(new President(line.split(",")[0], line.split(",")[1], line.split(",")[2], line.split(",")[3], line.split(",")[4]));
			}
		}catch(IOException e) {

			e.printStackTrace();
		}

		presidents.stream().forEach(x -> System.out.println(x));

	}
}


