import java.io.*;
 public class hw2{
     public static void main (String[] args)throws IOException{
         BufferedReader buf;
         int min,max,base;
         buf=new BufferedReader(new InputStreamReader(System.in));
         System.out.print("��J�d��̤p��:");
         min= Integer.parseInt(buf.readLine());
	 System.out.print("��J�d��̤j��:");
         max= Integer.parseInt(buf.readLine());
         System.out.print("��J���:");
         base= Integer.parseInt(buf.readLine());
	 System.out.print(base+"�����Ƭ�");
         for(int count=min;count<=max;count++)
        {
          if(count%base==0)
          {
            System.out.print(" "+count);
          }
        }
    }
}