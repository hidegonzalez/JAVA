import java.io.*;
 public class hw4{
     public static void main (String[] args)throws IOException{
         BufferedReader buf;
         int speed;
         buf=new BufferedReader(new InputStreamReader(System.in));
         do{
                System.out.println("��J���t����:");
                speed= Integer.parseInt(buf.readLine());
           } 
	while(speed<8||speed>17);
        if(speed>=8&&speed<=17)
        {
            if(speed<=11)
            {
                System.out.println("���t����:"+speed+"���׻䭷");
            }
            else if(speed>11&&speed<=15)
            {
                System.out.println("���t����:"+speed+"���׻䭷");
            }
            else  System.out.println("���t����:"+speed+"�j�P�䭷");
        }    
    }
}