import java.io.*;
 public class hw5{
     public static void main (String[] args)throws IOException{
         BufferedReader buf;
         int a,str,str1,str2,str3;
         buf=new BufferedReader(new InputStreamReader(System.in));
         System.out.print("���:");
         str= Integer.parseInt(buf.readLine());
	 a=str/86400;
	 str1=str/60;
	 str2=str/3600;
	if(str<60||str%60!=0)
	{
	 if(str<60)
	{
	 System.out.println(str+"��");   
	}
	 System.out.println(str%60+"��");
	}
	 if(str1<60||str1%60!=0)
	{
	 if(str1<60)
	{
	 System.out.println(str1+"��");
	}
	 System.out.println(str1%60+"��");   
 	}
	
	if(str2<24||str2%24!=0)
	 {
	if(str2<24)
	 {
	 System.out.println(str2+"�p��"); 
	 }
	 System.out.println(str2%24+"�p��");
	 }
	 if(a>=1)
	 System.out.println(a+"��");

     }
 }