package other.main;

public class ConvertRoman {
	String[] decis = { "I", "X", "C", "M" };
	String[] pentas = { "V", "L", "D", "F" };

	public String convertRoman(int num) {
		String roman = "";
		for (int i = 0; i < decis.length && num != 0; i++, num /= 10) {
			roman = convertDigit(num % 10, i) + roman;
		}
		return roman;
	}

	private String convertDigit(int digit, int pos) {
		if (digit < 4) {
			return repeat(decis[pos], digit);
		}
		if (digit == 4) {
			return decis[pos] + pentas[pos];
		}
		if (digit < 9) {
			return pentas[pos] + convertDigit(digit - 5, pos);
		}
		if (digit == 9) {
			return decis[pos] + decis[pos + 1];
		}
		return "";
	}

	private String repeat(String str, int repeatValue) {
		String result = "";
		for (int i = 0; i < repeatValue; i++) {
			result += str;
		}
		return result;
	}
}
