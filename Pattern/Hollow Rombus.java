//Hollow Rombus
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		for(int i=1;i<=n;i++) {
		    // For Spaces
		    for(int j=i;j<=n;j++) {
	        System.out.print(" ");	        
    		}
    		for(int j=1;j<=n;j++) {
    		    if(i==1 || j==1 || i==n || j==n) {
    		        System.out.print("#");
    		    }
    		    else {
    		        System.out.print(" ");
    		    }
    		}
		    
		    
		    System.out.println();
		}
	    
	}
}
