import java.io.*;
 public class hw6{
     public static void main (String[] args)throws IOException{
         BufferedReader buf;
         double cash,rcash=99999;
         int fun;
         buf=new BufferedReader(new InputStreamReader(System.in));
         do{
	    System.out.println("輸入功能");
            fun= Integer.parseInt(buf.readLine());

	    switch(fun){
             case 1:
                    System.out.println("你想領多少");
                    cash= Integer.parseInt(buf.readLine());
                    if(cash>rcash)
                    {
                        System.out.print("你很窮沒那多錢");
                        System.out.println("目前餘額"+rcash);
                    }
                    else System.out.println("目前餘額"+(rcash-cash));
                    break;
             case 2:
                    System.out.println("你想存多少");
                    cash= Integer.parseInt(buf.readLine());
                    rcash=cash+rcash;
                    System.out.println("目前餘額"+rcash);
                    break;
             case 3:System.out.println("目前餘額"+rcash);
                    break;
             case 4:System.out.println("拜拜");
                    break;
             default:System.out.println("你搞啥別亂搞");
                     
         }
	}while(fun<99);
    }
}