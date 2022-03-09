package assignment_01;

import ignore.TestingUtils;

public class App {
	
	/**
	Given a string of odd length, return the middle 3 characters from the string, 
	so the string <b>"Monitor"</b> yields <b>"nit"</b>. 
	If the string length is less than 3, return the string as is. <br> <br>

	<b>EXPECTATIONS:</b><br>
	middleThree("bunny") <b>---></b> "unn" <br>
	middleThree("peter") <b>---></b> "ete" <br>
	middleThree("Jamaica") <b>---></b>"mai" <br>
	 */
	
	public static String middleThree(String str) {
		String result = str;
		
		if(str.length()>=3) {
		int middle = str.length()/2;
		result = str.substring(middle-2,middle+2);
		}
		return result;
	}
	
	
	
	
	
	
	
private static String substring(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}







private static String substring() {
		// TODO Auto-generated method stub
		return null;
	}







//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
	}
}
