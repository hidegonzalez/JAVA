import java.io.*;
 public class hw6{
     public static void main (String[] args)throws IOException{
         BufferedReader buf;
         int attack,damage;
	 double buff;
         buf=new BufferedReader(new InputStreamReader(System.in));
         System.out.print("輸入攻擊值:");
         attack= Integer.parseInt(buf.readLine());
	 System.out.print("輸入增益值:");
         buff= Double.parseDouble(buf.readLine());
	 damage=(int)(attack*buff);
	   if(attack>0&&buff>0)
	   {
	      System.out.println("增益造成傷害值:"+damage);
	      if(damage==2147483647&&attack!=1&&buff!=1)
	      {
		System.out.println("增益運算結果:overflow");
	      }
	      else if(damage==0)
	      {
		System.out.println("增益運算結果:underflow");
	      } 
	      
		else System.out.println("增益運算結果:「正常」");   
	   }
 	 else System.out.println("錯誤");
 }
}