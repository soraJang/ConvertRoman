package main;

public class ConvertRoman {

	public String convertRoman(int num) {
		return convertDigit(num / 10, num % 10);
	}

	private String convertDigit(int t, int o) {
		String str = "";
		if (t == 0) {
		} else if (t == 1) {
			str = "X";
		} else if (t == 2) {
			str = "XX";
		} else if (t == 3) {
			str = "XXX";
		} else if (t == 4) {
			str = "XL";
		} else if (t == 5) {
			str = "L";
		} else if (t == 6) {
			str = "LX";
		} else if (t == 7) {
			str = "LXX";
		} else if (t == 8) {
			str = "LXXX";
		} else if (t == 9) {
			str = "XC";
		} else if (t == 10) {
			str = "C";
		}
		str += temp(o);
		return str;
	}

	private String temp(int o) {
		String str = "";

		if (1 <= o && o < 4) {
			for (int i = 1; i <= o; i++) {
				str += "I";
			}
		} else if (o == 4) {
			str += "I" + "V";
		} else if (o == 5) {
			str += "V";
		} else if (6 <= o && o < 9) {
			str += "V";
			for (int i = 6; i <= o; i++) {
				str += "I";
			}
		} else if (o == 9) {
			str += "I" + "X";
		}
		return str;
	}
}
