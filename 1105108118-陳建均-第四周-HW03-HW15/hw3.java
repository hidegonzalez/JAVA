import java.io.*;
 public class hw3{
     public static void main (String[] args)throws IOException{
         BufferedReader buf;
         int month,date;
         buf=new BufferedReader(new InputStreamReader(System.in));
         System.out.print("��J���:");
         month= Integer.parseInt(buf.readLine());
	 System.out.print("��J���:");
         date= Integer.parseInt(buf.readLine());
	 System.out.print("�A���P�y��:");
	 if(month<13||date<31)
     {
        
         switch(month){
         case 1:
                if(date>=21&&date<31)
                {
                    System.out.print("���~�y");
                }
                else if(date<21)
		        {
		            System.out.print("�]�~�y");
		        }
		        else System.out.print("���~");
                break;
         case 2:
                if(date>=19&&date<=30)
                {
                    System.out.print("�����y");
                }
                else if (date<19)System.out.print("���~�y");
                else System.out.print("���~");
                break;
         case 3:
                if(date>=21&&date<=31)
                {
                    System.out.print("�զϮy");
                }
                else if (date<21)System.out.print("�����y");
                else System.out.print("���~");
                break;
        case 4:
                if(date>=21&&date<=30)
                {
                    System.out.print("�����y");
                }
                else if (date<21)System.out.print("�զϮy");
                else System.out.print("���~");
                break;
        case 5:
                if(date>=22&&date<=31)
                {
                    System.out.print("���l�y");
                }
                else if (date<22)System.out.print("�����y");
                else System.out.print("���~");
                break;
        case 6:
                if(date>=22)
                {
                    System.out.print("���ɮy");
                }
                else if (date<22)System.out.print("���l�y");
                else System.out.print("���~");
                break;
        case 7:
                if(date>=23&&date<=31)
                {
                    System.out.print("��l�y");
                }
                else if (date<23)System.out.print("���l�y");
                else System.out.print("���~");
                break;
        case 8:
                if(date>=23&&date<=31)
                {
                    System.out.print("�B�k�y");
                }
                else if (date<23)System.out.print("��l�y");
                else System.out.print("���~");
                break;
        case 9:
                if(date>=23&&date<=30)
                {
                    System.out.print("�ѯ��y");
                }
                else if (date<23)System.out.print("��l�y");
                else System.out.print("���~");
                break;
        case 10:
                if(date>=24&&date<=31)
                {
                    System.out.print("���Ȯy");
                }
                else if (date<24)System.out.print("�ѯ��y");
                else System.out.print("���~");
                break;
        case 11:
                if(date>=22&&date<=30)
                {
                    System.out.print("�g��y");
                }
                else if (date<22)System.out.print("���Ȯy");
                else System.out.print("���~");
                break;
        case 12:
                if(date>=21&&date<=31)
                {
                    System.out.print("�]�~�y");
                }
                else if (date<21)System.out.print("�g��y");
                else System.out.print("���~");
                break;
                                               
        }
    }
    else System.out.print("���~");
    }
}