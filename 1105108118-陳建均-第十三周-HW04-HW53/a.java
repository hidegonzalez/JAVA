import java.io.*;
import Game_account.Game_account;
 public class a{
     public static void main (String[] args)throws IOException{
         int a=0;String password= "",password1="";
         BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
         while(true){
         System.out.print("�z���b�� : ");
		String account = buf.readLine();
        while(a==0){
		System.out.print("�z���K�X : ");
		 password = buf.readLine();
        System.out.print("�T�{�K�X : ");
         password1 = buf.readLine();
        if(password.equals(password1)){
             a++;
        }
        else {System.out.print("�K�X���~ : ");}
        }
		Game_account Game_account = new Game_account(account,password);
        Game_account.show();
        a=0;
     }}
 }
 