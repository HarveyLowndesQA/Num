package range;

public class NumberToName {

	
	public NumberToName() {
	}
	
	public void numberRangeToWord(int min, int max) {
		for(int i = min; i <= max; i ++) {
			System.out.println(i + ": " + getWord(i));
		}
	}
	
	public String getWord(int num) {
		
		String word = "";
		
		boolean has = false;
		
		//Thousands
		if(num >= 1000) {
			word += ones(num/1000) + " Thousand ";
			num = num%1000;
			has = true;
		}
		
		//Hundreds
		if(num >= 100) {
			word += ones(num/100) + " Hundred ";
			num = num%100;
			has = true;
		}
		
		//Tens
		if(num > 10 && num < 20) {
			if(has) {
				word += "and ";
			}
			word += teens(num%10);
		} else {
			if(has) {
				word += "and ";
			}
			word += tens(num/10);
			num = num%10;
		}
		
		if(num >= 1 && num < 10) {
			word += " " + ones(num);
		}
		return word;
	}
	
	public String ones(int a) {
		switch(a) {
		case 1:
			return "One";
		case 2:
			return "Two";
		case 3:
			return "Three";
		case 4:
			return "Four";
		case 5:
			return "Five";
		case 6:
			return "Six";
		case 7:
			return "Seven";
		case 8:
			return "Eight";
		case 9:
			return "Nine";
		}
		return "";
	}
	
	public String teens(int a) {
		switch(a) {
		case 1:
			return "Eleven";
		case 2:
			return "Twelve";
		case 3:
			return "Thirteen";
		case 4:
			return "Forteen";
		case 5:
			return "Fifteen";
		case 6:
			return "Sixteen";
		case 7:
			return "Seventeen";
		case 8:
			return "Eighteen";
		case 9:
			return "Ninteen";
		}
		return "";
	}
	
	public String tens(int a) {
		switch(a) {
		case 1:
			return "Ten";
		case 2:
			return "Twenty";
		case 3:
			return "Thirty";
		case 4:
			return "Forty";
		case 5:
			return "Fifty";
		case 6:
			return "Sixty";
		case 7:
			return "Seventy";
		case 8:
			return "Eighty";
		case 9:
			return "Ninty";
		}
		return "";
	}
	
}
