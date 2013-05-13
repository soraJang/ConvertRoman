package main;

public class ConvertRoman {
	String[] ts = { "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "C" };
	String[] os = { "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X" };

	public String convertRoman(int num) {
		return convertDigit(num / 10, num % 10);
	}

	private String convertDigit(int t, int o) {
		String str = "";

		if (t == 0) {
		} else {
			str += ts[t - 1];
		}
		str += temp(o);
		return str;
	}

	private String temp(int o) {
		String str = "";
		
		if (o == 0) {
		} else {
			str += os[o - 1];
		}
		return str;
	}
}
