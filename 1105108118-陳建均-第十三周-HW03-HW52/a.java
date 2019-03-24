import java.io.*;
import java.util.*;
 public class a{
     public static void main (String[] args)throws IOException{
         int a=0;String password= "",password1="";String account="";
         int i=0;
         int b;
         int c=0;
         int cc=0;
         int d=4;
         String arr[]={"a","a","a","a","a"};
         BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
         while(d>1){
          while(cc==0){   
         System.out.print("您的帳號 : ");
		account = buf.readLine();
        for(b=0;b<arr.length;b++){
        if(account.equals(arr[b])){
         System.out.println("error");c++;}
         }
	if(c==1){c=0;break;}
        else if(c==0) {
         arr[i]=account;
         i++;cc++;}
        while(a==0){
		System.out.print("您的密碼 : ");
		 password = buf.readLine();
        System.out.print("確認密碼 : ");
         password1 = buf.readLine();
        if(password.equals(password1)){
             a++;
        }
        else {System.out.print("密碼錯誤 : ");}
        }
		Game_account Game_account = new Game_account(account,password);
        Game_account.show();
        a=0;d--;cc=0;c=0;
     }}
 }}
class Game_account{
    public int a=0;
    private int uid ;
    private final String account;
    private String password;
    private static int keyid;
    private  String datee;
    Date date =new Date();
    Game_account(String acc,String pas){
        this.keyid=keyid;
        uid=uid+keyid;
        keyid++;
        datee=date.toString();
        account=acc;setpassword(pas);}
    public void setpassword(String pas){
        password=pas;
    }
    public String getpassword(){
        return password;
    }
    public String getaccount(){
        return account;
    }
    public int getkeyid(){
        return keyid;
    }
    public int getuid(){
        return uid;
    }
    public void show(){
        System.out.println("account: "+getaccount()+" password: "+getpassword()+" keyid: "+getkeyid()+" uid:"+getuid()+" date:"+datee);
    }
} 