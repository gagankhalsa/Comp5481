
public class Arrays {
	public Arrays() {
		int[] a=create(6);
		System.out.println("array created");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		int []a1=arrange(a);
		System.out.println("array arranged");
		for(int i=0;i<a1.length;i++)
		{
			System.out.println(a1[i]);
		}
		char[] chs= {'a','b','c'};
		String s=new String(chs,1,2);
		System.out.println(s);
	}
public static void main(String args[])
{
 new Arrays();
 
}
public static int[] create(int n) {
	int[] a=new int[n];
	for(int i=0;i<a.length;i+=2)
	{
		a[i]=i+1;
		a[i+1]=-a[i];
	}
	return a;
	
}
public static int[] arrange(int[] a) {
	for(int i=0;i<a.length-1;i++) {
		if(a[i]<a[i+1])
		{
			int n;
			n=a[i];
			a[i]=a[i+1];
			a[i+1]=n;
		}
	}
	return a;
	
}


}
