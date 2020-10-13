package lab_1;

public class Question2 {

	public static void main(String[] args) {
		
		numbers(8, 7);
	}
	public static void numbers(int num1, int num2) {
		String result = ((num1==6)||(num2==6)||(num1+num2==6)||(num1-num2==6)||(num2-num2==6)) ? "true" : "false";
		System.out.println(result);
	}

}
