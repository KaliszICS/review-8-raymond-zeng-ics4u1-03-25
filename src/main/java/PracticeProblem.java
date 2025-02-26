public class PracticeProblem {

	public static void main(String args[]) {
		
	}
	public static String pluralize(String word1){
	String word2 = "   " + word1.toLowerCase();
	if (word2.substring(word2.length() - 2).equals("ey") ){
		return "eys";
	
		}
	else if (word2.substring(word2.length() - 1).equals("y")){
			return "ies";
	}

	else if (word2.substring(word2.length() - 3).equals("ife")){
			return "ives";
	}
	else {
		return "s";
	}
}
	public static int min(int num1, int num2, int num3){
		int min = num1;
		if (min > num2){
			min = num2;
			if (min > num3){
				min = num3;
			}
		}
		return min;
	}
	public static Boolean isLeapYear(int year){
		if (year % 4 == 0 && year % 400 == 0){
			return (year % 4 == 0);
		}
		else {
			if (year % 4 == 0 && year % 100 != 0){
				return true;
			}
			else{
				return false;
			}
		}
	}
}

	
	

