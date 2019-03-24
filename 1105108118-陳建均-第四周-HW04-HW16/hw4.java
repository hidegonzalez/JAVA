import java.io.*;
 public class hw4{
     public static void main (String[] args)throws IOException{
         BufferedReader buf;
         int speed;
         buf=new BufferedReader(new InputStreamReader(System.in));
         do{
                System.out.println("輸入風速等級:");
                speed= Integer.parseInt(buf.readLine());
           } 
	while(speed<8||speed>17);
        if(speed>=8&&speed<=17)
        {
            if(speed<=11)
            {
                System.out.println("風速等級:"+speed+"輕度颱風");
            }
            else if(speed>11&&speed<=15)
            {
                System.out.println("風速等級:"+speed+"中度颱風");
            }
            else  System.out.println("風速等級:"+speed+"強烈颱風");
        }    
    }
}