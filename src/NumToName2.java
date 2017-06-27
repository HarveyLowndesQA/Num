
public class NumToName2 {

	public static String[] numbers = new String[]{"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
	public static String[] teens = new String[]{"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
	
	public static void main(String[] args) {
		int number = 100;
		teens(11);
		System.out.println(hundreds(number) + " " + tens(number) + teens(number) + " " + ones(number));
	}
	
	public static String ones(int a) {
		int ta = a % 10;
		if(ta < 11 && ta > 0) {
			return numbers[ta -1];
		}
		return "";
	}
	
	public static String tens(int a) {
		int ta = (a % 100) / 10;
		if(ta > 1) {
			return numbers[ta - 1] + "ty";
		}
		return "";
	}
	
	public static String teens(int a) {
		int ta = (a % 100);
		if(ta > 10 && ta < 20) {
			return teens[(ta / 10) - 1];
		}
		return "";
	}
	
	public static String hundreds(int a) {
		int ha = a / 100;
		if(ha > 0) {
			return numbers[ha - 1] + " hundred";
		}
		return "";
	}
}
