package ExampleArray;

public class ArrayEx {
	
	public static void getmarks()
	{
		int a[]= {1,2,3,4,5};
		int b[]=new int[] {2,4,5};
		int c[]=new int[10];
		System.out.println(a[3]);
		int total=0;
		for(int i=0;i<=a.length-1;i++)
		{
			total=total+a[i];
		}
		float avg=total/a.length;
		System.out.println(total);
		System.out.println(avg);
	}

	public static void main(String[] args) {
		getmarks();

	}

}
