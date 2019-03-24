import java.io.*;

public class HWW {
		public static void main(String[] args) throws IOException 
	{
		String str;
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("請輸入項數：");
		str = buf.readLine();
		System.out.println(  fac(Integer.parseInt(str)));
	}
	
	public static int fac(int n)
	{
		int a[]=new int [100];
		a[0]=5;
		int b=1;
		while(b<=n){
		if(b <2)
		{
			a [b]=a[b-1];
			b++;
		}
		else
		{
			 a[b]=a[b-1]+a[b-2];
			b++;
		}
		}
		return a[n];
	}
}