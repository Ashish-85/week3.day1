package week3.day1;

public class Calculator {

	public static void main(String[] args) {

		Calculator cal = new Calculator();
		cal.add(5, 10);

	}

	public int add(int i, int j) {
		return (i + j);

	}

	public int add(int i, int j, int z) {
		return (i + j + z);
	}

	public int multiply(int a, int b) {
		return (a * b);
	}

	public double multiply(int c, double d) {
		return (c * d);
	}

	public int subtract(int e, int f) {
		return (e - f);
	}

	public double subtract(double g, double h) {
		return (g - h);

	}

	public int divide(int k, int l) {
		return (k / l);

	}

	public double divide(double m, double n) {
		return (m / n);
	}

}
