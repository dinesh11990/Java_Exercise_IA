package JavaPractise;

public class Time_459_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("Hello World");
		
		String a="Hello";
		String b="Dinesh";
		String c="Hello there dinesh there";
		String d="I am new to programming";
		
		/*if(a.equals("Hello")) {
			
			System.out.println("Granted");
		}*/
		
		if(a.equalsIgnoreCase("Hello")) {
			
			System.out.println("Success");
		}
		
		System.out.println(b.charAt(3));
		System.out.println(c.indexOf("there",0));
		System.out.println(d.lastIndexOf("to"));

	}

}
