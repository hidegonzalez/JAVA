import java.io.*;

public class HW {
	public static void main(String[] args) throws IOException 
	{
		String str;
		int array[];
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		int a=0,b=0,c=0,d=99,e=0;
		System.out.print("請輸入學生人數：");
		str = buf.readLine();
		System.out.println("");
		array = new int[Integer.parseInt(str)];
		e=Integer.parseInt(str);
		for(int i=0; i<array.length; i++)
		{
			System.out.print("請輸入第" + (i+1) + "學生成績");
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
		System.out.print("共"+e+"位學生，");
		System.out.print(a+"人及格，");
		System.out.print(b+"人不及格，");
		System.out.print("最高分為"+c+"，");
		System.out.print("最低分為"+d);
	}
	
}