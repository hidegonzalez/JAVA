import java.io.*;
import java.util.*;
 public class t{
     public static void main (String[] args)throws IOException{
         BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
         int high=0;
         int weight=0;
         double BMI;
         int a=1;
         while(a==1){
         try{
         System.out.print("high  meter");
		 high =Integer.parseInt(buf.readLine());
         System.out.print("weight  kilogram");
		 weight =Integer.parseInt(buf.readLine());
         BMI=weight/(high*high);
         System.out.println(BMI);
         a=0;
         }
         catch(NumberFormatException e){
             System.out.println("error type");
         }
         catch(ArithmeticException  e){
             System.out.println("error divide type ");
         }
         finally{
             System.out.println("");
         }}
     }
 }