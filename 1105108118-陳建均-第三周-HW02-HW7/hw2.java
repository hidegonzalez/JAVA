import java.io.*;
 public class hw2{
     public static void main (String[]args)throws IOException{
         BufferedReader buf;
         int mooncake,price,cash;
         buf=new BufferedReader(new InputStreamReader(System.in));
         System.out.print("���ƶq:");
	 mooncake= Integer.parseInt(buf.readLine());
         System.out.print("�����:");
	 price= Integer.parseInt(buf.readLine());
         System.out.print("�I�ڪ��B:");
         cash= Integer.parseInt(buf.readLine());
         if(mooncake*price<=cash)
         {
             System.out.println("��I���B:"+cash);
             System.out.println("���I���B:"+mooncake*price);
             System.out.println("��s���B:"+(cash-mooncake*price));
         }
         else
             System.out.print("�I�ڪ��B����:");

     }
 }