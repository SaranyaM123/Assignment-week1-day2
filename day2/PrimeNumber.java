package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		int a = 13;
		boolean flag = false;
		for (int i = 2; i <= a/2; i++) {
			if(a%i==0 ) {
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("This is a prime number" +a);
		}
			else 
				System.out.println("This is not a prime number" +a);
		}
			
}


