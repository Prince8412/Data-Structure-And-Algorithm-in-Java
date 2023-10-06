import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=0;i<=n;i++){
			int product = i*i;
			if(product>n){
				System.out.println(i-1);
				break;
			}
		}
	}
}
