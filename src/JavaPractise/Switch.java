package JavaPractise;

public class Switch {
	
	int modelYear;
	String modelName;
	int modelSalary = 25000;
	
	public Switch(String Name,int Year) 
	{
		modelName = Name;
		modelYear = Year;		
		
	}
	
	// No need to create object for static block, it is taken into priority
	static{
	   
		System.out.println("Static block is executed first");
	}
	
	// Return types
	public int salaryForDriver() {
		
		System.out.println("Clio car driver salary " +modelSalary);
		return modelSalary;
	}
	
	
	// Parameterized constructor
	public void sayAboutCar() {
		
		System.out.println("Name is " +modelName+" and type is "+modelYear);
		
	}
	
	//Static method - first priority 
	public static void xYZ() {
		
		System.out.println("Sample output for static");
	}
	
	//Main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		int age = 21;
	
	switch(age){
	
	case(10):
	System.out.println("Wrong");
	break;
	case(15):
	System.out.println("Wrong");
	break;
	case(21):
	System.out.println("Right");
	break;
	default:
	System.out.println("Please give the valid age");
	break;

	}
	
	//Parameterized constructor no need to create object
	Switch obj = new Switch("Twingo", 2018);
	
	//obj.sayAboutCar();
	
	Switch a = new Switch("",0);
	
	// return type
	int x = a.salaryForDriver();
	System.out.println("Salary is given to Mr.X around " +x);
	
	// static method, no need to create object, 
	xYZ();
}
	
}
