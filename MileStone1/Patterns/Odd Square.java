// Odd Square
// Send Feedback
// Write a program to print the pattern for the given N number of rows.
// For N = 4
// 1357
// 3571
// 5713
// 7135
// Input Format :
// A single integer: N
// Output Format :
// Required Pattern
// Constraints :
// 0 <= N <= 50
// Sample Input 1 :
// 3
// Sample Output 1 :
// 135
// 351
// 513
// Sample Input 2 :
//  5
// Sample Output 2 :
// 13579
// 35791
// 57913
// 79135
// 91357

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		// Scanner s = new Scanner(System.in);
		// int n = s.nextInt();
		// int i = 1;
		// while(i<=n){
		// 	int j=1;
		// 	int sum =1;
		// 	while(j<=n){
		// 		System.out.print(sum);
		// 		j++;
		// 		sum = sum+2;
		// 	}
		// 	System.out.println();
		// 	i++;
		// }

		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++)
        {
            for (int j = i - 1; j < n; j++ )
            {
                System.out.print(j * 2 + 1);
            }
            for(int k = 0; k < i - 1; k++)
            {
                System.out.print(k * 2 + 1);
            }
            System.out.println();
        }
	}
}
