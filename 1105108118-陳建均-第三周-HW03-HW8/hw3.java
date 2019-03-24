import java.io.*;
 public class hw3{
     public static void main (String[]args){
         int math = 2*3%5+2/3;
         int math1 = 2*3%5+2/3;
         int math2 = 2*3%(5+2)/3;
         int math3 = 2 << 1+3 >> 3;
         boolean bool = false | false == false & true;
         System.out.println("math1 = " + math1);
         System.out.println("math2 = " + math2);
         System.out.println("math3 = " + math3);
         System.out.println("bool = " + bool);

     }
 }