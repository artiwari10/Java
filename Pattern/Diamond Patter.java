// Diamond Pattern
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
	   
	    Scanner in = new Scanner(System.in);
	    int n=in.nextInt();
	    int star=1;
	    for(int i=1;i<=n;i++) {
	      for(int j=i;j<=n;j++) {
	          System.out.print(" ");
	      }
	      for(int j=1;j<=star;j++) 
	        System.out.print("*");
	    
	    star+=2;
	    System.out.println();
	  }
	  star-=2;
	  for(int i=1;i<=n;i++) {
	      for(int j=1;j<=i;j++) {
	          System.out.print(" ");
	      }
	      for(int j=1;j<=star;j++) {
	          System.out.print("*");
	      }
	      star-=2;
	      System.out.println();
	  }
}
}