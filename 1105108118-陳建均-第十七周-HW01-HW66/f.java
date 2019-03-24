import java.io.*;
import java.util.*;
 public class f{
     public static void main (String[] args)throws IOException{
         BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
         String name;
         double speed;
         int qwer=0;
         int cont =0;
         int arr[]= new int[3];
         transport e[]= new transport[3];
         while(cont<3){
             System.out.println("selsect");
             qwer =Integer.parseInt(buf.readLine());    
         switch(qwer){
         case 0:{name=buf.readLine();
		 speed = Double.parseDouble(buf.readLine());
        e [cont]=new car(name,speed);
        e [cont].show();
        e [cont].move();
        break;}
        case 1: {name=buf.readLine();
		 speed = Double.parseDouble(buf.readLine());
         e [cont]=new ship(name,speed);
         e [cont].show();
         e [cont].move();
         break;}
         case 2: {name=buf.readLine();
		 speed = Double.parseDouble(buf.readLine());
          e [cont]=new plane(name,speed);
          e [cont].show();
         e [cont].move();
         break;}
 }cont++;
 }}
 }
 abstract class transport{
     private double speed;
     private String name;
     transport(String name,double speed){
         setspeed(speed);
         setname(name);
     }
     public  void setname(String na){
         name=na;
     }
     public void setspeed(double sp){
         speed=sp;
     }
     public double getspeed(){
         return speed;
     }
     public String getname(){
         return name;
     }
    public abstract void move ();
    public abstract void show();
 }
 class car extends transport{
     car(String name ,double speed){
         super(name,speed);
     }
     public void move(){
         System.out.println("car on the road");
     }
     public void show(){
         System.out.println("name:"+getname()+"  speed:"+getspeed());
     }
 }
 class ship extends transport{
     ship(String name ,double speed){
         super(name,speed);
     }
     public void move(){
         System.out.println("ship on the sea");
     }
      public void show(){
         System.out.println("name:"+getname()+"  speed:"+getspeed());
     }
 }
 class plane extends transport{
     plane(String name ,double speed){
         super(name,speed);
     }
     public void move(){
         System.out.println("plane on the sky");
     }
      public void show(){
         System.out.println("name:"+getname()+"  speed:"+getspeed());
     }
 }