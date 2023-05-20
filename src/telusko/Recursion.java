/**
 * 
 */
package telusko;

/**
 * @author user
 *
 */
public class Recursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 5;
		int result =0;
		int result1 =0;
		
		result = fact(num);
		result1 = factorial(num);

		System.out.println(result);
		System.out.println(result1);

	}
	
	public static int fact (int num) {
		int value =1;
		for(int i=1; i<=num ; i++) {
			value = value*i;
		}
		return value;
	}
	//Using recursion
	public static int factorial (int num) {
		if(num ==0)
			return 1;
		return num * factorial(num - 1);
	}

}
