import java.io.*;
 public class a{
     public static void main (String[] args)throws IOException{
         int a=0;String password= "",password1="";
         BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
         while(true){
         System.out.print("您的帳號 : ");
		String account = buf.readLine();
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
        a=0;
     }}
 }
class Game_account{
    private int uid ;
    private String account,password;
    private static int keyid;
    Game_account(String acc,String pas){
        this.keyid=keyid;
        uid=uid+keyid;
        keyid++;
        setpassword(pas);
        setaccount(acc);
    }
    public void setpassword(String pas){
        password=pas;
    }
    public void setaccount(String acc){
        account=acc;
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
        System.out.println("account: "+getaccount()+" password: "+getpassword()+" keyid: "+getkeyid()+" uid:"+getuid());
    }
} 