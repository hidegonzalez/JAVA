import java.io.*;
import java.util.*;
public class HH {
	public static void main(String[] args)throws IOException{
		String a;
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�п�J�n�d�ߪ������G");
		a=buf.readLine();
		if(a.equals("�ª��s")){TimeZone.setDefault(TimeZone.getTimeZone("GMT-8"));Date date = new Date();System.out.println(date);}
		else if(a.equals("�۴�")){TimeZone.setDefault(TimeZone.getTimeZone("GMT"));Date date1 = new Date();System.out.println(date1);}
		else if(a.equals("�ھ�")){TimeZone.setDefault(TimeZone.getTimeZone("GMT+1"));Date date2 = new Date();System.out.println(date2);}
		else if(a.equals("�Ҩ�")){TimeZone.setDefault(TimeZone.getTimeZone("GMT+7"));Date date3 = new Date();System.out.println(date3);}
		else if(a.equals("�x�W")){TimeZone.setDefault(TimeZone.getTimeZone("GMT+8"));Date date4 = new Date();System.out.println(date4);}
		else if(a.equals("�F��")){TimeZone.setDefault(TimeZone.getTimeZone("GMT+9"));Date date5 = new Date();System.out.println(date5);}
		else if(a.equals("����")){TimeZone.setDefault(TimeZone.getTimeZone("GMT+11"));Date date6 = new Date();System.out.println(date6);}
}
}