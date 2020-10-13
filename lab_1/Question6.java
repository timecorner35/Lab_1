package lab_1;

public class Question6 {

	public static void main(String[] args) {
		cigarParty(160, false);

	}
	public static void cigarParty(int cig, boolean isWeekend) {
		if ((isWeekend)&&cig>=40) {
		System.out.println("true");
		}
		else if(cig>=40&&cig<=60) {
			System.out.println("true");
			}
		else {System.out.println("false");}
		}
	}


