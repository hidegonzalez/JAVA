import java.io.*;
import java.util.*;
 public class f{
     public static void main (String[] args)throws IOException{
         BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
         String method;
         int price,distance,weight;
         System.out.println("vechine");
         method = buf.readLine();
         System.out.println("price");
         price = Integer.parseInt(buf.readLine());
         System.out.println("weight");
         weight = Integer.parseInt(buf.readLine());
         System.out.println("distance");
        distance = Integer.parseInt(buf.readLine());
         switch(method){
             case "bike":{
                 bike bike=new bike(123);
                 bike.move();
                 break;
             }
             case "ship":{
                 ship ship=new ship(123,price);
                 ship.move();
                 price=ship.delivery(weight,distance);
                 System.out.println(price);
                 break;
             }
             case "plane":{
                 plane plane=new plane(123,price);
                 plane.move();
                 price=plane.delivery(weight,distance);
                System.out.println(price);
                break;
             }
             default :System.out.println("error");
         }
     }
 }
 interface Delivery{
     int delivery(int weight, int distance);
     int maxweight =2000;
 }
abstract class vechine{
    private double speed;
    vechine(double spd){
        setspeed(spd);
    }
    public void setspeed(double spd){
        speed=spd;
    }
    public double getspeed(){
        return speed;
    }
    abstract void move();
}
class bike extends vechine{
    bike(double speed){
       super(speed); 
    }
    public void move(){
        System.out.println("cant");
    }
}
class ship extends vechine implements Delivery{
    private int price;
    ship(double speed,int pri){
       super(speed);
       setprice(pri); 
    }
    public void setprice(int pri){
        price=pri;
    }
    public int getprice(){
        return price;
    }
    public int delivery(int wei, int dis){
        if(wei>maxweight){
            System.out.println("overfloat");
        }
        else {
            price=price*dis*wei;
        }
        return price;
    }
    public void move(){
        System.out.println("can");
    }
}
class plane extends vechine implements Delivery{
    private int price;
    plane(double speed,int pri){
       super(speed);
       setprice(pri); 
    }
    public void setprice(int pri){
        price=pri;
    }
    public int getprice(){
        return price;
    }
    public int delivery(int wei, int dis){
        if(wei>maxweight){
            System.out.println("overfloat");
        }
        else {
            price=price*dis*wei;
        }
        return price;
    }
    public void move(){
        System.out.println("can");
    }
}