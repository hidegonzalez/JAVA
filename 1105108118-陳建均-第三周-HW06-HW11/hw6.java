import java.io.*;
 public class hw6{
     public static void main (String[] args)throws IOException{
         BufferedReader buf;
         int str;
         buf=new BufferedReader(new InputStreamReader(System.in));
         System.out.print("請輸入多益成績:");
         str= Integer.parseInt(buf.readLine());
	if(str>=10&&str<=990)
	{
	   if(str>=10&&str<=215)
	   {
	 	System.out.println("證照顏色:橘色");   
	   }
	   if(str>=220&&str<=465)
	   {
		System.out.println("證照顏色:棕色");
	   }
	   if(str>=470&&str<=725)
	   {
		System.out.println("證照顏色:綠色");
	   }
	   if(str>=730&&str<=855)
	   {
		System.out.println("證照顏色:藍色");
	   }
	   if(str>=860&&str<=990)
	   {
		System.out.println("證照顏色:金色");
	   }
       }
	else System.out.println("格式錯誤");	
 }
}