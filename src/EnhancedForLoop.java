import java.util.ArrayList;
import java.util.Scanner;

//enhave for loop for loop for integer
public class EnhancedForLoop {
public static void main(String[] args) {
	/*int arr []= {2,3,4,7,11,13,17,19,23,29};
	for(int t:arr) {
		System.out.println(t);
	}
	*/

//Enhanced for loop for string
/*String languages[]= {"java","python","Ruby"};
for(String t:languages) {
	System.out.println(t);
}
*/
/*//How to get prime number form the given range
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the number from which you wants to prime number");
	int p1=in.nextInt();
	System.out.println("Enter the number");
	int p2=in.nextInt();
	ArrayList<&It;
	>*/
	
	//Prgrsm for sum of n numbers
	Scanner input=new Scanner(System.in);
	System.out.println("Enter value of n:");
	int n=input.nextInt();
	long sum=0;
	for(int i=1;i<=n;i++) {
		sum+=i;
		
	}System.out.println("Sum of numbers from 1 to" +n +sum);
	
}
}