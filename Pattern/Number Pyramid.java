// Number Pyramid
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
            for(int j=1;j<=i;j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }	    
}
}