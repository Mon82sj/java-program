import java.util.*;
class SequentialSearch
{
  public static void main(String args[])
  {
	int search,size,i;
	Scanner s = new Scanner (System.in);
	System.out.println("Enter the size of the array : ");
	size=s.nextInt();
	System.out.println("Enter the array elements : ");
	int[] a = new int[size];
	for (i=0;i<size;i++)
	{
	    a[i]=s.nextInt();
	}
	System.out.println("The Array Elements are :");
	for (i=0;i<size;i++)
	{
	    System.out.println(a[i]);
	}
	
	System.out.println("Enter the Search element in the Entered array : ");
	search=s.nextInt();
	for (i=0;i<size;i++)
	{
	    if(a[i]==search)
	        {
	            System.out.println("Element found at index "+(i+1));
	            break;
	        }
	}
	   if (i==size)
	        {
	            System.out.println("Element not found ");
	            
	        }
	}
}
