public class Swap {
	
	public static void main(String[] args) {
	int a=20, b=10;
	System.out.println("Before Swapping a="+a+" b="+b);
	a=a+b;   //30
	b=a-b;   //20
	a=a-b;
	System.out.println("After Swapping a="+a+" b="+b);
	}
}