import java.io.*;
 public class hw2{
     public static void main (String[]args)throws IOException{
         BufferedReader buf;
         int mooncake,price,cash;
         buf=new BufferedReader(new InputStreamReader(System.in));
         System.out.print("月餅數量:");
	 mooncake= Integer.parseInt(buf.readLine());
         System.out.print("月餅單價:");
	 price= Integer.parseInt(buf.readLine());
         System.out.print("付款金額:");
         cash= Integer.parseInt(buf.readLine());
         if(mooncake*price<=cash)
         {
             System.out.println("實付金額:"+cash);
             System.out.println("應付金額:"+mooncake*price);
             System.out.println("找零金額:"+(cash-mooncake*price));
         }
         else
             System.out.print("付款金額不足:");

     }
 }