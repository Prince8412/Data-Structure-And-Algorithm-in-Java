// Code : Diamond of stars
// Send Feedback
// Print the following pattern for the given number of rows.
// Note: N is always odd.


// Pattern for N = 5



// The dots represent spaces.



// Input format :
// N (Total no. of rows and can only be odd)
// Output format :
// Pattern in N lines
// Constraints :
// 1 <= N <= 49
// Sample Input 1:
// 5
// Sample Output 1:
//   *
//  ***
// *****
//  ***
//   *
// Sample Input 2:
// 3
// Sample Output 2:
//   *
//  ***
//   *

// Java (SE 1.8)
// 12345678910111213141516171819202122
// import java.util.Scanner;
// public class Solution {
    
//     public static void main(String[] args) {
        
//         Scanner s = new Scanner(System.in);
// 		// int i = 1;
// 		int n = s.nextInt();
		
// 		// while(i<=n) {
    import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
		// int i = 1;
		int n = s.nextInt();
		
		// while(i<=n) {
		// 	int spaces = 1;
		// 	while(spaces<=n-i){
		// 		System.out.print(" ");
		// 		spaces++;
		// 	}
		// 	int j = 1;
		// 	int p = 1;
		// 	while(j<=i) {
		// 		System.out.print("*");
		// 		p++;
		// 		j++;
		// 	}
        //    int j = 1;
		//    while()
		// 	p = i-1;
		// 	j=1;
		// 	while(j<=i-1) {
		// 		System.out.print("*");
		// 		p--;
		// 		j++;
		// 	}
		// 	System.out.println();
		// 	i++;
		// }

    // int n = 7;  // Number of rows.
 
      n= n/2 + 1;
      int i=0;
      //We first print Pyramid Pattern
      for(i=0;i<n;i++)
      {
          for(int k=i;k<n-1;k++)
          System.out.print(" ");
 
          // We run loop till j = 2*i to print odd no. of stars.
          for(int j=0;j<=2*i;j++)
          {
            // We print '*' for each row.
            System.out.print("*");
          }
 
          System.out.println();
      }
 
      n=i;  // i=n-1 so copy its value to n.
 
      // We then print Inverted Pyramid Traingle.
      for(i=n-1;i>0;i--)
      {
          // We need to print one space for first row.
          for(int k=i;k<n;k++)
          System.out.print(" ");
 
          // We run loop from j = 2*i to 2 print odd no. of stars.
          for(int j=2*i;j>1;j--)
          {
            // We print '*' for each row.
            System.out.print("*");
          }
 
          System.out.println();
      }

    
    }
}