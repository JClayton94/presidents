package Presidents.Presidents;

public class App 
{
    public static void main(String[] args)
    {
    	
    	InputFromText input = new InputFromText();
    	
    	input.reader();
    	
    	
    	System.out.println(input.getPresidents().get(0).extractYear("doB"));
    	
    	
    	
    }
}
