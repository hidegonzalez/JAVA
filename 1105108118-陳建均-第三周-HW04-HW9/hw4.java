import java.io.*;
 public class hw4{
     public static void main (String[] args)throws IOException{
         BufferedReader buf;
         int str,a;
         buf=new BufferedReader(new InputStreamReader(System.in));
         System.out.print("�~��:");
         str= Integer.parseInt(buf.readLine());
	if(str%4==0&&str!=100)
	{
	 System.out.println("�褸"+str+"�O�|�~");   
	}
	 
	else
	 System.out.println("�褸"+str+"���O�|�~");
     }
 }