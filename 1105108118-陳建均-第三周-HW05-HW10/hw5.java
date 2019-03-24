import java.io.*;
 public class hw5{
     public static void main (String[] args)throws IOException{
         BufferedReader buf;
         int a,str,str1,str2,str3;
         buf=new BufferedReader(new InputStreamReader(System.in));
         System.out.print("秒數:");
         str= Integer.parseInt(buf.readLine());
	 a=str/86400;
	 str1=str/60;
	 str2=str/3600;
	if(str<60||str%60!=0)
	{
	 if(str<60)
	{
	 System.out.println(str+"秒");   
	}
	 System.out.println(str%60+"秒");
	}
	 if(str1<60||str1%60!=0)
	{
	 if(str1<60)
	{
	 System.out.println(str1+"分");
	}
	 System.out.println(str1%60+"分");   
 	}
	
	if(str2<24||str2%24!=0)
	 {
	if(str2<24)
	 {
	 System.out.println(str2+"小時"); 
	 }
	 System.out.println(str2%24+"小時");
	 }
	 if(a>=1)
	 System.out.println(a+"天");

     }
 }