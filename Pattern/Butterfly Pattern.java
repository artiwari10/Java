// ButterFly Pattern
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
	   
	    Scanner in = new Scanner(System.in);
	    int n=in.nextInt();
	    for(int i=1;i<=n;i++) {
	       
	       for(int j=1;j<=i;j++) {
	            System.out.print("*");
	        }
	        for(int j=1;j<=((2*n)-(2*i));j++) {
	            System.out.print(" ");
	        }
	        for(int j=1;j<=i;j++) {
	            System.out.print("*");
	        }
	       
	        System.out.println();
	    }
	    
	     for(int i=n;i>=1;i--) {
	       for(int j=1;j<=i;j++) {
	            System.out.print("*");
	        }
	        for(int j=1;j<=((2*n)-(2*i));j++) {
	            System.out.print(" ");
	        }
	        for(int j=1;j<=i;j++) {
	            System.out.print("*");
	        }
	      
	        System.out.println();
	    }
	    
	}
}
