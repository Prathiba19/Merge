# Merge


public class Merge {

	public static void main(String[] args) {
		int a[]={1,2,3,4};
		int b[]={3,4,5,6};
		int j=0;
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b[j])
			{
				sum+=a[i];
				j++;
			}
		}
		System.out.println(sum);

	}

}
