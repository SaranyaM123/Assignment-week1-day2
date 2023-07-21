package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int num = 34343;
		int reverse = 0;
		for (int i = num; i>0; i=i/10) {
			reverse=(reverse*10)+(i%10); 
				
			}
		if (num==reverse) {
			System.out.println("The given number is a palindrome" +num);
			}
		else {
			System.out.println("The given number is not a palindrome" +num);
		}
	}
}
