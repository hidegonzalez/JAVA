import java.io.*;

public class HHHWW {
		public static void main(String[] args) throws IOException 
	{
		String str;
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("請輸入學生數：");
		str = buf.readLine();
		input_data(Integer.parseInt(str));
	}
	
	public static int input_data(int n)throws IOException 
	{
		String arr[]=new String[100];
		int arra[]=new int[100];
		String str;
		String strr;
		int a=0,b=0,c=0,d;
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		
		while(a<n){
		System.out.println("請輸入學生名稱:：");
		str = buf.readLine();
		System.out.println("");
		System.out.print("輸入總平均分數:：");
		strr = buf.readLine();
		d=Integer.parseInt(strr);
		System.out.println("");
		if(d<0||d>100){
		System.out.print("輸入格式錯誤，請重新輸入");
		System.out.println("");
		c++;}
		else{
			arr[a]=str;
			arra[a]=Integer.parseInt(strr);
			a++;
			c++;
			System.out.print("是否繼續輸入成績");
			str = buf.readLine();
			if(str.equals("n")){break;}
		}
		}
		System.out.print("學生名稱    總平均");
		while(b<a){ show(arr[b],arra[b]);
			   b++;}
		System.out.print("總共輸入"+c+"筆");
		return 0;
	}
	public static String show (String a, int b){
		System.out.println("");
		System.out.print(a+"        "+b);
		System.out.println("");
		return "A";}}
