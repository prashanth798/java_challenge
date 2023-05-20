package telusko;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int pos = 8;
		int result = fib(pos);
		int result1 = fib(pos);
		System.out.println(result);
		System.out.println(result1);

	}
	
	public static int fib(int pos) {
		int a = 0, b=1, c=0;
		for(int i=2; i<=pos ;i++) {
			c =a+b;
			a=b;
			b=c;
		}
		return c;
	}

	//Using recursion
	public static int fibonacci(int pos) {
		return fib(pos-1) + fib(pos-2);
	}
}
