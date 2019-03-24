import java.io.*;
 public class hw3{
     public static void main (String[] args)throws IOException{
         BufferedReader buf;
         int month,date;
         buf=new BufferedReader(new InputStreamReader(System.in));
         System.out.print("¿é¤J¤ë¥÷:");
         month= Integer.parseInt(buf.readLine());
	 System.out.print("¿é¤J¤é´Á:");
         date= Integer.parseInt(buf.readLine());
	 System.out.print("§Aªº¬P®y¬°:");
	 if(month<13||date<31)
     {
        
         switch(month){
         case 1:
                if(date>=21&&date<31)
                {
                    System.out.print("¤ô²~®y");
                }
                else if(date<21)
		        {
		            System.out.print("Å]½~®y");
		        }
		        else System.out.print("¿ù»~");
                break;
         case 2:
                if(date>=19&&date<=30)
                {
                    System.out.print("Âù³½®y");
                }
                else if (date<19)System.out.print("¤ô²~®y");
                else System.out.print("¿ù»~");
                break;
         case 3:
                if(date>=21&&date<=31)
                {
                    System.out.print("¥Õ¦Ï®y");
                }
                else if (date<21)System.out.print("Âù³½®y");
                else System.out.print("¿ù»~");
                break;
        case 4:
                if(date>=21&&date<=30)
                {
                    System.out.print("ª÷¤û®y");
                }
                else if (date<21)System.out.print("¥Õ¦Ï®y");
                else System.out.print("¿ù»~");
                break;
        case 5:
                if(date>=22&&date<=31)
                {
                    System.out.print("Âù¤l®y");
                }
                else if (date<22)System.out.print("ª÷¤û®y");
                else System.out.print("¿ù»~");
                break;
        case 6:
                if(date>=22)
                {
                    System.out.print("¥¨ÃÉ®y");
                }
                else if (date<22)System.out.print("Âù¤l®y");
                else System.out.print("¿ù»~");
                break;
        case 7:
                if(date>=23&&date<=31)
                {
                    System.out.print("·à¤l®y");
                }
                else if (date<23)System.out.print("Âù¤l®y");
                else System.out.print("¿ù»~");
                break;
        case 8:
                if(date>=23&&date<=31)
                {
                    System.out.print("³B¤k®y");
                }
                else if (date<23)System.out.print("·à¤l®y");
                else System.out.print("¿ù»~");
                break;
        case 9:
                if(date>=23&&date<=30)
                {
                    System.out.print("¤Ñ¯¯®y");
                }
                else if (date<23)System.out.print("·à¤l®y");
                else System.out.print("¿ù»~");
                break;
        case 10:
                if(date>=24&&date<=31)
                {
                    System.out.print("¤ÑÃÈ®y");
                }
                else if (date<24)System.out.print("¤Ñ¯¯®y");
                else System.out.print("¿ù»~");
                break;
        case 11:
                if(date>=22&&date<=30)
                {
                    System.out.print("®g¤â®y");
                }
                else if (date<22)System.out.print("¤ÑÃÈ®y");
                else System.out.print("¿ù»~");
                break;
        case 12:
                if(date>=21&&date<=31)
                {
                    System.out.print("Å]½~®y");
                }
                else if (date<21)System.out.print("®g¤â®y");
                else System.out.print("¿ù»~");
                break;
                                               
        }
    }
    else System.out.print("¿ù»~");
    }
}