import java.io.*;
import java.util.*;
 public class s{
     public static void main (String[] args)throws IOException{
         BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
         String method;
         double time,times,timess,f,price;
	 price=0;
         System.out.println("num");
         f = Integer.parseInt(buf.readLine());
         while(f>0){
         System.out.println("select");
         method = buf.readLine();
         System.out.println("time");
         time = Double.parseDouble(buf.readLine());
         System.out.println("times");
         times = Double.parseDouble(buf.readLine());
         System.out.println("timess");
         timess = Double.parseDouble(buf.readLine());
         switch(method){
             case "cellphone":{
                 cellphone cellphone=new cellphone(time,times,timess);
                 price=price+cellphone.showmess();f--;
                 break;
             }
             case "telephone":{
                 telephone telephone=new telephone(time,timess);
                 price=telephone.showmess()+price;f--;
                 break;
             }
             case "tablet":{
                 tablet tablet=new tablet(time,times,timess);
                price=price+tablet.showmess();f--;
                break;
             }
             default :{System.out.println("error");price=price+0;}
         }
         }System.out.println(price);
     }
 }
 interface internet{
     int internet(int hour);
     int hourp =10;
 }
abstract class phone{
    private double time;
    phone(double time){
        settime(time);
    }
    public void settime(double tim){
        time=tim;
    }
    public double gettime(){
        return time;
    }
    abstract void cal(double time,double times,double timess);
    abstract double showmess();
}
class tablet extends phone implements internet{
    private double times;
    private double price;
    tablet(double time,double times,double timess){
       super(time);
        cal(time,times,timess);
    }
   public int internet(int hour)
    {
        return 0;
    }
    public void settimes(double tim){
        times=tim;
    }
    public double gettimes(){
        return times;
    }
    public void cal(double time,double times,double timess){
        if(times*hourp>=1000){
            price=3*time+1000+200+timess*13;
        }
        else {
            price=3*time+times*10+200+timess*13;
        }
    }
    public double showmess(){
        return price;
    }
}
class cellphone extends phone implements internet{
    private double times;
    private double price;
    cellphone(double time,double times,double timess){
       super(time);
        cal(time,times,timess);
    }
     public int internet(int hour)
    {
        return 0;
    }
    public void settimes(double tim){
        times=tim;
    }
    public double gettimes(){
        return times;
    }
    public void cal(double time,double times,double timess){
        if(times*hourp>=1300){
            price=2*time+1300+250+10*timess;
        }
        else {
            price=2*time+times*10+250+timess*10;
        }
    }
    public double showmess(){
        return price;
    }
}
class telephone extends phone{
    private double times;
    private double price;
    telephone(double time,double timess){
       super(time);
          cal(time,123,timess);
    }
    public void settimes(double tim){
        times=tim;
    }
    public double gettimes(){
        return times;
    }
    public void cal(double time,double times,double timess){
            price=1*time+5*timess;
    }
    public double showmess(){
        return price;
    }
}