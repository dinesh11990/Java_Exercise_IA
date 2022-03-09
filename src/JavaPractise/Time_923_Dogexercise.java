package JavaPractise;

public class Time_923_Dogexercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(dogTrouble(true,6)); //true
		System.out.println(dogTrouble(true,7)); //false
		System.out.println(dogTrouble(false,6)); //false
	}
	
	public static boolean dogTrouble(boolean barking,int hour) {
		//return barking;
		/*
		if(barking) {
			if(hour<7 || hour>20) {
				return true;
			}else {
				return false; //Not in trouble
			}
		}
		else {
			return false; //Not in trouble
		}*/
		
		return (barking && (hour < 7 || hour > 20));
	}

}
