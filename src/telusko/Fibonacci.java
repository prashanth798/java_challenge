package telusko;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int pos = 8;
		int result = fib(pos);
	
		System.out.println(result);
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

}
