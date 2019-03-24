package Game_account;

public class Game_account{
    private int uid ;
    private String account,password;
    private static int keyid;
    public Game_account(String acc,String pas){
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
