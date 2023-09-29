// Code : Reverse Number Pattern
// Send Feedback
// Print the following pattern for the given N number of rows.
// Pattern for N = 4
// 1
// 21
// 321
// 4321
// Input format :
// Integer N (Total no. of rows)
// Output format :
// Pattern in N lines
// Constraints
// 0 <= N <= 50
// Sample Input 1:
// 5
// Sample Output 1:
// 1
// 21
// 321
// 4321
// 54321
// Sample Input 2:
// 6
// Sample Output 2:
// 1
// 21
// 321
// 4321
// 54321
// 654321


import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		int i=1;
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		while(i<=n){
		    int counter = i;
			int j=1;
			while (j<=i) {
				System.out.print(counter);
				j++;
				counter--;
			}
			System.out.println();
			i++;
		}

		
	}

}


