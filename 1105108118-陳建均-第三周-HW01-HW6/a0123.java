import java.io.*;
 public class a0123{
     public static void main (String[] args)throws IOException{
         BufferedReader buf;
         String str;
	 String str1;
	 String str2;
	 String str3;
         buf=new BufferedReader(new InputStreamReader(System.in));
         System.out.print("�п�J�A���m�W:");
         str=buf.readLine();
         System.out.print("�п�J�A���ʧO:");
         str1=buf.readLine();
         System.out.print("�п�J�A���褸�X�ͦ~��:");
         str2=buf.readLine();
         System.out.print("�п�J�A���X�ͦa:");
         str3=buf.readLine();
	     System.out.println("�m�W:"+str);
	     System.out.println("�ʧO:"+str1);
	     System.out.println("�X�ͦ~���"+str2);
         System.out.println("�X�ͦa"+str3);

     }
 }