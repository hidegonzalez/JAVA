import java.io.*;
 public class hw6{
     public static void main (String[] args)throws IOException{
         BufferedReader buf;
         int str;
         buf=new BufferedReader(new InputStreamReader(System.in));
         System.out.print("�п�J�h�q���Z:");
         str= Integer.parseInt(buf.readLine());
	if(str>=10&&str<=990)
	{
	   if(str>=10&&str<=215)
	   {
	 	System.out.println("�ҷ��C��:���");   
	   }
	   if(str>=220&&str<=465)
	   {
		System.out.println("�ҷ��C��:�Ħ�");
	   }
	   if(str>=470&&str<=725)
	   {
		System.out.println("�ҷ��C��:���");
	   }
	   if(str>=730&&str<=855)
	   {
		System.out.println("�ҷ��C��:�Ŧ�");
	   }
	   if(str>=860&&str<=990)
	   {
		System.out.println("�ҷ��C��:����");
	   }
       }
	else System.out.println("�榡���~");	
 }
}