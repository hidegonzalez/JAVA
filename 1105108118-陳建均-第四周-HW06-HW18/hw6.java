import java.io.*;
 public class hw6{
     public static void main (String[] args)throws IOException{
         BufferedReader buf;
         double cash,rcash=99999;
         int fun;
         buf=new BufferedReader(new InputStreamReader(System.in));
         do{
	    System.out.println("��J�\��");
            fun= Integer.parseInt(buf.readLine());

	    switch(fun){
             case 1:
                    System.out.println("�A�Q��h��");
                    cash= Integer.parseInt(buf.readLine());
                    if(cash>rcash)
                    {
                        System.out.print("�A�ܽa�S���h��");
                        System.out.println("�ثe�l�B"+rcash);
                    }
                    else System.out.println("�ثe�l�B"+(rcash-cash));
                    break;
             case 2:
                    System.out.println("�A�Q�s�h��");
                    cash= Integer.parseInt(buf.readLine());
                    rcash=cash+rcash;
                    System.out.println("�ثe�l�B"+rcash);
                    break;
             case 3:System.out.println("�ثe�l�B"+rcash);
                    break;
             case 4:System.out.println("����");
                    break;
             default:System.out.println("�A�dԣ�O�÷d");
                     
         }
	}while(fun<99);
    }
}