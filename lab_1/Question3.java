package lab_1;

public class Question3 {

	public static void main(String[] args) {
		
specialEleven(24);
	}
	public static void specialEleven(int num) {
		String a = ((num%11==0)||(num%11==1)) ? "true" : "false";
		System.out.println(a);
	}

}
