import java.util.Scanner;
import java.util.Random;

public class Cipher {

	public static void main(String[] args) 
	{

	int one,second,third,fourth,fifth,first, last, total = 0;
	
	
	
	System.out.println("Programming Fundamentals");
	System.out.println("Name: Tera Smith");
	System.out.println("PROGRAMMING ASSIGNMENT 1");
	
	System.out.println("Welcome to the Cipher program.");
	
	
	Scanner scann = new Scanner (System.in);
	System.out.println("Please enter 5 numbers between 0 and 19");
	
	//enter numbers
	System.out.println("1st number: ");
	one = scann.nextInt();
	System.out.println("2nd number: ");
	second = scann.nextInt();
	
	System.out.println("3rd number: ");
	third=scann.nextInt();
	
	System.out.println("4th number: ");
	fourth=scann.nextInt();
	
	System.out.println("5th number: ");
	fifth=scann.nextInt();
	
	
	//adding numbers to get total
	total = one+second+third+fourth+fifth;
	
	System.out.println("Total = " +total);
	
	//key creation
	
	Random random = new Random();
	int rand = random.nextInt(10);
	
	System.out.println("Your random key is " +rand);
	
	//separating digits "total"
	
	first = total/10;
	last = total%10;
	
	//encrypting
	
	first = first + rand;
	last = last + rand;
	first = first%10;
	last = last%10;
	
	
	System.out.println("Your encoded number is " +first+last);
	
	

	}

}
