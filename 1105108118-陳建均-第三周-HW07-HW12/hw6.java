import java.io.*;
 public class hw6{
     public static void main (String[] args)throws IOException{
         BufferedReader buf;
         int attack,damage;
	 double buff;
         buf=new BufferedReader(new InputStreamReader(System.in));
         System.out.print("��J������:");
         attack= Integer.parseInt(buf.readLine());
	 System.out.print("��J�W�q��:");
         buff= Double.parseDouble(buf.readLine());
	 damage=(int)(attack*buff);
	   if(attack>0&&buff>0)
	   {
	      System.out.println("�W�q�y���ˮ`��:"+damage);
	      if(damage==2147483647&&attack!=1&&buff!=1)
	      {
		System.out.println("�W�q�B�⵲�G:overflow");
	      }
	      else if(damage==0)
	      {
		System.out.println("�W�q�B�⵲�G:underflow");
	      } 
	      
		else System.out.println("�W�q�B�⵲�G:�u���`�v");   
	   }
 	 else System.out.println("���~");
 }
}