
public class MyInteger {
	private int value;
	
	public MyInteger() {
		value = 1082;
	}
	
	public MyInteger(int input) {
		if (input <= 2147483647 && input >= -2147483648)
			value = input;
		else 
			System.out.println("Value is not within range of an int");
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int input) {
		value = input;
	}
	
	public boolean isEven() {
		if (value % 2 == 1)
			return false;
		else
			return true;
	}
	
	public boolean isOdd() {
		return !isEven();
	}
	
	public static int add(MyInteger int1, MyInteger int2) {
		return int1.value + int2.value;
	}
	
	@Override
	public String toString() {
		String evenOrOdd = "even";
		if (this.isOdd())
			evenOrOdd = "odd";
		
		return "This integer has an " + evenOrOdd + " value of " + value;
	}
	
	public static void main(String[] args) {
		MyInteger int1 = new MyInteger();
		MyInteger int2 = new MyInteger(2500);
		
		if (int1.isEven()) 
			System.out.println(int1.getValue() + " is an Even number");
		if (int1.isOdd())
			System.out.println(int1.getValue() + " is an Odd number");
		
		System.out.println("Setting Integer Value to 1081");
		int1.setValue(1081);
		System.out.println("Integer Value is now " + int1.getValue());
		System.out.println();
		System.out.println("Integer 1: " + int1);
		System.out.println("Integer 2: " + int2);
		System.out.println("Integer 1 + Integer 2 = " + MyInteger.add(int1, int2));
	}
}
