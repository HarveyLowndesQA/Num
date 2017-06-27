package range;

public class NumName {

	
	public NumName() {
		
	}
	
	public void numberRangeToWord(int min, int max) {
		for(int i = min; i <= max; i ++) {
			System.out.println(i + ": " + numberToWord(i));
		}
	}
	
	public String numberToWord(int a) {
		
		String word = "";
		
		boolean hasFirst = true;
		
		switch(a/100) {
		
		case 1:
			word = word + "One hundred ";
			a = a % 100;
			break;
		case 2:
			word = word + "Two hundred ";
			a = a % 200;
			break;
		case 3:
			word = word + "Three hundred ";
			a = a % 300;
			break;
		case 4:
			word = word + "Four hundred ";
			a = a % 400;
			break;
		case 5:
			word = word + "Five hundred ";
			a = a % 500;
			break;
		case 6:
			word = word + "Six hundred ";
			a = a % 600;
			break;
		case 7:
			word = word + "Seven hundred ";
			a = a % 700;
			break;
		case 8:
			word = word + "Eight hundred ";
			a = a % 800;
			break;
		case 9:
			word = word + "Nine hundred ";
			a = a % 900;
			break;
		default:
			hasFirst = false;
		}
		
		if(hasFirst && a > 0) {
			word = word + "and ";
		}
		
		boolean hasSecond = true;
		
		switch(a / 10) {
		case 2:
			word = word + "Twenty ";
			a = a % 20;
			break;
		case 3:
			word = word + "Thirty ";
			a = a % 30;
			break;
		case 4:
			word = word + "Fourty ";
			a = a % 40;
			break;
		case 5:
			word = word + "Fifty ";
			a = a % 50;
			break;
		case 6:
			word = word + "Sixty ";
			a = a % 60;
			break;
		case 7:
			word = word + "Seventy ";
			a = a % 70;
			break;
		case 8:
			word = word + "Eighty ";
			a = a % 80;
			break;
		case 9:
			word = word + "Ninty ";
			a = a % 90;
			break;
		default:
			hasSecond =  false;
		}
		
		switch(a) {
		case 1:
			word = word + "One ";
			break;
		case 2:
			word = word + "Two ";
			break;
		case 3:
			word = word + "Three ";
			break;
		case 4:
			word = word + "Four ";
			break;
		case 5:
			word = word + "Five ";
			break;
		case 6:
			word = word + "Six ";
			break;
		case 7:
			word = word + "Seven ";
			break;
		case 8:
			word = word + "Eight ";
			break;
		case 9:
			word = word + "Nine ";
			break;
		case 10:
			word = word + "Ten ";
			break;
		}
		
		if(hasSecond && a > 10) {
			word = word + "and ";
		}
		
		switch(a) {
		case 11:
			word = word + "Eleven ";
			break;
		case 12:
			word = word + "Twelve ";
			break;
		case 13:
			word = word + "Thirteen ";
			break;
		case 14:
			word = word + "Fourteen ";
			break;
		case 15:
			word = word + "Fifteen ";
			break;
		case 16:
			word = word + "Sixteen ";
			break;
		case 17:
			word = word + "Seventeen ";
			break;
		case 18:
			word = word + "Eighteen ";
			break;
		case 19:
			word = word + "Ninteen ";
			break;
		default:
			hasSecond =  false;
		}
		
		return word;
	}
	
}
