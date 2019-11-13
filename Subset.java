import java.util.*;
class Subset
{
	 static boolean  sub(int arr1[],int arr2[],int n,int m)
	{
		int j=0;
	
		for(int i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			
				if(arr2[i]==arr1[j])
				return true;
			
			if(j==m)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of first array");

int n=sc.nextInt();
	int arr1[]=new int[n];
	System.out.println("Enter the elements of first array");
	for(int i=0;i<n;i++)
	{
	arr1[i]=sc.nextInt();
	}
		System.out.println("Enter the size of second array");

	int o=sc.nextInt();
int arr2[]=new int[o];
	System.out.println("Enter the elements of second array");
	for(int i=0;i<o;i++)
	{
	arr2[i]=sc.nextInt();
	}
	if(sub(arr1,arr2,n,o))
	{
			System.out.println("arr2 is a subset of arr1");

	}
	else
{
		System.out.println("arr2 is not the subset of arr1");

}	
}
}