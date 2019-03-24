import java.io.*;
import java.util.*;
 public class f{
     public static void main (String[] args)throws IOException{
         try{
         BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
         String name,sex;
         int year;
         System.out.print("name");
		 name =buf.readLine();
         System.out.print("year");
		 year =Integer.parseInt(buf.readLine());
         System.out.print("sex");
		 sex =buf.readLine();
         }
         catch(NumberFormatException e){
             e.printStackTrace();
             System.out.println("error type");
         }
         finally{
             System.out.println("");
         }
     }
 }