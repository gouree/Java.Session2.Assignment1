import java.util.*;
public class XPattern {
	
	public static void main(String args[])
	{
		 
	          	Scanner input= new Scanner(System.in);
	          	int n; 
	          	System.out.println("Enter the number of rows you want   -->");
	          	n= input.nextInt();
	          	int i, j;
	           
	            for (i = 1; i <= n; i++)
	            {
	                for (j = 1; j <= n; j++)
	                {
	                    if (i==j)
	                    {
	                        System.out.print("*");
	                    } 
	                    else if (j == n - (i - 1))
	                    {
	                        System.out.print("*");
	                    } 
	                    else 
	                    {
	                        System.out.print(" ");
	                    }
	                }
	                
	                System.out.println();
	             }
	 }
}
	
