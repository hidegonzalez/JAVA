import java.io.*;
import java.util.*;
 public class s{
     public static void main (String[] args)throws IOException{
         BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
         int num,cont=0;
         int aa=1;
         String str;
         System.out.print("num");
		 //num =Integer.parseInt(buf.readLine());
         String a[];
         int b[];
         String c[];
         //String d[];
         while(aa==1){
         try{
             System.out.print("num");
             num =Integer.parseInt(buf.readLine());
            a=new String[num];
            b=new int[num];
            c=new String[num];
         for(;cont<=num;cont++){
             System.out.print("name");
		    a[cont]=buf.readLine();
            System.out.print("year");
		    b[cont]=Integer.parseInt(buf.readLine());
            System.out.print("sex");
		    c[cont]=buf.readLine();
         }
            aa=0;
         }
         catch(NegativeArraySizeException e){
            // e.printStackTrace();
             System.out.println("error type");
         }
         catch(NumberFormatException e){
             e.printStackTrace();
             System.out.println("error year");
         }
         finally{
             System.out.println("");
         }}
     }
 }