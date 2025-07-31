import java.util.Scanner;
public class indices {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array:");
		int size = sc.nextInt();
		int[] Array_numbers = new int[size];
		System.out.println("Enter the numbers:");
		for(int i=0;i<Array_numbers.length;i++) {
			Array_numbers[i] = sc.nextInt();
		}
		System.out.print("target:");
		int target = sc.nextInt();
		for(int i=0;i<Array_numbers.length;i++) {
			for(int j=1;j<Array_numbers.length;j++) {
				if(Array_numbers[i]+Array_numbers[j]==target) {
					System.out.println("The indices are "+i+","+j);
					System.out.print("Because nums["+i+"]"+"+"+"numbs["+j+"]"+"="+Array_numbers[i]+"+"+Array_numbers[j]+"="+target);
				}
			}
			
		}

	}

}
