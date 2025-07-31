import java.util.Scanner;
public class odd_and_even {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array:");
		int size = sc.nextInt();
		int[] Original_array = new int[size];
		System.out.print("Enter the numbers:");
		for(int i =0;i<size;i++) {
			Original_array[i] = sc.nextInt();
		}
		int even_sum = 0;
		int odd_sum = 0;
		for(int i= 0;i<size;i++) {
			if (Original_array[i] % 2==0) {
				even_sum+=Original_array[i];
			}
			else {
				odd_sum += Original_array[i];
			}	
		}
		System.out.println("Even:"+even_sum);
		System.out.println("Odd:"+odd_sum);
	}
}