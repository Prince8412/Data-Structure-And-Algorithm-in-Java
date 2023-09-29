import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        int rem;
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();

        int i=2;
        while(i<n){
            rem=n%i;
            if(rem==0){
                System.out.print(i+" ");
            }
           i=i+1;
        }
    }
}