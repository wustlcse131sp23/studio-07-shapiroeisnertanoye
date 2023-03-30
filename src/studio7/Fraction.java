package studio7;

public class Fraction {

	private int num;
	private int denom;
	private double frac;

	public static int gcd(int a, int b) {
		if (a % b == 0) {
			return b;
		} else {
			return gcd(b, a % b);
		}
	}

	public Fraction(int numerator, int denominator) {
		this.num = numerator;
		this.denom = denominator;
		this.frac = (double) num / denom;
	}

	public static Fraction addFrac(Fraction frac1, Fraction frac2) {
		int newNum = (frac1.num * frac2.denom + frac2.num * frac1.denom) / gcd(frac1.denom, frac2.denom);
		int newDenom = frac1.denom * frac2.denom / gcd(frac1.denom, frac2.denom);
		Fraction sum = new Fraction(newNum, newDenom);
		return sum;
	}
}
