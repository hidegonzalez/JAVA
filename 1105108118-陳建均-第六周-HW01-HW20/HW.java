import java.io.*;

public class HW {
	public static void main(String[] args) throws IOException 
	{
		String str;
		int array[];
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		int a=0,b=0,c=0,d=99,e=0;
		System.out.print("�п�J�ǥͤH�ơG");
		str = buf.readLine();
		System.out.println("");
		array = new int[Integer.parseInt(str)];
		e=Integer.parseInt(str);
		for(int i=0; i<array.length; i++)
		{
			System.out.print("�п�J��" + (i+1) + "�ǥͦ��Z");
			str = buf.readLine();
			System.out.println("");
			array[i] = Integer.parseInt(str);
		}
		
		for(int i=0; i<array.length; i++)
		{ 
			if(array[i]>=60){
			a++;
			}
			else b++;
			if(array[i]>=c){
			c=array[i];
			}
			if(array[i]<=d){
			d=array[i];
			}
		}
		System.out.print("�@"+e+"��ǥ͡A");
		System.out.print(a+"�H�ή�A");
		System.out.print(b+"�H���ή�A");
		System.out.print("�̰�����"+c+"�A");
		System.out.print("�̧C����"+d);
	}
	
}