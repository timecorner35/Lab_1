package lab_1;

public class Question5 {

	public static void main(String[] args) {
		caughtSpeeding(125, false);
	}
	public static void caughtSpeeding(int speed,boolean isBirthday) {
		int lim1=60, lim2=lim1+20;
		lim1 = (isBirthday) ? lim1+5 : lim1;
		int res = (speed>lim1) ? (speed>lim2) ? 2: 1 :0 ;
		System.out.println(res);
		
		
	}
	

}
