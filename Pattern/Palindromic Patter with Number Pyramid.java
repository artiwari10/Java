// Palindromic Patter with Number
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
	   
	    Scanner in = new Scanner(System.in);
	    int n=in.nextInt();
        for(int i=1;i<=n;i++) {
            for(int j=i;j<=n-1;j++) {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--) {
                System.out.print(j);
            }
            for(int j=2;j<=i;j++) {
                System.out.print(j);
            }
            System.out.println();
            
        }
	    
	}	    
}