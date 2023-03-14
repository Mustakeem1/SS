import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter row size");
		
		int row=sc.nextInt();
		System.out.println("Enter colomn3"
				+ " size");
		
		int colomn=sc.nextInt();
		int two [][]=new int[row][colomn];
			System.out.println("Enter the Elements of array");
			
				for(int i=0; i<row; i++) {
					for(int j=0; j<colomn; j++) {
						two[i][j]=sc.nextInt();
					}
				}
				System.out.println("Entered the Elements of array Are");
				for(int i=0; i<row; i++) {
					for(int j=0; j<colomn; j++) {
						System.out.println(two[i][j]);
					}
				}
			}
	

	}


