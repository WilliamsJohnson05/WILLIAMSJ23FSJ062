package javaLabCard1;

public class LargestNumber {
	public static void main(String[] args) {
		double n1 = 16, n2 = 5, n3 = 23;
		
		if(n1 >= n2 && n1 >= n3)
			System.out.println(n1 + "is the Largest Number.");
		else if (n2 >= n1 && n2 >= n3)
			System.out.println(n2 + "is the Largest Number.");
		else 
			System.out.println(n3 + "is the Largest Number.");
	}

}
