package lab_1;

public class Question4 {

	public static void main(String[] args) {
		deerPlay(16, false);

	}
	public static void deerPlay(int temperature, boolean isSummer) {
		int limit =(isSummer) ? (100) : 90;
		String res = (temperature>=60 && temperature<=limit) ? "true" :"false";
		System.out.println(res);
	}

}
