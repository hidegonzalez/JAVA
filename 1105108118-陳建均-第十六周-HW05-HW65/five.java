import java.io.*;
import java.util.*;
 public class five{
     public static void main (String[] args)throws IOException{
         BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
         int num=0;
         int cont=0;
         int aa=1;
         int qwer;
         int asd=1;
         int abc=1;
         String select;
         System.out.print("num");
		 //num =Integer.parseInt(buf.readLine());
         String a[];
         int b[];
         String c[];
         String d[];
          a=new String[num];
            b=new int[num];
            c=new String[num];
            d=new String[num];
         while(aa==1){
         try{
             System.out.print("num");
            num =Integer.parseInt(buf.readLine());
             a=new String[num];
            b=new int[num];
            c=new String[num];
            d=new String[num];
            aa=0;
         }
         catch(NegativeArraySizeException e){
            // e.printStackTrace();
             System.out.println("error type");
         }
         }
         aa=1;
         while(aa==1){
         try{
             for(;cont<num;cont++){
             System.out.print("name");
		    a[cont]=buf.readLine();
            System.out.print("year");
		    b[cont]=Integer.parseInt(buf.readLine());
            System.out.print("sex");
		    c[cont]=buf.readLine();
             System.out.print("department");
		    d[cont]=buf.readLine();
         }
         aa=0;         
         }
         
         catch(NumberFormatException e){
            // e.printStackTrace();
             System.out.println("error year");
         }
         finally{
             System.out.println("");
         }}
         aa=1;
         cont=0;
        while(aa==1){
            System.out.print("select");
		    select=buf.readLine();
            switch(select){
                case "a":
                    for(cont=0;cont<num;cont++){
                        System.out.println("name"+a[cont]);
                        System.out.println("year"+b[cont]);
                        System.out.println("sex"+c[cont]);
                        System.out.println("department"+d[cont]);
                        
                    }break;
                case "b":
                    while(asd==1){
                        try{
                            System.out.print("selection");
		                    qwer=Integer.parseInt(buf.readLine());
                             System.out.println("name"+a[qwer]);
                            System.out.println("year"+b[qwer]);
                            System.out.println("sex"+c[qwer]);
                            System.out.println("department"+d[qwer]);
                            asd=0;
                            }
                    catch(NumberFormatException e){
                        //e.printStackTrace();
                         System.out.println("error type");
                             }
                    catch(ArrayIndexOutOfBoundsException e){
                        System.out.println("out of range");
                    }}asd=1;break;
                case "c":
                    while(abc==1){
                     try{
                            System.out.print("selection");
		                    qwer=Integer.parseInt(buf.readLine());
                            System.out.print("name");
		                    a[qwer]=buf.readLine();
                            System.out.print("year");
		                    b[qwer]=Integer.parseInt(buf.readLine());
                            System.out.print("sex");
		                    c[qwer]=buf.readLine();
                            System.out.print("department");
		                    d[qwer]=buf.readLine();
                            abc=0;
                            }
                    catch(ArrayIndexOutOfBoundsException e){
                        System.out.println("out of range");}}
                        abc=1;break;
                case "d":
                    aa=0;
                    break;
                default: System.out.println("error");
            }
        }
     }
 }