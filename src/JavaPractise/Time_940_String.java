package JavaPractise;

public class Time_940_String {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		String name = "DINESHBABU";
		String extractedString = name.substring(2);
		
		System.out.println(extractedString);
		System.out.println(name.length());
		
		if(name.length() == 10) {
			
			System.out.println("length is 8");
		}else {
			
			System.out.println("Not Correct");
		}
	}
}
