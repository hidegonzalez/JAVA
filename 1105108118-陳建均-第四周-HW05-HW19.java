import java.io.*;
 public class hw5{
     public static void main (String[] args)throws IOException{
         BufferedReader buf;
         int num,numm;
         char yn;
         buf=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("人數");
         num= Integer.parseInt(buf.readLine());
         do{
             numm=(int)( Math.random() * num )+1;
             System.out.println("是否繼續");
             yn=(buf.readLine());
         }while(yn=='y');
        
    }
}