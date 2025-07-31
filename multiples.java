import java.util.Scanner;
public class multiples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size:");
		int size = sc.nextInt();
		int[] Array_numbers = new int[size];
		System.out.println("Enter 10 numbers:");
		for(int i=0;i<Array_numbers.length;i++) {
			Array_numbers[i] = sc.nextInt();
		}
		for(int i=0;i<Array_numbers.length;i++) {
			if(Array_numbers[i]%3==0 && Array_numbers[i]%9==0) {
				System.out.print(Array_numbers[i]+",");
			}
		}
	}

}
