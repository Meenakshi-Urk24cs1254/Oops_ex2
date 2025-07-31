import java.util.Scanner;
public class Number_found {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enetr the size of array:");
		int size = sc.nextInt();
		int[] Array_numbers = new int[size];
		System.out.print("Enter the numbers:");
		for(int i =0;i<size;i++) {
			Array_numbers[i] = sc.nextInt();
		}
		System.out.print("Enter the number to searched:");
		int search_number = sc.nextInt();
		int count_number =0;
		for(int i =0;i<Array_numbers.length;i++) {
			if(search_number == Array_numbers[i]) {
				count_number += 1;
			}
		}
		System.out.println("Number Found "+count_number+" times");
	}
}
