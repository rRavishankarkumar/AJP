package polymorphisum;

class cal{
	public int add(int num1, int num2) {
		
		int sum = num1+num2;
		System.out.println("");
		
		return sum;
	}
	public void add(double num1, double num2) {
		double sum = num2 + num1;
		System.out.println(sum);
		
	}
}
public class Ploimorphism {
	public static void main(String [] args) {
		cal obj = new cal();
		obj.add(12.123, 123.123);
	}
	
}
