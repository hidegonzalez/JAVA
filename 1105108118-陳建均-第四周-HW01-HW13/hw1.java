import java.io.*;
 public class hw1{
     public static void main (String[] args)throws IOException{
         BufferedReader buf;
         int min,max,base;
         buf=new BufferedReader(new InputStreamReader(System.in));
         System.out.print("輸入範圍最小值:");
         min= Integer.parseInt(buf.readLine());
	 System.out.print("輸入範圍最大值:");
         max= Integer.parseInt(buf.readLine());
         System.out.print("輸入基值:");
         base= Integer.parseInt(buf.readLine());
	 System.out.print(base+"的倍數為");
         while(min<=max)
        {
          if(min%base==0)
          {
            System.out.print(" "+min);
          }
          min++;
        }
    }
}