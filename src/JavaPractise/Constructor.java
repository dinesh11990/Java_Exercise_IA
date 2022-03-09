package JavaPractise;

public class Constructor {

	static String Name="";
	
	public Constructor() {
		
		System.out.println("Name of the person is ");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructor obj = new Constructor();
		Name="dinesh";
		
		System.out.println(" "+Name);
	}

}
